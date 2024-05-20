package Ejercicio2;

import java.util.Objects;

public class Triangulo extends Figura2D{


    private int long1, long2, long3;

    public Triangulo() {
    }

    public Triangulo(String nombre, int long1, int long2, int long3) {
        super(nombre);
        this.long1 = long1;
        this.long2 = long2;
        this.long3 = long3;
    }

    public int getLong1() {
        return long1;
    }

    public void setLong1(int long1) {
        this.long1 = long1;
    }

    public int getLong2() {
        return long2;
    }

    public void setLong2(int long2) {
        this.long2 = long2;
    }

    public int getLong3() {
        return long3;
    }

    public void setLong3(int long3) {
        this.long3 = long3;
    }

    @Override
    public double calcularPerimetro() {
        return long1+long2+long3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangulo triangulo)) return false;
        if (!super.equals(o)) return false;
        return long1 == triangulo.long1 && long2 == triangulo.long2 && long3 == triangulo.long3;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), long1, long2, long3);
    }


}
