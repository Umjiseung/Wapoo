package com.example.wapoo.service;

import com.example.wapoo.data.dto.request.LocationRegisterRequest;
import com.example.wapoo.data.dto.request.LocationUpdateRequest;
import com.example.wapoo.data.dto.response.LocationGetResponse;
import com.example.wapoo.data.dto.response.LocationRegisterResponse;
import com.example.wapoo.data.dto.response.LocationUpdateResponse;
import com.example.wapoo.data.entity.Floor;
import com.example.wapoo.data.entity.Location;

public interface WapooService {

    LocationRegisterResponse locationRegister(LocationRegisterRequest locationRegisterRequest);
    LocationGetResponse locationGet(Location location, Floor floor);
    LocationUpdateResponse locationUpdate(LocationUpdateRequest locationUpdateRequest);
}
