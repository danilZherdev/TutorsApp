package org.example.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;
@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RegistrationRequestDto {
    String username;
    String password;
    String email;
    String firstName;
    String lastName;
}
