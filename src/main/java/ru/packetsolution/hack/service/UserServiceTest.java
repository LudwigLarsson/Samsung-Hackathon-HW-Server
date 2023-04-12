package ru.packetsolution.hack.service;

import lombok.NonNull;

public class UserServiceTest {
    // проверяет номер на длину и соответствие стандарту
    public boolean phoneNumIsStd(@NonNull String phone){
        if (phone != null) {
            String[] phoneSplit = phone.split(" ");
            if (phoneSplit.length != 12) return false;
            if (!phoneSplit[0].equals("+")) return false;
            return true;
        }
        else {
            return true;
        }
    }
    public boolean emailIsStd(@NonNull String email){
        if(email != null) {
            if (email.contains("@")) return false;
            if (email.contains(".")) return false;
            return true;
        }
        else {
            return true;
        }
    }
}

