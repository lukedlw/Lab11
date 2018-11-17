
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02 Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;

    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the
     * panel.
     * 
     * @param title
     *            String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);

        int width = 800;
        int height = 600;

        // TODO: draw a dog:

        // Base head:
        Circle base = new Circle(new Point(400, 300), 400, Color.GRAY, true);

        // Ears:
        RightTriangle triL = new RightTriangle(new Point(275, 175), 30, -100, Color.PINK, true);
        RightTriangle triR = new RightTriangle(new Point(525, 175), -30, -100, Color.PINK, true);

        // Eyes:
        Oval OL1 = new Oval(new Point(325, 250), 50, 75, Color.WHITE, true);
        Oval OL = new Oval(new Point(325, 250), 25, 45, Color.BLACK, true);
        Oval OR1 = new Oval(new Point(475, 250), 50, 75, Color.WHITE, true);
        Oval OR = new Oval(new Point(475, 250), 25, 45, Color.BLACK, true);

        // Nose and Whiskers:
        Circle nose = new Circle(new Point(400, 300), 35, Color.BLACK, true);

        PolyLine line1 = new PolyLine(new Point(300, 350), new Point(400, 375), 50, Color.BLACK, true);
        PolyLine line2 = new PolyLine(new Point(400, 375), new Point(500, 350), 50, Color.BLACK, true);
        Oval tongue = new Oval(new Point(450, 420), 50, 75, Color.RED, true);
        // Collar:
        Oval collar = new Oval(new Point(400, 500), 400, 75, Color.BLUE, true);
        Circle collarC = new Circle(new Point(400, 500), 90, Color.RED, true);
        Circle collarC2 = new Circle(new Point(400, 500), 60, Color.GREEN, false);
        // Square around the dog:

        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();

        // TODO: add shapes to the panel:
        drawPanel.addShape(base);
        drawPanel.addShape(triL);
        drawPanel.addShape(triR);
        drawPanel.addShape(OL1);
        drawPanel.addShape(OL);
        drawPanel.addShape(OR1);
        drawPanel.addShape(OR);
        drawPanel.addShape(nose);
        drawPanel.addShape(collar);
        drawPanel.addShape(collarC);
        drawPanel.addShape(collarC2);
        drawPanel.addShape(line1);
        drawPanel.addShape(line2);
        drawPanel.addShape(tongue);

        // set background color
        drawPanel.setBackground(Color.CYAN);

        // add panel to frame
        this.add(drawPanel);

        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args
     *            Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
