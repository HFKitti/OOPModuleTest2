package main;

/**
 * Az alábbi osztály egyetlen metódust tartalmaz, amely hibásan működik.
 * Írj teszteseteket a test mappában található main.TestTaskTest nevű osztályba,
 * amelyek feltárják a metódus hibáját (vagy hibáit)!
 * (5 pont)
 */
public class TestTask {

    /**
     * A metódus megszámolja a bemeneti paraméterként kapott szám osztóit.
     */
    public static int countDivisors(int number) {
        int divisors = 0;

        for (int i = 1; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                divisors++;
            }
        }

        return divisors * 2;
    }

}
