package com.example;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("messageService1")
public class RandomTextMessageService implements MessageService {
    String [] tablica = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    @Override
    public String getMessage() {
        int x = new Random().nextInt(10);

        return tablica[x];
    }
}
