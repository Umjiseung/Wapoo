package com.example.wapoo.service;

import com.example.wapoo.data.dto.request.LocationRegisterRequest;
import com.example.wapoo.data.dto.request.StateUpdateRequest;
import com.example.wapoo.data.dto.response.LocationOfGenderGetsResponse;
import com.example.wapoo.data.dto.response.LocationRegisterResponse;
import com.example.wapoo.data.entity.Gender;

import java.util.List;

public interface WapooService {

    LocationRegisterResponse locationRegister(LocationRegisterRequest locationRegisterRequest);

    List<LocationOfGenderGetsResponse> locationOfGenderGets(Gender gender);

    void stateUpdate(StateUpdateRequest stateUpdateRequest);
}
