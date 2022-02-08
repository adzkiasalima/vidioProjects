package com.example.vidioprojects.service;

import com.example.vidioprojects.model.User;
import com.example.vidioprojects.model.UserSubscription;
import com.example.vidioprojects.model.Video;
import com.example.vidioprojects.repository.UserRepository;
import com.example.vidioprojects.repository.UserSubscriptionRepository;
import com.example.vidioprojects.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class AdminService {
    @Autowired
    VideoRepository videoRepository;
    UserRepository userRepository;
    UserSubscriptionRepository userSubscriptionRepository;

    public Video setVideoToPremiere(int video_id){

        Video video = videoRepository.getById(video_id);
        video.setIsPremier(1);
        videoRepository.save(video);

        return video;
    }

    boolean isUserSubscribed(int userId){
        User user = userRepository.getById(userId);
        List<UserSubscription> userSubscriptionEntry = userSubscriptionRepository.findByUser(user);



        return true;

    }
}
