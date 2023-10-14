package exercicio08.entities;

import java.util.Date;
import exercicio08.enums.StatusDoPedido;
import exercicio08.entities.Cliente;
import java.util.List;
import exercicio08.entities.ItemPedido;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class Estoque {
	SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
	private Date momento;
	private StatusDoPedido estado;
	//
	private Cliente cliente;
	private List<ItemPedido> listaDeItems = new ArrayList<ItemPedido>();
	
	//Construtor
	public Estoque(Date momento, StatusDoPedido estado, Cliente cliente) {
		this.momento = momento;
		this.estado = estado;
		this.cliente = cliente;
	}
	
	//Adicionar e remover
	public void addItem(ItemPedido item) {
		this.listaDeItems.add(item);
	}
	
	public void removeItem(ItemPedido item) {
		this.listaDeItems.remove(item);
	}
	
	//Contas
	public double total() {
		double soma = 0;
		for (ItemPedido lista : listaDeItems) {
			soma += lista.somaTotal();
		}
		return soma;
	}
	
	//
	public String toString() {
		
		StringBuilder str = new StringBuilder();
		str.append("Momento do Estoque : ");
		str.append(formatarData.format(momento) + "\n");
		str.append("Status do produto : ");
		str.append(estado + "\n");
		str.append("Cliente : ");
		str.append(cliente + "\n");
		str.append("\nItens pedido:\n");
		
		for (ItemPedido items : listaDeItems) {
			str.append(items );
		}
		str.append("\nValor total :");
		str.append(String.format("%.2f%n", total()));
		
		return str.toString();
	}
}