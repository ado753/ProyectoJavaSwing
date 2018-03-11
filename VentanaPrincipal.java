
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VentanaPrincipal extends JFrame {

    private JLabel insert, print;
    private JTextField campo1;
    private JButton boton1;
    private JDialog texto;


    public VentanaPrincipal() {
        super("Ventana Principal");
        setSize(400, 400);

        insert = new JLabel("Inserte Texto : ");
        campo1 = new JTextField(20);
        boton1 = new JButton("aceptar");

        FlowLayout f = new FlowLayout();
        print = new JLabel("");
        setLayout(f);

        setLayout(null);
        insert.setBounds(90, 75, 100, 30);
        campo1.setBounds(200, 75, 150, 30);
        boton1.setBounds(150, 175, 100, 30);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        texto = new JDialog(this);
        texto.setSize(600, 600);

        add(insert);
        add(campo1);
        add(boton1);

        texto.add(print);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boton1();
                campo1.setText(null);
            }
        });
    }

    private void boton1() {

        String valor = campo1.getText();
        texto.getContentPane().setBackground(Color.BLACK);//color del fondo
        print.setText(valor);
        print.setForeground(Color.WHITE);//color de la letra
        print.setFont(new java.awt.Font("Tahoma", 0, 50));//fuente y tamaño de la letra
        texto.setVisible(true);
    }
}
