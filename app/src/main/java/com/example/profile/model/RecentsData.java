package com.example.profile.model;

public class RecentsData{

    String animalName;
    String countryAnimal;
    String population;
    Integer imageUrl;

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public RecentsData(String animalName, String countryAnimal, String population, Integer imageUrl) {
        this.animalName = animalName;
        this.countryAnimal = countryAnimal;
        this.population = population;
        this.imageUrl = imageUrl;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setPlaceName(String animalName) {
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