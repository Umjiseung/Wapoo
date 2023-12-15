package com.example.wapoo.controller;

import com.example.wapoo.data.dto.request.LocationRegisterRequest;
import com.example.wapoo.data.dto.request.LocationUpdateRequest;
import com.example.wapoo.data.dto.response.LocationGetResponse;
import com.example.wapoo.data.dto.response.LocationRegisterResponse;
import com.example.wapoo.data.dto.response.LocationUpdateResponse;
import com.example.wapoo.data.entity.Floor;
import com.example.wapoo.data.entity.Gender;
import com.example.wapoo.data.entity.Location;
import com.example.wapoo.service.WapooService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/wapoo")
public class WapooController {

    private final WapooService wapooService;

    @PostMapping
    public ResponseEntity<LocationRegisterResponse> locationRegister(@RequestBody LocationRegisterRequest request) {
        wapooService.locationRegister(request);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<LocationGetResponse> locationGet(@RequestParam("location") Location location, @RequestParam("floor") Floor floor) {
        wapooService.locationGet(location,floor);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<LocationUpdateResponse> stateUpdate(@RequestBody LocationUpdateRequest locationUpdateRequest) {
        wapooService.locationUpdate(locationUpdateRequest);
        return new ResponseEntity<>(HttpStatus.RESET_CONTENT);
    }

}
