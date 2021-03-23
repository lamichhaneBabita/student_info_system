//package com.consultadd.collegeinfosystem.config;
//
//import com.consultadd.collegeinfosystem.model.User;
//import lombok.Data;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Objects;
//
//@Data
//public class UserDetails1 implements UserDetails {
//    User user;
//    UserDetails1 userDetails1;
//
//    public UserDetails1(User user) {
//        super();
//        this.user = user;
//
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        UserDetails1 that = (UserDetails1) o;
//        return Objects.equals(user, that.user) && Objects.equals(userDetails1, that.userDetails1);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(user, userDetails1);
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return Collections.singleton(new SimpleGrantedAuthority("USER"));
//    }
//
//    @Override
//    public String getPassword() {
//        return user.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return user.getUserName();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}