public class Cabecalho {
    void desenhaCabecalho(){
        System.out.println();

        for (int i = 0; i < 24; i++){ System.out.print("\u001b[36m█"); }
        System.out.print("  NÚMEROS PRIMOS E COMPOSTOS  ");
        for (int i = 0; i < 24; i++){ System.out.print("\u001b[36m█"); }

        System.out.print("\u001b[m");
    }

    void textoMenu1(){
        System.out.print("\n\n---> Deseja iniciar o programa?" +
                         "\u001B[1m" +
                         "\n\t[1] - sim" +
                         "\n\t[2] - não" +
                         "\u001B[m");
    }
    void textoEntrada2(){
        //Digite um número:
        System.out.print("\n\n\u001B[35m\t[1] - Números primos \n" +
                         "\u001B[33m\t[2] - Números compostos \u001B[m");
    }
    void textoErro(){
        System.out.print("\n\u001B[31m\tEntrada inválida! \n\tIntervalo aceito: 0 a 10000\n\u001B[m");
    }
    void textoMenu2(){
        System.out.print("\n\u001B[37m——————————————————————————————————————\u001B[m\n");
        System.out.print("---> Deseja continuar o programa?" +
                "\u001B[1m" +
                "\n\t[1] - sim" +
                "\n\t[2] - não" +
                "\u001B[m");
    }
}
