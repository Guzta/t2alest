package calculator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class LeitorDeArquivo {

	public static void main(String[] args) {

		try {
			FileInputStream arquivo = new FileInputStream("D:/mexendocomtexto.txt");
			InputStreamReader input = new InputStreamReader(arquivo);
			BufferedReader br = new BufferedReader(input);

			String linha;

			do {
				linha = br.readLine();
				if (linha != null) {
					String[] palavras = linha.split(";");
					
					System.out.println("Nova linha ------------------");
					for (int i = 0; i < palavras.length; i++) {
						System.out.println("Palavra lida = " + palavras[i]);
					}
				}
			} while (linha != null);
		} catch (Exception e) {
			System.out.println("Erro ao ler o arquivo");
		}
	}
}

// ============================================VERSÃO -
// 3============================================//
//
// ============================================VERSÃO -
// 3============================================//
// try {
// FileOutputStream arquivo = new FileOutputStream ("D:/mexendocomtexto.txt");
// PrintWriter pr = new PrintWriter(arquivo);
//
// pr.println("Linha1 Coluna1 ; Linha1 Coluna2; Linha1 Coluna3");
// pr.println("Linha2 Coluna1 ; Linha2 Coluna2; Linha2 Coluna3");
// pr.println("Linha3 Coluna1 ; Linha3 Coluna2; Linha3 Coluna3");
// }catch(Exception erro){
// System.out.print("erro ao escrever o arquivo");
// }

// ============================================VERSÃO -
// 2============================================//
// Path caminho = Paths.get("D:/expressoes.txt");
//
// try {
// byte[] texto = Files.readAllBytes(caminho);
// String leitura = new String(texto);
//
// JOptionPane.showMessageDialog(null, leitura);
// } catch(Exception erro) {
//
// }
// ============================================VERSÃO -
// 1============================================//
// Scanner ler = new Scanner(System.in);
//
// System.out.printf("Informe o nome de arquivo texto:\n");
// String nome = ler.nextLine();
//
// System.out.printf("\nConteúdo do arquivo texto:\n");
// try {
// FileReader arq = new FileReader(nome);
// BufferedReader lerArq = new BufferedReader(arq);
//
// String linha = lerArq.readLine(); // lê a primeira linha
// // a variável "linha" recebe o valor "null" quando o processo
// // de repetição atingir o final do arquivo texto
// while (linha != null) {
// System.out.printf("%s\n", linha);
//
// linha = lerArq.readLine(); // lê da segunda até a última linha
// }
//
// arq.close();
// } catch (IOException e) {
// System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
// }
//
// System.out.println();
// }
