package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository{

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	
	int numero = 0;
	
	
	public void listartodas() {
		for (var conta: listaContas) {
			conta.visualizar();
		}	
	}
	
	// Não consegui criar um método que se chamasse apenas "cadastrar"
	@Override
	public void cadastrar1(Conta conta) {
		listaContas.add(conta);
		System.out.println("\nA conta número " + conta.getNumero() + " foi criada com sucesso!");
	}  
	
	
	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTodas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrar(Conta conta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public int gerarNumero() {
		return ++ numero;	
	}

}
