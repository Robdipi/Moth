package moth.controller.handler;

import moth.model.command.CommandResult;
import moth.model.entity.Image;

public class ImageHandler implements CommandHandler {

    @Override
    public CommandResult execute(String... args) {
        if (args.length < 2) {
            return new CommandResult(false, "Usage: imgen <filename> <password>");
        }
        Image image = new Image(args[0], args[1]);
        return new CommandResult(true, "Image processed: " + image.getFilename());
    }
}
