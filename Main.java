import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> passedCoursesStudent1 = new ArrayList<>();
        passedCoursesStudent1.add("Java 1.0");

        ArrayList<String> passedCoursesStudent2 = new ArrayList<>();

        ArrayList<String> canTeachTeacher1 = new ArrayList<>();
        canTeachTeacher1.add("Java 1.0");

        ArrayList<String> canTeachTeacher2 = new ArrayList<>();
        canTeachTeacher2.add("Python 2.0");


        Student student1 = new Student("Farid", passedCoursesStudent1);
        Student student2 = new Student("Jonas", passedCoursesStudent2);
        Teacher teacher1 = new Teacher("Signe", canTeachTeacher1);
        Teacher teacher2 = new Teacher("Tine", canTeachTeacher2);


        ArrayList<Person> persons = new ArrayList<>();
        persons.add(student1);
        persons.add(student2);
        persons.add(teacher1);
        persons.add(teacher2);

       
        for (Person person : persons) {
            boolean success = person.addCourse("Java 1.0");
            if (!success) {
                if (person instanceof Student) {
                    System.out.println(person.getName() + " har allerede bestået dette kursus.");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan ikke undervise i dette fag.");
                }
            }
        }
    }
}
