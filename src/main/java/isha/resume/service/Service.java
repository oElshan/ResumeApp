package isha.resume.service;

import isha.resume.entity.Profile;
import isha.resume.repository.ProfileRepository;

import javax.transaction.Transactional;
import java.util.Comparator;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    ProfileRepository profileRepository;

    public Service(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Transactional
    public List<Profile> findAll() {
        List<Profile> profilesList = profileRepository.findAll();
        return profilesList;
    }

}
