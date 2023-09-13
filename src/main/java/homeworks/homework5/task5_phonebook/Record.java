package homeworks.homework5.task5_phonebook;

public class Record {

    private String name;
    private String telNumber;

    public Record(String name, String telNumber) {
        this.name = name;
        this.telNumber = telNumber;
    }

    public String getName() {
        return name;
    }

    public String getTelNumber() {
        return telNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", telNumber : " + telNumber;
    }


}
