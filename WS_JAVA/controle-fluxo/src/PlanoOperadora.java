public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "M"; //M / T
		
		if(plano == "B") {
            System.out.println("===== PLANO BASIC =====");
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
            System.out.println("===== PLANO MIDIA =====");
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano == "T") {
            System.out.println("===== PLANO TURBO =====");
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}
			
		
	}
}
