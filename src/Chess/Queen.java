package Chess;
import java.util.ArrayList;

/**
 * A Queen chess piece.
 */
public class Queen extends ChessPiece
{
	/**
	 * Constructs a Queen chess piece with given coordinates.
	 * @param coordinates coordinates of queen.
	 */
	public Queen(String coordinates)
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
