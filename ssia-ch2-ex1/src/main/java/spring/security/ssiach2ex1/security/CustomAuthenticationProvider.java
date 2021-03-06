//package spring.security.ssiach2ex1.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
//@Component
//public class CustomAuthenticationProvider implements AuthenticationProvider {
//
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//
//        String username = authentication.getName();
//        String password = String.valueOf(authentication.getCredentials());
//
//
//        if("abishek".equals(username) && "12345".equals(password)) {
//            return new UsernamePasswordAuthenticationToken(username, password, Arrays.asList());
//        } else {
//            throw new AuthenticationCredentialsNotFoundException("Error in authentication");
//        }
//    }
//
//    @Override
//    public boolean supports(Class<?> authentication) {
//        return UsernamePasswordAuthenticationToken.class
//                .isAssignableFrom(authentication);
//    }
//}
