package day_17.triangle;

public class Triangle {
    int sideA, sideB, sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA >= 1 && sideA <= 20) {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB >= 1 && sideB <= 20) {
            this.sideB = sideB;
        }
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        if (sideC >= 1 && sideC <= 20) {
            this.sideC = sideC;
        }
    }

    private boolean isTriangleValid(int sideA, int sideB, int sideC) {
        return sideA + sideB >= sideC || sideB + sideC >= sideA || sideA + sideC >= sideB;
    }

    public boolean check(int sideA, int sideB, int sideC) {
        return isTriangleValid(sideA, sideB, sideC);
    }

    public boolean checkIfTriangleIsRight(int sideA, int sideB, int sideC) {
        return (Math.pow(sideA, 2) + Math.pow(sideB, 2)) == Math.pow(sideC, 2)
               || (Math.pow(sideB, 2) + Math.pow(sideC, 2)) == Math.pow(sideA, 2)
               || (Math.pow(sideA, 2) + Math.pow(sideC, 2)) == Math.pow(sideB, 2);
    }
}
