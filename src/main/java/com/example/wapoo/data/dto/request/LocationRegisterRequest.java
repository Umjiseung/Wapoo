package com.example.wapoo.data.dto.request;

import com.example.wapoo.data.entity.Gender;
import com.example.wapoo.data.entity.Location;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LocationRegisterRequest {
    @NotBlank
    private Long id;
    @NotBlank
    private Location location;
    @NotBlank
    private Integer state;
    @NotBlank
    private Gender gender;
}
