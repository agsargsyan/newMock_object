package com.example.newMock.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class ResponseDTO {
    private String rqUID;
    private String clientId;
    private String account;
    private BigDecimal balance;
    private String currency;
    private BigDecimal maxLimit;
}
