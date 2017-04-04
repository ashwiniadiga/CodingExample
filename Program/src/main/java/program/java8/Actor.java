package program.java8;

import java.util.List;

public interface Actor {
	void act();
	void speak();
	default void comedy(){
		System.out.println("I can make people laugh");
	}
	

}
