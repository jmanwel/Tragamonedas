package ar.edu.UNLAM.PB2;

import java.util.Random;

public class Tambor {

		private Integer caras;

		public Tambor(Integer caras) {
			this.caras = caras;
		}

		public Integer girar() {
			Random generator = new Random();
			return generator.nextInt(this.caras) + 1;
		}

	
}
