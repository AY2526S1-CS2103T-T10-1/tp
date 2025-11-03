package seedu.address.logic.commands;

/**
 * A mock EditCommand for testing or placeholder purposes.
 */
public class MockEditCommand extends Command {
    public static final String COMMAND_WORD = "mockedit";

    @Override
    public CommandResult execute(Model model) {
        // This is a mock command. No actual logic is implemented.
        return new CommandResult("Mock EditCommand executed.");
    }
}
