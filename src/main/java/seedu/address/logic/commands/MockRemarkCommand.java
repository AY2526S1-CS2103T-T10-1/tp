package seedu.address.logic.commands;

/**
 * A mock RemarkCommand for testing or placeholder purposes.
 */
public class MockRemarkCommand extends Command {
    public static final String COMMAND_WORD = "mockremark";

    @Override
    public CommandResult execute(Model model) {
        // This is a mock command. No actual logic is implemented.
        return new CommandResult("Mock RemarkCommand executed.");
    }
}
