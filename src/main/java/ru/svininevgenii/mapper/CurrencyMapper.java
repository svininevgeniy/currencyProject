package ru.svininevgenii.mapper;

import org.mapstruct.Mapper;
import ru.svininevgenii.dto.CurrencyDto;
import ru.svininevgenii.entity.CurrencyEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CurrencyMapper {

    CurrencyDto toCurrencyDto(CurrencyEntity currencyEntity);
    List<CurrencyDto> toCurrencyDtoList(List<CurrencyEntity> currencyEntities);
}
