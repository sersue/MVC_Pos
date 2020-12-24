public class Main {

    private static CmdUI ui;
    // private static GraphicUI ui;
    public static void main(String[] args){
        
        Controller controller = new Controller();
        ui = new CmdUI(controller);
        ui.start();
    }
}