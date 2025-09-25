package com.madhavareddy.service;

import com.madhavareddy.service.data.Collage;
import com.madhavareddy.service.data.Student;

import java.util.concurrent.CompletableFuture;

public class CollageService {
    public CompletableFuture<Collage> getCollage() {
        sleep(800);
        return CompletableFuture.supplyAsync(() -> new Collage("Saint Luc University medical"));
    };

    public void sleep(long ms) {
        try { Thread.sleep(ms);
        } catch (InterruptedException e) { }
    }
}
