package org.launchcode.controllers;

import jakarta.validation.Valid;
import org.launchcode.models.Client;
import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @GetMapping("/user/add")
    public String displayAddUserForm(Model model) {
        model.addAttribute("user", new User());
        return "/user/add.html";
    }

    @PostMapping("/user/add")
    public String processAddUserForm(Model model, @Valid @ModelAttribute User user, BindingResult bindingResult, @RequestParam String verify) {

        if (bindingResult.hasErrors()) {
            return "user/add";
        }

        if (verify == null || user.getPassword() == null || !verify.equals(user.getPassword())) {
            return "user/add";
        }

        return "./";
    }


}
