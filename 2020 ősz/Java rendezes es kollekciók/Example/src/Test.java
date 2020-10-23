import java.util.*;

public class Test {

    public static void main(String[] args) {
//        Person p = new Person("Teszt Elek",30,Person.MALE);
//        System.out.println(p.getName());
//        p.setName("Juliska");
//        System.out.println(p.getName());
//        Person a = new Person("Mekk Elek",70,Person.MALE);
//        System.out.println(a);
//        System.out.println(p == a);
//        Person b = new Person("Mekk Elek",70,Person.MALE);
//        System.out.println(a == b);
//        System.out.println(a.equals(b));

//        Point a = new Point();
//        System.out.println("x: " + a.getX());
//        System.out.println("y: " + a.getY());
//        System.out.println(a);
//        Point b = new Point(2.3,1.8);
//        Point c = new Point(3.1,4.2);
//        System.out.println(b.equals(c));
//        System.out.println(b.tavolsag(c));
//        System.out.println(Point.tavolsag(b,c));

//        int[] t = {3, 7, 2, 9, 4};
//        System.out.println(Arrays.toString(t));

//        StringJoiner sj = new StringJoiner("-");                                              A StringJoiner használatával, az add metóduson keresztül egymás után pakolt elemek a létrehozáskor megadott karakter mentén lesznek elválasztva
//        for (int item:t) {                                                                    Hasznos például, ha olyan feladatot kaptok, hogy az elemek között legyen szóköz karakter, de az utolsó elem után már ne.
//            sj.add(Integer.toString(item));
//        }
//        System.out.println(sj.toString());

//        Arrays.sort(t);                                                                       Tömbök rendezése, ha csak a tömb referencia változóját kapja meg, a tárolt typus természetes rendezése alapján rendez.
//        System.out.println(Arrays.toString(t));                                               Saját típus esetén így természetes rendezést kell írnunk az osztályunkhoz. (Comparable interface)
//
//        Person[] p = {new Person("Teszt Elek",30, Person.MALE),
//                        new Person("Juliska",24,Person.FEMALE),
//                        new Person("Teszt Elek",23, Person.MALE),
//                        new Person("Mariska",36, Person.FEMALE)};
//        System.out.println(Arrays.toString(p));
//        Arrays.sort(p);
//        System.out.println(Arrays.toString(p));
//        Arrays.sort(p,new Person.PersonCompareByNameAndAge());                                Nem tremészetes rendezés esetén második paraméterben megadhatjuk a használni kívánt rendezési módot (pl egy belső osztály ami megvalósítja a Comparator interface-t)                           
//        System.out.println(Arrays.toString(p));
//
//        Arrays.sort(p, (a,b) -> a.getName().compareTo(b.getName()));                          Rendezés lambda kifejezéssel
//        System.out.println(Arrays.toString(p));
//
//        Arrays.sort(p, Comparator.comparing(Person::getName).                                 Rendezés a Comparatot osztály használatával, metódus referenciákat átadva, thenComparing segítségével további rendezést fűzhetünk hozzá
//                thenComparing(Person::getAge,Comparator.reverseOrder()));
//        System.out.println(Arrays.toString(p));

//        Set<Integer> i = new HashSet<>();                                                     Halmaz, nincsen redundancia, hashcode alapján hasonlítja az elemeket, ha a hashcode megegyezik, az equals metódussal bizonyosodik meg arról, hogy a két elem ugyanaz-e
//        i.add(12);                                                                            HashSet- nincsenek rendezve az elemek
//        i.add(4);                                                                             A kollekció neve után deklaráláskor <> karakterek közé a kollekcióban tárolni kívánt elemek típusát kell megadnunk
//        i.add(4);
//        i.add(2);
//        i.add(7);
//        System.out.println(i);
//
//        Set<Person> p = new HashSet<>();
//        p.add(new Person("Teszt Elek",30, Person.MALE));
//        p.add(new Person("Pista bacsi",67,Person.MALE));
//        p.add(new Person("Joska bacsi",76,Person.MALE));                                      Halmazhoz az add metódussal tudunk új elemet hozzá adni
//        p.add(new Person("Teszt Elek",30, Person.MALE));
//        p.add(new Person("Teszt Elee",30, Person.MALE));
//        System.out.println(p);
//
//        Set<Person> tp = new TreeSet<>();                                                     Halmaz, ami rendezett elemeket tartalmaz a természetes rendezés alapján, redundancia nincs (hashcode majd equals ha kell)
//        tp.add(new Person("Teszt Elek",30, Person.MALE));
//        tp.add(new Person("Pista bacsi",67,Person.MALE));
//        tp.add(new Person("Joska bacsi",76,Person.MALE));
//        tp.add(new Person("Teszt Elek",30, Person.MALE));
//        tp.add(new Person("Teszt Elee",30, Person.MALE));
//        System.out.println(tp);
//
//        for (Person person : tp){                                                             Halmaz bejárására lehetőség van foreach ciklussal vagy Iterator segítségével is
//            System.out.println(person);                                                       
//        }
//
//        System.out.println("-------");
//
//        Iterator<Person> it = tp.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

//        List<Person> l = new ArrayList<>();                                                   Lista, rendezett elemeket tartalmaz a természetes rendezés szerint, lehet redundancia
//        l.add(new Person("Teszt Elek",30, Person.MALE));
//        l.add(new Person("Pista bacsi",67,Person.MALE));
//        l.add(new Person("Joska bacsi",76,Person.MALE));
//        l.add(new Person("Teszt Elek",30, Person.MALE));
//        l.add(new Person("Teszt Elee",30, Person.MALE));
//        System.out.println(l);
//
//        System.out.println(l.size());                                                         a lista mérete
//        System.out.println(l.get(2));                                                         i. indexen tárolt értéket adja vissza
//        l.set(2,new Person("Mariska",80,Person.FEMALE));                                      i. indexen lévő elemet a megadottra változtatja
//        System.out.println(l);
//        l.add(2,new Person("Piroska neni",65,Person.FEMALE));                                 i. indexre beszúr egy új elemet, a korábbi elemek indexe tolódik
//        System.out.println(l);    
//
//        Iterator<Person> it = l.iterator();                                                   Lista bejáráse foreachel és Iteratorral
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        System.out.println("---");
//        for (Person person:l){
//            System.out.println(person);
//        }

        Map<String, Integer> map = new HashMap<>();                                             //Map - kulcs érték párokat reprezentál, a Map kulcsszó után a kulcs és az érték típusát is meg kell adni
        map.put("alma",2);                                                                      //put metódussal tudunk elemeket hozzáadni, a kulcs és az érték megadásával
        map.put("korte",3);
        map.put("szilva",1);                                                                    //HashMap nem lesz rendezve, egy kulcs egyszer fordulhat elő
        map.put("ananasz",6);
        map.put("szilva",8);
        System.out.println(map);
        System.out.println("Map size: " + map.size());

        Map<String,Integer> tree = new TreeMap<>();                                             //TreeMap-ben az elemek a kulcs szeint rendezve helyezkednek el, a kulcs típusának természetes rendezését felhasználva
        tree.put("alma",2);
        tree.put("korte",3);                                                                    //egy kulcs itt is egyszer fordulhat elő, a kulcsok egyediek
        tree.put("szilva",1);
        tree.put("ananasz",6);
        tree.put("szilva",8);
        System.out.println(tree);

        for (String key : tree.keySet()){                                                       //kulcsok bejárása
            System.out.println(key);
        }

        for (Map.Entry<String,Integer> entry : tree.entrySet()){                                //egész Map bejárása, a Map-et egy entrySetté alakítjuk, és egy Map.Entry típusú változóval felvesszük minden iterációban a kulcs érték párokat
            System.out.println(entry.getKey() + "=" + entry.getValue());                        //a Map.Entry után a kulcs és az érték típusát kell ugyanúgy megadni, mint a létrehozásnál
        }                                                                                       //a getKey() segítségével az adott rekor kulcsát, a getValue() segítségével pedig az értékét kérdezhetjük le
                                                                                                //van arra is lehetőség, hogy a kulcsokhoz tartozó érték maga is egy kollekció pl Lista legyen, ekkot az enty.getValue() metódussal lekérdezett Listás egy újabb foreach ciklussal könnyedén bejárhatjuk (nézünk majd erre példát)











    }
}
