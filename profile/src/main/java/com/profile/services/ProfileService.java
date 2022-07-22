package com.profile.services;

import com.profile.dtos.ProfileDetailsDto;
import com.profile.repositories.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public List<ProfileDetailsDto> getAllProfiles() {
        return this.profileRepository.findAll()
                .stream()
                .map(p -> new ProfileDetailsDto(p.getFirstName(), p.getLastName(), p.getGender(), p.getBornOn()))
                .collect(Collectors.toList());
    }
}
