package spring.security.ssiach2ex1.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebAuthorizationConfig extends WebSecurityConfigurerAdapter {

//    @Autowired
//    private CustomAuthenticationProvider customAuthenticationProvider;

//    1st step in this chapter

//    @Bean
//    public UserDetailsService userDetailsService(){
//
//        var userDetailsService = new InMemoryUserDetailsManager();
//
//        // next step
//        // 1. Create at least one user who has a set of credentials(username and password)
//        // 2. Add the user to be managed by our implementation of UserDetailsService
//        // 3. Define a bean of the type PasswordEncoder that our application can use to verify a given password with the one stored
//        //    and managed by UserDetailsService
//
//        // Builds the user with a given username, password and authorities lise
//        // 1. Create at least one user who has a set of credentials(username and password)
//        var user = User.withUsername("abishek")
//                .password("12345")
//                .authorities("read")
//                .build();
//
//        // Adds the user to be managed by UserDetailsService
//        // 2. Add the user to be managed by our implementation of UserDetailsService
//        userDetailsService.createUser(user);
//
//        return userDetailsService;
//    }
//
//    // 3. Define a bean of the type PasswordEncoder that our application can use to verify a given password with the one stored
//    //    and managed by UserDetailsService
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
//    }


    // We override this method from the WebSecurityConfigurerAdapter class
    // and use its parameter of type AuthenticationManagerBuilder to set both the
    // UserDetailsService and the PasswordEncoder as shown in the following listing'
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//
//        // Declare a UserDetailsService to store the users in memory
//        var userDetailsService = new InMemoryUserDetailsManager();
//
//        // Defines a user with all its detials
//        var user = User.withUsername("abishek")
//                .password("12345")
//                .authorities("read")
//                .build();
//
//        // add the user to be managed by our UserDetailsService
//        userDetailsService.createUser(user);
//
//        //The UserDetailsService and PasswordEncoder are now set up within the configure() method;
//        auth.userDetailsService(userDetailsService)
//                .passwordEncoder(NoOpPasswordEncoder.getInstance());
//    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth){
//        auth.authenticationProvider(customAuthenticationProvider);
//    }

    //    2nd step in this chapter
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.httpBasic();
        http.authorizeRequests()
                .anyRequest().authenticated();
    }






}
