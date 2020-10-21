import java.util.Comparator;

public class Person implements Comparable<Person>{

    public final static boolean MALE = false;
    public final static boolean FEMALE = true;

    private String name;
    private int age;
    private boolean isFemale;

    public Person(String name, int age, boolean isFemale) {
        this.name = name;
        this.age = age;
        this.isFemale = isFemale;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": ").append(age)
                .append(" (");
        if (isFemale){
            sb.append("F)");
        }
        else {
            sb.append("M)");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Person)){
            return false;
        }
        Person tmp = (Person)obj;
        return name.equals(tmp.getName())
                && age == tmp.getAge()
                && isFemale == tmp.isFemale();
    }

    @Override
    public int hashCode() {
        return name.length();
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }

    static class PersonCompareByNameAndAge implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            int res = o2.name.compareTo(o1.name);
            if (res != 0){
                return res;
            }
            return Integer.compare(o1.age,o2.age);
        }
    }
}
