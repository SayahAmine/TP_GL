





import model.Piece;
import model.Repair;

import java.util.Date;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Piece p1 = new Piece("Alternator", 101, 2, 150.0);
        Piece p2 = new Piece("Battery", 102, 1, 80.0);
        Piece p3 = new Piece("Oil Filter", 103, 5, 20.0);


        System.out.println("Initial Pieces:");
        p1.Display();
        p2.Display();
        p3.Display();


        Vector<Piece> pieceList = new Vector<>();
        pieceList.add(p1);
        pieceList.add(p2);


        Repair repair = new Repair(new Date(), 3, "Engine diagnostics", pieceList, pieceList.iterator());


        repair.addPiece("Oil Filter", 103, 5, 20.0);


        System.out.println("\nRepair Details:");
        repair.displayReperation();


        double total = repair.calculateAmountReperation();
        System.out.println("\nTotal Repair Amount: " + total);


        repair.modifyPiece(102, "Battery Premium", 2, 100.0);

        System.out.println("\nIs piece 101 available? " + repair.isAvailable(101));
        System.out.println("Is piece 999 available? " + repair.isAvailable(999));


        repair.deletePiece(101);


        System.out.println("\nFinal Repair Details:");
        repair.displayReperation();
    }
}
