package UI;
import dataStructure.List;
import dataStructure.Node;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class DrawShapes extends JFrame {
	private static final long serialVersionUID = 1L;
	public List _shapeList;

	//Constructor de la ventana que va a contener los rectangulos
    public DrawShapes(String title) {
        super(title);
        //Lista a usar para manejar rectangulos
    	_shapeList = null;
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);
        //Se inician los componentes que va a contener la pantalla
        this.initComponents();
    }
    //Metodo que crea las listas que contienen rectangulos y listas que contienen estas listas
    private void initComponents(){
    	List test1 = new List();
    	test1.addLast(new Rectangle(20, 30, 60, 30));
		test1.addLast(new Rectangle(80, 30, 60, 30));
		test1.addLast(new Rectangle(140, 30, 60, 30));
		test1.addLast(new Rectangle(200, 30, 60, 30));
		test1.addLast(new Rectangle(260, 30, 60, 30));
		test1.addLast(new Rectangle(320, 30, 60, 30));
		test1.addLast(new Rectangle(380, 30, 60, 30));
		test1.addLast(new Rectangle(440, 30, 60, 30));
		test1.addLast(new Rectangle(500, 30, 60, 30));
		test1.addLast(new Rectangle(560, 30, 60, 30));
		test1.addLast(new Rectangle(620, 30, 60, 30));
		test1.addLast(new Rectangle(680, 30, 60, 30));
		test1.addLast(new Rectangle(740, 30, 60, 30));
		test1.addLast(new Rectangle(800, 30, 60, 30));
		test1.addLast(new Rectangle(860, 30, 60, 30));

		


		List test2 = new List();
		test2.addLast(new Rectangle(20, 60, 60, 30));
		test2.addLast(new Rectangle(80, 60, 60, 30));
		test2.addLast(new Rectangle(140, 60, 60, 30));
		test2.addLast(new Rectangle(200, 60, 60, 30));
		test2.addLast(new Rectangle(260, 60, 60, 30));
		test2.addLast(new Rectangle(320, 60, 60, 30));
		test2.addLast(new Rectangle(380, 60, 60, 30));
		test2.addLast(new Rectangle(440, 60, 60, 30));
		test2.addLast(new Rectangle(500, 60, 60, 30));
		test2.addLast(new Rectangle(560, 60, 60, 30));
		test2.addLast(new Rectangle(620, 60, 60, 30));
		test2.addLast(new Rectangle(680, 60, 60, 30));
		test2.addLast(new Rectangle(740, 60, 60, 30));
		test2.addLast(new Rectangle(800, 60, 60, 30));
		test2.addLast(new Rectangle(860, 60, 60, 30));
		
		List test3 = new List();
		test3.addLast(new Rectangle(20, 90, 60, 30));
		test3.addLast(new Rectangle(80, 90, 60, 30));
		test3.addLast(new Rectangle(140, 90, 60, 30));
		test3.addLast(new Rectangle(200, 90, 60, 30));
		test3.addLast(new Rectangle(260, 90, 60, 30));
		test3.addLast(new Rectangle(320, 90, 60, 30));
		test3.addLast(new Rectangle(380, 90, 60, 30));
		test3.addLast(new Rectangle(440, 90, 60, 30));
		test3.addLast(new Rectangle(500, 90, 60, 30));
		test3.addLast(new Rectangle(560, 90, 60, 30));
		test3.addLast(new Rectangle(620, 90, 60, 30));
		test3.addLast(new Rectangle(680, 90, 60, 30));
		test3.addLast(new Rectangle(740, 90, 60, 30));
		test3.addLast(new Rectangle(800, 90, 60, 30));
		test3.addLast(new Rectangle(860, 90, 60, 30));
	
		List test4 = new List();
		test4.addLast(new Rectangle(20, 120, 60, 30));
		test4.addLast(new Rectangle(80, 120, 60, 30));
		test4.addLast(new Rectangle(140, 120, 60, 30));
		test4.addLast(new Rectangle(200, 120, 60, 30));
		test4.addLast(new Rectangle(260, 120, 60, 30));
		test4.addLast(new Rectangle(320, 120, 60, 30));
		test4.addLast(new Rectangle(380, 120, 60, 30));
		test4.addLast(new Rectangle(440, 120, 60, 30));
		test4.addLast(new Rectangle(500, 120, 60, 30));
		test4.addLast(new Rectangle(560, 120, 60, 30));
		test4.addLast(new Rectangle(620, 120, 60, 30));
		test4.addLast(new Rectangle(680, 120, 60, 30));
		test4.addLast(new Rectangle(740, 120, 60, 30));
		test4.addLast(new Rectangle(800, 120, 60, 30));
		test4.addLast(new Rectangle(860, 120, 60, 30));
		
		List test5 = new List();
		test5.addLast(new Rectangle(20, 150, 60, 30));
		test5.addLast(new Rectangle(80, 150, 60, 30));
		test5.addLast(new Rectangle(140, 150, 60, 30));
		test5.addLast(new Rectangle(200, 150, 60, 30));
		test5.addLast(new Rectangle(260, 150, 60, 30));
		test5.addLast(new Rectangle(320, 150, 60, 30));
		test5.addLast(new Rectangle(380, 150, 60, 30));
		test5.addLast(new Rectangle(440, 150, 60, 30));
		test5.addLast(new Rectangle(500, 150, 60, 30));
		test5.addLast(new Rectangle(560, 150, 60, 30));
		test5.addLast(new Rectangle(620, 150, 60, 30));
		test5.addLast(new Rectangle(680, 150, 60, 30));
		test5.addLast(new Rectangle(740, 150, 60, 30));
		test5.addLast(new Rectangle(800, 150, 60, 30));
		test5.addLast(new Rectangle(860, 150, 60, 30));
		
		List test6 = new List();
		test6.addLast(new Rectangle(20, 180, 60, 30));
		test6.addLast(new Rectangle(80, 180, 60, 30));
		test6.addLast(new Rectangle(140, 180, 60, 30));
		test6.addLast(new Rectangle(200, 180, 60, 30));
		test6.addLast(new Rectangle(260, 180, 60, 30));
		test6.addLast(new Rectangle(320, 180, 60, 30));
		test6.addLast(new Rectangle(380, 180, 60, 30));
		test6.addLast(new Rectangle(440, 180, 60, 30));
		test6.addLast(new Rectangle(500, 180, 60, 30));
		test6.addLast(new Rectangle(560, 180, 60, 30));
		test6.addLast(new Rectangle(620, 180, 60, 30));
		test6.addLast(new Rectangle(680, 180, 60, 30));
		test6.addLast(new Rectangle(740, 180, 60, 30));
		test6.addLast(new Rectangle(800, 180, 60, 30));
		test6.addLast(new Rectangle(860, 180, 60, 30));
	
		
		List test7 = new List();
		test7.addLast(new Rectangle(20, 210, 60, 30));
		test7.addLast(new Rectangle(80, 210, 60, 30));
		test7.addLast(new Rectangle(140, 210, 60, 30));
		test7.addLast(new Rectangle(200, 210, 60, 30));
		test7.addLast(new Rectangle(260, 210, 60, 30));
		test7.addLast(new Rectangle(320, 210, 60, 30));
		test7.addLast(new Rectangle(380, 210, 60, 30));
		test7.addLast(new Rectangle(440, 210, 60, 30));
		test7.addLast(new Rectangle(500, 210, 60, 30));
		test7.addLast(new Rectangle(560, 210, 60, 30));
		test7.addLast(new Rectangle(620, 210, 60, 30));
		test7.addLast(new Rectangle(680, 210, 60, 30));
		test7.addLast(new Rectangle(740, 210, 60, 30));
		test7.addLast(new Rectangle(800, 210, 60, 30));
		test7.addLast(new Rectangle(860, 210, 60, 30));
	
		List test8 = new List();
		test8.addLast(new Rectangle(20, 240, 60, 30));
		test8.addLast(new Rectangle(80, 240, 60, 30));
		test8.addLast(new Rectangle(140, 240, 60, 30));
		test8.addLast(new Rectangle(200, 240, 60, 30));
		test8.addLast(new Rectangle(260, 240, 60, 30));
		test8.addLast(new Rectangle(320, 240, 60, 30));
		test8.addLast(new Rectangle(380, 240, 60, 30));
		test8.addLast(new Rectangle(440, 240, 60, 30));
		test8.addLast(new Rectangle(500, 240, 60, 30));
		test8.addLast(new Rectangle(560, 240, 60, 30));
		test8.addLast(new Rectangle(620, 240, 60, 30));
		test8.addLast(new Rectangle(680, 240, 60, 30));
		test8.addLast(new Rectangle(740, 240, 60, 30));
		test8.addLast(new Rectangle(800, 240, 60, 30));
		test8.addLast(new Rectangle(860, 240, 60, 30));
		
		List test9 = new List();
		test9.addLast(new Rectangle(20, 270, 60, 30));
		test9.addLast(new Rectangle(80, 270, 60, 30));
		test9.addLast(new Rectangle(140, 270, 60, 30));
		test9.addLast(new Rectangle(200, 270, 60, 30));
		test9.addLast(new Rectangle(260, 270, 60, 30));
		test9.addLast(new Rectangle(320, 270, 60, 30));
		test9.addLast(new Rectangle(380, 270, 60, 30));
		test9.addLast(new Rectangle(440, 270, 60, 30));
		test9.addLast(new Rectangle(500, 270, 60, 30));
		test9.addLast(new Rectangle(560, 270, 60, 30));
		test9.addLast(new Rectangle(620, 270, 60, 30));
		test9.addLast(new Rectangle(680, 270, 60, 30));
		test9.addLast(new Rectangle(740, 270, 60, 30));
		test9.addLast(new Rectangle(800, 270, 60, 30));
		test9.addLast(new Rectangle(860, 270, 60, 30));
		
		List test10 = new List();
		test10.addLast(new Rectangle(20, 300, 60, 30));
		test10.addLast(new Rectangle(80, 300, 60, 30));
		test10.addLast(new Rectangle(140, 300, 60, 30));
		test10.addLast(new Rectangle(200, 300, 60, 30));
		test10.addLast(new Rectangle(260, 300, 60, 30));
		test10.addLast(new Rectangle(320, 300, 60, 30));
		test10.addLast(new Rectangle(380, 300, 60, 30));
		test10.addLast(new Rectangle(440, 300, 60, 30));
		test10.addLast(new Rectangle(500, 300, 60, 30));
		test10.addLast(new Rectangle(560, 300, 60, 30));
		test10.addLast(new Rectangle(620, 300, 60, 30));
		test10.addLast(new Rectangle(680, 300, 60, 30));
		test10.addLast(new Rectangle(740, 300, 60, 30));
		test10.addLast(new Rectangle(800, 300, 60, 30));
		test10.addLast(new Rectangle(860, 300, 60, 30));
		
		List test11 = new List();
		test11.addLast(new Rectangle(20, 330, 60, 30));
		test11.addLast(new Rectangle(80, 330, 60, 30));
		test11.addLast(new Rectangle(140, 330, 60, 30));
		test11.addLast(new Rectangle(200, 330, 60, 30));
		test11.addLast(new Rectangle(260, 330, 60, 30));
		test11.addLast(new Rectangle(320, 330, 60, 30));
		test11.addLast(new Rectangle(380, 330, 60, 30));
		test11.addLast(new Rectangle(440, 330, 60, 30));
		test11.addLast(new Rectangle(500, 330, 60, 30));
		test11.addLast(new Rectangle(560, 330, 60, 30));
		test11.addLast(new Rectangle(620, 330, 60, 30));
		test11.addLast(new Rectangle(680, 330, 60, 30));
		test11.addLast(new Rectangle(740, 330, 60, 30));
		test11.addLast(new Rectangle(800, 330, 60, 30));
		test11.addLast(new Rectangle(860, 330, 60, 30));
		
		List test12 = new List();
		test12.addLast(new Rectangle(20, 360, 60, 30));
		test12.addLast(new Rectangle(80, 360, 60, 30));
		test12.addLast(new Rectangle(140, 360, 60, 30));
		test12.addLast(new Rectangle(200, 360, 60, 30));
		test12.addLast(new Rectangle(260, 360, 60, 30));
		test12.addLast(new Rectangle(320, 360, 60, 30));
		test12.addLast(new Rectangle(380, 360, 60, 30));
		test12.addLast(new Rectangle(440, 360, 60, 30));
		test12.addLast(new Rectangle(500, 360, 60, 30));
		test12.addLast(new Rectangle(560, 360, 60, 30));
		test12.addLast(new Rectangle(620, 360, 60, 30));
		test12.addLast(new Rectangle(680, 360, 60, 30));
		test12.addLast(new Rectangle(740, 360, 60, 30));
		test12.addLast(new Rectangle(800, 360, 60, 30));
		test12.addLast(new Rectangle(860, 360, 60, 30));
		
		List test13 = new List();
		test13.addLast(new Rectangle(20, 390, 60, 30));
		test13.addLast(new Rectangle(80, 390, 60, 30));
		test13.addLast(new Rectangle(140, 390, 60, 30));
		test13.addLast(new Rectangle(200, 390, 60, 30));
		test13.addLast(new Rectangle(260, 390, 60, 30));
		test13.addLast(new Rectangle(320, 390, 60, 30));
		test13.addLast(new Rectangle(380, 390, 60, 30));
		test13.addLast(new Rectangle(440, 390, 60, 30));
		test13.addLast(new Rectangle(500, 390, 60, 30));
		test13.addLast(new Rectangle(560, 390, 60, 30));
		test13.addLast(new Rectangle(620, 390, 60, 30));
		test13.addLast(new Rectangle(680, 390, 60, 30));
		test13.addLast(new Rectangle(740, 390, 60, 30));
		test13.addLast(new Rectangle(800, 390, 60, 30));
		test13.addLast(new Rectangle(860, 390, 60, 30));
		
		List test14 = new List();
		test14.addLast(new Rectangle(20, 420, 60, 30));
		test14.addLast(new Rectangle(80, 420, 60, 30));
		test14.addLast(new Rectangle(140, 420, 60, 30));
		test14.addLast(new Rectangle(200, 420, 60, 30));
		test14.addLast(new Rectangle(260, 420, 60, 30));
		test14.addLast(new Rectangle(320, 420, 60, 30));
		test14.addLast(new Rectangle(380, 420, 60, 30));
		test14.addLast(new Rectangle(440, 420, 60, 30));
		test14.addLast(new Rectangle(500, 420, 60, 30));
		test14.addLast(new Rectangle(560, 420, 60, 30));
		test14.addLast(new Rectangle(620, 420, 60, 30));
		test14.addLast(new Rectangle(680, 420, 60, 30));
		test14.addLast(new Rectangle(740, 420, 60, 30));
		test14.addLast(new Rectangle(800, 420, 60, 30));
		test14.addLast(new Rectangle(860, 420, 60, 30));
		
		List test15 = new List();
		test15.addLast(new Rectangle(20, 450, 60, 30));
		test15.addLast(new Rectangle(80, 450, 60, 30));
		test15.addLast(new Rectangle(140, 450, 60, 30));
		test15.addLast(new Rectangle(200, 450, 60, 30));
		test15.addLast(new Rectangle(260, 450, 60, 30));
		test15.addLast(new Rectangle(320, 450, 60, 30));
		test15.addLast(new Rectangle(380, 450, 60, 30));
		test15.addLast(new Rectangle(440, 450, 60, 30));
		test15.addLast(new Rectangle(500, 450, 60, 30));
		test15.addLast(new Rectangle(560, 450, 60, 30));
		test15.addLast(new Rectangle(620, 450, 60, 30));
		test15.addLast(new Rectangle(680, 450, 60, 30));
		test15.addLast(new Rectangle(740, 450, 60, 30));
		test15.addLast(new Rectangle(800, 450, 60, 30));
		test15.addLast(new Rectangle(860, 450, 60, 30));

		
		List testFinale = new List();
		testFinale.addLast(test1);
		testFinale.addLast(test2);
		testFinale.addLast(test3);
		testFinale.addLast(test4);
		testFinale.addLast(test5);
		testFinale.addLast(test6);
		testFinale.addLast(test7);
		testFinale.addLast(test8);
		testFinale.addLast(test9);
		testFinale.addLast(test10);
		testFinale.addLast(test11);
		testFinale.addLast(test12);
		testFinale.addLast(test13);
		testFinale.addLast(test14);
		testFinale.addLast(test15);
		
		//Se guarda la lista en el parametro asignado
		_shapeList = testFinale;
    }
    
    //Metodo que pinta iterativamente los rectangulos de la matriz
    @Override
    public void paint(Graphics g) {
    	//Se le asigna un color a los rectangulos que se van a pintar
        g.setColor(Color.darkGray);
        //Nodo temporal para recorrer las filas de la matriz
    	Node temp1 = _shapeList.getHead();
    	//Se itera hasta que haya pintado todas las filas de la matriz
        while (temp1!=null) {
        	//Se hace un casteo para acceder a los datos de las filas dentro de la matriz
        	List temp2Aux = ((List)temp1.getDato());
        	//Se asigna un temporal  para recorrer las listas
        	Node temp2 = temp2Aux.getHead();
        	//Se itera hasta que haya pintado todos los elementos de la lista
        	while (temp2!=null){
        		//Se hace un casteo para poder pintar los elementos de las listas
        		Shape res = ((Rectangle)temp2.getDato());
        		//Se pinta el rectangulo
                res.draw(g);
                //Se continua al siguiente elemento de la lista
                temp2 = temp2.getNext();

        	}
        	//Se continua a la siguiente fila de la matriz
        	temp1 = temp1.getNext();

        }
    }

    
    //Main
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                DrawShapes d = new DrawShapes("TRON");
                d.setVisible(true);
            }
        });
    }
 
}
