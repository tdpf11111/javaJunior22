package lesson14;

import java.util.Objects;

public class Coin  implements Comparable<Coin>{
    private int nominal;
    private int year;
    private double diagonal;
    private String metall;

    public Coin() {
    }

    public Coin(int nominal, int year, double diagonal, String metall) {
        this.nominal = nominal;
        this.year = year;
        this.diagonal = diagonal;
        this.metall = metall;

    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coin)) return false;
        Coin coin = (Coin) o;
        return getNominal() == coin.getNominal() && getYear() == coin.getYear() && Double.compare(coin.getDiagonal(), getDiagonal()) == 0 && Objects.equals(getMetall(), coin.getMetall());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNominal(), getYear(), getDiagonal(), getMetall());
    }

    @Override
    public String toString() {
        return "Монета{" +
                "номинал=" + nominal +
                ", год выпуска=" + year +
                ", диаметр=" + diagonal +
                ", металл='" + metall + '\'' +
                '}';
    }

    @Override
    public int compareTo(Coin o) {
        if (this.nominal !=o.nominal){
            return this.nominal - o.nominal;
        }
        if (this.year !=o.year){
            return this.year - o.year;
        }
        if (this.diagonal !=o.diagonal){
            return Double.compare(this.diagonal,o.diagonal);
        }
        if (this.metall != o.metall){
            return this.metall.compareTo(o.metall);
        }

        return 0;
    }
}
