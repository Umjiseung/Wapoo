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



}
