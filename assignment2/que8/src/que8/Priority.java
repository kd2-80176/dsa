package que8;

import java.util.Scanner;

public class Priority {
	public static int prio(char opr) {
		switch (opr) {
		case '$':
			return 11;
		case '/':
			return 10;
		case '*':
			return 10;
		case '%':
			return 10;
		case '+':
			return 9;
		case '-':
			return 9;
		}
		return 0;

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first oprator to check priority=");
		char opr1=sc.next().charAt(0);
		System.out.print("Enter the second oprator to check priority=");
		char opr2=sc.next().charAt(0);
		if(prio(opr1)>prio(opr2)) 
		{
		System.out.println("opr :"+opr1+" has a greater priority than opr2:"+opr2);	
		}
		else if(prio(opr1)==prio(opr2)) 
		{
			System.out.println("opr :"+opr2+" has a equal priority opr2:"+opr1);		
		}
		else 
		{
			System.out.println("opr :"+opr2+" has a greater priority than opr2:"+opr1);		
		}
		

	}

}
