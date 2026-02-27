//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Skeleton implements Monster_i {
	// add instance variables
	private int size;
	private String name;

	public Skeleton(){
		name = "";
		size = 0;
	}	
	public Skeleton(String n){
		name = n;
		size = 0;
	}
	public Skeleton(String n, int s){
		size = s;
		name = n;
	}
	public void setSize(int s){
		size = s;
	}
	public void setName(String n){
		name = n;
	}
	public int getHowBig(){
		return size;
	}
	public String getName(){
		return name;
	}
	public boolean isBigger(Skeleton other){
		if(size > other.getHowBig()){
			return true;
		}
		return false;
	}
	public boolean isSmaller(Skeleton other){
		if(size < other.getHowBig()){
			return true;
		}
		return false;
	}
	public boolean namesTheSame(Skeleton other){
		if(name.equals(other.getName())){
			return true;
		}
		return false;
	}
	public String toString(){
		return "Skeleton's name : " + name + "\nSkeleton's size : " + size;
	}
}