package services;

public class CoffeService {
	
	/**
	    START Decouplinng classes by functional class of class 
	 */
	
	private CoffeInterface coffeInterface;
	
	public CoffeService(CoffeInterface coffeInterface) {
		this.coffeInterface = coffeInterface;
	}
	
	/**
	    END Decouplinng class
	 */
	
	public String OrederCoffe(int glasses) {
		
		String coffe = this.coffeInterface.Dispatch();
		
		return String.valueOf(glasses).concat(" - ").concat(coffe);
		
	}

}
