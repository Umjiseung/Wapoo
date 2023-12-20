package com.example.wapoo.toilet.service.impl;

import com.example.wapoo.toilet.data.dto.request.LocationRegisterRequest;
import com.example.wapoo.toilet.data.dto.request.LocationUpdateRequest;
import com.example.wapoo.toilet.data.dto.response.LocationGetResponse;
import com.example.wapoo.toilet.data.dto.response.LocationRegisterResponse;
import com.example.wapoo.toilet.data.enums.Floor;
import com.example.wapoo.toilet.data.enums.Gender;
import com.example.wapoo.toilet.data.enums.Location;
import com.example.wapoo.toilet.data.entity.Toilet;
import com.example.wapoo.toilet.repository.ToiletRepository;
import com.example.wapoo.toilet.service.ToiletService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ToiletServiceImpl implements ToiletService {

    private final ToiletRepository toiletRepository;

    @Override
    @Transactional(rollbackFor = {RuntimeException.class})
    public LocationRegisterResponse locationRegister(LocationRegisterRequest request) {
        Toilet toilet = Toilet.builder()
                .location(request.getLocation())
                .floor(request.getFloor())
                .gender(request.getGender())
                .position(request.getPosition())
                .state(request.getState())
                .build();
        toiletRepository.save(toilet);
        return new LocationRegisterResponse(
                toilet.getId(),
                toilet.getLocation(),
                toilet.getFloor(),
                toilet.getGender(),
                toilet.getPosition(),
                toilet.getState()
        );
    }

    @Override
    @Transactional(rollbackFor = {RuntimeException.class},readOnly = true)
    public List<LocationGetResponse> locationGet(Location location, Floor floor){
        List<Toilet> toilets = toiletRepository.findByLocationAndFloor(location,floor);
        List<LocationGetResponse> responses = new ArrayList<>();

        for (Toilet toilet: toilets) {
            responses.add(new LocationGetResponse(
               toilet.getGender(),
               toilet.getPosition(),
               toilet.getState()
            ));
        }
        return responses;
    }

    @Override
    @Transactional(rollbackFor = {RuntimeException.class})
    public void locationUpdate(LocationUpdateRequest request) {
        Toilet toilet = toiletRepository.findByIdAndPosition(request.getId(), request.getPosition());
        toilet.update(request.getState());
    }

}
