//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int numOfVowels(String words){
		char disChar = 'A';
		int numOfVow = 0;
		for(int i = 0; i < words.length(); i++){
			disChar = words.charAt(i);
			if(disChar == 'a' || disChar == 'e' || disChar == 'i' || disChar == 'o' || disChar == 'u'){
				numOfVow = numOfVow + 1;
			}
		}
		return numOfVow;
	}

	public boolean alphabetize(String word1, String word2, int place){
		if(word1.charAt(place) < word2.charAt(place)){
			return true;
		}
		if(word1.charAt(place) > word2.charAt(place)){
			return false;
		}
		return alphabetize(word1, word2, place++);
	}
	
	public int compareTo( Word rhs )
	{	
		if(numOfVowels(word) == numOfVowels(rhs.word)){
			if(word.equals(rhs.word)){
			return 0;
			}
			if(alphabetize(word, rhs.word, 0)){
				return 1;
			}else{
				return -1;
			}
		}
		if(numOfVowels(word) > numOfVowels(rhs.word)){
			return -1;
		}
		if(numOfVowels(word) < numOfVowels(rhs.word)){
			return 1;
		}
		
		return -2;
		
	}

	public String toString()
	{
		return word;
	}
}