package estructural;

public class Radio implements Dispositivo {
	private boolean on;
	private int canal;
	private int volumen;

    public Radio(boolean on, int canal, int volumen) {
        this.on = true;
        this.canal = 30;
        this.volumen = 0;
    }

        
        
        
	public boolean estaDisponible() {
		throw new UnsupportedOperationException();
	}

	public void encender() {
		throw new UnsupportedOperationException();
	}

        
          public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
//	

	public void apagar() {
		throw new UnsupportedOperationException();
	}

        @Override
	public void mostrarEstado() {
		String salida = "Radio";
                salida +="Estado: ";
                salida +=(this.on) ? "Encender" : "apagado" ;
                
                System.out.println("xx"+salida +""+this.getCanal());
	}
}