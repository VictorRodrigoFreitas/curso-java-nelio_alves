package _08_introducao_poo.EX03;

public class Student {

	public String nomeAluno;
	public double notaPrimeiroTrimestre;
	public double notaSegundoTrimestre;
	public double notaTerceiroTrimestre;

	public double notaFinal() {
		return this.notaPrimeiroTrimestre + this.notaSegundoTrimestre + this.notaTerceiroTrimestre;
	}

	public double aprovado() {

		if (this.notaFinal() < 60.0) {
			return 60.0 - this.notaFinal();
		} else {
			return 0.0;
		}

	}

}