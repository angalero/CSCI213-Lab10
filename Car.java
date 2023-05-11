public class Car extends Vehicle {

	
	private int numOfDoors;
	private int numOfPass;
	
	public Car(String aMake, String aModel, String aPlate,
			int doors, int pass) {
		super(aMake, aModel, aPlate);
		
		this.numOfDoors = doors;
		this.numOfPass = pass;
	}
	
	public int getDoors() {
		
		return this.numOfDoors;
	}
	
	public int getPass() {
		
		return this.numOfPass;
	}
	
	
	public String toString() {
		
		String vehString;
		
		vehString = String.format("%d-door %s %s with license %s",
				this.numOfDoors, this.getMake(), this.getModel(), 
				this.getPlate());
		
		return vehString;
	}
	
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Car)) {
			
			return false;
		}
		
		Car other = (Car) obj;
		
		if (this.numOfDoors == other.getDoors() 
			&& this.numOfPass == other.getPass() 
			&& super.equals(obj)){
				
				return true;
			}
		
		return false;
		
	}
	
	
	public Car copy() {
		
		Car carCopy;
		
		
		
		carCopy = new Car(this.getMake(), this.getModel(), 
				this.getPlate(), this.numOfDoors, this.numOfPass);
		
		return carCopy;
	}
	
	
}