
public class Level {
    //Local data fields
    private Row[] rows;
    
    //Default Constructor
    public Level() {
	rows = new Row[1];
	rows[0] = new Row();
    }
    
    //Overloaded Constructor for change in default values
    public Level(int spotsPerLevel, int spotsPerRow) {
	int numOfRows = spotsPerLevel/spotsPerRow;
	rows = new Row[numOfRows];
	for (int i = 0; i < numOfRows; i++) {
	    rows[i] = new Row(spotsPerRow);
	}
    }
    
    public void changeLevelSpot() {
	
    }
    
    public ParkingSpot findEmptySpot() {
	return emptySpot;
    }
    
    public String toString() {
	
    }

}
