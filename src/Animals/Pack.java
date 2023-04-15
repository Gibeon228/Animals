package Animals;

public abstract class Pack extends Animal {
    public Pack(String name, String birthday, Commands command) {
        super(name, birthday, command);
    }

    public String getInfo() {
        return super.getInfo();
    }

    public void step(){
        if(this.getCommand() != Commands.DEAD) {
            this.setCommand(Commands.GO);
        }
    }
}