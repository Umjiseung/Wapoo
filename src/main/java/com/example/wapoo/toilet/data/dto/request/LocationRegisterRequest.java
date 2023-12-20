package com.example.wapoo.toilet.data.dto.request;

import com.example.wapoo.toilet.data.enums.Floor;
import com.example.wapoo.toilet.data.enums.Gender;
import com.example.wapoo.toilet.data.enums.Location;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LocationRegisterRequest {
    @NotBlank
    private Location location;
    @NotBlank
    private Floor floor;
    @NotNull
    private Integer state;
    @NotBlank
    private Gender gender;
}
