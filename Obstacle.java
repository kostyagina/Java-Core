package Homeworklesson1;


import Homeworklesson1.TeamMember;

public abstract class Obstacle {

    private final int difficulty;

    public Obstacle(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void goChallenge(TeamMember member) {
    }

}
