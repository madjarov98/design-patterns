package command;

public class LieDownCommand implements Command {
	private Exercises exercises;
	public LieDownCommand(Exercises exercises) {
		this.exercises=exercises;
	}

    @Override
	public String execute() {
		
		return this.exercises.lieDown();
	}

}
