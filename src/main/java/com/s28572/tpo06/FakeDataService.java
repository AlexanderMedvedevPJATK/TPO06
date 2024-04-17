package com.s28572.tpo06;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Service
public class FakeDataService {
    public List<Person> generateFakeData(PersonFormDTO personFormDTO) {
        Faker faker = new Faker(personFormDTO.getLocale());
        List<Person> people = Stream.generate(Person::new).limit(personFormDTO.getQuantity()).toList();

        for (int i = 0; i < personFormDTO.getQuantity(); i++) {
            people.get(i).setLanguage(personFormDTO.getLocale().toString());
            people.get(i).setFirstName(faker.name().firstName());
            people.get(i).setLastName(faker.name().lastName());
            people.get(i).setBirthDate(new SimpleDateFormat("dd/MM/yyyy").format(faker.date().birthday()));
        }

        people.forEach(person -> {
            person.setLanguage(personFormDTO.getLocale().toString());
            person.setFirstName(faker.name().firstName());
            person.setLastName(faker.name().lastName());
            person.setBirthDate(new SimpleDateFormat("dd/MM/yyyy").format(faker.date().birthday()));
        });

        if (personFormDTO.getCountry() != null) {
            people.forEach(person -> person.setCountry(faker.country().name()));
        }
        if (personFormDTO.getAddress() != null) {
            people.forEach(person -> person.setAddress(faker.address().fullAddress()));
        }
        if (personFormDTO.getUniversity() != null) {
            people.forEach(person -> person.setUniversity(faker.university().name()));
        }
        if (personFormDTO.getJob() != null) {
            people.forEach(person -> person.setJob(faker.job().title()));
        }
        if (personFormDTO.getCompany() != null) {
            people.forEach(person -> person.setCompany(faker.company().name()));
        }
        if (personFormDTO.getSuperhero() != null) {
            people.forEach(person -> person.setSuperhero(faker.superhero().name()));
        }
        if (personFormDTO.getHarryPotter() != null) {
            people.forEach(person -> person.setHarryPotter(faker.harryPotter().character()));
        }
        if (personFormDTO.getBeer() != null) {
            people.forEach(person -> person.setBeer(faker.beer().name()));
        }

        return people;
    }
}
