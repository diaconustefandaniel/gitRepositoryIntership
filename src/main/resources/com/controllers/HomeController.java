
public class HomeController {

	
	public static int calculateSum(int a,int b)
	{
		System.out.println("suntem in metoda care calculeaza suma a doua numere");
		return a+b;
	}
	
	public static void main(String argv[])
	{
		int suma=calculateSum(2, 3);
	}
}
