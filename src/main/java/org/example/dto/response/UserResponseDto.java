package org.example.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.entity.UserRoleType;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponseDto {
    long id;
    String login;
    String firstName;
    String lastName;
    UserRoleType role;
}
