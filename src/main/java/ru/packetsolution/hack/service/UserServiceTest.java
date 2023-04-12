package ru.packetsolution.hack.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import ru.packetsolution.hack.repository.UserRepository;

@RequiredArgsConstructor
public class UserServiceTest {
    private final UserRepository repository;
    public boolean isValidPhoneNumber(String phoneNumber) {
        // Ожидаемый формат: +7XXXXXXXXXX
        return phoneNumber.matches("\\+7\\d{10}");
    }

    /* public boolean isPhoneNumberUnique(String phoneNumber) {
        return repository.findByPhoneNumber(phoneNumber) == null;
    }*/

    public boolean isPhoneNumberLengthValid(String phoneNumber) {
        // Максимально допустимая длина: 11 символов
        return phoneNumber.length() <= 12;
    }

    public boolean isPhoneNumberDigitsOnly(String phoneNumber) {
        // Удаляем все символы, кроме цифр, и сравниваем полученную строку с исходной
        return phoneNumber.replaceAll("\\D+", "").equals(phoneNumber);
    }

    public boolean isInternationalPhoneNumber(String phoneNumber) {
        // Номер телефона должен начинаться с символа "+" и содержать не менее 10 цифр
        return phoneNumber.matches("\\+[1-9]\\d{1,14}");
    }


}

