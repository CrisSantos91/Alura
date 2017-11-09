public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();

		f1.nome = "Hugo";
		f1.salario = 100;
		f1.recebeAumento(50);
		f1.dataDeEntrada = new Data();
		f1.dataDeEntrada.preencheData(1, 7, 2009);
		f1.mostra();

	}
}
