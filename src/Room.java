/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class Room 
{
    private String description;
    private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room getExit(String direction) {
    	
    	if (direction.equals("norte")) {
    		return northExit;
    	}
    	
    	if(direction.equals("sul")) {
    		return northExit;
    	}
    	
    	if(direction.equals("leste")) {
    		return northExit;
    	}
    	
    	if(direction.equals("oeste")) {
    		return northExit;
    	}
    	
    	return null;
    }
    
    public Room(String description) 
    {
        this.description = description;
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    
         
    
    public void setExits(Room north, Room east, Room south, Room west) 
    {
        if(north != null)
            northExit = north;
        if(east != null)
            eastExit = east;
        if(south != null)
            southExit = south;
        if(west != null)
            westExit = west;
    }
    
    
    public String getExitString() {
    	String saida = "saida ";
    	System.out.print("Saídas: ");
    	
    	if(northExit != null) {
            saida+="norte ";
        }
        if(eastExit != null) {
        	saida+="sul "; 
        }
        if(southExit != null) {
        	saida+="leste ";  
        }
        if(westExit != null) {
        	saida+="oeste ";   
        }
		return saida;
    }

    public Room getNorthExit() {
		return northExit;
	}

	public void setNorthExit(Room northExit) {
		this.northExit = northExit;
	}

	public Room getSouthExit() {
		return southExit;
	}

	public void setSouthExit(Room southExit) {
		this.southExit = southExit;
	}

	public Room getEastExit() {
		return eastExit;
	}

	public void setEastExit(Room eastExit) {
		this.eastExit = eastExit;
	}

	public Room getWestExit() {
		return westExit;
	}

	public void setWestExit(Room westExit) {
		this.westExit = westExit;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

}