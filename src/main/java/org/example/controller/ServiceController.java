package org.example.controller;

import org.example.dto.request.UserRequestDto;
import org.example.dto.response.ServiceResponseDto;
import org.example.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    ServiceService serviceService;

    @PostMapping("/register")
    public void create(@RequestBody UserRequestDto request) {
        serviceService.create(request);
    }
    @PutMapping
    public void update(@RequestBody UserRequestDto request) {
        serviceService.update(request);
    }
    @DeleteMapping
    public void delete(@RequestParam long serviceId) {
        serviceService.delete(serviceId);
    }
    @GetMapping
    public ServiceResponseDto get(@RequestParam long serviceId) {
        return serviceService.get(serviceId);
    }
    @GetMapping("all")
    public List<ServiceResponseDto> getAll(){
        return serviceService.getAll();
    }
}
