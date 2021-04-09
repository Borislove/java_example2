import java.awt.*;
import java.awt.event.InputEvent;
import java.io.IOException;

// "static void main" must be defined in a public class.
public class mouseKlick {

        public void toRight() throws IOException, AWTException {

            Robot robot = new Robot();
            robot.delay(100);

            robot.mouseMove(887, 983);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);



        }




        public static void main(String[] args) {
            System.out.println("Hello World!");
        }



}
