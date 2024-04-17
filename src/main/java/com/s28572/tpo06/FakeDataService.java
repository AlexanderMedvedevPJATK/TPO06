package com.s28572.tpo06;

import com.github.javafaker.Faker;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FakeDataService {
    public List<PersonDTO> generateFakeData(PersonFormDTO personFormDTO) {
        List<PersonDTO> fakeData = new ArrayList<>();
        Faker faker = new Faker(personFormDTO.getLocale());
        StringBuilder sb = new StringBuilder();
        PersonDTO personDTO;

        for (int i = 0; i < personFormDTO.getQuantity(); i++) {
            personDTO = new PersonDTO();
            personDTO.setFirstName(faker.name().firstName());
            personDTO.setLastName(faker.name().lastName());
            personDTO.setBirthDate(new SimpleDateFormat("dd/MM/yyyy").format(faker.date().birthday()));

            if (personFormDTO.getCountry() != null) {
                personDTO.setCountry(faker.country().name());
            }
            if (personFormDTO.getAddress() != null) {
                personDTO.setAddress(faker.address().fullAddress());
            }
            if (personFormDTO.getUniversity() != null) {
                personDTO.setUniversity(faker.university().name());
            }
            if (personFormDTO.getJob() != null) {
                personDTO.setJob(faker.job().title());
            }
            if (personFormDTO.getCompany() != null) {
                personDTO.setCompany(faker.company().name());
            }
            if (personFormDTO.getSuperhero() != null) {
                personDTO.setSuperhero(faker.superhero().name());
            }
            if (personFormDTO.getHarryPotter() != null) {
                personDTO.setHarryPotter(faker.harryPotter().character());
            }
            if (personFormDTO.getBeer() != null) {
                personDTO.setBeer(faker.beer().name());
            }

            fakeData.add(personDTO);
        }

        return fakeData;
    }
}
