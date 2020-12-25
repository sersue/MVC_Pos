import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class GraphicUI extends JFrame {
    JTextField desc_tf,price_tf,subtotal_tf,tax_tf,total_tf,amout_tf,balance_tf;
    JLabel title_lb,desc_lb,price_lb,subtotal_lb,tax_lb,total_lb,amout_lb,balance_lb;
    public GraphicUI()
    {
        super("O_MARKET POS");

        //welcome title
        setLayout(new FlowLayout());
        EtchedBorder eborder = new EtchedBorder();
        title_lb = new JLabel("Welcome to O_Market");
        title_lb.setBorder(eborder);


        //textfield , label
        desc_lb = new JLabel("Description");
        price_lb = new JLabel("Price");
        subtotal_lb = new JLabel("SubTotal");
        tax_lb = new JLabel("Tax");
        total_lb = new JLabel("Total");
        amout_lb = new JLabel("Amout Tendered");
        balance_lb = new JLabel("Balance Due");

        // textfield
        desc_tf = new JTextField(10);
        price_tf = new JTextField(10);
        subtotal_tf = new JTextField(10);
        tax_tf = new JTextField(10);
        total_tf = new JTextField(10);
        amout_tf = new JTextField(10);
        balance_tf = new JTextField(10);

        //textPanel
        JPanel descPanel = new JPanel();
        JPanel pricePanel = new JPanel();
        JPanel subtotalPanel = new JPanel();
        JPanel taxPanel = new JPanel();
        JPanel totalPanel = new JPanel();
        JPanel amoutPanel = new JPanel();
        JPanel balancePanel = new JPanel();

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
        amoutPanel.add(amout_lb);
        amoutPanel.add(amout_tf);
        balancePanel.add(balance_lb);
        balancePanel.add(balance_tf);
        //button
        JPanel buttonPanel = new JPanel();
        JButton NewSalebutton = new JButton("New Sale");
        JButton EnterItembutton = new JButton("EnterItem");
        JButton EndSalebutton = new JButton("EndSale");

        buttonPanel.add(NewSalebutton);
        buttonPanel.add(EnterItembutton);
        buttonPanel.add(EndSalebutton);
        add(title_lb);
        add(descPanel);
        add(pricePanel);
        add(subtotalPanel);
        add(taxPanel);
        add(totalPanel);
        add(amoutPanel);
        add(balancePanel);
        add(buttonPanel);
        setLocation(150,200);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
    public static void main(String[]args)
    {
        new GraphicUI();
        
    }
}
