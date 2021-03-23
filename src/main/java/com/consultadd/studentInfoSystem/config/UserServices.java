//package com.consultadd.collegeinfosystem.config;
//
//import com.consultadd.collegeinfosystem.Repos.UserRepo;
//import com.consultadd.collegeinfosystem.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Collection;
//
//@Service
//public class UserServices implements UserDetailsService {
//    @Autowired
//    UserRepo userRepo;
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        User user = userRepo.findByUserName(s);
//        if (user == null)
//            throw new UsernameNotFoundException(s);
//
//        return new UserDetails1(user);
//    }
//}
//
