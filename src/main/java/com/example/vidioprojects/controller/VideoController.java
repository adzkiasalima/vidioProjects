package com.example.vidioprojects.controller;

import com.example.vidioprojects.dto.VideoResponse;
import com.example.vidioprojects.model.Video;
import com.example.vidioprojects.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class VideoController {
    @Autowired
    AdminService adminService;

    @PatchMapping("/videos/{id}")
    public ResponseEntity<VideoResponse> updatePremierStatus(@PathVariable("id") int videoId) throws Exception {
        try {
            Video video = adminService.setVideoToPremiere(videoId);
            VideoResponse response = VideoResponse.builder()
                    .videoId(video.getId())
                    .isPremier(video.getIsPremier())
                    .name(video.getName())
                    .build();
            return new ResponseEntity<VideoResponse>(response, HttpStatus.ACCEPTED);
        }catch (Exception e){
            throw new Exception();
        }
    }

}
