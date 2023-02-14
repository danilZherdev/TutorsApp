package org.example.service.impl;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.dto.request.UserRequestDto;
import org.example.dto.response.ServiceResponseDto;
import org.example.repository.ServiceRepository;
import org.example.service.ServiceService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
@RequiredArgsConstructor
public class ServiceServiceImpl implements ServiceService {
    ServiceRepository serviceRepository;
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
