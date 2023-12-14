package com.example.wapoo.service;

import com.example.wapoo.data.dto.request.LocationRegisterRequest;
import com.example.wapoo.data.dto.request.StateUpdateRequest;
import com.example.wapoo.data.dto.response.LocationRegisterResponse;
import com.example.wapoo.data.entity.Gender;

public interface WapooService {

    LocationRegisterResponse locationRegister(LocationRegisterRequest locationRegisterRequest);

    Integer locationOfGenderGets(Gender gender);

    void stateUpdate(StateUpdateRequest stateUpdateRequest);
}
