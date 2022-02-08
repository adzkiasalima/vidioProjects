package com.example.vidioprojects.service;

import com.example.vidioprojects.model.User;
import com.example.vidioprojects.model.UserSubscription;
import com.example.vidioprojects.repository.UserRepository;
import com.example.vidioprojects.repository.UserSubscriptionRepository;
import com.example.vidioprojects.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserSubscriptionRepository userSubscriptionRepository;

    public boolean isUserSubscribed(int userId){
        User user = userRepository.getById(userId);
        List<UserSubscription> userSubscriptionEntry = userSubscriptionRepository.findByUser(user);

        for(UserSubscription entry : userSubscriptionEntry){
            Date start = entry.getStart();
            Date end = entry.getEnd();
            Date now = new Date();
            return (now.before(end) && now.after(start));
        }


        return false;

    }
}
