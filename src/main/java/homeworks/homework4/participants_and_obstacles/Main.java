package homeworks.homework4.participants_and_obstacles;

import homeworks.homework4.participants_and_obstacles.obstacles.Obstacle;
import homeworks.homework4.participants_and_obstacles.participants.Participant;

public class Main {

    public static void main(String[] args) {

        Participant cat = new Participant("Puss In Boots", 500, 2.5);
        Participant human = new Participant("Usein Bolt", 500, 1.5);
        Participant robot = new Participant("R2D2", 10000, 5);


        Obstacle wall = new Obstacle(2, "stoneWall");
        Obstacle treadmill = new Obstacle(800, "offRoad");

        Obstacle[] obstacles = {wall, treadmill};
        Participant[] participants = {cat, human, robot};


        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                if (obstacle.getName() == "stoneWall") {
                    if (participant.getPowerJump() > obstacle.getBarrierValue()) {
                        System.out.println("Учасник " + participant.getName() + " перестрибнув " + obstacle.getName() + " з висотою " +
                                obstacle.getBarrierValue() + " (може перестрибнути " + participant.getPowerJump() + ")" + ". та вийшов на бігову доріжку.");
                    } else {
                        System.out.println("Учасник " + participant.getName() + " не перестрибнув " + obstacle.getName() + " з висотою " + obstacle.getBarrierValue() +
                                ". Він подолав лише " + participant.getPowerJump() + ". та вибуває з змагань");
                        continue;
                    }
                } else if (obstacle.getName() == "offRoad") {
                    if (participant.getPowerRun() > obstacle.getBarrierValue()) {
                        System.out.println("Учасник " + participant.getName() + " перетнув " + obstacle.getName() + " протяжністю " +
                                obstacle.getBarrierValue() + " (може пробігти " + participant.getPowerRun() + ")" + ". та Завершив змагання.");
                    } else {
                        System.out.println("Учасник " + participant.getName() + " не подолав " + obstacle.getName() + " з протяжністю " + obstacle.getBarrierValue() +
                                ". Він подолав лише " + participant.getPowerJump() + ". та вибуває з змагань");
                    }


                }
            }


        }


    }
}



