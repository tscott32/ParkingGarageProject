
public class ParkingGarage {
    
    // Local variables
    private Level[] levels;
    
    // Default Constructor
    public ParkingGarage() {
	levels = new Level[1];
	levels[0] = new Level();
    }
    
    // Overloaded Constructor for different default values
    public ParkingGarage(int numOfLevels, int spotsPerLevel, int spotsPerRow) {
	levels = new Level[numOfLevels];
	for (int i = 0; i < numOfLevels; i++) {
	    levels[i] = new Level(spotsPerLevel, spotsPerRow);
	}
    }
    
    public ParkingSpot findEmptySpot() {
	return emptySpot;	
    }
    
    public void changeGarageSpot() {
	
    }
    
    public String toString() {
	return "";
    }
}
