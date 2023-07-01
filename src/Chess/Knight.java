package Chess;
import java.util.ArrayList;

/**
 * A Knight chess piece.
 */
public class Knight extends ChessPiece
{
	/**
	 * Constructs a Knight chess piece with given coordinates.
	 * @param coordinates coordinates of knight.
	 */
	public Knight(String coordinates)
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
		if(currentRow+2<8)
		{
			if(currentCol+1<8)
			{
				super.setCanMoveTo(super.getColumnLetter(currentCol+1)+(currentRow+3));
			}
			if(currentCol-1>=0)
			{
				super.setCanMoveTo(super.getColumnLetter(currentCol-1)+(currentRow+3));
			}
		}
		if(currentRow+1<8)
		{
			if(currentCol+2<8)
			{
				super.setCanMoveTo(super.getColumnLetter(currentCol+2)+(currentRow+2));
			}
			if(currentCol-2>=0)
			{
				super.setCanMoveTo(super.getColumnLetter(currentCol-2)+(currentRow+2));
			}
		}
		if(currentRow-2>=0)
		{
			if(currentCol+1<8)
			{
				super.setCanMoveTo(super.getColumnLetter(currentCol+1)+(currentRow-1));
			}
			if(currentCol-1>=0)
			{
				super.setCanMoveTo(super.getColumnLetter(currentCol-1)+(currentRow-1));
			}
		}
		if(currentRow-1>=0)
		{
			if(currentCol+2<8)
			{
				super.setCanMoveTo(super.getColumnLetter(currentCol+2)+(currentRow));
			}
			if(currentCol-2>=0)
			{
				super.setCanMoveTo(super.getColumnLetter(currentCol-2)+(currentRow));
			}
		}
		
		return super.canMoveTo();
	}
}
