package harsha;

public class potpie {
private int month;
private int day;
private int year;

public potpie(int m,int d,int y){
	month =m;
	day=d;
	year=y;
	System.out.printf("the contructor for this is %S \n", this);
}
public String tostring(){
	return String.format("%d %d %d", month,day,year);
}
}
