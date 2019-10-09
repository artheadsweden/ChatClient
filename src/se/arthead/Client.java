package se.arthead;

public class Client {

    public Client() {
        Sender sender = new Sender();
        sender.start();

        Reciever reciever = new Reciever();
        reciever.start();

        ChatGui chatGui = new ChatGui();
        chatGui.run();
    }
}
