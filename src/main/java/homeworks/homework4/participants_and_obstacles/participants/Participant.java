package homeworks.homework4.participants_and_obstacles.participants;

public class Participant {
    String name;
    private int powerRun;
    private double powerJump;

    public String getName() {
        return name;
    }

    public int getPowerRun() {
        return powerRun;
    }

    public double getPowerJump() {
        return powerJump;
    }

    public Participant(String name, int powerRun, double powerJump) {
        this.name = name;
        this.powerRun = powerRun;
        this.powerJump = powerJump;
    }

    public void run(){
        System.out.println("run");
    }
    public void jump(){
        System.out.println("jump");
    }
}
