import java.util.Scanner;

public class vetores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Defina o tamanho do vetor: ");
        int quantidade = entrada.nextInt();
        int[] grupoNumeros = new int[quantidade];


        System.out.println("Defina os valores do vetor:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Número na posição " + i + ": ");
            grupoNumeros[i] = entrada.nextInt();
        }


        int somaTotal = 0;
        for (int i = 0; i < quantidade; i++) {
            somaTotal += grupoNumeros[i];
        }


        double mediaNumeros = (double) somaTotal / quantidade;


        int maiorNumero = grupoNumeros[0];
        for (int i = 1; i < quantidade; i++) {
            if (grupoNumeros[i] > maiorNumero) {
                maiorNumero = grupoNumeros[i];
            }
        }


        int menorNumero = grupoNumeros[0];
        for (int i = 1; i < quantidade; i++) {
            if (grupoNumeros[i] < menorNumero) {
                menorNumero = grupoNumeros[i];
            }
        }


        System.out.println("Soma de todos os valores do vetor: " + somaTotal);
        System.out.println("Média de todos os valores do vetor: " + mediaNumeros);
        System.out.println("O maior valor do vetor: " + maiorNumero);
        System.out.println("O menor valor do vetor: " + menorNumero);


        System.out.print("Digite a posição para substituir: ");
        int posicao1 = entrada.nextInt();
        System.out.print("Digite o novo valor para essa posição: ");
        grupoNumeros[posicao1] = entrada.nextInt();

        System.out.print("Digite a segunda posição para substituir: ");
        int posicao2 = entrada.nextInt();
        System.out.print("Digite o novo valor para essa posição: ");
        grupoNumeros[posicao2] = entrada.nextInt();


        somaTotal = 0;
        for (int i = 0; i < quantidade; i++) {
            somaTotal += grupoNumeros[i];
        }
        mediaNumeros = (double) somaTotal / quantidade;


        System.out.println("Soma dos valores após as substituições: " + somaTotal);
        System.out.println("Média dos valores após as substituições: " + mediaNumeros);

        entrada.close();
    }
}
