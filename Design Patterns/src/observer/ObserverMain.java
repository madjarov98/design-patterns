package observer;

import java.util.ArrayList;

import command.Command;
import command.Exercises;
import command.FitnessInstructor;
import command.LieDownCommand;
import command.StandUpCommand;

public class ObserverMain {

	public static void main(String[] args) {
		FitnessInstructor fitnessInstructor = new FitnessInstructor();
        Exercises exercises = new Exercises();
        
        Command standUpCommand = new StandUpCommand(exercises);
        Command lieDownCommand = new LieDownCommand(exercises);

        Trainee trainee = new Trainee();
        
        Viewer firstViewer = new Viewer("First Viewer");
        Viewer secondViewer = new Viewer("Second Viewer");
        Viewer thirdViewer = new Viewer("Third Viewer");

        ArrayList<Viewer> viewers = new ArrayList<Viewer>();
        viewers.add(firstViewer);
        viewers.add(secondViewer);
        viewers.add(thirdViewer);
        
        for (Viewer viewer : viewers) {
        	trainee.subscribe(viewer);
        }

        fitnessInstructor.setCommand(standUpCommand);
        fitnessInstructor.returnMessage();
        trainee.doExercise(fitnessInstructor.setExercises());

        fitnessInstructor.setCommand(lieDownCommand);
        fitnessInstructor.returnMessage();
        trainee.doExercise(fitnessInstructor.setExercises());
	}

}
