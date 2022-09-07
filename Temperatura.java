package Fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		
		double F = 150;
		final double X = 32;
		final double Y = (0.5 / 9.0);
		double C = (F - X) * Y;
		
		System.out.println("O resultado é: " + C);
	}

}
