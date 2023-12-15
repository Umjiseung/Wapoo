package com.example.wapoo.data.dto.response;

import com.example.wapoo.data.entity.Floor;
import com.example.wapoo.data.entity.Gender;
import com.example.wapoo.data.entity.Location;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LocationUpdateResponse {

    private Long id;
    private Integer state;
    private Location location;
    private Floor floor;
    private Gender gender;

    public LocationUpdateResponse(Long id, Integer state, Location location, Floor floor, Gender gender) {
        this.id = id;
        this.state = state;
        this.location = location;
        this.floor = floor;
        this.gender = gender;
    }
}
