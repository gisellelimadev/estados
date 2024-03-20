package atividade5;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Digite um Estado"); 
		 String estado = scanner.nextLine();
		 if(estado.equals("DF")||estado.equals("GO")||estado.equals("MT")||estado.equals("MS")||estado.equals("AL")||estado.equals("BH")||estado.equals("CE")||estado.equals("MA")||estado.equals("PB")||estado.equals("PE")||estado.equals("PI")||estado.equals("RN")||estado.equals("SE")||estado.equals("AC")||estado.equals("AM")||estado.equals("AP")||estado.equals("PA")||estado.equals("RO")||estado.equals("RR")||estado.equals("TO")||estado.equals("ES")||estado.equals("MG")||estado.equals("RJ")||estado.equals("SP")||estado.equals("SC")||estado.equals("PR")||estado.equals("RS")) {
			 System.out.println("É um estado Brasileiro"); 
		 }else {
			 System.out.println("Não é um estado Brasileiro"); 
		 }
	}
}
