package com.example.studentcourseproject.configRecord;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@ConfigurationProperties(prefix = "app")
@Validated
public record PropertyRecord(
        @NotBlank String name,
        @Positive int maximumStudent,
        @Min(1) long courseDefaultDuration,
        boolean isEnabled,
        List<String> allowedCountries) {
}
