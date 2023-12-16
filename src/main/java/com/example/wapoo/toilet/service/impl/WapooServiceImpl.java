package com.example.wapoo.toilet.service.impl;

import com.example.wapoo.toilet.data.dto.request.LocationRegisterRequest;
import com.example.wapoo.toilet.data.dto.request.LocationUpdateRequest;
import com.example.wapoo.toilet.data.dto.response.LocationGetResponse;
import com.example.wapoo.toilet.data.dto.response.LocationRegisterResponse;
import com.example.wapoo.toilet.data.entity.Floor;
import com.example.wapoo.toilet.data.entity.Gender;
import com.example.wapoo.toilet.data.entity.Location;
import com.example.wapoo.toilet.data.entity.Wapoo;
import com.example.wapoo.toilet.repository.WapooRepository;
import com.example.wapoo.toilet.service.WapooService;
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
    public LocationGetResponse locationGet(Location location, Floor floor){
        Wapoo male = wapooRepository.findByLocationAndFloorAndGender(location,floor, Gender.MALE);
        Wapoo female = wapooRepository.findByLocationAndFloorAndGender(location,floor,Gender.FEMALE);
        return new LocationGetResponse(
                male.getState(),
                female.getState()
        );
    }

    @Override
    @Transactional(rollbackFor = {RuntimeException.class})
    public void locationUpdate(LocationUpdateRequest request) {
        Wapoo wapoo = wapooRepository.findById(request.getId())
                .orElseThrow(IllegalArgumentException::new);
        wapoo.update(request.getState());
    }

}
