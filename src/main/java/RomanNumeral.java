//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class RomanNumeral implements Comparable<RomanNumeral>
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		roman = str;
		number = 0;
		while(!(str.equals(""))){
		for(int i = 0; i < LETTERS.length; i++){
			if(str.indexOf(LETTERS[i])==0){
				number = number + NUMBERS[i];
				str = str.substring(LETTERS[i].length());
			}
		}
	}
		
	}

	public RomanNumeral(Integer orig)
	{
		number = orig;
		roman = "";
		for(int i = 0; i < NUMBERS.length; i++){
			while(orig >= NUMBERS[i]){
				roman = roman + LETTERS[i];
				orig = orig - NUMBERS[i];
			}
		}
	}

	//write a set number method
	
	public void setNumber(int num){
		number = num;
		roman = "";
		for(int i = 0; i < NUMBERS.length; i++){
			while(num >= NUMBERS[i]){
				roman = roman + LETTERS[i];
				num = num - NUMBERS[i];
			}
		}
	}
	public void setRoman(String rom){
		roman = rom;
		number = 0;
		while(!(rom.equals(""))){
		for(int i = 0; i < LETTERS.length; i++){
			if(rom.indexOf(LETTERS[i])==0){
				number = number + NUMBERS[i];
				rom = rom.substring(LETTERS[i].length());
			}
		}
	}
	}
	//write a set roman method

	public int getNumber(){
		
		return number;
	}
	public String getRoman(){
		return roman;
	}
	//write get methods for number and roman
	
	

	public int compareTo(RomanNumeral r)
	{
		return (number - r.getNumber());
	}

	//write  toString() method
	public String toString(){

		return roman;
	}
	
	
}