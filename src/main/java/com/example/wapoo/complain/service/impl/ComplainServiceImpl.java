package com.example.wapoo.complain.service.impl;

import com.example.wapoo.complain.data.dto.request.ComplainWriteReqeust;
import com.example.wapoo.complain.data.dto.response.ComplainGetsResponse;
import com.example.wapoo.complain.data.entity.Complain;
import com.example.wapoo.complain.repository.ComplainRepository;
import com.example.wapoo.complain.service.ComplainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ComplainServiceImpl implements ComplainService {

    private final ComplainRepository complainRepository;

    public void complainWrite(ComplainWriteReqeust complainWriteReqeust) {
        Complain complain = Complain.builder()
                .title(complainWriteReqeust.getTitle())
                .build();
        complainRepository.save(complain);
    }

    public List<ComplainGetsResponse> complainGets() {
        List<Complain> complains = complainRepository.findAll();
        List<ComplainGetsResponse> responses = new ArrayList<>();

        for (Complain complain: complains) {
            responses.add(new ComplainGetsResponse(
                    complain.getId(),
                    complain.getTitle()
            ));
        }
        return responses;
    }
}
