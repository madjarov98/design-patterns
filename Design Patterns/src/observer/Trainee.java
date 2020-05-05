package observer;

import java.util.ArrayList;
import java.util.List;

public class Trainee implements Observable {

private List<Observer> observers = new ArrayList<Observer>();
	
	private String exercises;

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setTrainee(this);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : this.observers) {
            observer.update();
        }
	}

	@Override
	public String getUpdate() {
		return this.exercises;
	}
	
	public String getExercise() {
        return exercises;
    }
	
	public void doExercise(String exercises) {
        this.exercises = exercises;
        this.notifyObservers();
    }
	
}
