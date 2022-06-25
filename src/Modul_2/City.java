package Modul_2;

public class City {

    private String name;
    private String countryCode;
    private int population;

    private Country country;

    public void city(Country country){}

    public City() {
    }

    public City(String name, String countryCode, int population) {
        this.name = name;
        this.countryCode = countryCode;
        this.population = population;
    }

    public City(String line){
        String[] parts = line.split(",");
        this.name = parts[0];
        this.countryCode = parts[1];
        this.population = Integer.parseInt(parts[2]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
