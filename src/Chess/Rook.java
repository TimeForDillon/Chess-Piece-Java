package Chess;
import java.util.ArrayList;

/**
 * Constructs a Rook chess piece with given coordinates.
 * @param coordinates coordinates of rook.
 */
public class Rook extends ChessPiece
{
	/**
	 * Constructs a Rook chess piece with given coordinates.
	 * @param coordinates coordinates of rook.
	 */
	public Rook(String coordinates)
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
		int currentCol = super.getColumnNumber();
		for(int i=currentRow+1; i<8 ; i++)
		{
			super.setCanMoveTo(super.getColumnLetter()+(i+1));
		}
		for(int i=currentRow; i>0 ; i--)
		{
			super.setCanMoveTo(super.getColumnLetter()+(i));
		}
		for(int i=currentCol+1; i<8 ; i++)
		{
			super.setCanMoveTo(super.getColumnLetter(i)+(currentRow+1));
		}
		for(int i=currentCol-1; i>=0 ; i--)
		{
			super.setCanMoveTo(super.getColumnLetter(i)+(currentRow+1));
		}
		return super.canMoveTo();
	}
	
}
