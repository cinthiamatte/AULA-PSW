package edu.udc.psw.aula001;

public class Aula001 {
	// Testando o uso do reposit�rio Git
	
	static int i2;
	int i3;
	static float f;
	
	public static void main(String args[])
	{
		int i = 25;
		
		i2 = 35;
		f = 2.3F;
		
		System.out.printf("vari�vel i = %d\n", i);
		System.out.printf("vari�vel f = %f\n", f);
		
		func(i);
		
		Aula001 obj;
		obj = new Aula001();		
		obj.func2(558);
	}
	static void func(int val)
	{
		System.out.printf("A fun��o recebeu o valor %d\n", val);
	}
	void func2(int val)
	{
		i2 = 55;
		i3 = 205;
		System.out.printf("A fun��o recebeu o valor %d\n", val);
	}

}
