package com.example.wapoo.complain.data.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ComplainGetsResponse {
    private Long id;
    private String title;

    public ComplainGetsResponse(Long id, String title) {
        this.id = id;
        this.title = title;
    }
}
