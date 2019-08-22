package Abstract;

public class WinFactory implements GUIFactory {

    @Override
    public ButtonI createButton() {
        return new WinButton();
    }
}
