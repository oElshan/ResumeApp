package isha.resume.services;

import isha.resume.entity.Profile;
import isha.resume.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProfileService {


   private ProfileRepository profileRepository;

   @Autowired
    public ProfileService(ProfileRepository profileRepository) {

       this.profileRepository = profileRepository;
    }

    @Transactional
    public List<Profile> findAll() {
        List<Profile> profilesList = profileRepository.findAll();

        return profilesList;
    }

    @Transactional
    public Profile findByUid(String uid) {
        Profile profile = profileRepository.findByUid(uid);
        return profile;
    }

}
