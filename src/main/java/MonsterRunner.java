//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class MonsterRunner
{
   public static void main( String args[] )
   {
	/* 
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 1st monster's name : ");
	Skeleton first = new Skeleton(scan.next());
	System.out.println("Enter 1st monster's size : ");
	first.setSize(scan.nextInt());
	System.out.println("Enter 2nd monster's name : ");
	Skeleton second = new Skeleton(scan.next());
	System.out.println("Enter 2nd monster's size : ");
	second.setSize(scan.nextInt());

	System.out.println("\nMonster 1 - " + first.getName());
	System.out.println("Monster 2 - " + second.getName());

	if(first.getHowBig() > second.getHowBig()){
		System.out.println("\nMonster one is bigger than Monster two.");
	}
	else if(first.getHowBig() < second.getHowBig()){
		System.out.println("\nMonster one is smaller than Monster two.");
	}
	else{
		System.out.println("\nMonster one and Monster two are the same size.");
	}
	if(first.namesTheSame(second)){
		System.out.println("Monster one has the same name as Monster two.");
	}
	else{
		System.out.println("Monster one does not have the same name as Monster two.");
	}


	System.out.println("Enter 1st monster's name : ");
	first.setName(scan.next());
	System.out.println("Enter 1st monster's size : ");
	first.setSize(scan.nextInt());
	System.out.println("Enter 2nd monster's name : ");
	second.setName(scan.next());
	System.out.println("Enter 2nd monster's size : ");
	second.setSize(scan.nextInt());

	System.out.println("\nMonster 1 - " + first.getName());
	System.out.println("Monster 2 - " + second.getName());

	if(first.getHowBig() > second.getHowBig()){
		System.out.println("\nMonster one is bigger than Monster two");
	}
	else if(first.getHowBig() < second.getHowBig()){
		System.out.println("\nMonster one is smaller than Monster two");
	}
	else{
		System.out.println("\nMonster one and Monster two are the same size");
	}
	if(first.namesTheSame(second)){
		System.out.println("Monster one and Monster two have the same name");
	}
	else{
		System.out.println("Monster one does not have the same name as Monster two");
	}


	System.out.println("Enter 1st monster's name : ");
	first.setName(scan.next());
	System.out.println("Enter 1st monster's size : ");
	first.setSize(scan.nextInt());
	System.out.println("Enter 2nd monster's name : ");
	second.setName(scan.next());
	System.out.println("Enter 2nd monster's size : ");
	second.setSize(scan.nextInt());

	System.out.println("\nMonster 1 - " + first.getName());
	System.out.println("Monster 2 - " + second.getName());

	if(first.getHowBig() > second.getHowBig()){
		System.out.println("\nMonster one is bigger than Monster two");
	}
	else if(first.getHowBig() < second.getHowBig()){
		System.out.println("\nMonster one is smaller than Monster two");
	}
	else{
		System.out.println("\nMonster one and Monster two are the same size");
	}
	if(first.namesTheSame(second)){
		System.out.println("Monster one and Monster two have the same name");
	}
	else{
		System.out.println("Monster one does not have the same name as Monster two");
	}





	*/ 
		Monster zero = new Monster();
		Monster one = new Monster(8);
		Monster sue = new Monster(9, 4);
		Monster harry = new Monster(1, 2, 3);
		out.println("\nzero Monster :: " + zero);		
		out.println("\none Monster :: " + one);
		out.println("\nsue Monster :: " + sue);
		out.println("\nharry Monster :: " + harry);

		out.println("\nchanging harry's properties ");				
		harry.setHeight(7);
		harry.setWeight(6);
		harry.setAge(5);
		out.println("\nharry Monster :: " + harry);

		out.println("\ncloning harry");	
		sue = (Monster)harry.clone();
		out.println("\nsue Monster :: " + sue);

		Monster mOne = new Monster(33,33,11);
		Monster mTwo = new Monster(55,33,11);

		out.println("\nMonster 1 :: " + mOne);
		out.println("\nMonster 2 :: " + mTwo);

		out.print("\nmOne.equals(mTwo) == ");
		out.println(mOne.equals(mTwo));

		out.print("\nmOne.compareTo(mTwo) == ");
		out.println(mOne.compareTo(mTwo));
		out.print("\nmTwo.compareTo(mOne) == ");
		out.println(mTwo.compareTo(mOne));
	}
}