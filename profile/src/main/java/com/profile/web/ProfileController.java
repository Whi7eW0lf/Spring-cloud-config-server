package com.profile.web;

import com.profile.dtos.ProfileDetailsDto;
import com.profile.services.ProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping
    public ResponseEntity<List<ProfileDetailsDto>> getAllProfiles() {
        return ResponseEntity.ok(this.profileService.getAllProfiles());
    }

}
