package estructural;

public class ControlRemotoAvanzado extends ControlRemoto {

	public void ControRemotoAvanzado(Dispositivo dev) {
		
            
            super.dispositivo= dev;
	}

	public void mute() {
		this.dispositivo.setVolumen(0);
	}
}