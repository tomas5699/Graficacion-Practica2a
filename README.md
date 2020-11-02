# Graficacion-practica2a
# uso de puntos realizar cuadros de una sola medida 
# codigo 

parte del codigo donde se utilizo ciclos for para la creacion de este programa 

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
 
 # Ejecucion 
 ![Captura de pantalla (26)](https://user-images.githubusercontent.com/73785441/97922925-d3890d00-1d22-11eb-8f3f-36c6389e0338.png)
