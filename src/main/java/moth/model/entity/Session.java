package moth.model.entity;

import moth.model.command.Command;

public class Session {

    private boolean running;

    public Session() {
        this.running = true;
    }

    public boolean isRunning() {
        return running;
    }

    public void stop() {
        this.running = false;
    }

    public Command parseCommand(String input) {
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
