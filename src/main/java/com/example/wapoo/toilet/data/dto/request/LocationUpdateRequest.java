package com.example.wapoo.toilet.data.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LocationUpdateRequest {
    @NotBlank
    private Long id;
    @NotBlank
    private Integer state;

}
