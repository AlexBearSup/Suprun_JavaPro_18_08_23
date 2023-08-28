package homeworks.homework4.participants_and_obstacles.obstacles;

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

    public void overCome(){
        System.out.println("overcome");
    }
}
