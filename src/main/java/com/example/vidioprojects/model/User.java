package com.example.vidioprojects.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@Table(name="user")
public class User {
    @Column
    @Id
    private int id;
    @Column
    private String name;

}
