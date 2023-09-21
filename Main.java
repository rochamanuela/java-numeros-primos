import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cabecalho c = new Cabecalho();
        c.desenhaCabecalho();

        Scanner tec = new Scanner(System.in);
        c.textoMenu1();
        System.out.print("\n\tDigite: ");
        int resp = tec.nextInt();

        while (resp != 2){
            System.out.print("\n---> Digite um número: ");
            int numero = tec.nextInt();

            try{
                if (numero >= 0 && numero <= 10000){
                    Primos primos = new Primos(numero);
                    primos.verificar();

                    c.textoEntrada2();
                    System.out.print("\n\tDigite: ");
                    int op = tec.nextInt();

                    if (op == 1){
                        primos.criarListas();
                        primos.exibirPrimos();
                    } else if (op == 2) {
                        primos.criarListas();
                        primos.exibirCompostos();
                    }
                }
                else c.textoErro();
            }
            catch (Exception e) {
                c.textoErro();
            }

            c.textoMenu2();
            System.out.print("\n\tDigite: ");
            resp = tec.nextInt();
        }
    }
}
