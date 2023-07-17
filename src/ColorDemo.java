import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class ColorDemo extends JFrame {
    private JSlider slider1, slider2, slider3;
    private Color rectColor;

    public ColorDemo() {
        // Configurar la ventana JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);

        // Configurar los deslizadores
        slider1 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        slider2 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        slider3 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);

        // Configurar los controladores de eventos de los deslizadores
        ChangeListener sliderChangeListener = new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int deslizador1 = slider1.getValue();
                int deslizador2 = slider2.getValue();
                int deslizador3 = slider3.getValue();
                rectColor = new Color(deslizador1, deslizador2, deslizador3);
                repaint();
            }
        };

        slider1.addChangeListener(sliderChangeListener);
        slider2.addChangeListener(sliderChangeListener);
        slider3.addChangeListener(sliderChangeListener);

        // Configurar el panel de deslizadores
        JPanel sliderPanel = new JPanel();
        sliderPanel.setLayout(new GridLayout(3, 2));
        sliderPanel.add(new JLabel("Deslizador 1:"));
        sliderPanel.add(slider1);
        sliderPanel.add(new JLabel("Deslizador 2:"));
        sliderPanel.add(slider2);
        sliderPanel.add(new JLabel("Deslizador 3:"));
        sliderPanel.add(slider3);

        // Agregar el panel de deslizadores a la ventana
        add(sliderPanel, BorderLayout.NORTH);
    }

    public void paint(Graphics g) {
        super.paint(g);
        
        // Dibujar el rectángulo con el color definido
        g.setColor(rectColor);
        g.fillRect(100, 100, 200, 200);

        // Establecer el color en negro para dibujar los valores de los deslizadores
        g.setColor(Color.BLACK);

        // Obtener los valores de los deslizadores
        int deslizador1 = slider1.getValue();
        int deslizador2 = slider2.getValue();
        int deslizador3 = slider3.getValue();

        // Dibujar los valores de los deslizadores debajo del rectángulo
        g.drawString("Deslizador 1: " + deslizador1, 100, 320);
        g.drawString("Deslizador 2: " + deslizador2, 100, 340);
        g.drawString("Deslizador 3: " + deslizador3, 100, 360);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ColorDemo());
    }
}