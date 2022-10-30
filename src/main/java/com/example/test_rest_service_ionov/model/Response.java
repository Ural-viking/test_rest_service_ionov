package com.example.test_rest_service_ionov.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class Response {

    private String uid;
    private String operationUid;
    private String systemTime;
    private String code;
    private String errorCode;
    private String errorMessage;

}