package com.example.wapoo.data.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LocationOfGenderGetsResponse {
    private Long id;
    private String location;
    private Boolean state;

    public LocationOfGenderGetsResponse(Long id, String location, Boolean state) {
        this.id = id;
        this.location = location;
        this.state = state;
    }
}
