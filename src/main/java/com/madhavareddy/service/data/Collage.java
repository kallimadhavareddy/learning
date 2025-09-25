package com.madhavareddy.service.data;

public class Collage{
    String details ;

    public Collage(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Collage{" +
                "details='" + details + '\'' +
                '}';
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}
