package isha.resume.controllers;

import isha.resume.entity.Profile;
import isha.resume.form.SingUpForm;
import isha.resume.services.EditProfileService;
import isha.resume.services.FindProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


// TODO: 21/10/2019 добавить регистрация нового пользователя и сохранения в БД
@Controller
public class WelcomeController {
    @Autowired
    private FindProfileService findProfileService;
    private EditProfileService editProfileService;

    @RequestMapping("/")
    public String welcome() {
        return "/welcome";
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getProfile(@PathVariable("id") String id, Model model)
    {

        Profile profile = findProfileService.findProfileById(Long.parseLong(id));

        model.addAttribute("firstName", profile.getFirstName());
        return "/profile";
    }


    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String showhome(@ModelAttribute("req") SingUpForm singUpForm, Model model) {

        editProfileService.createNewProfile(singUpForm);
        return "/edit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String edit() {
        return "/edit";
    }
}
