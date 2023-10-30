package lab5;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class ImageViewer extends JFrame {
    private JLabel imageLabel;

    public ImageViewer(String imagePath) {
        // Проверяем, существует ли файл по указанному пути
        File imageFile = new File(imagePath);
        if (!imageFile.exists()) {
            System.out.println("Файл не существует: " + imagePath);
            System.exit(1);
        }

        // Создаем метку для отображения изображения
        ImageIcon imageIcon = new ImageIcon(imagePath);
        imageLabel = new JLabel(imageIcon);
        add(imageLabel);

        setTitle("Просмотр изображения");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Использование: java ImageViewer C:\\Users\\user\\Desktop\\воня.jpeg");
            System.exit(1);
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                String imagePath = "C:\\Users\\user\\Desktop\\воня.jpeg"; // Используйте путь из аргументов командной строки
                ImageViewer viewer = new ImageViewer(imagePath);
                viewer.setVisible(true);
            }
        });
    }
}
