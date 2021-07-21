package com.learning.studentregistrationapplication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/students")
public class StudentController {

    @GetMapping
    public List<String> getStudents() {
        List<String> names = new ArrayList<>();
        names.add("Anotida Maditsha");
        names.add("Farirai Madicha");
        names.add("Mufaro Madicha");

        return names;
    }

}
