package com.example.wapoo.data.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Lombok;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StateUpdateRequest {
    @NotBlank
    private Long id;
    @NotBlank
    private Boolean state;
}
