package org.example.service;

import org.example.dto.request.SubjectRequestDto;
import org.example.dto.request.UserRequestDto;
import org.example.dto.response.UserResponseDto;

import java.util.List;

public interface UserService {
    List<UserResponseDto> getAll();

    void create(UserRequestDto request);

    UserResponseDto get(long userId);

    void update(UserRequestDto request);

    void delete(long userId);
}
