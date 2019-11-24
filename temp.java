import java.util.*;

class ABA implements Cloneable{
	public int a = 2;
	public int b = 3;

	protected Object clone(){
		return super.clone();
	}
}

class Test{
	public static void main(String[] Args){
		ArrayList<ABA> A = new ArrayList<ABA>();
		
		ABA c = new ABA();
		ABA b = (ABA)c.clone();
		/*A.add(b);
		A.get(0).a = 10;
		A.get(0).b = 20;
		System.out.println(A.get(0) == b);*/
		// System.out.println(A.get(0).a);
		// System.out.println(A.get(0).b);
	}
}