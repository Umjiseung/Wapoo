package com.example.wapoo.toilet.service;

import com.example.wapoo.toilet.data.dto.request.LocationRegisterRequest;
import com.example.wapoo.toilet.data.dto.request.LocationUpdateRequest;
import com.example.wapoo.toilet.data.dto.response.LocationGetResponse;
import com.example.wapoo.toilet.data.dto.response.LocationRegisterResponse;
import com.example.wapoo.toilet.data.enums.Floor;
import com.example.wapoo.toilet.data.enums.Gender;
import com.example.wapoo.toilet.data.enums.Location;

import java.util.List;

public interface ToiletService {

    LocationRegisterResponse locationRegister(LocationRegisterRequest locationRegisterRequest);
    List<LocationGetResponse> locationGet(Location location, Floor floor, Gender gender);
    void locationUpdate(LocationUpdateRequest locationUpdateRequest);
}
