package com.madhavareddy.service;

import com.madhavareddy.service.data.Student;

import java.util.concurrent.CompletableFuture;

public class StudentService {
    public  CompletableFuture<Student> getStudent() {
        sleep(800);
        return CompletableFuture.supplyAsync(() -> new Student("Hello Madhava"));
    };

    public void sleep(long ms) {
        try { Thread.sleep(ms);
        } catch (InterruptedException e) { }
    }
}
