package moth.controller.parser;

import java.util.Arrays;

public class InputParser {

    private final String rawInput;
    private final String command;
    private final String[] args;

    public InputParser(String rawInput) {
        this.rawInput = rawInput.trim();
        String[] parts = this.rawInput.split("\\s+");
        this.command = parts.length > 0 ? parts[0].toLowerCase() : "";
        this.args = parts.length > 1 ? Arrays.copyOfRange(parts, 1, parts.length) : new String[0];
    }

    public String getCommand() {
        return command;
    }

    public String[] getArgs() {
        return args;
    }

    public String getRawInput() {
        return rawInput;
    }
}
