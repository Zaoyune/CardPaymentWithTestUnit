package com.amigoscode.testing.utils;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class PhoneNumberValidator implements Predicate<String> {

/*Predicate in general meaning is a statement about something that is
either true or false. In programming, predicates represent single argument
functions that return a boolean value.*/
    @Override
    public boolean test(String phoneNumber) {
        return phoneNumber.startsWith("+44") &&
                phoneNumber.length()==13;
    }
}
