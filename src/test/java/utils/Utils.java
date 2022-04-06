package utils;

import com.github.javafaker.Faker;

public class Utils {
    Faker fake = new Faker();
    public String generateRandomName(){
        return fake.name().name();
    }

    public String generateRandomJob(){
        return fake.job().title();
    }
}
