package com.example.wapoo.domain.toilet.service;

import com.example.wapoo.domain.toilet.data.dto.request.LocationRegisterRequest;
import com.example.wapoo.domain.toilet.data.dto.request.LocationUpdateRequest;
import com.example.wapoo.domain.toilet.data.dto.response.LocationGetResponse;
import com.example.wapoo.domain.toilet.data.dto.response.LocationRegisterResponse;
import com.example.wapoo.domain.toilet.data.enums.Floor;
import com.example.wapoo.domain.toilet.data.enums.Location;

import java.util.List;

public interface ToiletService {

    LocationRegisterResponse locationRegister(LocationRegisterRequest locationRegisterRequest);
    List<LocationGetResponse> locationGet(Location location, Floor floor);
    void locationUpdate(LocationUpdateRequest locationUpdateRequest);
}
