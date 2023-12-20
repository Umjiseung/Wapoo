package com.example.wapoo.toilet.controller;

import com.example.wapoo.toilet.data.dto.request.LocationRegisterRequest;
import com.example.wapoo.toilet.data.dto.request.LocationUpdateRequest;
import com.example.wapoo.toilet.data.dto.response.LocationGetResponse;
import com.example.wapoo.toilet.data.dto.response.LocationRegisterResponse;
import com.example.wapoo.toilet.data.enums.Floor;
import com.example.wapoo.toilet.data.enums.Gender;
import com.example.wapoo.toilet.data.enums.Location;
import com.example.wapoo.toilet.service.ToiletService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/toilet")
public class ToiletController {

    private final ToiletService toiletService;

    @PostMapping
    public ResponseEntity<LocationRegisterResponse> locationRegister(@Valid @RequestBody LocationRegisterRequest request) {
        return new ResponseEntity<>(toiletService.locationRegister(request), HttpStatus.CREATED);
    }

    @GetMapping("/{location}/{floor}/{gender}")
    public ResponseEntity<List<LocationGetResponse>> locationGet(
            @PathVariable("location") Location location,
            @PathVariable("floor") Floor floor,
            @PathVariable("gender")Gender gender
            ) {
        return ResponseEntity.ok(toiletService.locationGet(location,floor,gender));
    }

    @PatchMapping
    public ResponseEntity<Void> stateUpdate(@Valid @RequestBody LocationUpdateRequest locationUpdateRequest) {
        toiletService.locationUpdate(locationUpdateRequest);
        return new ResponseEntity<>(HttpStatus.RESET_CONTENT);
    }

}
