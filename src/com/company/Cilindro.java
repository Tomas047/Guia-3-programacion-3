package com.company;

public class Cilindro extends Circulo{

    private double altura;

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }
    public Cilindro(double altura) {
        super();
        this.altura = altura;
    }
    public Cilindro() {
        super();
        this.altura = 1.0;
    }

    public double volumen (){
        return super.area()*altura;
    }

    @Override
    public double area() {
        return (2*Math.PI*super.getRadio()*altura + 2*super.area());
    }

    @Override
    public String toString() {
        return super.toString() + "altura: " + altura;
    }
}
