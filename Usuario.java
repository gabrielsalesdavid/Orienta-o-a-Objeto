package br.com.modificadoresdeacesso;

public class Usuario {
	public static void main (String [] args) {
		Cliente bryan = new Cliente ("Bryan Gabriel" , "Rua Palmeiras, 1914");
		Cliente rebeca = new Cliente ("Rebeca Vitoria", "Rua Amor da minha vida, 2");
		
		Conta conta_bryan = new Conta (1, 200.0f, 400.0f, bryan);
		Conta conta_rebeca = new Conta (2,600.0f, 800.0f, rebeca);
		
		System.out.println("Saldo do Bryan: " + conta_bryan.getSaldo());
		System.out.println("Saldo da Rebeca: " + conta_rebeca.getSaldo());
		
		conta_bryan.sacar(900);
		System.out.println("Saldo do Bryan: " + conta_bryan.getSaldo());
		
		System.out.println("Seu limite é? " + conta_bryan.getLimite());

	}
}
