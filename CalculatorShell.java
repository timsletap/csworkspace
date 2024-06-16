
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
   This frame contains a panel that displays buttons
   for a calculator and a panel with a text fields to
   specify the result of calculation.
*/
public class CalculatorShell extends JFrame
{  

   private JTextField display;
   private double lastValue;
   private String lastOperator;
   private boolean start; 

   public CalculatorShell()
   {
      JPanel calPanel = new JPanel();
      calPanel.setLayout(new GridLayout(5, 3));
      createControlPanel();
      pack();
   }
      
   /**
      Creates the control panel with the text field 
      and buttons on the frame.
   */
   private void createControlPanel()
   {      
	   // the panel for holding the user interface components
	      JPanel buttonPanel = new JPanel();
	      buttonPanel.setLayout(new GridLayout(5, 3));
          buttonPanel.add(makeDigitButton("0"));
	      buttonPanel.add(makeDigitButton("1"));
	      buttonPanel.add(makeDigitButton("2"));
          buttonPanel.add(makeDigitButton("3"));
          buttonPanel.add(makeDigitButton("4"));
          buttonPanel.add(makeDigitButton("5"));
          buttonPanel.add(makeDigitButton("6"));
          buttonPanel.add(makeDigitButton("7"));
          buttonPanel.add(makeDigitButton("8"));
          buttonPanel.add(makeDigitButton("9"));
	      buttonPanel.add(makeOperatorButton("+"));
          buttonPanel.add(makeOperatorButton("-"));
          buttonPanel.add(makeOperatorButton("*"));
          buttonPanel.add(makeOperatorButton("/"));
	      buttonPanel.add(makeOperatorButton("="));
          buttonPanel.add(makeClearButton("clr"));
	      display = new JTextField("0");
	      display.setEditable(false);
	           
	     
	      add(buttonPanel, BorderLayout.CENTER);
	      add(display, BorderLayout.NORTH);
	      lastValue = 0;
	      lastOperator = "=";
	      start = true;
   }

   /**
      Calculates the resulting value in a calculator.
      @param n the number to calculate
   */
   public void calculate(double n)
   {  
      if (lastOperator.equals("+")) 
         lastValue += n;
    else if (lastOperator.equals("-")) 
          lastValue -= n; 
    else if (lastOperator.equals("*")) 
          lastValue *= n; 
    else if (lastOperator.equals("/")) 
          lastValue /= n; 
     else if (lastOperator.equals("=")) 
          lastValue = n; 
    
      
      display.setText("" + lastValue);
   }
   
   /**
      Makes a button representing a digit of a calculator.
      @param digit the digit of the calculator
      @return the button of the calculator
   */
   public JButton makeDigitButton(final String digit)
   {
      JButton button = new JButton(digit);
      
      class ButtonListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {  
            if (start) 
               display.setText(digit);
            else 
               display.setText(display.getText() + digit);
            start = false;
         }        
      }

      ButtonListener listener = new ButtonListener();
      button.addActionListener(listener);  
      return button;    
   } 
   public JButton makeClearButton(final String s)
   {
      JButton button = new JButton(s);
      
      class ButtonListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {  
            if (start) {
                lastValue = 0;
                display.setText("0");

            }
               
            
         }        
      }

      ButtonListener listener = new ButtonListener();
      button.addActionListener(listener);  
      return button;    
   } 
   
   /**
      Makes a button representing an operator of a calculator.
      @param op the operator of the calculator
      @return button the button of the calculator
   */
   public JButton makeOperatorButton(final String op)
   {
      JButton button = new JButton(op);
      
      class ButtonListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {  
            if (!start)
            {  
               double x = Double.parseDouble(display.getText());
               calculate(x);
               start = true;
            }
            
            lastOperator = op;
         }       
      }

      ButtonListener listener = new ButtonListener();
      button.addActionListener(listener);  
      return button;    
   }     
   
   public static void main(String[] args)
   {  
      JFrame frame = new CalculatorShell();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("MY SHELL");
      frame.setVisible(true);
   }
   
  
}
