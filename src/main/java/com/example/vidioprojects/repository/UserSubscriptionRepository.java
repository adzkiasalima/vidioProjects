package com.example.vidioprojects.repository;

import com.example.vidioprojects.model.Subscription;
import com.example.vidioprojects.model.User;
import com.example.vidioprojects.model.UserSubscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserSubscriptionRepository extends JpaRepository<UserSubscription, Integer> {

    List<UserSubscription> findByUser(User user);

    List<UserSubscription> findBySubscription(Subscription subscription);

}
