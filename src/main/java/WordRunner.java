
import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("java/words.dat"));

		int size = file.nextInt();
		ArrayList<Word> words = new ArrayList<>();

		for(int i = 0; i < size; i++){
			words.add(new Word(file.nextLine()));
		}
		int total = 0;
		while(total != 8){
			total = 0;
			for(int i = 0; i < words.size()-1; i++){
				Word word1 = words.get(i);
				Word word2 = words.get(i+1);
				
				total = total + words.get(i).compareTo(words.get(i+1));
				if(word1.compareTo(word2) != 1){
					words.set(i, word2);
					words.set(i+1, word1);
				}
				
			}
		}
		for(int i = 0; i < words.size(); i++){
			System.out.println(words.get(i).toString());
		}








	}
}