
public class LBList2Demo {
	
	public static void main(String [] args) {
		
		
		LBList2<Integer> listOne = new LBList2<Integer>();
		LBList2<Integer> listEmpty = new LBList2<Integer>();
		LBList2<Integer> listMulti = new LBList2<Integer>();
		
		listOne.add(1);
		
		listMulti.add(2);
		listMulti.add(6);
		listMulti.add(7);
		listMulti.add(8);
		listMulti.add(2);
		listMulti.add(5);
		listMulti.add(1);
		listMulti.add(6);
		listMulti.add(9);
		listMulti.add(2);
		listMulti.add(4);
		listMulti.add(2);
		
		System.out.println("---Testing toString method ---");
		System.out.println(listOne.toString());
		System.out.println(listEmpty.toString());
		System.out.println(listMulti.toString());
		
		
		System.out.println("---Testing removeAll method ---");
		System.out.println(listMulti.toString());
		System.out.println(listMulti.size());
		listMulti.removeAll(1);
		
	}
}
