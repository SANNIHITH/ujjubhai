package Abstract;

public class Application {


    public static void main(String[] args) {
        FactoryCreator.factory(FactoryType.OSXFactory).createButton().paint();
        FactoryCreator.factory(FactoryType.WinFactory).createButton().paint();

    }
}
