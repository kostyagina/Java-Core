package Homeworklesson1;


import Homeworklesson1.Status;
import Homeworklesson1.Team;
import Homeworklesson1.TeamMember;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (TeamMember member : team.getMembers()) {
            for (Obstacle obs : obstacles) {
                obs.goChallenge(member);
                if (member.getStatus() == Status.NoPassedDistance) {
                    break;
                }
            }
        }
    }

}
