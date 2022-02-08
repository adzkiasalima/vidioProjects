package com.example.vidioprojects.controller;

import com.example.vidioprojects.dto.SubsResponse;
import com.example.vidioprojects.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserSubsController {
    @Autowired
    UserService userService;

        @GetMapping("/users/subscriptions/{id}")
        public ResponseEntity<SubsResponse> isUserSubscribed(@PathVariable("id") int userId){
            boolean userStatus = userService.isUserSubscribed(userId);
            SubsResponse response = SubsResponse.builder()
                    .userId(userId)
                    .subscriptionStatus(userStatus ? 1 : 0)
                    .build();

            return new ResponseEntity<SubsResponse> (response,HttpStatus.OK);
        }
}
