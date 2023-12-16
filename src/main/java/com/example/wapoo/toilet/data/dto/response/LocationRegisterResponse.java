package com.example.wapoo.toilet.data.dto.response;

import com.example.wapoo.toilet.data.entity.Gender;
import com.example.wapoo.toilet.data.entity.Location;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class LocationRegisterResponse {
    private Long id;
    private Location location;
    private Integer state;
    private Gender gender;

    public LocationRegisterResponse(Long id, Location location, Integer state, Gender gender) {
        this.id = id;
        this.location = location;
        this.state = state;
        this.gender = gender;
    }
}
