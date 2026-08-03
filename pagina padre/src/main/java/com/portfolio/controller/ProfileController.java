package com.portfolio.controller;

import com.portfolio.service.ProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("person", profileService.getProfileData());
        return "index";
    }
}
