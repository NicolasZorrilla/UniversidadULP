
package com.mycompany.universidadejemplo;

import gui.*;

public class UniversidadEjemplo {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        MenuView desktopView = new MenuView();
        desktopView.setVisible(true);
        desktopView.setLocationRelativeTo(null);
    }
}
