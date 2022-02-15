package com.example.minah;

import org.springframework.stereotype.Service;

@Service
public class EnrolmentService {

    public String getSubject() {
        String title = "과목명:";
        String subject = "공학수학";
        return title + subject;
    }

}
