package com.example.profile.model;

import com.example.profile.MainActivity;

import java.util.List;

public class TopAnimalsData {

    String animalName;
    String countryAnimal;
    String population;
    Integer imageUrl;

    public <RecentsData> TopAnimalsData(MainActivity recentsDataMainActivity, List<TopAnimalsData> topAnimalsDataList) {
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public TopAnimalsData(String animalName, String countryAnimal, String population, Integer imageUrl) {
        this.animalName = animalName;
        this.countryAnimal = countryAnimal;
        this.population = population;
        this.imageUrl = imageUrl;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getCountryAnimal() {
        return countryAnimal;
    }

    public void setCountryAnimal(String countryAnimal) {
        this.countryAnimal = countryAnimal;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
}