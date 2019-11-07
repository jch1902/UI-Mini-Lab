import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Calculator 
{
    private JFrame frame;
    private JTextField textField;
    double num = 0, result = 0;
    String text = "0";
    char operator = '0';
    /**
     * Launch the application.
     */
    public static void main(String[] args) 
    {
        
        EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                try 
                {
                    Calculator window = new Calculator();
                    window.frame.setVisible(true);
                } catch (Exception e) 
                {
                    e.printStackTrace();
                }
            }
        });
    }
    /**
     * Create the application.
     */
    public Calculator() 
    {
        initialize();
    }
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() 
    {
        
        /*********************row 1*************************/
        frame = new JFrame();
        frame.setResizable(false);
        frame.setBounds(100, 100, 320, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        textField = new JTextField();
        textField.setBackground(Color.WHITE);
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setFont(new Font("Tahoma", Font.BOLD, 25));
        textField.setBounds(10, 11, 294, 70);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        textField.setText(text);
        
        //Clear button (figure out how to make it work)
        JButton Bclear = new JButton("C");
        Bclear.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		textField.setText("0");
        		text = "";
        	}
        });
        Bclear.setFont(new Font("Arial", Font.BOLD, 25));
        Bclear.setBounds(10, 90, 70, 70);
        frame.getContentPane().add(Bclear);
        
        //Backspace button (figure out how to make it work)
        JButton Bback = new JButton("<");
        Bback.setFont(new Font("Tahoma", Font.BOLD, 25));
        Bback.setBounds(85, 90, 70, 70);
        frame.getContentPane().add(Bback);
        
        //Percent button (figure out how to make it work)
        JButton Bmod = new JButton("%");
        Bmod.setFont(new Font("Tahoma", Font.BOLD, 25));
        Bmod.setBounds(160, 90, 70, 70);
        frame.getContentPane().add(Bmod);
        
        //Addition button (figure out how to make it work)
        JButton Badd = new JButton("+");
        Badd.setFont(new Font("Tahoma", Font.BOLD, 25));
        Badd.setBounds(235, 90, 70, 70);
        frame.getContentPane().add(Badd);
        
        /*********************row 2*************************/
        
        //Button 7 
        JButton B7 = new JButton("7");
        B7.setFont(new Font("Tahoma", Font.BOLD, 25));
        B7.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                updateDisplay("7");
            }
        });
        B7.setBounds(10, 165, 70, 70);
        frame.getContentPane().add(B7);
        
        //Button 8 
        JButton B8 = new JButton("8");
        B8.setFont(new Font("Tahoma", Font.BOLD, 25));
        B8.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                updateDisplay("8");
            }
        });
        B8.setBounds(85, 165, 70, 70);
        frame.getContentPane().add(B8);
        
        //Button 9 
        JButton B9 = new JButton("9");
        B9.setFont(new Font("Tahoma", Font.BOLD, 25));
        B9.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                updateDisplay("9");
            }
        });
        B9.setBounds(160, 165, 70, 70);
        frame.getContentPane().add(B9);
        
        //Subtraction button (figure out how to make it work)
        JButton Bsub = new JButton("-");
        Bsub.setFont(new Font("Tahoma", Font.BOLD, 25));
        Bsub.setBounds(235, 165, 70, 70);
        frame.getContentPane().add(Bsub);
        
        /*********************row 3*************************/
        
        //Button 4
        JButton B4 = new JButton("4");
        B4.setFont(new Font("Tahoma", Font.BOLD, 25));
        B4.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                updateDisplay("4");
            }
        });
        B4.setBounds(10, 240, 70, 70);
        frame.getContentPane().add(B4);
        
        //Button 5
        JButton B5 = new JButton("5");
        B5.setFont(new Font("Tahoma", Font.BOLD, 25));
        B5.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                updateDisplay("5");
            }
        });
        B5.setBounds(85, 240, 70, 70);
        frame.getContentPane().add(B5);
        
        //Button 6 
        JButton B6 = new JButton("6");
        B6.setFont(new Font("Tahoma", Font.BOLD, 25));
        B6.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                updateDisplay("6");
            }
        });
        B6.setBounds(160, 240, 70, 70);
        frame.getContentPane().add(B6);
        
        //Multiplication button (figure out how to make it work)
        JButton Bmulti = new JButton("*");
        Bmulti.setFont(new Font("Tahoma", Font.BOLD, 25));
        Bmulti.setBounds(235, 240, 70, 70);
        frame.getContentPane().add(Bmulti);
        
        /*********************row 4*************************/
        
        //Button 1 
        JButton B1 = new JButton("1");
        B1.setFont(new Font("Tahoma", Font.BOLD, 25));
        B1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                updateDisplay("1");
            }
        });
        B1.setBounds(10, 315, 70, 70);
        frame.getContentPane().add(B1);
        
        //Button 2 
        JButton B2 = new JButton("2");
        B2.setFont(new Font("Tahoma", Font.BOLD, 25));
        B2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                updateDisplay("2");
            }
        });
        B2.setBounds(85, 315, 70, 70);
        frame.getContentPane().add(B2);
        
        //Button 3 
        JButton B3 = new JButton("3");
        B3.setFont(new Font("Tahoma", Font.BOLD, 25));
        B3.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                updateDisplay("3");
            }
        });
        B3.setBounds(160, 315, 70, 70);
        frame.getContentPane().add(B3);
        
        //Division button (figure out how to make it work)
        JButton Bdiv = new JButton("/");
        Bdiv.setFont(new Font("Tahoma", Font.BOLD, 25));
        Bdiv.setBounds(235, 315, 70, 70);
        frame.getContentPane().add(Bdiv);
        
        /*********************row 5*************************/
        //Button 0 
        JButton B0 = new JButton("0");
        B0.setFont(new Font("Tahoma", Font.BOLD, 25));
        B0.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                updateDisplay("0");
            }
        });
        B0.setBounds(10, 390, 70, 70);
        frame.getContentPane().add(B0);
        
        //Sign button (figure out how to make it work)
        JButton Bsign = new JButton("-+");
        Bsign.setFont(new Font("Tahoma", Font.BOLD, 25));
        Bsign.setBounds(85, 390, 70, 70);
        frame.getContentPane().add(Bsign);
        
        //Decimal button (figure out how to make it work)
        JButton Bdec = new JButton(".");
        Bdec.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        Bdec.setFont(new Font("Tahoma", Font.BOLD, 25));
        Bdec.setBounds(160, 390, 70, 70);
        frame.getContentPane().add(Bdec);
        
        //Equal button (figure out how to make it work)
        JButton Bequal = new JButton("=");
        Bequal.setFont(new Font("Tahoma", Font.BOLD, 25));
        Bequal.setBounds(235, 390, 70, 70);
        frame.getContentPane().add(Bequal);
    }
    
    public void updateDisplay(String num)
    {
    	if(text.equals("0"))
    		text = text.substring(0, text.length() - 1);
        text = text.concat(num);
        textField.setText(text);
    }
}