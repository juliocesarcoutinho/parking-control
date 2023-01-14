package com.api.parkingcontrol.configs.security;

import com.api.parkingcontrol.models.UserModel;
import com.api.parkingcontrol.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository repository) {
        this.userRepository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserModel userModel = userRepository.findByUserName(username)
                .orElseThrow( () -> new UsernameNotFoundException("User Name Not Found with Username: " + username));
        return userModel;
    }
}
