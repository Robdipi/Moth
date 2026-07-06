package moth.controller.handler;

import moth.model.command.CommandResult;
import moth.view.display.HelpDisplay;
import moth.view.terminal.TerminalWriter;

public class HelpHandler implements CommandHandler {

    private final HelpDisplay helpDisplay;

    public HelpHandler(TerminalWriter writer) {
        this.helpDisplay = new HelpDisplay(writer);
    }

    @Override
    public CommandResult execute(String... args) {
        helpDisplay.show();
        return new CommandResult(true, "Help displayed");
    }
}
