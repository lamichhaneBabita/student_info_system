package com.consultadd.studentInfoSystem.config;


//
//@Configuration
//@EnableWebSecurity
//public class Config extends WebSecurityConfigurerAdapter {
//    @Autowired
//    UserDetailsService userDetailsService;
//    @Bean
//
//    AuthenticationProvider authenticationProvider(){
//        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
//        daoAuthenticationProvider.setUserDetailsService(userDetailsService);
//        daoAuthenticationProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
//        return daoAuthenticationProvider;
//    }

//    @Bean
//    @Override
//    protected UserDetailsService userDetailsService(){
//        List<UserDetails> user = new ArrayList<>();
//        user.add(User.withDefaultPasswordEncoder().username("root").password("babita").roles("USER").build());
//        return  new InMemoryUserDetailsManager(user);
//    }

//}
