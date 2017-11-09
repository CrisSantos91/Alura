public class Conta {
	int numero;
	double saldo;
	double limite;
	Cliente titular = new Cliente();

	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	void deposita(double quantidade) {
		this.saldo += quantidade;
	}

	boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			// não deu pra sacar!
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}

}
