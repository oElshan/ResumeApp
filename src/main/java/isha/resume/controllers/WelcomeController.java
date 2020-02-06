package isha.resume.controllers;

import isha.resume.entity.Profile;
import isha.resume.dto.SignUpForm;
import isha.resume.services.EditProfileService;
import isha.resume.services.FindProfileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@Controller
public class WelcomeController {
    Logger logger = LoggerFactory.getLogger(WelcomeController.class);
    @Autowired
    private FindProfileService findProfileService;
    @Autowired
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


//    @RequestMapping(value = "/registration", method = RequestMethod.POST)
//    public String showhome(@Valid @ModelAttribute("req") SignUpForm signUpForm, BindingResult bindingResult, Model model) {
//        if (bindingResult.hasErrors()) {
//            model.addAttribute("singUpErrors", bindingResult);
//            return "/welcome";
//        }
//        model.addAttribute( "newProfile",editProfileService.createNewProfile(signUpForm));
//        return "/edit";
//    }
//
//
  @RequestMapping(value = "/sign-up", method = RequestMethod.GET)
    public String register( ) {
        return "/sign-up";
    }

    @RequestMapping(value = "/sign-in", method = RequestMethod.GET)
    public String login( ) {
        return "/sign-in";
    }

    @RequestMapping(value = "/signupForm", method = RequestMethod.POST,produces={"application/json"})
    @ResponseBody
    public String regProfile(@RequestBody SignUpForm signUpForm) {
        logger.info(signUpForm.toString());

//        Profile profile = findProfileService.findProfileByEmail(signUpForm.getEmail());
//        if (profile != null) {
//            CurrentProfile currentProfile = new CurrentProfile(editProfileService.createNewProfile(signUpForm));
//            Authentication authentication = new UsernamePasswordAuthenticationToken(currentProfile, currentProfile.getPassword(),currentProfile.getAuthorities());
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//        }
//        return "redirect:/edit";
        return "OK";
    }


    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String edit() {
        return "/edit";
    }

    @RequestMapping(value = "/edit/skills", method = RequestMethod.GET)
    public String editSkills() {
        return "";
    }
}
