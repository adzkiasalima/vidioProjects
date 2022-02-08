package com.example.vidioprojects.service;

import com.example.vidioprojects.repository.VideoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdminServiceTest {
    @Autowired
    AdminService adminService;
    @Autowired
    VideoRepository videoRepository;

    @Test
    public void testSetToPremier(){
        int videoId = 2;
        adminService.setVideoToPremiere(videoId);

        assertEquals(1, videoRepository.getById(videoId).getIsPremier());
    }
}