package com.example.wapoo.toilet.controller;

import com.example.wapoo.toilet.data.dto.request.LocationRegisterRequest;
import com.example.wapoo.toilet.data.dto.request.LocationUpdateRequest;
import com.example.wapoo.toilet.data.dto.response.LocationGetResponse;
import com.example.wapoo.toilet.data.dto.response.LocationRegisterResponse;
import com.example.wapoo.toilet.data.entity.Floor;
import com.example.wapoo.toilet.data.entity.Location;
import com.example.wapoo.toilet.service.WapooService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/wapoo")
public class WapooController {

    private final WapooService wapooService;

    @PostMapping
    public ResponseEntity<LocationRegisterResponse> locationRegister(@RequestBody LocationRegisterRequest request) {
        return new ResponseEntity<>(wapooService.locationRegister(request), HttpStatus.CREATED);
    }

    @GetMapping("/{location}/{floor}")
    public ResponseEntity<LocationGetResponse> locationGet(
            @PathVariable("location") Location location,
            @PathVariable("floor") Floor floor
            ) {
        return ResponseEntity.ok(wapooService.locationGet(location,floor));
    }

    @PatchMapping
    public ResponseEntity<Void> stateUpdate(@RequestBody LocationUpdateRequest locationUpdateRequest) {
        wapooService.locationUpdate(locationUpdateRequest);
        return new ResponseEntity<>(HttpStatus.RESET_CONTENT);
    }

}
