package com.example.wapoo.toilet.data.dto.response;

import com.example.wapoo.toilet.data.enums.Floor;
import com.example.wapoo.toilet.data.enums.Gender;
import com.example.wapoo.toilet.data.enums.Location;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class LocationRegisterResponse {
    private Long id;
    private Location location;
    private Floor floor;
    private Gender gender;
    private Integer position;
    private Boolean state;

    public LocationRegisterResponse(Long id, Location location, Floor floor, Gender gender, Integer position, Boolean state) {
        this.id = id;
        this.location = location;
        this.floor = floor;
        this.gender = gender;
        this.position = position;
        this.state = state;
    }
}
