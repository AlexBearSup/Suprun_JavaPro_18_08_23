package homeworks.homework4.participants_and_obstacles.obstacles;

import homeworks.homework4.participants_and_obstacles.participants.Participant;

public class Obstacle {

    int barrierValue;
    String name;
    public int getBarrierValue() {
        return barrierValue;
    }
    public String getName() {
        return name;
    }
    public Obstacle(int barrierValue, String name) {
        this.barrierValue = barrierValue;
        this.name = name;
    }

    public void overCome (){
        System.out.println(name + " can be overcome");
    }

    public void passed (Participant participant, Obstacle obstacle){
        System.out.println("Учасник " + participant.getName() + " подолав перешкоду " + obstacle.getName() + " на дистанції " +
                obstacle.getBarrierValue() + "м.");
    }
    public void notPassed (Participant participant, Obstacle obstacle){
        System.out.print("Учасник " + participant.getName() + " не подолав перешкоду " + obstacle.getName() + " на дистанції " +
                obstacle.getBarrierValue() + "м.");
    }
}


