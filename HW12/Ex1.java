import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Yoon", 23));
        list.add(new Person("Hong", 53));
        list.add(new Person("Kim", 37));
        list.add(new Person("Park", 67));
        list.add(new Person("Lee", 15));

        Collections.sort(list);
        Iterator<Person> itr=list.iterator();
        System.out.println("*** 나이순 정렬 ***");
        while(itr.hasNext())
            System.out.println(itr.next().toString());
        System.out.println();

        Collections.sort(list, new PersonComparator());
        itr=list.iterator();
        System.out.println("*** 이름순 정렬 ***");
        while(itr.hasNext())
            System.out.println(itr.next().toString());
        System.out.println();
    }
}
class Person implements Comparable<Person>{
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name; this.age = age;
    }
    public String toString() { return name + " : " + age; }

    @Override
    public int compareTo(Person p) {
        return this.age-p.age;
    }
}
class PersonComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2){
        return p1.name.compareTo(p2.name);
    }
}