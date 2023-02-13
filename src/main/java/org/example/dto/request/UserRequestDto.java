package org.example.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.entity.UserRoleType;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class UserRequestDto {
    String login;
    String password;
    String email;
    String firstName;
    String lastName;
    UserRoleType role;
}
