package ui;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;

import controller.Interactor;
import sale.SalesLineItem;

@SuppressWarnings("serial")
public class GraphicUI extends JFrame {
	
    private Interactor interactor;

    private JTextField desc_tf,price_tf,subtotal_tf,tax_tf,total_tf;
    private JLabel desc_lb,price_lb,subtotal_lb,tax_lb,total_lb;
    private JTextArea textArea;
    String [] items;
    private  JComboBox combo;
    Integer value,min,max,step; 
    private SpinnerNumberModel numberModel;
    private JSpinner spinner;
    
    
    public GraphicUI(Interactor interactor)
    {
    	this.interactor = interactor;
    	initialize();

    }

	private void initialize() {
		// TODO Auto-generated method stub
		getContentPane().setLayout(null);
		setLayout(new FlowLayout());
        
        
        //textArea
        textArea = new JTextArea(6,80);
        textArea.setEditable(false);
        textArea.setVisible(true);
        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(18,249,640,133);
        getContentPane().add(scroll);
        
        
        //title
        JLabel title_lb = new JLabel("                         Welcome to O_Market                               ");
        title_lb.setBounds(208,20,210,16);
        title_lb.setFont(new Font("Lucida Grande",Font.PLAIN,15));
        getContentPane().add(title_lb);
        add(title_lb);

        
        //Textfield

        desc_lb = new JLabel("Description :");
        desc_tf = new JTextField(10);
        
        price_lb = new JLabel("Price :");
        price_tf = new JTextField(10);
        
        subtotal_lb = new JLabel("SubTotal :");
        subtotal_tf = new JTextField(10);

        tax_lb = new JLabel("Tax :");
        tax_tf = new JTextField(10);

        total_lb = new JLabel("Total :");   
        total_tf = new JTextField(10);  

        
        JLabel itemidfield = new JLabel("   Item id : ");
        items = interactor.getitemid();
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        combo = new JComboBox(items);
        c.add(itemidfield);
        c.add(combo);
        
        JLabel quantityfield = new JLabel("      Quantity : ");
        value = new Integer(1);
        min = new Integer(1);
        max = new Integer(10);
        step = new Integer(1);
        
        numberModel = new SpinnerNumberModel(value,min,max,step);

        spinner = new JSpinner(numberModel);

       
        c.add(quantityfield);
        c.add(spinner);
        
    
      
        JPanel descPanel = new JPanel();
        JPanel pricePanel = new JPanel();
        JPanel subtotalPanel = new JPanel();
        JPanel taxPanel = new JPanel();
        JPanel totalPanel = new JPanel();
      
        descPanel.add(desc_lb);
        descPanel.add(desc_tf);
        pricePanel.add(price_lb);
        pricePanel.add(price_tf);
        subtotalPanel.add(subtotal_lb);
        subtotalPanel.add(subtotal_tf);
        taxPanel.add(tax_lb);
        taxPanel.add(tax_tf);
        totalPanel.add(total_lb);
        totalPanel.add(total_tf);

        makeButton("newSale",(e)->newsalebutton(),18,148,20,10);
        makeButton("EnterItem",(e)->enterbutton(),10,100,40,30);
        makeButton("EndSale",(e)->endsalebutton(),13,118,60,50);


        add(descPanel);
        add(pricePanel);
        add(subtotalPanel);
        add(taxPanel);
        add(totalPanel);

        
        setLocation(150,200);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void newsalebutton() {
		// TODO Auto-generated method stub
		interactor.makeNewSale();
	}
	
	private void enterbutton() {
		//값 받아
		String itemid = combo.getSelectedItem().toString();
		int quantity = (int) spinner.getModel().getValue();
		//interactor에게 넘김  
		ArrayList<SalesLineItem> result = interactor.enterItem(itemid, quantity);
		
		//interactor에게 넘어온 값 ui에 뿌려주기 
		String Description = interactor.Description(itemid);
		desc_tf.setText(Description);
		
		int Price = interactor.price(itemid,quantity);
		price_tf.setText(String.valueOf(Price));
		textArea.append(result.toString());
		
		int SubPrice = interactor.makePayment();
		 subtotal_tf.setText(String.valueOf(SubPrice));
	}
	 private void endsalebutton() {
			
		 double total_price = interactor.afterTax();
		 total_tf.setText(String.valueOf(total_price));
		 

		}

	

	private void makeButton(String title, ActionListener listener, int x, int y,int w,int h) {
     	JButton button = new JButton(title);
     	button.addActionListener(listener);
     	button.setBounds(x,y,w,h);
     	
     	getContentPane().add(button);
     	
     }
	
	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		}

    }
    


