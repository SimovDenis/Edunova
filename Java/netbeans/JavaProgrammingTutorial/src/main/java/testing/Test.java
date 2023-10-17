package testing;

import com.github.javafaker.Faker;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Faker faker = new Faker();        

        List<LocalTime> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Date vrijeme = faker.date().birthday();
            LocalTime satMin = Instant.ofEpochMilli(vrijeme.getTime()).atZone(ZoneId.systemDefault()).toLocalTime();            
            lista.add(satMin);
            System.out.println(lista.get(i));
        }
    }
}
