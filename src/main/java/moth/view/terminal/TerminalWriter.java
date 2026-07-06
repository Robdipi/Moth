package moth.view.terminal;

public class TerminalWriter {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_ORANGE = "\u001B[38;5;208m";

    public void writeLine(String line) {
        System.out.println(ANSI_ORANGE + line + ANSI_RESET);
    }

    public void write(String text) {
        System.out.print(ANSI_ORANGE + text + ANSI_RESET);
    }

    public void writeLinePlain(String line) {
        System.out.println(line);
    }

    public void writePlain(String text) {
        System.out.print(text);
    }
}
