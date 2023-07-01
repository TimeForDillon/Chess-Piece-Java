package Chess;
import java.util.ArrayList;

/**
 * A chess piece with a position.
 */
public abstract class ChessPiece
{
	private String position;
	private ArrayList<String> canMoveTo;
	
	/**
	 * Constructor for ChessPiece object.
	 */
	public ChessPiece()
	{
		this.position = "";
		this.canMoveTo = new ArrayList<String>();
	}
	
	/**
	 * Sets the position of the chess piece to the given coordinates.
	 * @param coordinates Coordinates for location of chess piece.
	 */
	public void setPosition(String coordinates)
	{
		this.position = coordinates.toUpperCase();
	}
	
	/**
	 * Gets the position of the chess piece.
	 * @return String Coordinates for location of chess piece.
	 */
	public String getPosition()
	{
		return this.position;
	}
	
	/**
	 * Retrieves a list of all possible spots the chess piece can move to. 
	 * @return A list of all possible spots the chess piece can move to.
	 */
	public ArrayList<String> canMoveTo()
	{
		return this.canMoveTo;
	}
	
	/**
	 * Sets positions the piece can move to.
	 */
	public void setCanMoveTo(String coordinates)
	{
		this.canMoveTo.add(coordinates);
	}
	
	/**
	 * Returns a string with the data of the object.
	 * @return A string with the data of the object.
	 */
	public String toString()
	{
		return (this.position + " " + this.canMoveTo.toString());
	}
	
	/**
	 * Retrieves the numeric value of the column.
	 * @return The numeric value of the column.
	 */
	public int getColumnNumber()
	{
		char column = this.position.charAt(0);
		switch(column)
		{
		default: return 0;
		case 'A': return 0;
		case 'B': return 1;
		case 'C': return 2;
		case 'D': return 3;
		case 'E': return 4;
		case 'F': return 5;
		case 'G': return 6;
		case 'H': return 7;
		}
	}
	
	/**
	 * Retrieves the column letter.
	 * @return String column letter.
	 */
	public String getColumnLetter()
	{
		return this.position.charAt(0) + "";
	}
	
	/**
	 * Retrieves the column letter.
	 * @return String column letter.
	 */
	public String getColumnLetter(int num)
	{
		switch(num)
		{
		default: return "A";
		case 0: return "A";
		case 1: return "B";
		case 2: return "C";
		case 3: return "D";
		case 4: return "E";
		case 5: return "F";
		case 6: return "G";
		case 7: return "H";
		}
	}
	
	/**
	 * Retrieves the row number.
	 * @return row number.
	 */
	public int getRow()
	{
		char row = this.position.charAt(1);
		switch(row)
		{
		default: return 0;
		case '1': return 0;
		case '2': return 1;
		case '3': return 2;
		case '4': return 3;
		case '5': return 4;
		case '6': return 5;
		case '7': return 6;
		case '8': return 7;
		}
	}
}
