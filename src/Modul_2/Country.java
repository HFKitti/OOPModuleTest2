package Modul_2;

import java.util.*;

public class Country {

    private String code;
    private String name;
    private String continent;
    private String region;
    private double area;
    private int independence;
    private int population;
    private String bossName;

    private City city;

    public Country() {
    }

    public Country(String code, String name, String continent, String region, double area, int independence, int population, String bossName) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.area = area;
        this.independence = independence;
        this.population = population;
        this.bossName = bossName;
    }

    public Country(String lines) {
        String[] parts = lines.split(",");

        if (parts[5].equalsIgnoreCase("NULL")) {
            parts[5] = String.valueOf(0);
            this.code = parts[0];
            this.name = parts[1];
            this.continent = parts[2];
            this.region = parts[3];
            this.area = Double.parseDouble(parts[4]);
            this.independence = 0;
            this.population = Integer.parseInt(parts[6]);
            this.bossName = parts[7];
        }else{
            this.code = parts[0];
            this.name = parts[1];
            this.continent = parts[2];
            this.region = parts[3];
            this.area = Double.parseDouble(parts[4]);
            this.independence = Integer.parseInt(parts[5]);
            this.population = Integer.parseInt(parts[6]);
            this.bossName = parts[7];
        }


        /*this.code = parts[0];
        this.name = parts[1];
        this.continent = parts[2];
        this.region = parts[3];
        this.area = Double.parseDouble(parts[4]);
        this.independence = Integer.parseInt(parts[5]);
        this.population = Integer.parseInt(parts[6]);
        this.bossName = parts[7];*/
    }








    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getIndependence() {
        return independence;
    }

    public void setIndependence(int independence) {
        this.independence = independence;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }


    // 3. feladat
    public double getPopulationDensity() {
        List<Country> countries = new ArrayList<>();

        for (int i = 0; i < countries.size(); i++) {
            countries.get(i);
            return population / area;
        }
        return -1;
    }



    //4.feladat
    public double getRuralPopulation(){

       int xy = city.getPopulation() - population;
       return xy;

    }


    //5.feladat
    public Country findCountryByISoCode(String isoCode){
        List<Country> countries = new ArrayList<>();

        isoCode = "AFG";

        for (int i = 0; i < countries.size(); i++) {
            if(code.equalsIgnoreCase(isoCode)){
                System.out.println(countries.get(i));

            }
        }
        return null;
    }

    //6.feladat
    public List<String> getCountriesOfContinent(String continentName) {
        List<Country> countries = new ArrayList<>();

        continentName = "Afganisztán";

        for (int i = 0; i < countries.size(); i++) {
            if (name.equalsIgnoreCase(continentName)) {
                System.out.println(countries.get(i));
            }
            }

        return null;
    }


    //7.feladat
    public Set<String> getCitiesOfCountry(String countryCode){


        return null;
    }



    //8.feladat
    public int countAhmeds() {
        List<String> countries = new ArrayList<>();
        String Ahmed = "Hamad";

        for (int i = 0; i < countries.size(); i++) {
            String find = countries.get(i);
            if (find.equalsIgnoreCase(Ahmed)) {
                return i;
            }
        }
        return 0;
    }




    //9.feladat
   public String getPopularFirstLetter(){
        List<String> countries = new ArrayList<>();

       Set<String> letter = new HashSet<>(countries);
       System.out.println("legnépszerűbb betű: " + letter);
       return "";
    }


    //10.feladat
    public String lastIndependentCountryCode(){

        return null;
    }

}

