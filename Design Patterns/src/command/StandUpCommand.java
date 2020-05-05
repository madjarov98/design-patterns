package command;

public class StandUpCommand implements Command {
	private Exercises exercises;
	public StandUpCommand(Exercises exercises) {
		this.exercises=exercises;
	}

	@Override
	public String execute() {
		return this.exercises.standUp();

	}

}
