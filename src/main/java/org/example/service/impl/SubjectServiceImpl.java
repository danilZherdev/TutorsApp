package org.example.service.impl;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.dto.request.SubjectRequestDto;
import org.example.dto.response.SubjectResponseDto;
import org.example.repository.SubjectRepository;
import org.example.service.SubjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    SubjectRepository subjectRepository;
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
