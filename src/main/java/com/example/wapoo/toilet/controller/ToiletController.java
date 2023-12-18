package com.example.wapoo.toilet.controller;

import com.example.wapoo.toilet.data.dto.request.LocationRegisterRequest;
import com.example.wapoo.toilet.data.dto.request.LocationUpdateRequest;
import com.example.wapoo.toilet.data.dto.response.LocationGetResponse;
import com.example.wapoo.toilet.data.dto.response.LocationRegisterResponse;
import com.example.wapoo.toilet.data.entity.Floor;
import com.example.wapoo.toilet.data.entity.Location;
import com.example.wapoo.toilet.service.ToiletService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/toilet")
public class ToiletController {

    private final ToiletService toiletService;

    @PostMapping
    public ResponseEntity<LocationRegisterResponse> locationRegister(@RequestBody LocationRegisterRequest request) {
        return new ResponseEntity<>(toiletService.locationRegister(request), HttpStatus.CREATED);
    }

    @GetMapping("/{location}/{floor}")
    public ResponseEntity<LocationGetResponse> locationGet(
            @PathVariable("location") Location location,
            @PathVariable("floor") Floor floor
            ) {
        return ResponseEntity.ok(toiletService.locationGet(location,floor));
    }

    @PatchMapping
    public ResponseEntity<Void> stateUpdate(@Valid @RequestBody LocationUpdateRequest locationUpdateRequest) {
        toiletService.locationUpdate(locationUpdateRequest);
        return new ResponseEntity<>(HttpStatus.RESET_CONTENT);
    }

}
