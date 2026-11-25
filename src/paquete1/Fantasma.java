package paquete1;

public class Fantasma {
	private int fantasma_posX;
	private int fantasma_posY;
	
	public Fantasma() {
		this.fantasma_posX = 11;
		this.fantasma_posY = 9;
	}

	public int getFantasma_posX() {
		return fantasma_posX;
	}

	public void setFantasma_posX(int fantasma_posX, int tamanoTablero) {
		if (fantasma_posX <= 1) {
			this.fantasma_posX = 1;
		}
		if (fantasma_posX >= tamanoTablero -1) {
			this.fantasma_posX = tamanoTablero -1;
		}
		this.fantasma_posX = fantasma_posX;
		
	}

	public int getFantasma_posY() {

		return fantasma_posY;
	}

	public void setFantasma_posY(int fantasma_posY, tamanoFila) {
		if (fantasma_posX <= 1) {
			this.fantasma_posX = 1;
		}
		if (fantasma_posX >= tamanoFila -1) {
			this.fantasma_posX = tamanoFila -1;
		}
		this.fantasma_posY = fantasma_posY;
	}

}
