import java.awt.Color;
import java.awt.Point;

public class Shape
{
    protected Point[] location;
    private Color color;
    private boolean filled;
    
    public Shape(Color color, boolean filled)
    {
        
    }
    
    public Color getColor()
    {
        return this.color;
    }
    
    public boolean isFilled()
    {
        return this.filled;
    }
    
    public Point[] getLocation()
    {
        return this.location;
    }

}
