package com.s28572.tpo06;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.web.servlet.error.ErrorController;
@Controller
public class MyErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError(Model model, HttpServletRequest request) {
        System.out.println("ERROR CONTROLLER EXECUTED");
        model.addAttribute("personFormDTO", new PersonFormDTO());
        model.addAttribute("error", request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE)
                + " " + request.getAttribute(RequestDispatcher.ERROR_MESSAGE));
        return "index";
    }

}
