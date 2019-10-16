package isha.resume.services;

import isha.resume.entity.Profile;
import isha.resume.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private ProfileRepository profileRepository;

    // TODO: 25/09/2019 реализовать user detail service


    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Profile profile = profileRepository.findProfileByFirstName(name);

        return null;

    }



}
