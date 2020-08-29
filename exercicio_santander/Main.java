package exercicio_santander;

public class Main {

	public static void main(String[] args) {
		System.out.println("================CONTA_POUPANCA================");
		ContaPoupanca contaP = new ContaPoupanca(1000.00);
		System.out.println(contaP.getSaldo());
		System.out.println(contaP.recolherJuros());
		
		Cliente cli1 = new Cliente(1,"Romao",11232321,"39183079807");
		cli1.setConta(contaP);
		
		contaP.sacar(2000.00);

		System.out.println(cli1);
		System.out.println("==============================================");
		
		System.out.println("================CONTA_CORRENTE================");
		ContaCorrente contaC = new ContaCorrente(1000.00);
		System.out.println("Saldo atual: " + contaC.getSaldo());
		Cheque cheque = new Cheque(1000.00,1102,"10/12/2020");
		
		Cliente cli2 = new Cliente(2,"Jurani",11232321,"39183079807");
		cli2.setConta(contaC);
		contaC.depositarCheque(cheque); //Aqui deposito o cheque e associo o mesmo a ContaCorrente
		System.out.println("Saldo atual apos deposito de cheque: " + contaC.getSaldo());
		
		contaC.sacar(2701.00);

		System.out.println(cli2);
		System.out.println("==============================================");
	}

}
