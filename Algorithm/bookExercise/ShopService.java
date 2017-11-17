package bookExercise;

public class ShopService {
	// Singleton definition
	// Static field
	private static ShopService singleton = new ShopService();

	// Constructor
	private ShopService() {
	};

	// Static method
	static ShopService getInstance() {
		return singleton;
	}
}
