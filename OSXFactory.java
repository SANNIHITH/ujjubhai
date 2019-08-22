package Abstract;

public class OSXFactory implements GUIFactory {

    @Override
    public ButtonI createButton() {
        return new OSXButton();
    }
}
