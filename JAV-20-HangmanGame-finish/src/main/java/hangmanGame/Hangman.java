package hangmanGame;

public class Hangman {

	public int countTheLetters(String word, char letter) {
		 int result = 0;
		 
		 
		 for(char c : word.toCharArray()) {
			 if(c == letter) {
				 result++;
			 }
		 }

		
		return result;
	}

	public String getWord() {
		// TODO Auto-generated method stub
		return "school";
	}

}
