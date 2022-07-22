package com.profile.config;

import com.profile.entities.Profile;
import com.profile.repositories.ProfileRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class SampleDataInitializer implements CommandLineRunner {

    private final ProfileRepository profileRepository;

    public SampleDataInitializer(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public void run(String... args) {
        if (this.profileRepository.count() == 0) {
            this.profileRepository.saveAll(SAMPLE_PROFILES);
        }
    }

    private static final List<Profile> SAMPLE_PROFILES = List.of(
            new Profile("Salih", "Musov", "MALE", LocalDate.of(1996, 10, 17)),
            new Profile("Ivan", "Ivanov", "MALE", LocalDate.of(1999, 12, 28)),
            new Profile("Viara", "Dimitrova", "FEMALE", LocalDate.of(1995, 11, 14))
    );
}
