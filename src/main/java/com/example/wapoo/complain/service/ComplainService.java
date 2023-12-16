package com.example.wapoo.complain.service;

import com.example.wapoo.complain.data.dto.request.ComplainWriteReqeust;
import com.example.wapoo.complain.data.dto.response.ComplainGetsResponse;

import java.util.List;

public interface ComplainService {
    void complainWrite(ComplainWriteReqeust complainWriteReqeust);
    List<ComplainGetsResponse> complainGets();
}
