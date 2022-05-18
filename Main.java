package Homeworklesson1;

import Homeworklesson1.Course;
import Homeworklesson1.Cross;
import Homeworklesson1.Fight;
import Homeworklesson1.Swimming;
import Homeworklesson1.Team;
import Homeworklesson1.TeamMember;

public class Main {

    public static void main(String[] args) {

        // Создаем команду
        Team myTeam = new Team("Моя команда из четырёх участников",
                new TeamMember("Первый участник", 1),
                new TeamMember("Второй участник", 2),
                new TeamMember("Третий участник", 3),
                new TeamMember("Четвертый участник", 4));

        // Создаем полосу препятствий:
        Course course = new Course(new Cross(1), new Swimming(2), new Fight(3));

        // Просим команду пройти полосу:
        course.doIt(myTeam);

       // Показываем результаты:
        myTeam.showResults();
    }
}


