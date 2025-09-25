package com.madhavareddy;

import com.madhavareddy.service.CollageService;
import com.madhavareddy.service.StudentService;
import com.madhavareddy.service.data.Collage;
import com.madhavareddy.service.data.Student;
import com.madhavareddy.service.data.University;

import java.util.concurrent.CompletableFuture;

public class CompletableFeatureService {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        CollageService collegeService = new CollageService();

        CompletableFuture<Student> studentFuture = studentService.getStudent();
        CompletableFuture<Collage> collageFuture = collegeService.getCollage();

        CompletableFuture<University> universityFuture = studentFuture.exceptionally(ex -> new Student("Default Student"))
                .thenCombine(collageFuture.exceptionally(ex -> new Collage("Default Collage")), (University::new));

        University university = universityFuture.join();
        System.out.println(university);


    }
}
