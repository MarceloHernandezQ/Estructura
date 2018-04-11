package estructural;

public class Tv implements Dispositivo {
	private boolean  on;
	private int canal;
	private int volumen;

        @Override
	public boolean estaDisponible() {
		throw new UnsupportedOperationException();
	}

        @Override
	public void encender() {
		this.on = true ;
                System.out.println("televisor esendido");
	}

	public int getVolumen() {
		throw new UnsupportedOperationException();
	}

	public void setVolumen(int porcentaje) {
		
	}

	public void setCanal(int canal) {
		throw new UnsupportedOperationException();
	}

	public int getCanal() {
		throw new UnsupportedOperationException();
	}

	public void apagar() {
		throw new UnsupportedOperationException();
	}

	public void mostrarEstado() {
		throw new UnsupportedOperationException();
	}
}