
public class TestStock {
	public static void main(String[] args) {
		Stock s = new Stock("ORCL","Orcale Corporation");
		s.previousClosingPrice = 34.5 ;
		s.currentPrice = 34.35 ;
		
		System.out.println("Corporation name  : " +s.name);
		System.out.println("Corporation symbol : " +s.symbol);
		System.out.println("Percentage chnage : " +s.getChangePercent());
	}
}
