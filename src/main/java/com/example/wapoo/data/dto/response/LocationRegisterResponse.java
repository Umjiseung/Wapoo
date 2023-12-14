package com.example.wapoo.data.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class LocationRegisterResponse {
    private Long id;
    private String location;
    private Boolean state;

    public LocationRegisterResponse(Long id, String location, Boolean state) {
        this.id = id;
        this.location = location;
        this.state = state;
    }
}
