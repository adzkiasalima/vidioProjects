package com.example.vidioprojects.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subscription")
@Setter@Getter
public class Subscription {
    @Column
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private float price;
    @Column
    private int periode;

}
