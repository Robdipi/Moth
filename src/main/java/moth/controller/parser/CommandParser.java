package moth.controller.parser;

import moth.model.command.Command;

public class CommandParser {

    public Command parse(String input) {
        if (input == null || input.isBlank()) {
            return Command.UNKNOWN;
        }
        String trimmed = input.trim().toLowerCase();
        switch (trimmed) {
            case "shutdown": return Command.SHUTDOWN;
            case "help": return Command.HELP;
            case "imgen": return Command.IMGEN;
            case "imgde": return Command.IMGDE;
            default: return Command.UNKNOWN;
        }
    }
}
