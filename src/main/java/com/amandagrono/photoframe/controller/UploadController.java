package com.amandagrono.photoframe.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController("/api/v1/upload")
public class UploadController {


    @PostMapping("/single")
    public ResponseEntity<String> uploadSingle(@RequestParam("file") MultipartFile file) {


        return ResponseEntity.ok().body(file.getOriginalFilename());
    }
}
