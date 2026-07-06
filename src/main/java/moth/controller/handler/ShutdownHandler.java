package moth.controller.handler;

import moth.model.command.CommandResult;
import moth.model.entity.Session;

public class ShutdownHandler implements CommandHandler {

    private final Session session;

    public ShutdownHandler(Session session) {
        this.session = session;
    }

    @Override
    public CommandResult execute(String... args) {
        session.stop();
        return new CommandResult(true, "Shutting down...");
    }
}
