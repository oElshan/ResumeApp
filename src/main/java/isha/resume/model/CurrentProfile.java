package isha.resume.model;

import isha.resume.entity.Profile;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.Collections;

public class CurrentProfile extends User {

    private Long id;
    private String name;


    public CurrentProfile(Profile profile) {
        super(profile.getFirstName(), profile.getPasword(), true, true, true, true, Collections.singleton(new SimpleGrantedAuthority(Role.USER.name())));
        this.id = profile.getId();
        this.name = profile.getFirstName();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
