package com.example.wapoo.toilet.service;

import com.example.wapoo.toilet.data.dto.request.LocationRegisterRequest;
import com.example.wapoo.toilet.data.dto.request.LocationUpdateRequest;
import com.example.wapoo.toilet.data.dto.response.LocationGetResponse;
import com.example.wapoo.toilet.data.dto.response.LocationRegisterResponse;
import com.example.wapoo.toilet.data.entity.Floor;
import com.example.wapoo.toilet.data.entity.Location;

public interface ToiletService {

    LocationRegisterResponse locationRegister(LocationRegisterRequest locationRegisterRequest);
    LocationGetResponse locationGet(Location location, Floor floor);
    void locationUpdate(LocationUpdateRequest locationUpdateRequest);
}
