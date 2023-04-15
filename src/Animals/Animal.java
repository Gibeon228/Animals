package Animals;

public abstract class Animal {
    private String name;
    private Commands command;
    private String birthday;

    public Animal(String name, String birthday, Commands command) {
        this.name = name;
        this.birthday = birthday;
        this.command = command;
    }

    public Commands getCommand() {
        return this.command;
    }

    public String getName() {
        return this.name;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setCommand(Commands command) {
        this.command = command;
    }

    public String getInfo() {
        return "Name: " + this.name + " Status: " + this.command + " Bithday: " + this.birthday;
    }

    public void step() {
    }
}

