package com.example.wapoo.toilet.data.dto.request;


import com.example.wapoo.toilet.data.enums.Floor;
import com.example.wapoo.toilet.data.enums.Gender;
import com.example.wapoo.toilet.data.enums.Location;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LocationRegisterRequest {
    @NotNull
    private Location location;
    @NotNull
    private Floor floor;
    @NotNull
    private Gender gender;

    @NotNull
    private Integer position;

    @NotNull
    @JsonProperty("state")
    private Boolean state;
}
