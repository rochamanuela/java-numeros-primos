import java.util.ArrayList;

public class Primos {
    int numeroUsuario;
    int divisores = 0;

    public Primos(int numero) {
        this.numeroUsuario = numero;
    }

    void verificar(){
        for (int i = 1; i <= numeroUsuario; i++){
            if (numeroUsuario % i == 0){
                divisores++;
            }
        }

        if (divisores == 2){
            System.out.print("\tO número " + numeroUsuario + "\u001B[35m é primo \u001B[m");
        } else
            System.out.print("\tO número " + numeroUsuario + "\u001B[33m não é primo \u001B[m");
    }

    ArrayList<Integer> primos = new ArrayList<>();
    ArrayList<Integer> compostos = new ArrayList<>();

    void criarListas(){
        compostos.add(1);

        for (int numeroAtual = 2; numeroAtual <= numeroUsuario; numeroAtual++){
            boolean pertence = true;

            for (int i = 2; i < numeroAtual; i++){
                if (numeroAtual % i == 0) { pertence = false; }
            }

            if (pertence){ primos.add(numeroAtual); }
            else compostos.add(numeroAtual);
        }
    }

    // método para exibir a lista de números primos
    void exibirPrimos(){
        System.out.println("\n---> Lista de números primos");
        System.out.print("\t\u001B[35m[  ");
        for (int item: primos) { System.out.print(item + "  "); }
        System.out.println("]\u001B[m");
    }

    // método para exibir a lista de números compostos
    void exibirCompostos(){
        System.out.println("\n---> Lista de números compostos");
        System.out.print("\t\u001B[33m[  ");
        for (int item: compostos) {
            System.out.print(item + "  ");
        }
        System.out.println("]\u001B[m");
    }

}
