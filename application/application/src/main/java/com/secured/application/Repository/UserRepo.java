package com.secured.application.Repository;

import com.secured.application.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer> {

    Optional<User> findUserByUsername(String u);

}
