package com.example.wapoo.toilet.data.dto.request;

import com.example.wapoo.toilet.data.entity.Floor;
import com.example.wapoo.toilet.data.entity.Gender;
import com.example.wapoo.toilet.data.entity.Location;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LocationRegisterRequest {
    @NotBlank
    private Location location;
    @NotBlank
    private Floor floor;
    @NotBlank
    private Integer state;
    @NotBlank
    private Gender gender;
}
