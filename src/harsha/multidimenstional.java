package harsha;
import java.util.Random;
import java.util.Scanner;
public class multidimenstional {
	//Multidimensional array
	public static void main(String args[]){
	int firstarray[][]={{8,7,8,8,2,6},{7,8,9,4,5}};
	int secondarray[][]={{30,44,45,46},{46},{4,5,6}};
	
	System.out.println("this is the first array");
	display(firstarray);
	
	System.out.println("this is the SECOND array");
	display(secondarray);
	
	
	}
	public static void display(int x[][]){
		for(int row=0;row<x.length;row++){
			for(int column=0;column<x[row].length;column++){
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();
		}
		
	}
	}