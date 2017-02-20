package object_oriented;

public class MathodsMain {

	public static void main(String[] args) {
		Plane plane = new Plane();
		plane.title = "boeing 787";
		plane.capacity = 200;
		plane.speed = 1000;//git test
		
		Plane plane2 = new Plane();
		plane.title = "boeing 787";
		plane.capacity = 200;
		plane.speed = 1000;
		
		int diff = plane2.difference();
		System.out.println(diff);
		Plane plane3 = plane;
		/*
		if (plane.equals(plane2)) System.out.println("plane equals plane2");
		else if (plane.equals(plane3)) System.out.println("plane equals plane3");
		else System.out.println("plane doesn`t equals to any planes");
		
		if (plane==plane3) System.out.println("plane == plane3");
		
		System.out.println(plane2.get(plane2));
		 **/
		//int a = plane.get(plane2, 5, -8, 3 ,4);
		//System.out.println("a ="+a);
		
	}

}
