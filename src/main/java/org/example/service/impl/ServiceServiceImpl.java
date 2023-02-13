package org.example.service.impl;

import org.example.dto.request.UserRequestDto;
import org.example.dto.response.ServiceResponseDto;
import org.example.service.ServiceService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceServiceImpl implements ServiceService {
    @Override
    public List<ServiceResponseDto> getAll() {
        return null;
    }

    @Override
    public void create(UserRequestDto request) {

    }

    @Override
    public void update(UserRequestDto request) {

    }

    @Override
    public void delete(long userId) {

    }

    @Override
    public ServiceResponseDto get(long serviceId) {
        return null;
    }
}
