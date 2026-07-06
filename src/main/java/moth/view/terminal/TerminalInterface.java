package moth.view.terminal;

import java.util.Scanner;

public class TerminalInterface {

    private final Scanner scanner;

    public TerminalInterface() {
        this.scanner = new Scanner(System.in);
    }

    public String readInput() {
        System.out.print("moth> ");
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }
}
