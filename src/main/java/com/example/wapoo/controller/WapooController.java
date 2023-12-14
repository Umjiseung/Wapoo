package com.example.wapoo.controller;

import com.example.wapoo.data.dto.request.LocationRegisterRequest;
import com.example.wapoo.data.dto.request.StateUpdateRequest;
import com.example.wapoo.data.dto.response.LocationOfGenderGetsResponse;
import com.example.wapoo.data.dto.response.LocationRegisterResponse;
import com.example.wapoo.data.entity.Gender;
import com.example.wapoo.service.WapooService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class WapooController {

    private final WapooService wapooService;

    @PostMapping
    public ResponseEntity<LocationRegisterResponse> locationRegister(@RequestBody LocationRegisterRequest request) {
        wapooService.locationRegister(request);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{gender}")
    public ResponseEntity<List<LocationOfGenderGetsResponse>> locationOfGenderGets(@PathVariable Gender gender) {
        wapooService.locationOfGenderGets(gender);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<String> stateUpdate(@RequestBody StateUpdateRequest stateUpdateRequest) {
        wapooService.stateUpdate(stateUpdateRequest);
        return ResponseEntity.ok("업데이트 되었습니다.");
    }

}
