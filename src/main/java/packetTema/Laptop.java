package packetTema;

public class Laptop {
	private String brand;
	private int pret;
	private int ram;
	public Laptop(String brand, int pret, int ram) {
		super();
		this.brand = brand;
		this.pret = pret;
		this.ram = ram;
	}
	public String getBrand() {
		return brand;
	}
	public int getPret() {
		return pret;
	}
	public int getRam() {
		return ram;
	}
	
}
