package lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageDisplayApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Жесть снизу кот");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            try {
                // Загрузка изображения из указанного пути
                String imagePath = args[0];
                BufferedImage image = ImageIO.read(new File(imagePath));

                // Создание компонента для отображения изображения
                JLabel imageLabel = new JLabel(new ImageIcon(image));
                frame.add(imageLabel, BorderLayout.CENTER);

                frame.setVisible(true);
            } catch (Exception e) {
                System.err.println("Ошибка при загрузке изображения: " + e.getMessage());
            }
        });
    }
}
