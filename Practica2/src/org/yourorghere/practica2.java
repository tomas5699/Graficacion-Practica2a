
package org.yourorghere;


import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*                     creamos la ventana                             */
public class practica2 extends JFrame{
 static GL gl;
 static GLU glu;
/*                     dimensiones                                       */
 public practica2 (){
 setTitle("Puntos ");
 setSize(1600, 900);
 
 // clase Graphic
 GraphicListener listener = new GraphicListener();
 //Creamos el canvas
 GLCanvas canvas = new GLCanvas(new GLCapabilities());
 canvas.addGLEventListener(listener);
 getContentPane().add(canvas);
 }

 public static void main (String args[]){
 practica2 frame = new practica2();
 frame.setVisible(true);
 frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
 }

 public class GraphicListener implements GLEventListener{
 public void display(GLAutoDrawable arg0) {
 gl.glClear(GL.GL_COLOR_BUFFER_BIT);
 gl.glColor3f(0,1,1);                                                          //tipo de color 
 gl.glPointSize(30);                                                          //tamano del punto
 gl.glBegin(GL.GL_POINTS);
 

 for ( double i= -0.81; i< 0.8; i+=0.10){                      /*  controla x*/
 
 for (double j=-0.81; j<0.8; j=j+0.10){                        /*  controla y*/
	 
 //indica la posicion
 gl.glVertex2d(i,j);
 }

 }

 //Se acaba el dibujado de puntos
                           gl.glEnd();
                           gl.glFlush();


 }
 
 public void init(GLAutoDrawable arg0) {
 glu = new GLU();
 gl = arg0.getGL();
 gl.glClearColor(0, 0, 0, 0);

 }
 public void reshape(GLAutoDrawable drawable, int x, int y, int
width, int height) {
 }
 public void displayChanged(GLAutoDrawable drawable, boolean
modeChanged, boolean deviceChanged) {
 }
 }
}
