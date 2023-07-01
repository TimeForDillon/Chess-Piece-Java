package Chess;
import java.util.ArrayList;

/**
 * A class to test the ChessPiece class. 
 */
public class ChessPieceTester {

	public static void main(String[] args)
	{
		ArrayList<ChessPiece> myPieces = new ArrayList<ChessPiece>();
		
		myPieces.add(new Pawn("d4"));
		myPieces.add(new Bishop("d4"));
		myPieces.add(new Rook("d4"));
		myPieces.add(new King("d4"));
		myPieces.add(new Queen("d4"));
		myPieces.add(new Knight("d4"));
		
		System.out.println("Pawn:");
		System.out.println(myPieces.get(0).canMoveTo());
		System.out.println("\rBishop:");
		System.out.println(myPieces.get(1).canMoveTo());
		System.out.println("\rRook:");
		System.out.println(myPieces.get(2).canMoveTo());
		System.out.println("\rKing:");
		System.out.println(myPieces.get(3).canMoveTo());
		System.out.println("\rQueen:");
		System.out.println(myPieces.get(4).canMoveTo());
		System.out.println("\rKnight:");
		System.out.println(myPieces.get(5).canMoveTo());
	}

}
