package vttp.d3;

public class RemoteMain {
    public static void main(String[] args) {
        Honda h = new Honda();
        Computer myNotebook = new Computer();

        Controllable ctrl = new Honda();

        RemoteControl rm = new RemoteControl(h);
        RemoteControl rmNotebook = new RemoteControl(myNotebook);

        rm.start();
        rmNotebook.start();
    }    
}
