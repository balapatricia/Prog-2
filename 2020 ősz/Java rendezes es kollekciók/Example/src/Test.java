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

//        StringJoiner sj = new StringJoiner("-");
//        for (int item:t) {
//            sj.add(Integer.toString(item));
//        }
//        System.out.println(sj.toString());

//        Arrays.sort(t);
//        System.out.println(Arrays.toString(t));
//
//        Person[] p = {new Person("Teszt Elek",30, Person.MALE),
//                        new Person("Juliska",24,Person.FEMALE),
//                        new Person("Teszt Elek",23, Person.MALE),
//                        new Person("Mariska",36, Person.FEMALE)};
//        System.out.println(Arrays.toString(p));
//        Arrays.sort(p);
//        System.out.println(Arrays.toString(p));
//        Arrays.sort(p,new Person.PersonCompareByNameAndAge());
//        System.out.println(Arrays.toString(p));
//
//        Arrays.sort(p, (a,b) -> a.getName().compareTo(b.getName()));
//        System.out.println(Arrays.toString(p));
//
//        Arrays.sort(p, Comparator.comparing(Person::getName).
//                thenComparing(Person::getAge,Comparator.reverseOrder()));
//        System.out.println(Arrays.toString(p));

//        Set<Integer> i = new HashSet<>();
//        i.add(12);
//        i.add(4);
//        i.add(4);
//        i.add(2);
//        i.add(7);
//        System.out.println(i);
//
//        Set<Person> p = new HashSet<>();
//        p.add(new Person("Teszt Elek",30, Person.MALE));
//        p.add(new Person("Pista bacsi",67,Person.MALE));
//        p.add(new Person("Joska bacsi",76,Person.MALE));
//        p.add(new Person("Teszt Elek",30, Person.MALE));
//        p.add(new Person("Teszt Elee",30, Person.MALE));
//        System.out.println(p);
//
//        Set<Person> tp = new TreeSet<>();
//        tp.add(new Person("Teszt Elek",30, Person.MALE));
//        tp.add(new Person("Pista bacsi",67,Person.MALE));
//        tp.add(new Person("Joska bacsi",76,Person.MALE));
//        tp.add(new Person("Teszt Elek",30, Person.MALE));
//        tp.add(new Person("Teszt Elee",30, Person.MALE));
//        System.out.println(tp);
//
//        for (Person person : tp){
//            System.out.println(person);
//        }
//
//        System.out.println("-------");
//
//        Iterator<Person> it = tp.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

//        List<Person> l = new ArrayList<>();
//        l.add(new Person("Teszt Elek",30, Person.MALE));
//        l.add(new Person("Pista bacsi",67,Person.MALE));
//        l.add(new Person("Joska bacsi",76,Person.MALE));
//        l.add(new Person("Teszt Elek",30, Person.MALE));
//        l.add(new Person("Teszt Elee",30, Person.MALE));
//        System.out.println(l);
//
//        System.out.println(l.size());
//        System.out.println(l.get(2));
//        l.set(2,new Person("Mariska",80,Person.FEMALE));
//        System.out.println(l);
//        l.add(2,new Person("Piroska neni",65,Person.FEMALE));
//        System.out.println(l);
//
//        Iterator<Person> it = l.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        System.out.println("---");
//        for (Person person:l){
//            System.out.println(person);
//        }

        Map<String, Integer> map = new HashMap<>();
        map.put("alma",2);
        map.put("korte",3);
        map.put("szilva",1);
        map.put("ananasz",6);
        map.put("szilva",8);
        System.out.println(map);
        System.out.println("Map size: " + map.size());

        Map<String,Integer> tree = new TreeMap<>();
        tree.put("alma",2);
        tree.put("korte",3);
        tree.put("szilva",1);
        tree.put("ananasz",6);
        tree.put("szilva",8);
        System.out.println(tree);

        for (String key : tree.keySet()){
            System.out.println(key);
        }

        for (Map.Entry<String,Integer> entry : tree.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }












    }
}
