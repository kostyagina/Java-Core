package homeworkLesson9;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Data {

    public static List<Student> getStudentsList() {
        // Список курсов
        Course course1 = new Course("Магия моделирования");
        Course course2 = new Course("Идеальные брюки");
        Course course3 = new Course("Магия кружева");
        Course course4 = new Course("Платье мечты");
        Course course5 = new Course("Юбка мечты");
        Course course6 = new Course("Шьем юбку А-силуэта");
        Course course7 = new Course("Шьем платье А-силуэта");
        Course course8 = new Course("Шьем брюки-бананы");
        Course course9 = new Course("Шьем юбку-карандаш");
        Course course10 = new Course("Шьем мужскую рубашку");
        Course course11 = new Course("Пальто мечты");
        Course course12 = new Course("Домашняя одежда");

        // Список студентов
        Student student1 = new Student("Мария", Arrays.asList(course1, course3, course5));
        Student student2 = new Student("Анна", Arrays.asList(course1, course2, course3));
        Student student3 = new Student("Виктория", Arrays.asList(course1, course7, course11));
        Student student4 = new Student("Валентина", Arrays.asList(course2, course4, course8, course1, course3, course5));
        Student student5 = new Student("Светлана", Arrays.asList(course3, course7, course9));
        Student student6 = new Student("Виолетта", Arrays.asList(course1, course3, course5, course9));
        Student student7 = new Student("Евгения", Arrays.asList(course2, course6, course7, course5, course9));
        Student student8 = new Student("Александра", Arrays.asList(course3, course2, course4));
        Student student9 = new Student("Марина", Arrays.asList(course4, course8, course5));
        Student student10 = new Student("Ольга", Arrays.asList(course5, course1, course9));
        Student student11 = new Student("Елена", Arrays.asList(course6, course9, course5));
        Student student12 = new Student("София", Arrays.asList(course7, course6, course5));
        Student student13 = new Student("Вероника", Arrays.asList(course8, course1, course5));
        Student student14 = new Student("Татьяна", Arrays.asList(course9, course2, course5));
        Student student15 = new Student("Надежда", Arrays.asList(course10, course3, course1));
        Student student16 = new Student("Раиса", Arrays.asList(course11, course9, course2));
        Student student17 = new Student("Лидия", Arrays.asList(course12, course8, course3));
        Student student18 = new Student("Наталья", Arrays.asList(course11, course7, course4));
        Student student19 = new Student("Алла", Arrays.asList(course10, course6, course5));
        Student student20 = new Student("Кристина", Arrays.asList(course9, course5, course3));
        Student student21 = new Student("Евдокия", Arrays.asList(course8, course6, course5));
        Student student22 = new Student("Ирина", Arrays.asList(course7, course2, course11));
        Student student23 = new Student("Юлианна", Arrays.asList(course6, course1, course5));
        Student student24 = new Student("Юлия", Arrays.asList(course5, course11, course12));
        Student student25 = new Student("Ева", Arrays.asList(course4, course12, course5));
        Student student26 = new Student("Ксения", Arrays.asList(course3, course9, course5));
        Student student27 = new Student("Пелагея", Arrays.asList(course2, course6, course3));
        Student student28 = new Student("Елизавета", Arrays.asList(course1, course9, course5));


        return Arrays.asList(student1, student2, student3, student4, student5, student6, student7,
                student8, student9, student10, student11, student12, student13, student14,
                student15, student16, student17, student18, student19, student20, student21,
                student22, student23, student24, student25, student26, student27, student28);
    }

    public static Course getRandomCourse() {
        Random random = new Random();
        List<Course> courses = getListCourses();
        return courses.get(random.nextInt(courses.size()));
    }

    private static List<Course> getListCourses() {
        return Arrays.asList(new Course("Магия моделирования"),
                new Course("Идеальные брюки"),
                new Course("Магия кружева"),
                new Course("Платье мечты"),
                new Course("Юбка мечты"),
                new Course("Шьем юбку А-силуэта"),
                new Course("Шьем платье А-силуэта"),
                new Course("Шьем брюки-бананы"),
                new Course("Шьем юбку-карандаш"),
                new Course("Шьем мужскую рубашку"),
                new Course("Пальто мечты"),
                new Course("Домашняя одежда"));
    }
}
