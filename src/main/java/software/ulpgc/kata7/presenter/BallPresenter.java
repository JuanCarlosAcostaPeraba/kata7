package software.ulpgc.kata7.presenter;

import software.ulpgc.kata7.model.Ball;
import software.ulpgc.kata7.model.Observer;
import software.ulpgc.kata7.view.BallDisplay;

public class BallPresenter implements Observer {
    private final static double PixelsByMeter = 100;
    private final Ball ball;
    private final BallDisplay display;

    private BallPresenter(Ball ball, BallDisplay display) {
        this.ball = ball;
        this.ball.add(this);
        this.display = display;
        this.display.on(this::updateBallPosition);
    }

    public static void with(Ball ball, BallDisplay display) {
        new BallPresenter(ball, display);
    }

    @Override
    public void changed() {
        refresh();
    }

    private void refresh() {
        display.drawBall(y(), r());
    }

    private int y() {
        return display.getHeight() - (int) (ball.getH() * PixelsByMeter);
    }

    private int r() {
        return (int) (ball.getR() * PixelsByMeter);
    }

    private void updateBallPosition(int y) {
        double h = (display.getHeight() - y) / PixelsByMeter;
        ball.setH(h);
    }
}