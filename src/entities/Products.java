package entities;

public class Products {

	public String name;
	public double price;
	public int quantity;

	// ==========calculando o valor total de itens no estoque
	public double totalValueInStock() {
		return price * quantity;

	}

	// ==========adicionando valor ao estoque (produto quantity
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	// ==========subtraindo produtos do estoque
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name
				+ ", $"
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.3f", totalValueInStock());
		
	}
}
