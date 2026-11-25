package paquete1;

public class Partida {
	private int puntuacion;
	private Fantasma fantasma;
	private Comecocos coco;
	private Tablero tablero;
	
	public Partida() {
		this.coco = new Comecocos();
		this.fantasma = new Fantasma();
		this.tablero = new Tablero();
		this.puntuacion = 0;
	}
	
	
}
