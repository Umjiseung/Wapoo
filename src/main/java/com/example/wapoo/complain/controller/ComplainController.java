package com.example.wapoo.complain.controller;

import com.example.wapoo.complain.data.dto.request.ComplainWriteReqeust;
import com.example.wapoo.complain.data.dto.response.ComplainGetsResponse;
import com.example.wapoo.complain.service.ComplainService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/complain")
@RequiredArgsConstructor
@CrossOrigin
public class ComplainController {

    private final ComplainService complainService;

    @PostMapping
    public ResponseEntity<Void> complainWrite(@RequestBody ComplainWriteReqeust writeReqeust) {
        complainService.complainWrite(writeReqeust);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ComplainGetsResponse>> complainGets() {
        return new ResponseEntity<>(complainService.complainGets(),HttpStatus.OK);
    }



}
