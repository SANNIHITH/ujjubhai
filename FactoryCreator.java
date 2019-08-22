package Abstract;

public class FactoryCreator {
    public static GUIFactory factory(FactoryType factory){
        if (factory == FactoryType.WinFactory){
            return new WinFactory();
        }
        else if (factory == FactoryType.OSXFactory){
            return new OSXFactory();
        }
        else{
            return null;
        }
    }
}
