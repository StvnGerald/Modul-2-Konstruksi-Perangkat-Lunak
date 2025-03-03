import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class MainJFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JLabel outputLabel;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainJFrame frame = new MainJFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MainJFrame() {
        setTitle("Test TP2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 200);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(new GridLayout(3, 1, 5, 5));
        setContentPane(contentPane);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        textField = new JTextField(15);
        JButton submitButton = new JButton("Submit");

        inputPanel.add(textField);
        inputPanel.add(submitButton);
        contentPane.add(inputPanel);

        outputLabel = new JLabel("Input nama anda pada kolom diatas!");
        outputLabel.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(outputLabel);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textField.getText();
                if (!nama.isEmpty()) {
                    outputLabel.setText("Halo, " + nama + "!");
                } else {
                    outputLabel.setText("Masukkan nama terlebih dahulu.");
                }
            }
        });
    }
}

