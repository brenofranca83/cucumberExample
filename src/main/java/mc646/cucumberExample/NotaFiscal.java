package mc646.cucumberExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class NotaFiscal {

	private Collection<ItemNota> itens;  
	
	public NotaFiscal() {
		this.itens = new ArrayList<ItemNota>();
	}
	
	public void addItem(ItemNota item) {
		this.itens.add(item);
	}
	
	public float calcularValorFinal() {
		float valorFinal = 0f;
		
		for (Iterator<ItemNota> iterator = this.itens.iterator(); iterator.hasNext();) {
			ItemNota itemNota = (ItemNota) iterator.next();
			float imposto = 0f;
			Produto prod = itemNota.getProd();
			
			float matImp = prod.getPercMaterialImport();
			if(matImp > 10f && matImp <= 30f) {
				imposto = 0.03f;
			}
			else if(matImp > 30f && matImp <= 50f) {
				imposto = 0.05f;
			}
			else if(matImp > 50f && matImp <= 80f) {
				imposto = 0.08f;
			}
			else if(matImp > 80f) {
				imposto = 0.11f;
			}
			float preco = prod.getPreco();
			float valorProduto = (preco + (preco * imposto)) * itemNota.getQuant();
			valorFinal += valorProduto; 
		}
		
		return valorFinal;
	}

}
