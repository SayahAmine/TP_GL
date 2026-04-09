package model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Iterator;
import java.util.Vector;


@Getter
@Setter
public class Repair {

    private Date  repairdate;
    private int nbhours;
    private String job;

    private Vector<Piece> listPiece = new Vector<>();
    Iterator<Piece> iterator = listPiece.iterator();


    public Repair(Date repairdate, int nbhours, String job, Vector<Piece> listPiece, Iterator<Piece> iterator) {

        this.repairdate = repairdate;
        this.nbhours = nbhours;
        this.job = job;

        if(listPiece == null ) {
            this.listPiece = new Vector<>();
        }else{
            this.listPiece = listPiece;
        }
    }

    public double calculateAmountReperation() {
        double total = 0;
        Iterator<Piece> iterator = listPiece.iterator(); // new iterator each time
        while (iterator.hasNext()) {
            total += iterator.next().calculateAmount();
        }
        return total;
    }



    public void addPiece( String name,int ref, int quantity, double price) {

        while (iterator.hasNext()) {

            Piece p = iterator.next();
            if (p.getRefrance() == ref) {
                p.setStockQuantity(p.getStockQuantity() + quantity);
                return;
            }
        }
        listPiece.add(new Piece(name, ref, quantity, price));
    }


    public void modifyPiece(int ref, String name, int quantity, double price) {

        while (iterator.hasNext()) {

            Piece p = iterator.next();

            if (p.getRefrance() == ref) {
                p.setName(name);
                p.setStockQuantity(quantity);
                p.setPrice(price);
                return;
            }
        }
        System.out.println("Piece does not exist!");
    }

    public boolean isAvailable(int ref) {

        while (iterator.hasNext()) {

            Piece p = iterator.next();
            if (p.getRefrance() == ref) {
                return true;
            }
        }
        return false;
    }

    public void deletePiece(int ref) {

        while (iterator.hasNext()) {

            Piece p = iterator.next();

            if (p.getRefrance() == ref) {
                p.Display();
                iterator.remove();
                System.out.println("Piece deleted");
                return;
            }
        }
        System.out.println("Piece does not exist!");
    }

    public void displayReperation() {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
