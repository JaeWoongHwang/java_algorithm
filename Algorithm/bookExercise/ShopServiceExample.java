package bookExercise;

public class ShopServiceExample {

	public static void main(String[] args) {
		// Get singleton through getInstance() method
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2){
			System.out.println("There are same ShopService instances");
		} else {
			System.out.println("There are not same ShopService instances");
		}

	}

}
