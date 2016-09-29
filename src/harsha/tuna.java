package harsha;
public class tuna{
	private String girlname;
	public tuna(String name){
		girlname=name;
	}
	public void setName(String name){
		girlname=name;
	}
	public String getName(){
		return girlname;
		
	}
	public void saying(){
		System.out.printf("your first girlfriend was %s\n", getName());
	}
	public void fucking(){
		System.out.printf("your second gf was %s ",getName());
	}
}