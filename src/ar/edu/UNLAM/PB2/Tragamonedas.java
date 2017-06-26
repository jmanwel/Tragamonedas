package ar.edu.UNLAM.PB2;

public class Tragamonedas {
	
	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;
	
	private Integer rTambor1;
	private Integer rTambor2;
	private Integer rTambor3;

	public Tragamonedas(Integer carasTambor) {
		this.tambor1 = new Tambor(carasTambor);
		this.tambor2 = new Tambor(carasTambor);
		this.tambor3 = new Tambor(carasTambor);
	}
		
	public void jugar() {
		this.rTambor1 = this.tambor1.girar();
		this.rTambor2 = this.tambor2.girar();
		this.rTambor3 = this.tambor3.girar();
	}

	public Integer getTambor1() {
		return this.rTambor1;
	}

	public Integer getTambor2() {
		return this.rTambor2;
	}

	public Integer getTambor3() {
		return this.rTambor3;
	}
	

}
