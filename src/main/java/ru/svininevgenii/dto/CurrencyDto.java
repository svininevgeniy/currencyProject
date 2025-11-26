package ru.svininevgenii.dto;

import java.math.BigDecimal;

public record CurrencyDto (Long id, String code, BigDecimal rate) {
}
