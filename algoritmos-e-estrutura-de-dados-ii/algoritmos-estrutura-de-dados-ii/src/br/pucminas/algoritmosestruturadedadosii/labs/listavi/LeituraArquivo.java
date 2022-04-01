package br.pucminas.algoritmosestruturadedadosii.labs.listavi;

public class LeituraArquivo {

	public static void main(String[] args) {
		// adicionar um try ... catch para tratar a excessao
		//ArquivoTextoLeitura input = new ArquivoTextoLeitura("/home/sinaide/temp/TesteLeitura.txt"); //caminho completo par a acesso em outro diretório
		ArquivoTextoLeitura input = new ArquivoTextoLeitura("TesteLeitura.txt"); //arquivo no diretorio src
		
		String lines = input.ler();
		String aux   = "";
		while (lines != null) {
			MyIO.println(lines);
			aux  += lines +"\n";
			lines = input.ler();
		}
		aux = aux.substring(0, aux.length()-1);//eliminar o último \n
		//String nameArq = "TesteEscrita.txt";
		MyIO.println("Informe um nome para o arquivo de saída: ");
		String nameArq = MyIO.readLine();
		ArquivoTextoEscrita output = new ArquivoTextoEscrita(nameArq);
		output.escrever(aux);
		output.fecharArquivo();
		MyIO.println("Programa finalizado!");
	}
}
