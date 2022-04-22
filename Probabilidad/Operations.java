import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Operations extends JFrame implements ActionListener
{
    public double respnormal;
    public double respDistint;
    public double respComb;
    public JTextField txtField1, txtField2, txtField3,txtField4, txtField5, txtField6,
                       ansNorm, ansPerm, ansComb;
    public JFrame frame;
    public JLabel label1, label2, label3, label4, label5, label6,mainlabel, normallabel, comblabel,permlabel;
    public JButton normal, perm, comb, clear;
    public static void main (String [] args)
    {
        Operations frame = new Operations(); //frame para poner todo el interfaz      
        frame.setBounds(400,400,850,850);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setTitle("Probabilidad Calculadora"); 
        frame.createInterfaz();
        frame.setVisible(true); 
        

    }
     public void createInterfaz()
    {
        Container window = getContentPane();
        window.setBackground(Color.white);
        window.setLayout(null);//an established layout
        
        mainlabel = new JLabel("Pone los valores Para calcular la Probabiliadad");
        mainlabel.setBounds(50,50,400,30); //x-axis, y-axis, length,width
        window.add(mainlabel);
        
        normallabel = new JLabel("Probabilidad Normal:");
        normallabel.setBounds(50,120,200,30);
        window.add(normallabel);
  
        label1 = new JLabel("Ingrese el primer valor (n):");
        label1.setBounds(50,180,250,30);
        window.add(label1);
        
        txtField1 = new JTextField(16);
        txtField1.setBounds(50,220,115,30);
        window.add(txtField1);
        
        label2 = new JLabel("Ingrese el segundo valor (N):");
        label2.setBounds(425,180,250,30);
        window.add(label2);
        
        txtField2 = new JTextField(16);
        txtField2.setBounds(425,220,115,30);
        window.add(txtField2);
        
        normal = new JButton("Calcular");
        normal.setLayout(null);
        normal.addActionListener(this);
        normal.setBounds(50,255,90,30);
        window.add(normal);
        
        ansNorm = new JTextField(16);
        ansNorm.setEditable(false);
        ansNorm.setBounds(135,255,180,30);
        window.add(ansNorm);
        
        permlabel = new JLabel("Permutaciones con Objetos Distintos");
        permlabel.setBounds(50,325,320,30);
        window.add(permlabel);
        
        label3 = new JLabel("Ingrese el primer valor (n):");
        label3.setBounds(50,385,250,30);
        window.add(label3);
        
        txtField3 = new JTextField(16);
        txtField3.setBounds(50,425,115,30);
        window.add(txtField3);
        
        label4 = new JLabel("Ingrese el segundo valor (r):");
        label4.setBounds(425,385,250,30);
        window.add(label4);
        
        txtField4 = new JTextField(16);
        txtField4.setBounds(425,425,115,30);
        window.add(txtField4);
        
        perm = new JButton("Calcular");
        perm.setLayout(null);
        perm.addActionListener(this);
        perm.setBounds(50,460,90,30);
        window.add(perm);
        
        ansPerm = new JTextField(16);
        ansPerm.setEditable(false);
        ansPerm.setBounds(135,460,180,30);
        window.add(ansPerm);
        
        
        comblabel = new JLabel("Combinaciones");
        comblabel.setBounds(50,530,250,30);
        window.add(comblabel);
        
        label5 = new JLabel("Ingrese el primer valor (n):");
        label5.setBounds(50,590,350,30);
        window.add(label5);
        
        txtField5 = new JTextField(16);
        txtField5.setBounds(50,630,115,30);
        window.add(txtField5);
        
        label6 = new JLabel("Ingrese el segundo valor (r):");
        label6.setBounds(425,590,350,30);
        window.add(label6);
        
        txtField6 = new JTextField(16);
        txtField6.setBounds(425,630,115,30);
        window.add(txtField6);
        
        comb = new JButton("Calcular");
        comb.setLayout(null);
        comb.addActionListener(this);
        comb.setBounds(50,665,90,30);
        window.add(comb);
        
        ansComb = new JTextField(16);
        ansComb.setEditable(false);
        ansComb.setBounds(135,665,180,30);
        window.add(ansComb);
        
        clear = new JButton("Clear");
        clear.setLayout(null);
        clear.addActionListener(this);
        clear.setBounds(50,705,90,30);
        window.add(clear);
        
        
    }
   public String probNormal(String n, String N)//function for probabilidad normal
    {
       double N1 = Double.parseDouble(n);
       double N2 = Double.parseDouble(N);
        respnormal = N1/N2;
        String resp = Double.toString(respnormal);
        return resp;
    }
   public  String permDistintos(String n, String r)//function for permutaciones distintos
    {
      double n1= Double.parseDouble(n);
      double n2= Double.parseDouble(r);
      double a = 1;
      double denom = n1-n2;
      double factr=1;
      for(int i=1;i<=n1;i++)
      {    
          a=a*i;    
      }    
      for (int i = 1;i<=denom;i++)
      {
          factr = factr * i;
      }
      
      respDistint = a/factr;
      String resp = Double.toString(respDistint);
      
      return resp;
    }
    
    public String Combinaciones(String n, String r)
    {
         double n1= Double.parseDouble(n);
         double n2= Double.parseDouble(r);
         double a = n1-n2;//for the denominator
         double factn=1;
         double factr=1;
         double facta=1;
         for(int i=1;i<=n1;i++){    
          factn=factn*i;    
      }   
           for(int i=1;i<=n2;i++){    
           factr=factr*i;    
      }  
         for(int i=1;i<=a;i++){    
          facta=facta*i;    
      }  
          respComb = factn/(factr*facta);
          String resp = Double.toString(respComb);
          return resp;
    }
   public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == normal)
        {
            String valor1n = txtField1.getText();
            String valor2n = txtField2.getText();
            ansNorm.setText(probNormal(valor1n, valor2n));
        }
        else if (e.getSource() == perm)
        {
          String valor1p = txtField3.getText();
          String valor2p = txtField4.getText();  
          ansPerm.setText(permDistintos(valor1p, valor2p));
        }
        else if (e.getSource() == comb)
        {
          String valor1c = txtField5.getText();
          String valor2c = txtField6.getText();  
          Combinaciones(valor1c, valor2c);
          ansComb.setText(Combinaciones(valor1c, valor2c));
        }
        else if (e.getSource() == clear)
        {
            txtField1.setText("");
            txtField2.setText("");
            txtField3.setText("");
            txtField4.setText("");
            txtField5.setText("");
            txtField6.setText("");
            ansNorm.setText("");
            ansPerm.setText("");
            ansComb.setText("");
        }
        
    }
}