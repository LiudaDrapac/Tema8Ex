import person.Person;
import person.Staff;
import person.Student;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Victor", "Alba Iulia");
        Staff staff = new Staff("Dana", "Teodorovici", "DanteAlighere", 21.50);
        Student student = new Student("Daniel", "Docuceaev", "Informatica", 2023, 1000.50);

        System.out.println(person.getName());
        System.out.println(person.getAddress());
        System.out.println("_________________________________");

        System.out.println(staff.getName());
        System.out.println(staff.getAddress());
        System.out.println(staff.getSchool());
        System.out.println(staff.getPay());
        System.out.println("_________________________________");

        System.out.println(student.getName());
        System.out.println(student.getAddress());
        System.out.println(student.getProgram());
        System.out.println(student.getYear());
        System.out.println(student.getFee());

    }
}

