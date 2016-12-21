package ponto2d;

public class Ponto2D {

	// Campos publicos não existe restriçoes para valores de x e y
	public double x, y;

	// construtor default: ponto definido na origem (0,0)
	public Ponto2D() {
		x = 0;
		y = 0;
	}

	// Construtor parametrizado: ponto definido na instanciação
	public Ponto2D(double px, double py) {
		x = px;
		y = py;
	}

	//determina a distancia entre instancia e coordenada dada
	public double distancia(double px, double py){
		return Math.sqrt(Math.pow(x - px, 2) + Math.pow(y - py, 2));
	}
	
	//determina a distancia entre instancia e ponto dado
	public double distancia(Ponto2D p){
		return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
	}
	//Fornece representação textual dos objetos
	public String toString(){
		return "Ponto2D[ x = "+x+"y = "+y+" ]";
	}
	
	
}
