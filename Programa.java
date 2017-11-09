public class Programa {
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
        /*Cliente c = new Cliente();
        minhaConta.titular = c;*/

		minhaConta.titular.nome = "Duke";
		minhaConta.saldo = 1000.0;
		
		minhaConta.saca(400);
		
		minhaConta.deposita(700);

		System.out.println("Saldo atual: " + minhaConta.saldo);

	}
}
