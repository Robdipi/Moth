package moth.controller.handler;

import moth.model.command.CommandResult;

public interface CommandHandler {

    CommandResult execute(String... args);
}
