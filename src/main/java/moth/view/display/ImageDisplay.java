package moth.view.display;

import moth.model.entity.Image;
import moth.view.terminal.TerminalWriter;

public class ImageDisplay {

    private final TerminalWriter writer;

    public ImageDisplay(TerminalWriter writer) {
        this.writer = writer;
    }

    public void show(Image image) {
        writer.writeLine("Image: " + image.getFilename());
        writer.writeLine("Password: " + "*".repeat(image.getPassword().length()));
    }
}
