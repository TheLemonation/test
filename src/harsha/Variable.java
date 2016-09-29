package harsha;
//variable length arguments
public class Variable {
public static void main(String[] args){
	System.out.println(average(75,45,46,47,54,45,1215454));
	
}
public static int average(int...number){
	int total=0;
	for(int x:number)
		total+=x;
	return total/number.length;
}
}
