//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //error!
        //Bicycle.HandleBar handleBar = new Bicycle.HandleBar();

        Bicycle bicycle = new Bicycle(1000);

        Bicycle.HandleBar handleBar = bicycle.new HandleBar();
        handleBar.setupCircled();
        System.out.println(handleBar.getShape());

        handleBar.setupRectaingle();
        System.out.println(handleBar.getShape());

        System.out.println(bicycle.getCost());

    }
}

