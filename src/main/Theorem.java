package main;

/**
 * Az elméleti kérdéseket itt találod.
 * A válaszaidat a kérdés komment-blokkjába írd!
 */
public class Theorem {

    /* 1. Milyen OOP-koncepciók jelennek meg a Java programozási nyelvben, és azok mit jelentenek?
        Jellemezd a koncepciókat 1-2 mondatban!
        (6 pont)

- absztarkció (abstraction)
    elérhető absztrakt osztályok és interfészek segítésgével
    csak a funkció látható, belső logika rejtve marad
    amiket használunk: változók, metodusok, osztályok, objektumok

- enkapszuláció (encapsulation)
    csak az fér hozzá egy adott dologhoz, aki/ami birtokolja
    ami logikailag összetartozik, az mind egy egységet képez
    egy osztály egy logikailag összetartozó egység

- öröklödés (inheratice)
    egy osztály egy másiktól örököl
    minden osztálynak csak egy leszármazottja lehet
    javaban minden isztály Ősatyja az Object osztály
    a gyerek osztály használhatja a szülö osztály fildjeit, de a szulő osztály már nem
    konstruktorok sem örökithetőek, csak a fieldek(amennyiben publikusak)

- többalakúság (polymorphism)
    több metodusnak ugyanaz a neve, mégis mást csinálnak
    elérhető a az Overloading és az Overriding használatával
    overloading: a metódusoknak más típusú és/vagy más darabszámú bemeneti paraméterük van
    overriding: öröklődés esetén használható
                a Gyerek osztály felülírja a Szülő osztály metódusát

egyéb koncepciók:
- coupling (csatolás)
osztályok mennyit látnak egymásból (láthatósági jelzők)

- cohesion (kohézió)
egy egység (pl. package) egyetlen jól meghatározott feladatot lát el

- association (asszociáció)
az objektumok közötti kapcsolatot határozza meg (egy objektum milyen viszonyban van egy
másikkal)

- aggregation (aggregáció)
az association megvalósítása, amelyben az objektum állapotához tartozik egy másik
objektum, amely önállóan is létező

- composition (kompozíció)
az association másik megvalósítása, amelyben az objektum állapotához tartozik egy másik
objektum, és a tartalmazó objektum nem létezik a “szülő” nélkül

     */



    /* 2. Milyen módszerek léteznek a dinamikus adatszerkezetekben tárolt objektumok rendezésére?
        Ismertesd ezeket a rendezési módszereket röviden!
        (Megjegyzés: a dinamikus adatszerkezetek a List, a Set és a Map.)
        (6 pont)

-sorted: a beszúrás sorrendjében történik a beolvasás és végigjárás
-ordered:növekvő sorrendben, nagyság szerint rendez
-TreeMap: az angol ABC szerinti sorrendben
-LinkedList: láncolt lista, melyben beszúrás a végére ill. kiolvasás onnan gyors, az általános címzés lassú

     */


    /* 3. Mit jelent a szálkezelés? Hogyan valósítható meg egy többszálú program? Mik az előnyei, hátrányai, veszélyei?
        (3 pont)

-lényege a párhuzamosság, vagyis a számitógép egy időben több feladatot is el tud látni
-két lehetőség van több szálas program készítésére. Implementálhatunk egy interfészt vagy örökíthetünk egy osztályt
-minden szálat egy Thread osztály példánya reprezentál
-lehet időziteni őket a Timer -rel
-hátránya: könnyű eltontani, sok a hiba lehetőség
-előnye: több program fut egyszerre

     */

}
