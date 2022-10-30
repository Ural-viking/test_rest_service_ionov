package com.example.test_rest_service_ionov.service;

import com.example.test_rest_service_ionov.model.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("ModifySystemTime")

public class ModifySystemTime implements MyModifyService {
    @Override
    public Response modify(Response response){
        response.setSystemTime("");
        return response;
    }
}