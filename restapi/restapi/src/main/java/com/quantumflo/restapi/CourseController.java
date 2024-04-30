package com.quantumflo.restapi;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
@Component
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> fetchCourses() {
        return Arrays.asList(new Course("DSA", 3, "Striver"),
        new Course("System Design", 3, "Educative")
        );
    }
}
