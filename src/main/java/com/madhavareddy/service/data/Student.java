package com.madhavareddy.service.data;

public  class Student {
    String details;

    @Override
    public String toString() {
        return "Student{" +
                "details='" + details + '\'' +
                '}';
    }

    public Student(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
