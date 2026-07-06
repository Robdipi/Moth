package moth.view.display;

import java.util.List;

public class HelpDisplay {

    public void show() {
        List<String> helpLines = List.of(
            "Available commands:",
            "  shutdown - closes the app",
            "  help     - gives a list of all commands",
            "  imgen    - generate an image (usage: imgen <filename> <password>)",
            "  imgde    - decode an image (usage: imgde <filename> <password>)"
        );
        helpLines.forEach(System.out::println);
    }
}
