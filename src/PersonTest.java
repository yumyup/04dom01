/**
 * Created by Helmut on 2017-03-15.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("Jan");
        person[1] = new Person("Krzysztof");
        person[2] = new Person("Anna");
       //person.showInfo(this.name);

        System.out.println(person[0]);
        System.out.println(person[1]);
        System.out.println(person[2]);
    }
}
