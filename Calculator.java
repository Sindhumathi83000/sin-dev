import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Applet implements ActionListener
{
  Label l1,l2,l3;
  TextField T1,T2,T3;
  Button b1,b2,b3,b4,b5;

 public void init()
 {
   l1=new Label("Enter The First Number  = ");
   l2=new Label("Enter The Second Number  = ");
   l3=new Label("Result = ");

   T1=new TextField();
   T2=new TextField();
   T3=new TextField();

   b1=new Button("+");
   b2=new Button("-");
   b3=new Button("*");
   b4=new Button("/");
   b5=new Button("%");
  
  add(l1);
  add(T1);
  
  add(l2);
  add(T2);

  add(l3);
  add(T3);


  add(b1);
  b1.addActionListener(this);
  add(b2);
  b2.addActionListener(this);
  add(b3);
  b3.addActionListener(this);
  add(b4);
  b4.addActionListener(this);
  add(b5);
  b5.addActionListener(this);
 }

 public void actionPerformed(ActionEvent x)
 {
   int n1=Integer.valueOf(T1.getText());
   int n2=Integer.valueOf(T1.getText());
   int n3=0;


   if(x.getSource()==b1)
   n3=n1+n2;

   if(x.getSource()==b2)
   n3=n1-n2;

   if(x.getSource()==b3)
   n3=n1*n2;

   if(x.getSource()==b4)
   n3=n1/n2;

   if(x.getSource()==b5)
   n3=n1%n2;

   T3.setText(Integer.toString(n3));
}

/*

<applet code="Calculator.class" width=600 height=300>
</applet>

*/
}


