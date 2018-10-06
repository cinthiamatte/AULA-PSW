package udc.edu.psw;
//convenção: nome de classe com a primeira letra de cada palavra em maiuscula = came-case

public class Aula {
	
		int i2; //existe somente dentro da classe
		
		@SuppressWarnings("unused")
		public static void main(String args[]) // somente main funciona
		// funçao static não pode acessar variaveis que não são de class ou funcão statict
		{
			//Tipos de Variaveis
			int i = 25;
			float f = 5.25f;
			double d = 5.25000;
			char c = 'a';
			long l = 455;
			byte b = 45;
			
			boolean bool = true;
			String str = " String ";
			
			System.out.printf("Ola mundo\n");
			System.out.print(i);
			
			// função static só chama outra funçao se for static
			func(i);
			//caso a funcao n seja static, deve-se chamar metodos de obj que a funçao tem acesso
			
			Aula obj; //declara obj, ele não tem valor e para poder usar deve-se colocar um valor
			obj = new Aula(); //estancia o obj com uma variavel local, new = alocação de memoria
			obj.func2(55); //chama a funçao , obs: atribuiu valor
		}
		// criar função
		static void func(int valor)
		{
			System.out.printf("\n A funcao recebeu o valor %d", valor); 
		}
		void func2(int valor)
		{
			System.out.printf("\n A funcao recebeu o valor %d", valor); 
		}
	}
	// Diferença com a ling C x Java
	//Orientada objeto não existe variaveis globais, tudo deve estar dentro da classe.

