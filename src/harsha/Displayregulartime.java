package harsha;

public class Displayregulartime {
	public static void main(String[] args){
    	time timeObject=new time();
    	System.out.println(timeObject.tomilitary());
    	System.out.println(timeObject.toString());
    	
    	timeObject.settime(13,27,6);
    	System.out.println(timeObject.tomilitary());

    	System.out.println(timeObject.toString());
	}
}
