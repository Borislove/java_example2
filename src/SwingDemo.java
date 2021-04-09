
	package my;

    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.JSlider;
    import javax.swing.WindowConstants;

    public class SwingDemo {

    public static void main(String[] args) {
                JFrame frame = new JFrame("Frame with Slider");
                JSlider slider = new JSlider(JSlider.VERTICAL, 0, 100, 60);
                slider.setInverted(true);
                slider.setMinorTickSpacing(5);
                slider.setMajorTickSpacing(20);
                slider.setPaintTicks(true);
                slider.setPaintLabels(true);
               JPanel panel = new JPanel();
                panel.add(slider);
                frame.add(panel);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setSize(600, 300);
                frame.setVisible(true);
            }
}