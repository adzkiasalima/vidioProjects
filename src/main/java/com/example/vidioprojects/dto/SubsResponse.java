package com.example.vidioprojects.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter@Getter
public class SubsResponse {
    int userId;
    int subscriptionStatus;
}
