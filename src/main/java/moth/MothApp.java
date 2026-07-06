package moth;

import moth.controller.handler.CommandHandler;
import moth.controller.handler.HelpHandler;
import moth.controller.handler.ImageHandler;
import moth.controller.handler.ShutdownHandler;
import moth.controller.parser.InputParser;
import moth.model.command.Command;
import moth.model.command.CommandResult;
import moth.model.entity.Session;
import moth.view.display.HelpDisplay;
import moth.view.terminal.TerminalInterface;
import moth.view.terminal.TerminalWriter;

public class MothApp {

    private final Session session;
    private final TerminalInterface terminal;
    private final TerminalWriter writer;

    public MothApp() {
        this.session = new Session();
        this.terminal = new TerminalInterface();
        this.writer = new TerminalWriter();
    }

    public void run() {
        writer.writeLine("Moth v0.1 - Type 'help' for available commands");

        while (session.isRunning()) {
            String input = terminal.readInput();
            InputParser parser = new InputParser(input);
            CommandHandler handler = resolveHandler(parser.getCommand());

            CommandResult result = handler.execute(parser.getArgs());
            if (!result.isSuccess()) {
                writer.writeLine("Error: " + result.getMessage());
            }
        }

        terminal.close();
    }

    private CommandHandler resolveHandler(String command) {
        switch (command) {
            case "shutdown": return new ShutdownHandler(session);
            case "help": return new HelpHandler(new HelpDisplay());
            case "imgen": return new ImageHandler();
            case "imgde": return new ImageHandler();
            default: return args -> new CommandResult(false, "Unknown command: " + command);
        }
    }

    public static void main(String[] args) {
        new MothApp().run();
    }
}
