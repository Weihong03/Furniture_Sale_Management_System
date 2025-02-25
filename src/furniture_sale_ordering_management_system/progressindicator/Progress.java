package furniture_sale_ordering_management_system.progressindicator;

import javax.swing.JProgressBar;

public class Progress extends JProgressBar {

    private final ProgressCircleUI ui;

    public Progress() {
        setOpaque(false);
        setStringPainted(true);
        ui = new ProgressCircleUI();
        setUI(ui);
    }

    @Override
    public String getString() {
        return ((int) (getValue() * ui.getAnimate())) + "%";
    }

    public void start() {
        ui.start();
    }
}
