package com.profile.dtos;

import java.time.LocalDate;

public record ProfileDetailsDto(String firstName, String lastName, String gender, LocalDate bornOn) {
}
