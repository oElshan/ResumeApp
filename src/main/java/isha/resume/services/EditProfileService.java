package isha.resume.services;

import isha.resume.entity.*;
import isha.resume.dto.SignUpForm;

import java.util.List;
/**
 *  сервис по созданию и обновления информации профиля
 *
 * */
public interface EditProfileService {

    Profile createNewProfile(SignUpForm signUpForm);

    List<Skill> listSkills(long id);

    void updateSkills(long id, List<Skill> skillList);

//    List<Certificate> listCertificates(long id);
//
//    List<Course> listCourses(long id);
//
//    List<Education> listEducations(long id);
//
//    List<Hobby> listHobbies(long id);
//
//    List<Language> listLanguages(long id);
//
//    List<Practic> listPractics(long id);


    // TODO: 22/10/2019 добавить listSkillCategory и updateSkills и другие данные


}
