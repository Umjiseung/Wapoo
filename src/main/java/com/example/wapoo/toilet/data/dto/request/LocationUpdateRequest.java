package com.example.wapoo.toilet.data.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LocationUpdateRequest {
    @NotNull
    private Long id;
    @NotNull
    private Integer position;
    @NotNull
    private Boolean state;

}
