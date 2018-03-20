package aplicacionesProyecto;

public class arduino {
	
	private static final double  X = 0.0;
	private static final double Y = 0.0;
	private double x;
	private String nombre;
	private double y;
	
	public arduino(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public arduino () {
		this.x = X;
		this.y = Y;
	}
	
	public arduino (String nombre) {
		this.x = X;
		this.y = Y;
		this.nombre = nombre;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String coordenadas() {
		String coordenadas = "latitud: "+x+"longitud: "+y;	
		return coordenadas;
	}
}
