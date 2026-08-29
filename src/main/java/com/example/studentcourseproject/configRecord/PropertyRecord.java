package com.example.studentcourseproject.configRecord;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "app")
public record PropertyRecord(
        String name,
        int maximumStudent,
        String courseDefaultDuration,
        boolean isEnabled,
        List<String> allowedCountries) {
}
