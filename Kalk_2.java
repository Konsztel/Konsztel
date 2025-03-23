//Version 1.2

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalk_2 extends JFrame implements ActionListener {

    JLabel l_a, l_b, l_result;
    JButton b_adding, b_subtraction, b_multiplication, b_splitting, b_power, b_square_root, b_cbrt;
    JTextField t_a, t_b;
    double a, b, wynik;

    public Kalk_2(){
        setSize(800,600);
        setTitle("Kalkulator");
        setLayout(null);

        l_result = new JLabel("Wynik:");
        l_result.setFont(new Font("Courier",Font.PLAIN, 20));
        l_result.setBounds(350, 50, 200, 20);
        add(l_result);

        l_a = new JLabel("a");
        l_a.setFont(new Font("Courier",Font.PLAIN, 20));
        l_a.setBounds(30, 150,50, 50);
        add(l_a);

        l_b = new JLabel("b");
        l_b.setFont(new Font("Courier",Font.PLAIN, 20));
        l_b.setBounds(30, 200, 50, 50);
        add(l_b);

        b_adding = new JButton("+");
        b_adding.setFont(new Font("Courier",Font.PLAIN, 20));
        b_adding.setBounds(570, 150, 70, 50);
        add(b_adding);
        b_adding.addActionListener(this);
        b_adding.setToolTipText("Dodawanie");

        b_subtraction = new JButton("-");
        b_subtraction.setFont(new Font("Courier",Font.PLAIN, 20));
        b_subtraction.setBounds(570, 200, 70, 50);
        add(b_subtraction);
        b_subtraction.addActionListener(this);
        b_subtraction.setToolTipText("Odejmowanie");

        b_multiplication = new JButton("*");
        b_multiplication.setFont(new Font("Courier",Font.PLAIN, 20));
        b_multiplication.setBounds(500, 150, 70, 50);
        add(b_multiplication);
        b_multiplication.addActionListener(this);
        b_multiplication.setToolTipText("Mnożenie");

        b_splitting = new JButton("/");
        b_splitting.setFont(new Font("Courier",Font.PLAIN, 20));
        b_splitting.setBounds(500, 200, 70, 50);
        add(b_splitting);
        b_splitting.addActionListener(this);
        b_splitting.setToolTipText("Dzielenie");

        b_power = new JButton("^");
        b_power.setFont(new Font("Courier",Font.PLAIN, 20));
        b_power.setBounds(500, 250, 70, 50);
        add(b_power);
        b_power.addActionListener(this);
        b_power.setToolTipText("Potęgowanie");

        b_square_root = new JButton("√");
        b_square_root.setFont(new Font("Courier",Font.PLAIN, 20));
        b_square_root.setBounds(570, 250, 70, 50);
        add(b_square_root);
        b_square_root.addActionListener(this);
        b_square_root.setToolTipText("Pierwiastek kwadratowy");

        b_cbrt = new JButton("√3");
        b_cbrt.setFont(new Font("Courier",Font.PLAIN, 20));
        b_cbrt.setBounds(500, 300, 70, 50);
        add(b_cbrt);
        b_cbrt.addActionListener(this);
        b_cbrt.setToolTipText("Pierwiastek sześcienny");

        t_a = new JTextField("");
        t_a.setBounds(50, 150, 50, 50);
        add(t_a);

        t_b = new JTextField("");
        t_b.setBounds(50, 200, 50, 50);
        add(t_b);

        UIManager.put("ToolTip.font", new Font("Arial", Font.PLAIN, 16));
    }


    public static void main(String[] args) {
        Kalk_2 main_window = new Kalk_2();
        main_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_window.setVisible(true);}

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        a = Double.parseDouble((t_a.getText()));
        b = Double.parseDouble(t_b.getText());

        if (source == b_adding) {
            wynik = a + b;}
        else if (source==b_subtraction){
            wynik = a - b;}
        else if (source==b_multiplication){
            wynik = a * b;}
        else if (source==b_power){
            wynik = Math.pow(a, b);}
        else if (source==b_square_root){
            wynik = Math.sqrt(a);}
        else if (source==b_cbrt){
            wynik = Math.cbrt(a);}
        else {
            wynik = a / b;}
        l_result.setText("Wynik:" + String.valueOf(wynik));

    }
}