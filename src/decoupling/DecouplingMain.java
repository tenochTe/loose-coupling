package decoupling;

import services.CoffeService;
import services.HotCoffe;
import services.IceCoffe;

public class DecouplingMain {
	
	public static void main(String[] args) {
		
		CoffeService hotCoffe =new CoffeService(new HotCoffe());		
			System.out.println(hotCoffe.OrederCoffe(3));
		
		CoffeService iceCoffe =new CoffeService(new IceCoffe());
			System.out.println(iceCoffe.OrederCoffe(1));
	}

}
