package frasesbentennyson;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Funciones {
    private static final String[] FRASES_BEN10 = {
            "Frase Número 1: Es hora de ser héroe.",
            "Frase Número 2: Ahora estoy en problemas.",
            "Frase Número 3: ¿¡Materia Gris!?",
            "Frase Número 4: ¿Listo para la acción?", 
            "Frase Número 5: Vamos, equipo Tennyson.",  
            "Frase Número 6: Nunca subestimes el poder de un héroe.", 
            "Frase Número 7: Soy Ben Tennyson portador del arma más poderosa de todo el universo.", 
            "Frase Número 8: No hay desafío que Ben Tennyson no pueda superar.", 
            "Frase Número 9: Esto se va a poner salvaje.",
            "Frase Número 10: Ni siquiera lo intentes, Vilgax." ,
            "Frase Número 11: Los malos nunca descansan, pero yo tampoco. ",
            "Frase Número 12: Como decía Mandibulin: Nadie me respeta.",
            "Frase Número 13: Déjame presentate un amigo que me gusta llamar Humongosaurio!",
            "Frase Número 14: Vamos amor, cualquier viejo alien servirá de dizfras.",
            "Frase Número 15: Muy bien fenómeno ahora es personal.",
            "Frase Número 16: Ser un héroe es genial, pero también conlleva mucha responsabilidad.",
            "Frase Número 17: El Omnitrix me da el poder de diez héroes, y no tengo miedo de usarlo.",
            "Frase Número 18: Nunca subestimes la astucia de un Tennyson.",
            "Frase Número 19: No importa cuán difícil se ponga, siempre encontraré una forma de salvar el día.",
            "Frase Número 20: Omnitrix Auto-destruyete en 30 segundos: Código de Comando: 000-Destruyete-0.",
    };
    
   private JFrame ventanaPrincipal;
    private JLabel etiquetaFrase;

    public void iniciarVentanaPrincipal() {
        ventanaPrincipal = new JFrame("Frases de Ben Tennyson (Ben 10)");
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton botonMostrarFrase = new JButton("Mostrar Frase");
        JButton botonTerminar = new JButton("Terminar");

        etiquetaFrase = new JLabel();

        ActionListener botonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == botonMostrarFrase) {
                    mostrarFrase();
                } else if (e.getSource() == botonTerminar) {
                    cerrarVentanaPrincipal();
                }
            }
        };

        botonMostrarFrase.addActionListener(botonListener);
        botonTerminar.addActionListener(botonListener);

        ventanaPrincipal.getContentPane().add(botonMostrarFrase);
        ventanaPrincipal.getContentPane().add(botonTerminar);
        ventanaPrincipal.getContentPane().add(etiquetaFrase);

        ventanaPrincipal.setLayout(new BoxLayout(ventanaPrincipal.getContentPane(), BoxLayout.Y_AXIS));
        ventanaPrincipal.setSize(625, 118);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setVisible(true);
    }

    private void mostrarFrase() {
        Random random = new Random();
        int indiceFrase = random.nextInt(FRASES_BEN10.length);
        etiquetaFrase.setText(FRASES_BEN10[indiceFrase]);
    }

    private void cerrarVentanaPrincipal() {
        ventanaPrincipal.dispose();
    }
}