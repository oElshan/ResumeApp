package isha.resume.services;

import isha.resume.entity.Profile;
import isha.resume.form.ReqForm;
import isha.resume.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EditProfileService {

    @Autowired
    private ProfileRepository profileRepository;


    public Profile createProfile(ReqForm reqForm) {
        Profile profile = new Profile();
        profile.setFirstName(reqForm.getName());
        profile.setLastName(reqForm.getSecondName());
        profile.setEmail(reqForm.getEmail());
        profile.setPasword(reqForm.getPassword());
        return profile;
    }


}
