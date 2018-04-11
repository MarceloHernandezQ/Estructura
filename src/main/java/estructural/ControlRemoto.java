package estructural;

public class ControlRemoto {
	public Dispositivo dispositivo;

	public void subirVolumen() {
		this.dispositivo.setVolumen(this.dispositivo.getVolumen()+10);
                
	}

	public void bajarVolumen() {
		this.dispositivo.setVolumen(this.dispositivo.getVolumen()+10);
	}

	public void subirCanal() {
		this.dispositivo.setCanal(this.dispositivo.getCanal()+1);
	}

	public void bajarCanal() {
		this.dispositivo.setCanal(this.dispositivo.getCanal()-1);
	}

	public boolean encender() {
		
            return false;
	}

	public ControlRemoto() {
		throw new UnsupportedOperationException();
	}

	public ControlRemoto(Dispositivo dispo) {
		throw new UnsupportedOperationException();
	}
}