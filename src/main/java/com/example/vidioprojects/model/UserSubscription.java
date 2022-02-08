package com.example.vidioprojects.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.MetaValue;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
    @Column(name = "subs_id")
    private int subscriptionId;
    @Column(name = "user_id")
    private int userId;
}
