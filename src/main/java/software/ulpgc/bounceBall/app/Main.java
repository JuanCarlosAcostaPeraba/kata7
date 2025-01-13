package software.ulpgc.bounceBall.app;

import software.ulpgc.bounceBall.model.Ball;
import software.ulpgc.bounceBall.presenter.BallPresenter;
import software.ulpgc.bounceBall.view.MainFrame;

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