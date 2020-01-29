package isha.resume.services.impl;

import isha.resume.entity.Profile;
import isha.resume.model.CurrentProfile;
import isha.resume.services.FindProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    FindProfileService findProfileService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Profile profile = findProfileService.findProfileByEmail(email);
        if (profile != null) {
            CurrentProfile currentProfile = new CurrentProfile(profile);
        }else
            throw new UsernameNotFoundException("Profile not found by " + email);
        return null;
    }
}
