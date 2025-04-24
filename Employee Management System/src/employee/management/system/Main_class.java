package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame {
    Main_class() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1020,600);
        add(img);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(300, 142, 500, 50);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        img.add(heading);

        JButton add = new JButton("ADD EMPLOYEE");
        add.setBounds(270, 230, 150, 50);
        add.setForeground(Color.white);
        add.setBackground(Color.black);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddEmployee();
                setVisible(false);
            }
        });
        img.add(add);

        JButton view = new JButton("VIEW EMPLOYEE");
        view.setBounds(470, 230, 150, 50);
        view.setForeground(Color.white);
        view.setBackground(Color.black);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new View_Employee();
                setVisible(false);
            }
        });
        img.add(view);

        JButton rem = new JButton("REMOVE EMPLOYEE");
        rem.setBounds(370, 330, 180, 50);
        rem.setForeground(Color.white);
        rem.setBackground(Color.black);
        rem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Remove_Employee();
            }
        });
        img.add(rem);

        setSize(1020, 600);
        setLocation(120, 30);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main_class();
    }
}
