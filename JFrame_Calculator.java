import java.awt.*;  
import java.awt.event.*; 
import javax.swing.*;

public class JFrame_Calculator extends Frame implements ActionListener
{
    double num,ans;  //These all are INSTANCE variable
    int calculation;
    JTextField txt; 
    JLabel label;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b00,badd,bsub,bmul,bdot,bdiv,bdel,bac,beql;
    JFrame_Calculator() // Constructor of JFrame_Calculator
     {
       //Creating FRAME  
       JPanel panel=new JPanel();
       JFrame frame=new JFrame( "Calculator");
       frame.setSize(400,550);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.add(panel);       
       panel.setLayout(null);
       
       txt=new JTextField();
       txt.setBounds(43,30,290,50);
       panel.add(txt);
       
       //Buttons
       b1= new JButton("1");b1.setBounds(10,100,70,60);
       b2= new JButton("2");b2.setBounds(90,100,70,60);
       b3= new JButton("3");b3.setBounds(170,100,70,60);
       b4= new JButton("4");b4.setBounds(10,170,70,60);
       b5= new JButton("5");b5.setBounds(90,170,70,60);
       b6= new JButton("6");b6.setBounds(170,170,70,60);
       b7= new JButton("7");b7.setBounds(10,240,70,60);
       b8= new JButton("8");b8.setBounds(90,240,70,60);
       b9= new JButton("9");b9.setBounds(170,240,70,60);
       b0= new JButton("0");b0.setBounds(10,310,70,60);
       b00= new JButton("00");b00.setBounds(90,310,70,60);
       bdot= new JButton(".");bdot.setBounds(170,310,70,60);
       beql= new JButton("=");beql.setBounds(10,380,233,70);
       
       //operation Button
       badd= new JButton("+");badd.setBounds(250,310,130,140);
       bsub= new JButton("-");bsub.setBounds(250,240,130,55);
       bmul= new JButton("*");bmul.setBounds(250,170,60,55);
       bdiv= new JButton("/");bdiv.setBounds(320,170,60,55);
       bac= new JButton("AC");bac.setBounds(250,100,60,55);
       bdel= new JButton("DEL");bdel.setBounds(320,100,60,55);
       
       //Adding Action Listener to button
       b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
       b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);
       b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);
       b0.addActionListener(this);b00.addActionListener(this);bdot.addActionListener(this);
       beql.addActionListener(this);badd.addActionListener(this);bsub.addActionListener(this);
       bmul.addActionListener(this);bdiv.addActionListener(this);bac.addActionListener(this);
       bdel.addActionListener(this);
       
          
       //Label
       label=new JLabel();
       label.setBounds(120, 20, 170, 140);
       panel.add(label);
       // Adding Buttons to panel
       panel.add(b1);panel.add(b2);panel.add(b3);panel.add(b4);
       panel.add(b5);panel.add(b6);panel.add(b7);panel.add(b8);
       panel.add(b9);panel.add(b0);panel.add(b00);panel.add(bdot);
       panel.add(beql);panel.add(bac);panel.add(bdel);panel.add(bsub);
       panel.add(bdiv);panel.add(bmul);panel.add(badd);
       
       panel.setBackground(Color.white);
       frame.setVisible(true);        
         
        
     }
     
     // Method to perform Arithmetic operations
    public void arithmatic_operation()
    {
        switch(calculation)
        {
            case 1:
            {
                ans= num + Double.parseDouble(txt.getText());
                txt.setText(Double.toString(ans));
                break;
            }
            case 2:
            {
                ans= num - Double.parseDouble(txt.getText());
                txt.setText(Double.toString(ans));
                break;
            }
            case 3:
            {
                ans= num * Double.parseDouble(txt.getText());
                txt.setText(Double.toString(ans));
                break;
            }
            case 4:
            {
                ans= num / Double.parseDouble(txt.getText());
                txt.setText(Double.toString(ans));
                break;
            }
            
        }
    }
    
    //Main Method 
    public static void main(String[] args)
    {
    	JFrame_Calculator obj =new JFrame_Calculator();             
                
       
    }
    // Method of Action Listener
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //System.out.println("Button clicked");
        if(e.getSource() == b1)
        {
        txt.setText(txt.getText()+ "1");
        }
        else if(e.getSource() == b2)
        {
        txt.setText(txt.getText()+ "2");
        }
        else if(e.getSource() == b3)
        {
        txt.setText(txt.getText()+ "3");
        }
        else if(e.getSource() == b4)
        {
        txt.setText(txt.getText()+ "4");
        }
        else if(e.getSource() == b5)
        {
        txt.setText(txt.getText()+ "5");
        }
        else if(e.getSource() == b6)
        {
        txt.setText(txt.getText()+ "6");
        }
        else if(e.getSource() == b7)
        {
        txt.setText(txt.getText()+ "7");
        }
        else if(e.getSource() == b8)
        {
        txt.setText(txt.getText()+ "8");
        }
        else if(e.getSource() == b9)
        {
        txt.setText(txt.getText()+ "9");
        }
        else if(e.getSource() == b0)
        {
        txt.setText(txt.getText()+ "0");
        }
        else if(e.getSource() == b00)
        {
        txt.setText(txt.getText()+ "00");
        }
        else if(e.getSource() == bdot)
        {
        txt.setText(txt.getText()+ ".");
        }
        else if(e.getSource() == bac)
        {
        txt.setText("");
        }
        else if(e.getSource() == badd)
        {
        num=Double.parseDouble(txt.getText());
        calculation = 1;
        txt.setText("");
        label.setText(num + "+");
        
        }
        else if(e.getSource() == bsub)
        {
        num=Double.parseDouble(txt.getText());
        calculation = 2;
        txt.setText("");
        label.setText(num + "-");
        }
        else if(e.getSource() == bmul)
        {
        num=Double.parseDouble(txt.getText());
        calculation = 3;
        txt.setText("");
        label.setText(num + "*");
        }
        else if(e.getSource() == bdiv)
        {
        num=Double.parseDouble(txt.getText());
        calculation = 4;
        txt.setText("");
        label.setText(num + "/");
        }
        else if(e.getSource() == beql)
        {
        arithmatic_operation();
        }
        else if(e.getSource() == bdel)
        {
        int length=txt.getText().length(); 
        int number=txt.getText().length()- 1;
        String store;
        if(length>0)
        {
            StringBuilder back=new StringBuilder(txt.getText());
            back.deleteCharAt(number);
            store=back.toString();
            txt.setText(store);
        }
                
        }
       
    }
}
