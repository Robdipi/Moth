package moth.controller.handler;

import moth.model.command.CommandResult;
import moth.view.display.HelpDisplay;

public class HelpHandler implements CommandHandler {

    private final HelpDisplay helpDisplay;

    public HelpHandler(HelpDisplay helpDisplay) {
        this.helpDisplay = helpDisplay;
    }

    @Override
    public CommandResult execute(String... args) {
        helpDisplay.show();
        return new CommandResult(true, "Help displayed");
    }
}
