package Homeworklesson1;


import Homeworklesson1.Status;

public class TeamMember {
    private Status status = Status.NoPassedDistance;
    private final String name;
    private final int power;

    public TeamMember(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void fight(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance, " победил в поединке");
        } else {
            changeStatus(Status.NoPassedDistance, " проиграл в поединке");
        }
    }

    public void jump(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance, " препрыгнул через планку");
        } else {
            changeStatus(Status.NoPassedDistance, " задел и сбил планку");
        }
    }

    public void run(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance, " пробежал кросс");
        } else {
            changeStatus(Status.NoPassedDistance, " сошел с дистанции");
        }
    }

    public void swim(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance, " проплыл дистанцию");
        } else {
            changeStatus(Status.NoPassedDistance, " не проплыл до конца дистанции");
        }
    }

    private boolean checkPower(int courseDifficulty) {
        return power > courseDifficulty || power == courseDifficulty;
    }

    private void changeStatus(Status newStatus, String message) {
        status = newStatus;
        System.out.println(name + message);
    }

}
