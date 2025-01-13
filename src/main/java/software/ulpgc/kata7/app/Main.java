package software.ulpgc.kata7.app;

import software.ulpgc.kata7.model.Ball;
import software.ulpgc.kata7.presenter.BallPresenter;
import software.ulpgc.kata7.view.MainFrame;

public class Main {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        BallPresenter.with(
                new Ball(5, 0, 0.4, 0.5),
                frame.getDisplay()
        );
        frame.setVisible(true);
    }
}