package ui;

import java.util.Scanner;

import controller.Interactor; 


public class CmdUI {

    private static Scanner scanner = new Scanner(System.in);

    private Interactor interactor;
    
    private String itemid;
    private int quantity;

    public CmdUI(Interactor interactor){
        this.interactor = interactor;
    }

    public void start(){
        boolean quit = false;
        while (!quit){
            int command = getCommand();
            switch(command){
                case 0:
                    quit = true;
                    break;
                case 1:
                    newSale();
                    break;
                case 2:
                    enter();
                    break;
                case 3:
                	Payment();
                	quit = true;
                  
                default:
                    break;
            }
        }
        System.out.println("bye!");
    }

    

	public void newSale(){
        interactor.makeNewSale();

    }
    public void enter(){
    	
        System.out.println("enter item id : ");
        //cast Int to ItemID 
        itemid = scanner.next();
        System.out.println("enter Quantity : ");
        quantity = scanner.nextInt();

        System.out.println(interactor.enterItem(itemid,quantity));  
             

    }
   
    private void Payment() {
		// TODO Auto-generated method stub
    	System.out.println("Before Tax = "+interactor.makePayment());  
    	System.out.println("After Tax [Total] = "+interactor.afterTax());  


	}
    

    public int getCommand(){
        System.out.println("\n Select a command !");
        System.out.println("\n 0. Quit");
        System.out.println("\n 1. New Sale");
        System.out.println("\n 2. Enter Item");
        System.out.println("\n 3. End Sale");
        // System.out.println("\n 4. ");
    
        int command = scanner.nextInt();
        return command;

    }
}
