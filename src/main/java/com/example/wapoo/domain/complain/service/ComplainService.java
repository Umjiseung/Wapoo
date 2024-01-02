package com.example.wapoo.domain.complain.service;

import com.example.wapoo.domain.complain.data.dto.request.ComplainWriteReqeust;
import com.example.wapoo.domain.complain.data.dto.response.ComplainGetsResponse;

import java.util.List;

public interface ComplainService {
    void complainWrite(ComplainWriteReqeust complainWriteReqeust);
    List<ComplainGetsResponse> complainGets();
}
