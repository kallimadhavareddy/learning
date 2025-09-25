package com.madhavareddy.service.data;

import com.madhavareddy.CompletableFeatureService;

public class University {
    Student student;
    Collage college;

    public University(Student student, Collage college) {
        this.student = student;
        this.college = college;
    }

    @Override
    public String toString() {
        return "University{" +
                "student=" + student +
                ", college=" + college +
                '}';
    }
}
