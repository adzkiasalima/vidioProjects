package com.example.vidioprojects.controller;

import com.example.vidioprojects.dto.VideoResponse;
import com.example.vidioprojects.model.Video;
import com.example.vidioprojects.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/videos")
    public ResponseEntity<List<VideoResponse>> getAllVideos(){
        List<Video> videos = adminService.getAllVideo();
        List<VideoResponse> responses= new ArrayList<>();
        for (Video vid : videos) {
            VideoResponse res = VideoResponse.builder()
                    .name(vid.getName())
                    .videoId(vid.getId())
                    .isPremier(vid.getIsPremier())
                    .build();
            responses.add(res);
        }


        return new ResponseEntity<List<VideoResponse>>(responses, HttpStatus.OK);
    }

}
