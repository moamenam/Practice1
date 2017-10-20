
public class P1 implements Comparable<P1> {

	
	String name;
	int weight;
	
	public P1(String pname,int pWeight){
		super();
		this.name=pname;
		this.weight=pWeight;
	}
	
	
	public int compareTo(P1 o) {
		// TODO Auto-generated method stub
		return weight-o.weight;
	}

}
