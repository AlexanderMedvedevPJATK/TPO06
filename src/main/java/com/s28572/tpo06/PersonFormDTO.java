package com.s28572.tpo06;

import java.time.LocalDate;
import java.util.Locale;

public class PersonFormDTO {
    private int quantity;
    private Locale locale;
    private String country;
    private String address;
    private String university;
    private String job;
    private String company;
    private String superhero;
    private String harryPotter;
    private String beer;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSuperhero() {
        return superhero;
    }

    public void setSuperhero(String superhero) {
        this.superhero = superhero;
    }

    public String getHarryPotter() {
        return harryPotter;
    }

    public void setHarryPotter(String harryPotter) {
        this.harryPotter = harryPotter;
    }

    public String getBeer() {
        return beer;
    }

    public void setBeer(String beer) {
        this.beer = beer;
    }

    @Override
    public String toString() {
        return "PersonFormDTO{" +
                "quantity='" + quantity + '\'' +
                ", locale=" + locale +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", university='" + university + '\'' +
                ", job='" + job + '\'' +
                ", company='" + company + '\'' +
                ", superhero='" + superhero + '\'' +
                ", harryPotter='" + harryPotter + '\'' +
                ", beer='" + beer + '\'' +
                '}';
    }
}
