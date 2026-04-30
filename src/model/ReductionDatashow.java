package model;

import interfaces.IStrategieReduction;

public class ReductionDatashow implements IStrategieReduction {
    public double appliquerReduction(double montant) {
        return montant*0.8; // 20% de réduction pour datashow
    }
}
