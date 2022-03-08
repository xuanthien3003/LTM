package bai2;
import java.util.Scanner;

public class bt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Chiều dài của hình chữ nhật: ");
		double chieuDai = scanner.nextDouble();
		System.out.print("Chiều rộng của hình chữ nhật: ");
		double chieuRong = scanner.nextDouble();
		
		System.out.print("Chu vi của hình chữ nhật: ");
		double CV = (chieuDai+chieuRong)*2;
		System.out.println(CV);
		System.out.print("Diện tích của hình chữ nhật: ");
		double DT= chieuDai*chieuRong;		
		System.out.println(DT);
		System.out.print("Cạnh nhỏ nhất: ");
		double CNN=Math.min(chieuDai,chieuRong);
		System.out.print(CNN);
	}

}