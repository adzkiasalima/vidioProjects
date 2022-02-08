package com.example.vidioprojects.dto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter@Getter
@Builder
public class VideoResponse {

    int videoId;
    int isPremier;
    String name;
}
