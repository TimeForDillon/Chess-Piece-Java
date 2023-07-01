package Chess;
import java.util.ArrayList;

/**
 * A Bishop chess piece
 */
public class Bishop extends ChessPiece
{
	/**
	 * Constructs a Bishop chess piece with given coordinates.
	 * @param coordinates coordinates of bishop.
	 */
	public Bishop(String coordinates)
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
		for(int i=currentRow+1, j=currentCol+1; i<8&&j<8; i++, j++)
		{
			super.setCanMoveTo(super.getColumnLetter(j)+(i+1));
		}
		for(int i=currentRow+1, j=currentCol-1; i<8&&j>=0; i++, j--)
		{
			super.setCanMoveTo(super.getColumnLetter(j)+(i+1));
		}
		for(int i=currentRow-1, j=currentCol-1; i>=0&&j>=0; i--, j--)
		{
			super.setCanMoveTo(super.getColumnLetter(j)+(i+1));
		}
		for(int i=currentRow-1, j=currentCol+1; i>=0&&j<8; i--, j++)
		{
			super.setCanMoveTo(super.getColumnLetter(j)+(i+1));
		}
		return super.canMoveTo();
	}
}
