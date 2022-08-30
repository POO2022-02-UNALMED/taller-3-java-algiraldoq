package taller3.televisores;

public class TV {
	private Marca marca;
	private Integer canal = 1;
	private Integer precio = 500;
	private Boolean estado;
	private Integer volumen = 1;
	private Control control;
	static int numTV = 0;

	public TV(Marca marca, Boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Integer getCanal() {
		return canal;
	}

	public void setCanal(Integer canal) {
		if (estado == true  && canal >= 1 && canal <= 120) {
			this.canal = canal;			
		}
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getVolumen() {
		return volumen;
	}

	public void setVolumen(Integer volumen) {
		if (1 <= volumen && canal <= 7 && estado == true) {
			this.volumen = volumen;			
		}
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	public void setNumTV(int num) {
		numTV = num;
	}
	
	public Integer getNumTV() {
		return numTV;
	}

	public void turnOn() {
		estado = true;
	}

	public void turnOff() {
		estado = false;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void canalUp() {
		if (canal >= 1 && canal < 120 && estado == true) {
			canal = canal + 1;
		}
	}

	public void canalDown() {
		if (1 < canal && canal <= 120 && estado == true) {
			canal = canal - 1;
		}
	}

	public void volumenUp() {
		if (1 <= volumen && volumen < 7 && estado == true) {
			volumen = volumen + 1;
		}
	}

	public void volumenDown() {
		if (1 < volumen && volumen <= 7 && estado == true) {
			volumen = volumen - 1;
		}
	}
}
