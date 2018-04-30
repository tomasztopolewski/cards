package pl.tomasztopolewski.cards;

import pl.tomasztopolewski.cards.communication.console.Console;

public class MainConsole {

    public static void main(String[] args) throws InterruptedException {
        Console console = new Console();

        while (true) {
            console.removeOrder();
            console.createOrder();
            console.doOrder();
        }
    }
}
