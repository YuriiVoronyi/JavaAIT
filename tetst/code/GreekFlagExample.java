import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GreekFlagExample extends Frame {
    public GreekFlagExample() {
        setSize(300, 200);
        setVisible(true);

        // Добавляем слушателя для закрытия окна
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        // Рисуем синий фон
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Рисуем белые горизонтальные полосы
        g.setColor(Color.WHITE);
        int stripeHeight = getHeight() / 9; // Высота каждой полосы
        for (int i = 0; i < 9; i += 2) {
            g.fillRect(0, i * stripeHeight, getWidth(), stripeHeight);
        }

        // Рисуем белый крест
        int crossWidth = getWidth() / 5; // Ширина креста
        int crossHeight = getHeight() / 5; // Высота креста
        int crossX = (getWidth() - crossWidth) / 2; // Координата X креста
        int crossY = (getHeight() - crossHeight) / 2; // Координата Y креста
        g.fillRect(crossX, 0, crossWidth, getHeight());
        g.fillRect(0, crossY, getWidth(), crossHeight);
    }

    public static void main(String[] args) {
        new GreekFlagExample();
    }
}