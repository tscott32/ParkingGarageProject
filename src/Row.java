
public class Row {
    private ParkingSpot[] spots;
    
    public Row() {
	spots = new ParkingSpot[1];
	spots[0] = new ParkingSpot();	
    }
    
    public Row(int size) {
	spots = new ParkingSpot[size];
	for (int i = 0; i < size; i++) {
	    spots[i] = new ParkingSpot();
	}
    }
    
    public int getSize() {
	return spots.length;
    }
    
    public void changeSpotType() {
	
    }
    
    public ParkingSpot findEmptySpot() {
	
    }
    
    public String toString() {
	
    }
    
}
