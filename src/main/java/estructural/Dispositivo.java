package estructural;

public interface Dispositivo {

	public boolean estaDisponible();

	public void encender();

	public int getVolumen();

	public void setVolumen(int porcentaje);

	public void setCanal(int canal);

	public int getCanal();

	public void apagar();

	public void mostrarEstado();
}