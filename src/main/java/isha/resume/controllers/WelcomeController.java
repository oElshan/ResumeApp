package isha.resume.controllers;

import isha.resume.form.ReqForm;
import isha.resume.repository.ProfileRepository;
import isha.resume.services.FindProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class WelcomeController {
    @Autowired
    private FindProfileService profileService;

    @RequestMapping("/")
    public String welcome() {
        return "/welcome";
    }


    @RequestMapping(value = "/{uid}", method = RequestMethod.GET)
    public String getProfile(@PathVariable("uid") String uid, Model model)
    {
        return "/profile";
    }


    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String showhome(@ModelAttribute("req") ReqForm reqForm, Model model) {

        model.addAttribute("name", reqForm.getName());
        model.addAttribute("secondName", reqForm.getEmail());
        model.addAttribute("password", reqForm.getPassword());
        return "/result";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String edit() {
        return "/edit";
    }
}
