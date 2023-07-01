package Chess;
import java.util.ArrayList;

/**
 * A Pawn chess piece.
 */
public class Pawn extends ChessPiece
{
	/**
	 * Constructs a Pawn chess piece with given coordinates.
	 * @param coordinates coordinates of Pawn.
	 */
	public Pawn(String coordinates)
	{
		super();
		super.setPosition(coordinates);
	}
	
	/**
	 * Retrieves a list of all possible spots the chess piece can move to. 
	 * @return A list of all possible spots the chess piece can move to.
	 */
	public ArrayList<String> canMoveTo()
	{
		int currentRow = super.getRow();
		if(currentRow++<7)
		{
			super.setCanMoveTo(super.getColumnLetter()+(currentRow+1));
		}
		if(currentRow-->1)
		{
			super.setCanMoveTo(super.getColumnLetter()+(currentRow));
		}
		return super.canMoveTo();
	}
}
