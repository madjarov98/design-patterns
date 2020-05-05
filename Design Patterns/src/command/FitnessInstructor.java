package command;

public class FitnessInstructor {
	
		private Command command;	

		public void setCommand(Command command) {
			this.command = command;
		}
		
	public String setExercises() {
		return this.command.execute();
		
	}
	public void returnMessage() { 
    	if(this.command instanceof LieDownCommand) {
    		System.out.println("Next exercise is to Lie Down!");
    	}
    	else {
    		System.out.println("Next exercise is to Stand Up!");
    	}
	}
}
