import person.Person;
import person.Staff;
import person.Student;

public class Main {
    public static void main(String[] args) {
       Person person = new Person("Ana", "AlbaIulia");
        System.out.println(person);

        System.out.println("                             ");

        Student student = new Student("Ion", "Ismail", "Matematica", 2023, 10000.5);
        System.out.println(student);

        System.out.println("                             ");

        Staff staff = new Staff("Dan", "Teodorovici", "DanteAligheri", 150.5);
                System.out.println(staff);
    }
}

