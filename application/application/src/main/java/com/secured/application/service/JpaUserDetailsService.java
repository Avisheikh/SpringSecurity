package com.secured.application.service;

import com.secured.application.model.CustomUserDetails;
import com.secured.application.Entity.User;
import com.secured.application.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;

@Service
public class JpaUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public CustomUserDetails loadUserByUsername(String username){
        Supplier<UsernameNotFoundException> s =
                () -> new UsernameNotFoundException("Problem during authentication!");

        User u = userRepo.findUserByUsername(username).orElseThrow(s);

        System.out.println(u.getUsername());

        return new CustomUserDetails(u);
    }

}
