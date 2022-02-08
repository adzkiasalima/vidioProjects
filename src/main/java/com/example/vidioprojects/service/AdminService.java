package com.example.vidioprojects.service;

import com.example.vidioprojects.model.Video;
import com.example.vidioprojects.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class AdminService {
    @Autowired
    VideoRepository videoRepository;

    public void setVideoToPremiere(int video_id){

        Video video = videoRepository.getById(video_id);
        video.setIsPremier(1);
    }
}
