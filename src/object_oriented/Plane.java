package object_oriented;
//testing branches ddsd
//sdsdsd
public class Plane {
	public String title;
	public int capac1ty1;
	public int speed = 7;
	
	static String object_name = Object.class.getName();
	//this trainee/test
		public int difference() {
			return speed - capacity;
		}
		
	public void get(){
		
		System.out.println(object_name);
		System.out.println("Title: " +this.title +"; capacity: "+capacity+";"
				+ " speed: "+this.speed);
	}
	public void get(String title, int capacity, int speed){
		
		System.out.println(object_name);
		System.out.print("Title: " +title +"; capacity: "+capacity+"; speed: "+speed);
	}
	
	public String get(Plane p){
		
		return String.valueOf(p);	
	}
	
	public int get(Plane p, int b, int c, int d, int e){
		int res = b - capacity;
		return res;
		//Plane plane = new Plane();
		//return plane;	
	}
	public int return_smth (int a, int b){
		int res = a+b;
		return res;
	}
	
	
	
   
}
