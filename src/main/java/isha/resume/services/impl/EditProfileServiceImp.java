package isha.resume.services.impl;

import isha.resume.entity.*;
import isha.resume.form.SignUpForm;
import isha.resume.repository.ProfileRepository;
import isha.resume.services.EditProfileService;
import isha.resume.util.DataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EditProfileServiceImp implements EditProfileService {

    @Autowired
    private ProfileRepository profileRepository;


    // TODO: 12/11/2019 передадим этот обьект в другой метод контроллера  
    @Override
    @Transactional
    public Profile createNewProfile(SignUpForm signUpForm) {
        Profile profile = new Profile();
        profile.setFirstName(signUpForm.getName());
        profile.setLastName(signUpForm.getSecondName());
        profile.setEmail(signUpForm.getEmail());
        profile.setPasword(signUpForm.getPassword());
        profile.setUid(DataUtil.generateProfileUid(signUpForm));
        profile.setComleted(false);
        profileRepository.save(profile);
        return profile;
    }

    @Override
    public List<Skill> listSkills(long id) {
       return   profileRepository.findAllById(id).getSkills();
    }


    @Override
    @Transactional
    public void updateSkills(long id, List<Skill> skillList) {
        Profile profile =profileRepository.findAllById(id);
        profile.setSkills(skillList);
        profileRepository.save(profile);
    }
    // TODO: 22/10/2019 прочитать про метод save()  spring data JPA

//    @Override
//    public List<Certificate> listCertificates(long id) {
//        return null;
//    }
//
//    @Override
//    public List<Course> listCourses(long id) {
//        return null;
//    }
//
//    @Override
//    public List<Education> listEducations(long id) {
//        return null;
//    }
//
//    @Override
//    public List<Hobby> listHobbies(long id) {
//        return null;
//    }
//
//    @Override
//    public List<Language> listLanguages(long id) {
//        return null;
//    }
//
//    @Override
//    public List<Practic> listPractics(long id) {
//        return null;
//    }
}
