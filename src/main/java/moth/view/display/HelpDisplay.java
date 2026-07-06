package moth.view.display;

import moth.view.terminal.TerminalWriter;
import java.util.List;

public class HelpDisplay {

    private final TerminalWriter writer;

    public HelpDisplay(TerminalWriter writer) {
        this.writer = writer;
    }

    public void show() {
        List<String> helpLines = List.of(
            "Available commands:",
            "  shutdown - closes the app",
            "  help     - gives a list of all commands",
            "  imgen    - generate an image (usage: imgen <filename> <password>)",
            "  imgde    - decode an image (usage: imgde <filename> <password>)"
        );
        helpLines.forEach(writer::writeLine);
    }
}
