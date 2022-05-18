package Homeworklesson1;


import Homeworklesson1.Status;

public class Team {
    private TeamMember[] members;
    private final String name;

    public Team(String name, TeamMember... members) {
        this.members = members;
        this.name = name;
    }

    public TeamMember[] getMembers() {
        return members;
    }

    public void showResults() {
        printDivider();
        System.out.println("Полосу препятствий преодолевала команда: " + name);
        for (TeamMember member : members) {
            if (member.getStatus() == Status.NoPassedDistance) {
                showResultMemberNoPassed(member);
            } else {
                showResultMemberPassed(member);
            }
        }
        printDivider();
    }

    private void showResultMemberNoPassed(TeamMember member) {
        printDivider();
        System.out.println(member.getName() + ", к сожалению, не преодолел полосу препятствий.");
    }

    private void showResultMemberPassed(TeamMember member) {
        printDivider();
        System.out.println(member.getName() + ", к счастью, успешно преодолел полосу препятствий.");
    }

    private void printDivider() {
        System.out.println(" ");
    }
}
