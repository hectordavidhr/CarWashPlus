package com.company;

public class lavado1 implements dibujar{

    private String tipo;
    private String precio;

    private static lavado1 milavado;

    public  static final lavado1 getMilavado(String tipo, String precio) {
        if (milavado == null) {

            milavado = new lavado1(tipo, precio);
        }
        return milavado;
    }

    private lavado1(String tipo, String precio){

        this.tipo = tipo;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrecio() {
        return precio;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public void dibujar() {
        System.out.println("Lavados realizado tipo:  "+tipo +",    precio: "+precio);
    }
}


