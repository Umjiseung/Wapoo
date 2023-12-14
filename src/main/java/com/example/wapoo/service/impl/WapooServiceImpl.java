package com.example.wapoo.service.impl;

import com.example.wapoo.data.dto.request.LocationRegisterRequest;
import com.example.wapoo.data.dto.request.StateUpdateRequest;
import com.example.wapoo.data.dto.response.LocationRegisterResponse;
import com.example.wapoo.data.entity.Gender;
import com.example.wapoo.data.entity.Wapoo;
import com.example.wapoo.repository.WapooRepository;
import com.example.wapoo.service.WapooService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WapooServiceImpl implements WapooService {

    private final WapooRepository wapooRepository;

    @Transactional(rollbackFor = {RuntimeException.class})
    public LocationRegisterResponse locationRegister(LocationRegisterRequest request) {
        Wapoo location = Wapoo.builder()
                .id(request.getId())
                .location(request.getLocation())
                .state(request.getState())
                .build();
        wapooRepository.save(location);
        return new LocationRegisterResponse(
                location.getId(),
                location.getLocation(),
                location.getState()
                );
    }

    @Transactional(readOnly = true,rollbackFor = {RuntimeException.class})
    public Integer locationOfGenderGets(Gender gender) {
        List<Wapoo> male = wapooRepository.findByGender(Gender.MALE);
        List<Wapoo> female = wapooRepository.findByGender(Gender.FEMALE);
        int maleLastRoom = 0;
        int femaleLastRoom = 0;
        for (Wapoo wapoo : male) {
            maleLastRoom++;
        }
        return maleLastRoom;
    }

    @Transactional(rollbackFor = {RuntimeException.class})
    public void stateUpdate(StateUpdateRequest stateUpdateRequest) {
        Wapoo wapoo = wapooRepository.findById(stateUpdateRequest.getId())
                .orElseThrow(IllegalAccessError::new);

        wapoo.update(stateUpdateRequest);
    }

}
