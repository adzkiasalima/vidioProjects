package com.example.vidioprojects.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "video")
public class Video {
    @Column
    @Id
    private int id;
    @Column
    private String name;
    @Column(name = "is_premier")
    private int isPremier;

}
