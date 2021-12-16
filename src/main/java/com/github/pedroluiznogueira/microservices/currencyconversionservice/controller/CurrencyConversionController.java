package com.github.pedroluiznogueira.microservices.currencyconversionservice.controller;

import com.github.pedroluiznogueira.microservices.currencyconversionservice.model.CurrencyConversion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

    @GetMapping("currency-exchange/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calculateCurrencyConversion(
        @PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
        return new CurrencyConversion(1001L, from, to, quantity, BigDecimal.ONE, BigDecimal.ONE, " ");
    }
}
