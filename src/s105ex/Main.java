package s105ex;

public class Main {

	public static void main(String[] args) {

		MyList mylist = new MyList();
		for (int i =0; i < 100;i++) {
			mylist.add(i);

		}
		
		
		System.out.println(mylist.getSize());
		System.out.println(mylist.get(89));

	}

}
