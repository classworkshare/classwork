public class Confirm14Q1 {
	
	public static void main(String[] args) {
		Bus instBus;
		PatrolCar instPCar;
		
		instBus = new Bus();
		instPCar = new PatrolCar();
		
		instBus.put(5);
		instBus.drive(20);
		instBus.drop(3);
		instPCar.siren();
		instPCar.drive(10);
	}
}