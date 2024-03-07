package frasesbentennyson;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FrasesBenTennyson {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Funciones funciones = new Funciones();
            funciones.iniciarVentanaPrincipal();
        });
    }
}
