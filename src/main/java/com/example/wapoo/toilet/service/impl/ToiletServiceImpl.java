package com.example.wapoo.toilet.service.impl;

import com.example.wapoo.toilet.data.dto.request.LocationRegisterRequest;
import com.example.wapoo.toilet.data.dto.request.LocationUpdateRequest;
import com.example.wapoo.toilet.data.dto.response.LocationGetResponse;
import com.example.wapoo.toilet.data.dto.response.LocationRegisterResponse;
import com.example.wapoo.toilet.data.entity.Floor;
import com.example.wapoo.toilet.data.entity.Gender;
import com.example.wapoo.toilet.data.entity.Location;
import com.example.wapoo.toilet.data.entity.Toilet;
import com.example.wapoo.toilet.repository.ToiletRepository;
import com.example.wapoo.toilet.service.ToiletService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
public class ToiletServiceImpl implements ToiletService {

    private final ToiletRepository toiletRepository;

    @Override
    @Transactional(rollbackFor = {RuntimeException.class})
    public LocationRegisterResponse locationRegister(LocationRegisterRequest request) {
        Toilet toilet = Toilet.builder()
                .floor(request.getFloor())
                .location(request.getLocation())
                .state(request.getState())
                .gender(request.getGender())
                .build();
        toiletRepository.save(toilet);
        return new LocationRegisterResponse(
                toilet.getId(),
                toilet.getLocation(),
                toilet.getState(),
                toilet.getGender()
        );
    }

    @Override
    @Transactional(rollbackFor = {RuntimeException.class},readOnly = true)
    public LocationGetResponse locationGet(Location location, Floor floor){
        Toilet male = toiletRepository.findByLocationAndFloorAndGender(location,floor, Gender.MALE);
        Toilet female = toiletRepository.findByLocationAndFloorAndGender(location,floor,Gender.FEMALE);
        return new LocationGetResponse(
                male.getState(),
                female.getState()
        );
    }

    @Override
    @Transactional(rollbackFor = {RuntimeException.class})
    public void locationUpdate(LocationUpdateRequest request) {
        Toilet toilet = toiletRepository.findById(request.getId())
                .orElseThrow(IllegalArgumentException::new);
        log.info(String.valueOf(toilet.getId()));
        toilet.update(request.getState());
    }

}
