import java.util.Scanner;


public class CNDA 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Scanner mi_scanner=new Scanner(System.in);
for(int i=0; i<3; i++);
		{
			System.out.print("Ingrese Nota: ");
			int nota=mi_scanner.nextInt();
			if(nota>=90)
			{
				System.out.println("Excelencia");
			}else if (nota>=80)
				{
				System.out.println("Sobresaliente");
				}else if (nota>=60)
				{System.out.print("Aprobado");
			}else
				System.out.print("reprobado");
		}
	}
}
