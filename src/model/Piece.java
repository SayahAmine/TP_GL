package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Piece {


    private String name;

    private int refrance;
    private int stockQuantity;

    private double price;

    public Piece(String name, int refrance, int stockQuantity, double price) {
        this.name = name;
        this.refrance = refrance;
        // If stockQuantity is negative or 0, set it to 0; otherwise keep the given value
        this.stockQuantity = (stockQuantity <= 0) ? 0 : stockQuantity;
        this.price = price;
    }

    public void addQuantity(int quantity) {
        this.stockQuantity += quantity;
    }

    double calculateAmount() {
        return stockQuantity * price;
    }

    public void Display() {
        System.out.println("Name: " + name);
        System.out.println("Refrance: " + refrance);
        System.out.println("Stock Quantity: " + stockQuantity);
        System.out.println("Price: " + price);
    }

}
