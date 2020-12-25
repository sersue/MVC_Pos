import jdk.jfr.internal.Repository;

public class Main {

    private static CmdUI ui;
    // private static GraphicUI ui;
    public static void main(String[] args){

        
        Controller controller = new Controller(repository);
        ui = new CmdUI(controller);
        // ui = new GraphicUI(controller);
        ui.start();
    }
}