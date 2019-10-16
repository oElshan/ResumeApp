package isha.resume.services;

import isha.resume.entity.Profile;
import isha.resume.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FindProfileService {

    @Autowired
    private ProfileRepository profileRepository;


    @Transactional
    public List<Profile> findAll() {
        List<Profile> profilesList = profileRepository.findAll();
        return profilesList;
    }

    @Transactional
    public Profile findByName(String name) {
        return profileRepository.findProfileByFirstName(name);
    }

    @Transactional
    public Profile findProfileByUid(String uid) {
        return profileRepository.findProfileByUid(uid);

    }



}
