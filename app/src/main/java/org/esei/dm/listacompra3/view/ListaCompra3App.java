package org.esei.dm.listacompra3.view;

import android.app.Application;


import org.esei.dm.listacompra3.core.Item;

import java.util.ArrayList;
import java.util.List;

public class ListaCompra3App extends Application {
    private List<Item> items;
    private int pos;

    @Override
    public void onCreate() {
        super.onCreate();
        this.items = new ArrayList<>();
    }

    /**
     * Gets the list of items
     * @return the list of items, as a List<Item>.
     */
    public List<Item> getItemList() {
        return this.items;
    }

    public void addItem(String nombre, int num) {
        Item item = new Item( nombre );
        item.setNum( num );

        this.items.add( item );
    }

    public void modifyItem(int pos, String nombre, int num) {
        Item item = new Item( nombre );
        item.setNum( num );

        this.items.set( pos, item );
    }
}
