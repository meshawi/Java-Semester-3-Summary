import java.util.Scanner;
import javax.swing.JOptionPane; 

public class S3Programing {

	public static void main(String[] args) {
		
//		------- all this work done by @MOhammed Aleshawi ---------
		
		/*to use Stander Input Statement
		first add this above public class import java.util.Scanner;
		then add this command
		 		scanner + scnaer's name =new Scanner(System.in);
		 		
		if you want to make the input as specifies data type use can add
		the scanner's Variable Name.nextDATATPE 
				4ex. dgree.nextInt();
		finally, end the Scanner class using the following command:
				objectName.close(); 

		 to read STRING :  scanner's name.next();
		 to read INTEGER:  scanner's name.nextInt();
		 to read Double :  scanner's name.nextDouble();
		 and the list goes on and on .nextByte .nextShort ect.
		
		Scanner test = new Scanner(System.in); //call the Scanner class from the java library 
		use this command  scanner's name.nextInt();  if the next input is an integer
		now what ever value stored in the test is going to be Integer
		System.out.println("the input = " + test.nextInt());
		test.close(); //end the Scanner class
		*/
		
		//more Practice ::::::::::::::
	    /*
		int no1, no2;
		
		Scanner P1 = new Scanner(System.in);
		System.out.println("ENTER FIRST VALUE");
		no1 = P1.nextInt();
		System.out.println("ENTER SECEND VALUE");
		no2 = P1.nextInt();
		
		int totalP1 = no1+no2;
		System.out.println("the total is =" + totalP1);
					//the link for tutorial : https://youtu.be/huZ1neRqNho
		*/
//-----------------------------------------------------------------------------------------------------
		/*Graphical User Interface (GUI) method
		 * first add this above public class import javax.swing.JOptionPane; 
		 *  import the library and call the JOptionPane class from the javax library using the
			following command:
					import javax.swing.JOptionPane; 
			 The two methods of this class that we use are: showInputDialog and showMessageDialog.
				 The method showInputDialog allows the user to input a string from the keyboard.
				 The method showMessageDialog allows the programmer to display the results.
		 
		String name = JOptionPane.showInputDialog("Enter your Name");
	//variableName =JOptionPane.showInputDialog(“the message that will appear to the user”);
		JOptionPane.showConfirmDialog(null,"Hello " + name);
		Finally, end the JOptionPane class using the following command:
				System.exit(0);
		
	    this method is for string only !!!!!! if you want to to use another data type use the following 
		byte =  	Byte.parseByte(variableName);
		short=  	Short.parseShort(variableName);
		int  =  	Integer.parseInt(variableName);
		long =  	Long.parseLong(variableName);
		float=  	Float.parseFloat(variableName);
		double = 	Double.parseDouble(variableName);
		boolean =	Boolean.parseBoolean(variableName); 
		*/
		
		
		// more Practice ::::::::::::::
		/*
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are " + age + " years old", "Window name",JOptionPane.INFORMATION_MESSAGE); 
		//the command						text		 v 			text	  panel name	the image shown in the panel
		System.exit(0);
		*/
					//the link for tutorial : https://youtu.be/rWCnZKF-U3Q
//-----------------------------------------------------------------------------------------------------
		/* Escape Characters
		 * use /n for NewLine
		 * use /t for Tab ( some spaces )
		 * use /r for Make the next in new line
		 * use /' for Single quote
		 * use /" for Double quote
		 */
		
		
		//more Practice ::::::::::::::
		/*
		System.out.println("\tHe said\n\"Hello\" \n");
		System.out.println("  Practise Escape");
		System.out.println("hi\rHello\n");
		
		*/
		
		//the link for tutorial : https://youtu.be/pxOos0bT9rM
//-----------------------------------------------------------------------------------------------------
		//assignment operation
		/* it is used to say A=A+B, but in Java we say A+=B its the same but defrint statement
		 * use can use A+=B or A-=B or A*=B A/=B A%=B
		 */
		
		// more Practice ::::::::::::::
		/*
		int x =13, y=4;
		x+=y;
		System.out.println("x = " + x);
		
		*/
		
//-----------------------------------------------------------------------------------------------------
		
		//arthemetic operation
		//normal operations like add, sub, mult, ect...
		
		
		// more Practice ::::::::::::::
		/*
		int x =3, y=2, z=x+y;
		
		System.out.println("z = " + z);
		
		// also we have Pre Increment (++A) and Post Increment (A++), same for sub
		int a=7, b=7;
		System.out.println("Deffult = "+ a);
		System.out.println("Pre Increment = "+ ++a);// save new value then print
		System.out.println("Post Increment = "+ b++);// print then save new value

		*/
		
//-----------------------------------------------------------------------------------------------------
		//logical operation
		//AND = && , OR = || , NOT = ! :: to learn the value return to the truth table
		
		// more Practice ::::::::::::::
		/*
		System.out.println("AND");
		boolean A=true, B=false;
		boolean C1 = A&&A    ,   C2 = A&&B    ,    C3 = B&&B;
		System.out.println("C1 = " +C1);
		System.out.println("C3 = " +C2);
		System.out.println("C3 = " +C3);
		
		System.out.println();
		System.out.println("OR");

		boolean D1 = A||A    ,   D2 = A||B    ,    D3 = B||B;
		System.out.println("D1 = " +D1);
		System.out.println("D3 = " +D2);
		System.out.println("D3 = " +D3);
		
		System.out.println();
		System.out.println("NOT");

		boolean E1 = !A    ,   E2 = !B;
		System.out.println("E1 = " +E1);
		System.out.println("E3 = " +E2);
		*/
		
//-----------------------------------------------------------------------------------------------------
		/*Relational operations 
		 *normal : A is equal B						in java : A==B
		 *normal : A is not equal B					in java : A != B
		 *normal : A is less than B					in java : A < B
		 *normal : A is greater than B				in java : A > B
		 *normal : A is greater than or equal B		in java : A >= B
		 *normal : A is less than or equal B		in java : A <= B 
		 */
		
		// more Practice ::::::::::::::
		/*
		String name="Mohammed";
		System.out.println(name=="Mohammed" ? "Name is Correct " : "Name Wrong!");
		//is the name = Mohammed if yes (?) print Name is Correct else (:) print Name Wrong!
		
		*/
		
//-----------------------------------------------------------------------------------------------------
		/*Textual operations 
		 * first we need to know that the index start from 0 unlike Length witch starts by 1
		 * for example the Name Mohammed  more explaining > M o h a m m e d
		 * 						01234567					0 1 2 3 4 5 6 7
		 * so the index is = 7 and the Length is = 8
		 * !!!!!! Remember spaces count : Saleh Ali more explaining > Saleh Ali
		 * 															  012345678
		 * so the index is = 8 and the Length is = 9 because spaces count
		 * 
		 * 
		 * so we have low for it >>  { Length = index + 1 }
		 */
		
		
		//Merger process
		//we use String concat(String otherString); to merge to strings
		
		//Retrieval process 
		//we use char charAt(int index); to get on specific index
								//or
		//we use String substring(int beginIndex, int endIndex); to get specific indexes

		//replaceing process
		//we use String replaceAll(String oldString, String newString); to replace specific string to another
		
		//Comparison process
		//we use boolean matches(String otherString); to see if string indexes with another string indexes
		//we use boolean equals(String otherString) to see if string Cases matches with another string Cases 
		//boolean equalsIgnoreCase(String otherString) to see if string matches with another string and ignoring the Case (A,a)

		//Calculation process
		//we use int length(); to calculate the length of variable
		
		//Conversion process
		//we use String toLowerCase() to change the String to Small letters
		//we use String toUpperCase() to change the String to Capital letters
		
		//Casting Operations
		//Atomic Casting :
		//Automatic conversion between data types occurs in two cases:
			//If the two types are compatible (e.g. long, int.).
			//If the target type is greater than the source type (e.g. int to long, float to double, int to double…).
		//Explicit Casting:
			//A function that helps convert should be used for the following cases:
			//If the data types are incompatible (such as from int to char, or from int to boolean...etc), there are methods that we will learn about in next semester.
			//If the target type is smaller than the source type (e.g. from int to byte), then the conversion function will be in the form:
		
				//we use targetType variable1=(targetType) variable2;
		//thus :
		//tagetType: is the type required to convert an uppercase variable to it.
		//variable1: variable with lowercase type.
		//variable2: the variable with uppercase type

		// more Practice ::::::::::::::
		/*
		
			//Merger process
		System.out.println("\tMerger process");
		System.out.println();

		String name = "Moahmmed S Aleshawi";
		String Jop = " , I'm a Student"; 
		// we can save it as new variable or concat in the print Statement , I'm going to save it as new Variable
		String newName = name.concat(Jop);
		System.out.println(newName);
		
		System.out.println();

			//Retrieval process
		System.out.println("\tRetrieval process");
		System.out.println();
		
		char CharRetrive =name.charAt(9);
		System.out.println(CharRetrive);
		String subStringP1 = newName.substring(0,5);
		System.out.println(subStringP1);
		
		System.out.println();

		
			//Replaceing process
		System.out.println("\tReplaceing process");
		System.out.println();
		
		String newrReplaceAll = name.replaceAll("S", "Saleh");
		System.out.println(newrReplaceAll);

		System.out.println();

		
		//Comparison process
		System.out.println("\tComparison process");
		System.out.println();
		
		boolean test1 = name.matches("Moahmmed S Aleshawi");
		boolean test2 = name.equals("moahmmed s aleshawi");
		boolean test3 = name.equalsIgnoreCase("moahmmed s aleshawi");
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);

		System.out.println();

		
			//Calculation process
		System.out.println("\tCalculation process");
		System.out.println();
		
		int L =name.length();
		System.out.println(L);
		
		System.out.println();

		
			//Conversion process
		System.out.println("\tConversion process");
		System.out.println();
		
		String convSmall = name.toLowerCase();
		String convBigg = name.toUpperCase();
		System.out.println(convSmall);
		System.out.println(convBigg);

		System.out.println();

		//Casting
		System.out.println("Explicit Casting");
		System.out.println();
		
		double x = 55.17;
		int y =(int)x;
		System.out.println(y);
		
		
		System.out.println();

		System.out.println("Atomic Casting");
		System.out.println();
		
		int a =5;
	    double b = a;
	    System.out.println(b);
		*/
		
//-----------------------------------------------------------------------------------------------------
		//IF Statement
		 // Simple if = if the condition is true the precede else nothing (One path only)
		 // IF else =  if the condition is true the precede else do some thing (two paths)
		 // Nasted IF = more of IFs ( multiple if ) or more of else ( multiple else ) it means more choices 
		 
		
		
		
		//more Practice ::::::::::::::

		//Simple if
		  
		/*
		Scanner IF = new Scanner(System.in);
		double dgree=IF.nextDouble();
		
		if(dgree>=60) { //add the { } if there is more then one statement like more then one print
			System.out.println("Pass");
			System.out.println("Congratulations");
		}

		System.out.println("Fail");
		System.out.println("Maybe next time");

				IF.close();
		*/
		
		
		//If else
		
		/*
		Scanner IF = new Scanner(System.in);
		double dgree=IF.nextDouble();
		
		if(dgree>=60)
		 
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		System.out.println("Good Luck");
				IF.close();

		*/
		
		
		// Nasted IF (muliple elses)
		 
		/*
		Scanner IF = new Scanner(System.in);
		double dgree=IF.nextDouble();
		
		if(dgree>=90)
			System.out.println("A");
		else if (dgree>=80)
			System.out.println("B");
		else if (dgree>=70)
			System.out.println("C");
		else if (dgree>=60)
			System.out.println("D");
		else 
			System.out.println("F");
				IF.close();

		*/
		
		
		//Nasted if (muliple ifs ) if the digree =99 for example the resulte would be A,B,C,D unlike Nasted if (muliple elses)
		
		/*
		Scanner IF = new Scanner(System.in);
		double dgree=IF.nextDouble();
		
		if(dgree>=90)
			System.out.println("A");
		if (dgree>=80)
			System.out.println("B");
		if (dgree>=70)
			System.out.println("C");
		if (dgree>=60)
			System.out.println("D");
		else 
			System.out.println("F");
				IF.close();

		*/
		
		
		//IF ELSE USING ?:
	
		/*
		Scanner IF = new Scanner(System.in);
		double dgree=IF.nextDouble();
		
		System.out.println(dgree >=60 ? "Pass" : "Fail");
		//is the dgree = grater than or equal to 60 if yes (?) print Pass else (:) Fail
		
		System.out.println("Good Luck");
				IF.close();

		*/
		
		
		
		//Nested Conditional
		
		/*
		Scanner ageinput = new Scanner(System.in);
		int age1 =ageinput.nextInt();
		
		if(age1==18 || age1==19)
			System.out.println("Welcome you are old enugh");
		else
			System.out.println("Sorrry you are not old enugh");

		ageinput.close();
		*/
		
//-----------------------------------------------------------------------------------------------------
		
		
		//Switch
		//Switches used to do match cases , for example if I input something its going search in the cases and look for match 
		// but if there is no match its going use the default statement
		
		
		//more Practice ::::::::::::::
		// Normal Switch ( inter day nomber and you will get the day name )
		
		/*
		Scanner dayInput = new Scanner (System.in);
		int day = dayInput.nextInt();
		switch(day) {
		case 1:
			System.out.println("Saterday");
			break;
		case 2:
			System.out.println("Sunday");
			break;
		case 3:
			System.out.println("Monday");
			break;
		case 4:
			System.out.println("Tuesday");
			break;
		case 5:
			System.out.println("Wensday");
			break;
		case 6:
			System.out.println("Thursday");
			break;
		case 7:
			System.out.println("Friday");
			break;
			default:
				System.out.println("The day number is Wrong !");
			
			dayInput.close();
			*/
		
		
		//the second switch method we use it to avoid repet
		//( if i have multiple cases with the same action like the same print statement i use this one instead of adding the print to each case)
		
		/*
		Scanner dayInput = new Scanner (System.in);
		String Age = dayInput.next();
		switch(Age) {
		case "A+":
		case "A":
		case "B+":
		case "B":
		case "C+":
		case "C":
		case "D+":
		case "D":
			System.out.println("Congurlations on you secsess");//for all above cases
			break;
		case"F":
			System.out.println("Sorry good luck");// for F case
			break;
			default:
				System.out.println("No grade interd"); // if there is no match
		dayInput.close();
		
		
		}
		*/
		
//-----------------------------------------------------------------------------------------------------
		
		
		//Triangle >> = corner A + corner B + corner C 
		//more Practice ::::::::::::::
		
		/*
		int a=3, b=4, c=5;
		int area = a+b+c;
		System.out.println(area);
		
		*/
		
		//Roctangle >> = Side X + Side Y
		//more Practice ::::::::::::::
		
		/*
		int x=3, y=5;
		int area = x*y;
		System.out.println(area);

		*/
		
		//circle >> = PI * the radius squared
		//more Practice ::::::::::::::

		/*
		final double PI =3.14;
		int n =3;
		
		double area = PI*n*n;//n*n to get the n squared
		System.out.println(area);

		*/
		
		//-----------------------------------------------------------------------------------------------------
		
		
		/*
		 * 				LOOP IN JAVA
		 * Program print integer numbers from 1 to 10:
		 * And the SUM 
		 */
		
		
		//For Repetition Statement
		//more Practice ::::::::::::::

		/*
		for(int i = 1; i<=10; i++)
			System.out.println(i);
		*/
		
		//Sum :
		/*
		int sum=0;
		for(int i = 1; i<=10; i++)
			sum+=i;
		System.out.println("Total is = " + sum);
		*/
		
		//-----------------------------------------------------------------------------------------------------
		
		//While Repetition Statement
		//more Practice ::::::::::::::

		/*
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		*/
		
		//Sum :
		/*
		int i = 1, sum=0;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println("Total is = " + sum);
		*/
		
		//-----------------------------------------------------------------------------------------------------

		//Do While Repetition Statement
		//more Practice ::::::::::::::

		/*
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}
		while(i<=10);
		*/
		
		//Sum :
		/*
		int i = 1, sum=0;
		do {
			sum+=i;
			i++;
		}
		while(i<=10);
		System.out.println("Total is = " + sum);
		 */
		
		//-----------------------------------------------------------------------------------------------------

		/*
		 * 				NESTED LOOP IN JAVA
		 * A program that prints multiplication tables from 1 to 10:
		 */
		
		
		//For Nested Loop Statement
		//more Practice ::::::::::::::
		
		/*
		int i,j,result;
		for(i = 1; i<=10; i++) {
			for(j = 1; j<=10; j++) {
				result= i * j ;
				System.out.println(i + " * " + j + " = " + result);
			}
			System.out.println("----------------");
		}
		*/
		
		//Do While Nested Loop Statement
		//more Practice ::::::::::::::
		
		/*
		int i, result;
		i =1;
		do {
			int j=1;
			do {
				result= i * j ;
				System.out.println(i + " * " + j + " = " + result);
				j++;
			}while(j<=10);
			
			System.out.println("----------------");
			i++;
		}while(i<=10);
		*/
		
		
		//While Nested Loop Statement
		//more Practice ::::::::::::::
		
		/*
		int i, result;
		i =1;
		
		while(i<=10) {
			int j=1;
			
			while(j<=10) {
				result= i * j ;
				System.out.println(i + " * " + j + " = " + result);
				j++;
			}
			
			System.out.println("----------------");
			i++;
		}
		*/
			
		//-----------------------------------------------------------------------------------------------------

		
		
		
		//brake
		//more Practice ::::::::::::::
		
		/*
		for(int i = 1; i<=10; i++) {
			if(i==4) {
				break;//stop the loop at 4
			}
			System.out.println(i);
		}
		*/
		
		//continue
		//more Practice ::::::::::::::
		
		/*
		for(int i = 1; i<=10; i++) {
			if(i==4) {
				continue;//DON'T stop the loop at 4 ( the condition is not printed )
			}
			System.out.println(i);
		}
		*/
		
//						------- all this work done by @MOhammed Aleshawi ---------
	}
}
