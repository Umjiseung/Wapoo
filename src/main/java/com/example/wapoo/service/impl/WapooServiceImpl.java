package com.example.wapoo.service.impl;

import com.example.wapoo.data.dto.request.LocationRegisterRequest;
import com.example.wapoo.data.dto.request.LocationUpdateRequest;
import com.example.wapoo.data.dto.response.LocationGetResponse;
import com.example.wapoo.data.dto.response.LocationRegisterResponse;
import com.example.wapoo.data.dto.response.LocationUpdateResponse;
import com.example.wapoo.data.entity.Floor;
import com.example.wapoo.data.entity.Gender;
import com.example.wapoo.data.entity.Location;
import com.example.wapoo.data.entity.Wapoo;
import com.example.wapoo.repository.WapooRepository;
import com.example.wapoo.service.WapooService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class WapooServiceImpl implements WapooService {

    private final WapooRepository wapooRepository;

    @Override
    @Transactional(rollbackFor = {RuntimeException.class})
    public LocationRegisterResponse locationRegister(LocationRegisterRequest request) {

        Wapoo wapoo = Wapoo.builder()
                .floor(request.getFloor())
                .location(request.getLocation())
                .state(request.getState())
                .gender(request.getGender())
                .build();
        wapooRepository.save(wapoo);
        return new LocationRegisterResponse(
                wapoo.getId(),
                wapoo.getLocation(),
                wapoo.getState(),
                wapoo.getGender()
        );
    }

    @Override
    @Transactional(rollbackFor = {RuntimeException.class},readOnly = true)
    public LocationGetResponse locationGet(Location location,Floor floor){

        return new LocationGetResponse(

        );
    }

    @Override
    @Transactional(rollbackFor = {RuntimeException.class})
    public LocationUpdateResponse locationUpdate(LocationUpdateRequest request) {
        Wapoo wapoo = wapooRepository.findById(request.getId())
                .orElseThrow(IllegalAccessError::new);
        wapoo.setState(request.getState());
        return new LocationUpdateResponse(
                wapoo.getId(),
                wapoo.getState(),
                wapoo.getLocation(),
                wapoo.getFloor(),
                wapoo.getGender()
        );
    }

}
