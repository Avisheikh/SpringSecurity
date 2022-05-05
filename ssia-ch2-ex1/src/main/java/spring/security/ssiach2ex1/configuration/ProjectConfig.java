package spring.security.ssiach2ex1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;


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
//        Map<String, PasswordEncoder> encoders = new HashMap<>();
//
//        encoders.put("noop",NoOpPasswordEncoder.getInstance());
//        encoders.put("bcrypt", new BCryptPasswordEncoder());
//        encoders.put("scrypt", new SCryptPasswordEncoder());
//
//        return new DelegatingPasswordEncoder("noop",encoders);
    }

}
