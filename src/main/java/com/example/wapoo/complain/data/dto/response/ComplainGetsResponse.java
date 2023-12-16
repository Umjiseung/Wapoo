package com.example.wapoo.complain.data.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ComplainGetsResponse {
    private Long id;
    private String title;
    private String time;

    public ComplainGetsResponse(Long id, String title,String time) {
        this.id = id;
        this.title = title;
        this.time = time;
    }
}
