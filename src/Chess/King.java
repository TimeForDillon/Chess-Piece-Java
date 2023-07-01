package Chess;
import java.util.ArrayList;

/**
 * A King chess piece.
 */
public class King extends ChessPiece
{
	/**
	 * Constructs a King chess piece with given coordinates.
	 * @param coordinates coordinates of king.
	 */
	public King(String coordinates)
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
		if(currentRow++<7)
		{
			super.setCanMoveTo(super.getColumnLetter()+(currentRow+1));
			if(currentCol++<7)
			{
				super.setCanMoveTo(super.getColumnLetter(this.getColumnNumber()+1)+(currentRow+1));
			}
			if(currentCol-->1)
			{
				super.setCanMoveTo(super.getColumnLetter(this.getColumnNumber()-1)+(currentRow+1));
			}
		}
		if(currentRow-->1)
		{
			super.setCanMoveTo(super.getColumnLetter()+(currentRow));
			if(currentCol++<7)
			{
				super.setCanMoveTo(super.getColumnLetter(this.getColumnNumber()+1)+(currentRow));
			}
			if(currentCol-->1)
			{
				super.setCanMoveTo(super.getColumnLetter(this.getColumnNumber()-1)+(currentRow));
			}
		}
		if(currentCol++<7)
		{
			super.setCanMoveTo(super.getColumnLetter(this.getColumnNumber()+1)+(currentRow+1));
		}
		if(currentCol-->1)
		{
			super.setCanMoveTo(super.getColumnLetter(this.getColumnNumber()-1)+(currentRow+1));
		}
		return super.canMoveTo();
	}
}
