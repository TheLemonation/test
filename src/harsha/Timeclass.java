package harsha;

public class Timeclass {
            public static void main(String[] args){
            	time timeObject=new time();
            	System.out.println(timeObject.tomilitary());
            timeObject.settime(1,1,1);
            System.out.println(timeObject.tomilitary());
            }
}
