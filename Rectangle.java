package UI;
import java.awt.Graphics;

//Clase que dibuja rectangulos
//Extiende a la clase Shape para reducir complejidad
public class Rectangle extends Shape {
	
	//Constructor parametrizado de rectangulos
	public Rectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

	//Constructor default de rectangulos
    public Rectangle() {
        super();
    }
    
    //Se sobreescribe el metodo de la clase Shape
    //Metodo que dibuja un rectangulo en la pantalla
    @Override
    public void draw(Graphics g) {
        g.drawRect(getX(), getY(), getWidth(), getHeight());
    }
}
