//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster(){

	}
	public Monster(int ht){
		myHeight = ht;
	}
	public Monster(int ht, int wt){
		myHeight = ht;
		myWeight = wt;
	}
	public Monster(int ht, int wt, int age){
		myHeight = ht;
		myWeight = wt;
		myAge = age;
	}
	public void setHeight(int ht){
		myHeight = ht;
	}
	public void setWeight(int wt){
		myWeight = wt;
	}
	public void setAge(int age){
		myAge = age;
	}
	public int getHeight(){
		return myHeight;
	}
	public int getWeight(){
		return myWeight;
	}
	public int getAge(){
		return myAge;
	}
	

	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster(myHeight, myWeight, myAge);
	}

	public boolean equals( Object obj )
	{
		Monster rhs = (Monster)obj;
		if(myHeight == rhs.getHeight()){
			if(myWeight == rhs.getWeight()){
				if(myAge == rhs.getAge()){
					return true;
				}
			}
		}

		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if(equals(rhs)){
			return 0;
		}
		if(myHeight > rhs.getHeight()){
			return 1;
		}
		if(myHeight < rhs.getHeight()){
			return -1;
		}
		if(myHeight == rhs.getHeight()){
			if(myWeight > rhs.getWeight()){
				return 1;
			}
			if(myWeight < rhs.getWeight()){
				return -1;
			}
			if(myWeight == rhs.getWeight()){
				if(myAge > rhs.getAge()){
					return 1;
				}
				if(myAge < rhs.getAge()){
					return -1;
				}
			}
		}
		return 0;
	}

	//write a toString() method
	public String toString(){
		return "Monster :: " + myHeight + " " + myWeight + " " + myAge;
	}
	
}