import java.util.Arrays;
/**
Podemos utilizar a classe “java.util.Arrays”, mas que não faz parte do pacote "lang" do Java. Desse modo, devemos importá-la utilizando o comando “import java.util.Arrays”, para que seja possível aplicar os recurso
**/

public class ArraySimples{
	public static void main (String [] args){
		String[] paises = {"BRASIL", "RÚSSIA", "ÍNDIA", "CHINA"};
		
		System.out.println(paises [0]);
		System.out.println(Arrays.toString (paises))
		
		int posição = Arrays.binarySearch (paises, "Brasil")
		//para realizar uma pesquisa no array, utilizamos um objeto chamado “arrays”, com o método “binarySearch” para buscar o elemento
		System.out.println (posicao)
		
		Arrays.sort (paises, 0, paises.length);//ordena o nosso array iniciando em zero
		//É  possível ordenar o array utilizando a classe “Arrays.sort()”
		System.out.println (Arrays.toString (paises));
	}
}