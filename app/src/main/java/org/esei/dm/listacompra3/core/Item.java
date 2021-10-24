package org.esei.dm.listacompra3.core;


public class Item {
    private String nombre;
    private int num;

    public Item(String n)
    {
        this.nombre = n;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString()
    {
        return this.getNombre() + ". Num.: " + this.getNum();
    }
}
