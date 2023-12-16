package com.example.wapoo.toilet.data.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LocationGetResponse {
    private Integer male;
    private Integer female;

    public LocationGetResponse(Integer male, Integer female) {
        this.male = male;
        this.female = female;
    }
}
