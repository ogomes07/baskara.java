
import java.util.Scanner;
public class area {
	public class calArea {
		public static void mains (String[]args) {
			double r, area;
			Scanner in= new Scanner(System.in);
			System.out.print("Digite o raio da circuferencia:");
			r= in.nextDouble();
			area = 3.1411592*r*r;
			System.out.print("A area da circuferencia é: "+ area);
			in.close();
		}
	}
}
