package ui;

import java.util.Scanner;
import controller.Interactor; 

public class CmdUI {

    private static Scanner scanner = new Scanner(System.in);

    private Interactor interactor;

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
                  
                case 3:
                    endSale();
                  
                default:
                    break;
            }
        }
        System.out.println("bye");
    }

    public void newSale(){
        interactor.makeNewSale();

    }
    public void enter(){
    	
        System.out.println("enter item id : ");
        String itemid = scanner.next();

        System.out.println("enter Quantity : ");
        int quantity = scanner.nextInt();

        interactor.enterItem(itemid,quantity);
        System.out.println("enter");


    }
    public void endSale(){
        System.out.println("End Sale");
        // System.out.print(controller.endSale());
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
