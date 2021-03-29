package nl.han.ooad.quebble;

import java.util.ArrayList;
import java.util.List;

public class Letters implements IPritableToConsole {

	private ArrayList<Character> letters;

	public Letters(ArrayList<Character> letters) {
		this.letters = letters;
	}


	/**
	 * @see IPritableToConsole#printToConsole()
	 *  
	 */
	public void printToConsole() {

	}

    public ArrayList<Character> getLetters() {
		return letters;
    }
}
