package iTforstudents;

public class company {
	private String name;
	private String address;
	private double cost;
	private double income;
	private double benefit;

	public company(String name, String address, double cost, double income) {
		this.name = name;
		this.address = address;
		this.cost = cost;
		this.income = income;
		this.benefit = calculateBenefit();
	}

	public double calculateBenefit() {
		return income - cost;
	}

	public void displayInformation() {
		System.out.println("Ten cong ty: " + name);
		System.out.println("Dia chi: " + address);
		System.out.println("Chi phi: " + cost);
		System.out.println("Doanh thu: " + income);
		System.out.println("Loi nhuan: " + benefit);
	}

	public static void main(String[] args) {
		company company = new company("HaiNH", "Duy Tan", 1000000, 1500000);
		company.displayInformation();
	}
}
