package Modul_2;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorldStatistics {
    public static void main(String[] args) {

        //országok beolvasása

        List<Country> countries = new ArrayList<>();
        File document = new File("docs/orszagok.txt");

        try {
            Scanner scanner = new Scanner(new File(String.valueOf(document)));

            while (scanner.hasNextLine()) {
                String lines = scanner.nextLine();
                Country country = new Country(lines);
                countries.add(country);

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Ország mérete: " + countries.size());


        //városok beolvasása

       List<City> cities = new ArrayList<>();
        File file = new File("docs/varosok.txt");

        try {
            Scanner scanner = new Scanner(new File(String.valueOf(file)));

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                City city = new City(line);
                cities.add(city);

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println( "Város mérete: " + cities.size());
    }


    }


