package isha.resume.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/")
public class WelcomeController {
    private final static Logger LOGGER = Logger.getLogger(WelcomeController.class);

//    @RequestMapping(method = RequestMethod.GET)
//    public String showhome() {
//
//    }
}
