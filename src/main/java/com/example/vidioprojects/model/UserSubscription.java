package com.example.vidioprojects.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name="usr_subs")
public class UserSubscription {
    @Column
    @Id
    private int id;
    @Column(name = "start")
    private Date start;
    @Column(name = "end")
    private Date end;

    @ManyToOne
    @JoinColumn(name="subs_id", nullable=false)
    private Subscription subscription;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
}


