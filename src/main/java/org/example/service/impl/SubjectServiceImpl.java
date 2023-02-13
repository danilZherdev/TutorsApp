package org.example.service.impl;

import org.example.dto.request.SubjectRequestDto;
import org.example.dto.response.SubjectResponseDto;
import org.example.service.SubjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Override
    public void create(SubjectRequestDto request) {

    }

    @Override
    public void update(SubjectRequestDto request) {

    }

    @Override
    public void delete(long subjectId) {

    }

    @Override
    public SubjectResponseDto get(long subjectId) {
        return null;
    }

    @Override
    public List<SubjectResponseDto> getAll() {
        return null;
    }
}
