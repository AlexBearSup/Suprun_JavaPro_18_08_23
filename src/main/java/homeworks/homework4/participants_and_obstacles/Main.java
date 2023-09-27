package homeworks.homework4.participants_and_obstacles;
import homeworks.homework4.participants_and_obstacles.obstacles.Obstacle;
import homeworks.homework4.participants_and_obstacles.participants.Participant;

public class Main {

    public static void main(String[] args) {

        Participant cat = new Participant("Котейко", 500, 2.5);
        Participant human = new Participant("Скайуокер", 900, 1.5);
        Participant robot = new Participant("R2D2", 1000, 5);

        Obstacle wall = new Obstacle(2, "Кам'яна стіна");
        Obstacle treadmill = new Obstacle(1000, "Бездоріжжя");

        Obstacle[] obstacles = {wall, treadmill};
        Participant[] participants = {human, cat, robot};


        System.out.println();
        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle.getName() == wall.getName()) {
                    if (participant.getPowerJump() > obstacle.getBarrierValue()) {
                        obstacle.passed(participant, obstacle);
                    } else {
                        obstacle.notPassed(participant, obstacle);
                        System.out.println(" Пройдено " + participant.getPowerJump() + "м.");
                        System.out.println();
                        break;
                    }
                } else if (obstacle.getName() == treadmill.getName()) {
                    if (participant.getPowerRun() >= obstacle.getBarrierValue()) {
                        obstacle.passed(participant, obstacle);
                        System.out.println();

                    } else {
                        obstacle.notPassed(participant, obstacle);
                        System.out.println(" Пройдено " + participant.getPowerRun() + "м.");
                        System.out.println();
                        break;
                    }
                }
            }
        }
    }
}



