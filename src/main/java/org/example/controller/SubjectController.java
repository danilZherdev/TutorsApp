package org.example.controller;

import org.example.dto.request.SubjectRequestDto;
import org.example.dto.response.SubjectResponseDto;
import org.example.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @PostMapping
    public void create(@RequestBody SubjectRequestDto request) {
        subjectService.create(request);
    }
    @PutMapping
    public void update(@RequestBody SubjectRequestDto request) {
        subjectService.update(request);
    }
    @DeleteMapping
    public void delete(@RequestParam long subjectId) {
        subjectService.delete(subjectId);
    }
    @GetMapping
    public SubjectResponseDto get(@PathVariable long subjectId) {
        return subjectService.get(subjectId);
    }
    @GetMapping("all")
    public List<SubjectResponseDto> getAll(){
        return subjectService.getAll();
    }
}