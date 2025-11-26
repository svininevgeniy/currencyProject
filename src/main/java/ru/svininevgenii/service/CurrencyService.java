package ru.svininevgenii.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.svininevgenii.dto.CurrencyDto;
import ru.svininevgenii.mapper.CurrencyMapper;
import ru.svininevgenii.repository.CurrencyRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CurrencyService {

    private final CurrencyRepository currencyRepository;
    private final CurrencyMapper currencyMapper;

    public List<CurrencyDto> getPagedCurrency(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);

        return currencyRepository.findAll(pageable)
                .stream()
                .map(currencyMapper::toCurrencyDto)
                .toList();
    }
}
