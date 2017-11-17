package practiceA;

public class FindKim {
	public String findKim(String[] seoul){
		
		int x = 0;
		
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				x =i;
			}
		}
		
		return "김서방은 "+ x + "에 있다";
	}
	
	public static void main(String[] args) {
		FindKim kim = new FindKim();
		String[] names = {"Queen", "Tod","Kim"};
		System.out.println(kim.findKim(names));
	}
}