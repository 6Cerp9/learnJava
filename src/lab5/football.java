package lab5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class football extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;

    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public football() {
        setTitle("Football Match Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(4, 1));

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");
        JButton randButton = new JButton("Рандом");

        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Никто не забил");
        winnerLabel = new JLabel("Победителя нет");

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateResultLabel();
                lastScorerLabel.setText("Последний забивший: AC Milan");
                determineWinner();
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateResultLabel();
                lastScorerLabel.setText("Последний забивший: Real Madrid");
                determineWinner();
            }
        });

        randButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int miS = milanScore;
                int maS = madridScore;
                System.out.println(milanScore+madridScore);
                milanScore = random.nextInt(0,((miS + maS)+1)); // Генерация случайного числа от 0 до суммы голов
                madridScore = ((miS + maS)-milanScore); // Генерация случайного числа от 0 до суммы голов - сумма голов милана для Madrid
                updateResultLabel();
                lastScorerLabel.setText("НИКТО НЕ ЗАБИЛ, РАНДОМ ВСЁ РЕШИЛ");
                determineWinner();
            }
        });

        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);
        add(milanButton);
        add(madridButton);
        add(randButton);
    }

    private void updateResultLabel() {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
    }

    private void determineWinner() {
        if (milanScore > madridScore) {
            winnerLabel.setText("Победитель: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Победитель: Real Madrid");
        } else if (milanScore == madridScore) {
            winnerLabel.setText("Победитель: Ничья");
        } else {
            winnerLabel.setText("Победителя нет");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                football simulator = new football();
                simulator.setVisible(true);
            }
        });
    }
}
//Добавить кнопку которая рандомит счёт по кнопке рандома эти 17 очков рандомно распределит между командами
//ВСЕ ГОЛЫ в матче перерандомит