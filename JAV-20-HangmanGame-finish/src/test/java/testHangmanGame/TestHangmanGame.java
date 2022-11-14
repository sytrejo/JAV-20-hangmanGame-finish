package testHangmanGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hangmanGame.Hangman;

class TestHangmanGame {
	//5 steps in TDD
	//write a test
	//make the test compile
	//watch the test fail
	//just enough to make it pass
	//Refactor and generalize 
	
	String word;
	char letter;
	Hangman newHangmanGame;
	
	@BeforeEach
	void setUp() {
		newHangmanGame = new Hangman();

	}

	@Test
	void test_whenTheCountTheLettersMethodIsCalledTheNumberOfTimesTheLetterAppearsInTheWordIsReturned() {
		//Arrange
		word = "school";
		letter = 'o';

		//Act -- calling the code under test
		int count = newHangmanGame.countTheLetters(word, letter);
	
		//Assert -- compare the expected result and the actual result.
		assertEquals(2, count);
			
	}
	
	@Test
	void test_whenTheCountTheLettersMethodIsCalledTheNumberOfTimesTheLetterAppearsInTheWordifLIsGussessed() {
		//Arrange
		word = "school";
		letter = 'l';
	
		//Act -- calling the code under test
		int count = newHangmanGame.countTheLetters(word, letter);
		
		//Assert -- compare the expected result and the actual result.
		assertEquals(1, count);
			
	}
	
	@Test
	void test_whenMethodGetWordIsCalledReturnsAWord() {
		//Arrange - preconditions
//		Hangman newHangmanGame = new Hangman();
		
		//Act -- code to be tested.
		String returnedWord = newHangmanGame.getWord();
		
		//Assert
		assertEquals("school", returnedWord);
		assertTrue(returnedWord.length() == 6);
	}
	
	

}
