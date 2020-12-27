import java.lang.ModuleLayer.Controller;


public class main {

    private static CmdUI ui;
    // private static GraphicUI ui;
    public static void main(String[] args){
        
        Controller controller = new Controller();

        ui = new CmdUI(controller);
        //ui = new GraphicUI(controller);

        ui.start();
    }
}