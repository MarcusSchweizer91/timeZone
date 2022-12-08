package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record Animal(
        String name,
        LocalDate birthdate
) {
}
