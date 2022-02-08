package com.example.vidioprojects.dto;

import com.example.vidioprojects.model.Video;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
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
