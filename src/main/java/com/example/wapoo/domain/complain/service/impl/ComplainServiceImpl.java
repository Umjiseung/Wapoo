package com.example.wapoo.domain.complain.service.impl;

import com.example.wapoo.domain.complain.data.dto.request.ComplainWriteReqeust;
import com.example.wapoo.domain.complain.data.dto.response.ComplainGetsResponse;
import com.example.wapoo.domain.complain.data.entity.Complain;
import com.example.wapoo.domain.complain.repository.ComplainRepository;
import com.example.wapoo.domain.complain.service.ComplainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ComplainServiceImpl implements ComplainService {

    private final ComplainRepository complainRepository;

    @Transactional(rollbackFor = {RuntimeException.class})
    public void complainWrite(ComplainWriteReqeust complainWriteReqeust) {
        SimpleDateFormat dateFormat = new SimpleDateFormat ( "yyyyMMdd");
        Date time = new Date();
        String result = dateFormat.format(time);

        Complain complain = Complain.builder()
                .title(complainWriteReqeust.getTitle())
                .time(result)
                .build();

        complainRepository.save(complain);
    }

    @Transactional(readOnly = true,rollbackFor = {RuntimeException.class})
    public List<ComplainGetsResponse> complainGets() {
        List<Complain> complains = complainRepository.findAll();
        List<ComplainGetsResponse> responses = new ArrayList<>();

        for (Complain complain: complains) {
            responses.add(new ComplainGetsResponse(
                    complain.getId(),
                    complain.getTitle(),
                    complain.getTime()
            ));
        }
        return responses;
    }
}
