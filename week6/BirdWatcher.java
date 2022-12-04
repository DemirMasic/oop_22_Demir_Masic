package week6;

import java.util.ArrayList;
import java.util.Collections;

public class BirdWatcher {
	ArrayList<Bird> birds = new ArrayList<Bird>();
	
	public BirdWatcher() {
		
	}
	
	public void addBird(Bird newBird) {
		this.birds.add(newBird);
	
	}
	
	
	public void statistics(){
		birds.sort((Bird b1, Bird b2) -> Integer.compare(b2.getObeservations(), b1.getObeservations()));
		for (Bird bird : this.birds) {
			System.out.println(bird.getName() + " (" + bird.getLatinName() + ") :" + bird.getObeservations() + " observations");
		}
	}
	
	public boolean doesExist(String nameOfBird){
		for (Bird bird : birds) {
			if(StringUtils.included(bird.getName(), nameOfBird)) {
				return true;
			}
		}
		return false;
	}
	
	public void gotObserved(String name) {
		for (Bird bird : birds) {
			if(StringUtils.included(bird.getName(), name)) {
				bird.Observed();
			}
		}
	}
	
	public void show(String name){
		for (Bird bird : this.birds) {
			if (StringUtils.included(bird.getName(), name)) {
				System.out.println(bird.getName() + " (" + bird.getLatinName() + ") :" + bird.getObeservations() + " observations");
			}
			
		}
	}
}