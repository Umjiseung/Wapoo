package com.example.wapoo.service.impl;

import com.example.wapoo.data.dto.request.LocationRegisterRequest;
import com.example.wapoo.data.dto.response.LocationRegisterResponse;
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
                .id(request.getId())
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
    public Integer locationGet(Gender gender, Location location){

    }

}
