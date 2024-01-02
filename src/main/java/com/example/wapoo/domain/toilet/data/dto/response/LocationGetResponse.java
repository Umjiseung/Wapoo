package com.example.wapoo.domain.toilet.data.dto.response;

import com.example.wapoo.domain.toilet.data.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LocationGetResponse {
    private Gender gender;
    private Integer position;
    private Boolean state;

    public LocationGetResponse(Gender gender, Integer position, Boolean state) {
        this.gender = gender;
        this.position = position;
        this.state = state;
    }
}
