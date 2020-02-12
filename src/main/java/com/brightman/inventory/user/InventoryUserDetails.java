package com.brightman.inventory.user;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class InventoryUserDetails implements UserDetails {
    private static final long serialVersionUID = 1L;
    private Integer userId;
    private String userName;
    private String email;
    @JsonIgnore
    private String password;
    private Collection<? extends GrantedAuthority> authorities;
    
    public InventoryUserDetails(Integer userId, String userName, String email, String password,
            Collection<? extends GrantedAuthority> authorities) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }
    
    public static InventoryUserDetails build(User user) {
        List<GrantedAuthority> authorities = user.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getRoleName().name()))
                .collect(Collectors.toList());

        return new InventoryUserDetails(
                user.getUserId(), 
                user.getUserName(), 
                user.getEmail(),
                user.getPassword(), 
                authorities);
    }
    
    public Integer getUserId() {
        return userId;
    }
    
    @Override
    public String getUsername() {
        return userName;
    }
    
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        InventoryUserDetails user = (InventoryUserDetails) object;
        return Objects.equals(userId, user.userId);
    }
}