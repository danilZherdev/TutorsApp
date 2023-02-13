package org.example.service.impl;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.example.dto.request.UserRequestDto;
import org.example.dto.response.UserResponseDto;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserServiceImpl implements UserService {

    @Override
    public List<UserResponseDto> getAll() {
        return null;
    }

    @Override
    public void create(UserRequestDto request) {

    }

    @Override
    public UserResponseDto get(long userId) {
        return null;
    }

    @Override
    public void update(UserRequestDto request) {

    }

    @Override
    public void delete(long userId) {

    }
}
