package ejemplos1;

public class EjemplosFuncionesRecursivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int resultado=factorialRecursiva2(n);
		System.out.println("El factorial de "+
							n+" es "+resultado);
	}
	
	public static int factorialIterativa(int num)
	{
		int ac=1;
		
		for(int i=num;i>=1;i--)
		{
			ac=ac*i;
		}
		
		return ac;
		
	}
	
	public static int factorialRecursiva2(int num)
	{
		int acumulador=1;
		//caso base
		if(num==1 || num==0)
			return 1;
		else//caso recursivo
		{
			acumulador=num*factorialRecursiva2(num-1);
			return acumulador;
		}
	}
	
	public static int factorialRecursiva(int num)
	{	
		int dev=1;
		//caso base
		if(num==1)
			dev=1;		
		//caso recursivo
		else
			dev=num*factorialRecursiva(num-1);
		
		return dev;		
	}
	
	public static void imprimeNumerosAscendente(int num)
	{
		//caso base
		if(num==1)
			System.out.println(" "+num);
		//caso recursivo
		else{
			imprimeNumerosAscendente(num-1);
			System.out.println(" "+num+" ");
		}			
	}
	
	public static void imprimeNumerosDescendente(int num)
	{
		//caso base
				if(num==1)
					System.out.println(" "+num);
				//caso recursivo
				else{					
					System.out.println(" "+num+" ");
					imprimeNumerosDescendente(num-1);
				}	
	}

}
