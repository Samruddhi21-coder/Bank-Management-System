package bank.management.system;

import javax.swing.*;
import javax.swing.tree.VariableHeightLayoutCache;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JLabel label1,label2,label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;

    Login()//constructor
    {
        super("Bank Management System");    //title should always be written first


        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));  //for image address
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);


        ImageIcon ii1 =new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));  //for image address
        Image ii2 = ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3=new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);


        label1= new JLabel("Welcome to ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38)); //make bold
        label1.setBounds(230,125,450,40);
        add(label1);

        label2= new JLabel("Card No:");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Ralway",Font.BOLD,28)); //make bold
        label2.setBounds(150,190,375,30);
        add(label2);

        textField2= new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);


        label3= new JLabel("Pin:");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Ralway",Font.BOLD,28)); //make bold
        label3.setBounds(150,250,375,30);
        add(label3);

        passwordField3= new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3); //to display box for password

        //BUTTONS
        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1); //to display button

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);
        add(button2); //to display button

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this);
        add(button3); //to display button


        //ICONS

        ImageIcon iii1 =new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));  //for image address
        Image iii2 = iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);  //x and y should be 0 as we want the image to cover entire form
        add(iiimage);


        setLayout(null);  //for no default bordering as we want form as per our perspective
        setSize(850,480);    //form size
        setLocation(450,200);       //location for form to appear in middle we set x and y
        setVisible(true);                 //to make our form visible

    }

        public void actionPerformed(ActionEvent e)
        {
            try
            {
                if (e.getSource()==button1)
                {

                }
                else if (e.getSource()==button2)
                {
                 textField2.setText("");
                 passwordField3.setText("");
                }
                else if (e.getSource()==button3)
                {

                }
            }catch(Exception E)
            {
                E.printStackTrace();
            }


        }



    public static void main(String[] args) {
        new Login();    //object







    }
}