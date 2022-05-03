package spring.security.ssiach2ex1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import spring.security.ssiach2ex1.entity.User;
import spring.security.ssiach2ex1.security.SecurityUser;


import javax.sql.DataSource;
import java.util.List;

@Configuration
public class ProjectConfig {

//    @Bean
//    public UserDetailsService userDetailsService(){
//        UserDetails u = new User("abishek","12345","read");
//        List<UserDetails> users = List.of(u);
//        return new InMemoryUserDetailsService(users);
//    }

    @Bean
    public UserDetailsService userDetailsService(DataSource dataSource){

//        String usersByUsernameQuery = "select username,password,enabled " +
//                "from users where username = ?";
//
//        System.out.println(usersByUsernameQuery);
//
//        String authsByUserQuery = "select username, authority " +
//                "from security.authorities where username = ?";
//
//        var userDetailsManager = new JdbcUserDetailsManager(dataSource);
//        userDetailsManager.setUsersByUsernameQuery(usersByUsernameQuery);
//        userDetailsManager.setAuthoritiesByUsernameQuery(authsByUserQuery);
//
//        return userDetailsManager;

        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

}
