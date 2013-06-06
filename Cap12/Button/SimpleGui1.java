package Cap12.Button;

// import swing package

import javax.swing.*;

public class SimpleGui1 {
    public static void main(String[] args) {

        // make a frame and a button
        JFrame frame = new JFrame();
        JButton button = new JButton("Click Me");
        // you can pass the button constructor the text you want on the button

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this line makes the program quit as soon as you close the window

        // add the button to the frame content pane
        frame.getContentPane().add(button);

        // give the frame a size, in pixels
        frame.setSize(300, 300);

        // finally, make it visible!! if you forget this step, you won't see anything when you run the code
        frame.setVisible(true);
    }
}
