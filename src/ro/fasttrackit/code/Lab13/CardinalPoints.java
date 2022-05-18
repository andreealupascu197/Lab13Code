package ro.fasttrackit.code.Lab13;

import java.util.Arrays;

public enum CardinalPoints {
    NORD("N"),
    SUD("S"),
    EST("E"),
    VEST("V"),
    NORD_VEST("NV");

    private String abreviation;

    CardinalPoints(String abreviation) {
        this.abreviation = abreviation;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public String direction() {
        return switch (this) {
            case NORD -> "UP";
            case SUD -> "Down";
            case EST -> "Right";
            case VEST -> "left";
            case NORD_VEST -> "leftUP";
        };
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(CardinalPoints.values())); //lista card pooints din enum
        System.out.println(CardinalPoints.valueOf("NORD").direction()); // case
        System.out.println(CardinalPoints.NORD.name()); //nume
        System.out.println(CardinalPoints.EST.ordinal()); //index in lista
    }
}
