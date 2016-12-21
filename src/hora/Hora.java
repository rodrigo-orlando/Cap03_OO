package hora;

public class Hora {

	private int hor, min, seg; // tres atributos int de valor restrito
	// Metodos de acesso (leitura) dos campos restritos.

	public int getHoras() {
		return hor;
	}

	public int getMinutos() {
		return min;
	}

	public int getSegundos() {
		return seg;
	}

	// Metodos de alteração (escrita) dos campo restritos

	public void setHoras(int h) {
		if (h >= 0 && h < 24)
			hor = h;
	}

	public void setMinutos(int m) {
		if (m >= 0 && m < 60)
			min = m;
	}

	public void setSegundos(int s){
		if (s >= 0 && s < 60)
			seg = s;
	}

	public void setHorario (int h, int m, int s){
		setHoras(h);
		setMinutos(m);
		setSegundos(s);
	}
	//Representação textual dos objetos hora
	
	public String toString(){
		return String.format("%02d:%02d:%02d", getHoras(),getMinutos(),getSegundos());
	}

}
