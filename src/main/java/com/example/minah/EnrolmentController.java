package com.example.minah;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrolmentController {

    @Autowired
    private EnrolmentService enrolmentService;

    @GetMapping("/enrolment")
    public String getSubjects() {
        return enrolmentService.getSubject();
    }
}
