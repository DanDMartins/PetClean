import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaquinaBanho maquina = new MaquinaBanho(); // criar a máquina
        Pet ragnar = new Pet("Gato", "Ragnar"); // criar o Pet

        int option = 0;
        Scanner scanner = new Scanner(System.in);

        while (option != 7) {

            System.out.println("Bem vindos ao PetClean! Por favor, seleciona uma das opções");
            System.out.println("1 - Abastecer Água");
            System.out.println("2 - Abastecer Shampoo");
            System.out.println("3 - Colocar Pet");
            System.out.println("4 - Dar Banho");
            System.out.println("5 - Retirar Pet");
            System.out.println("6 - Limpar Máquina");
            System.out.println("7 - Sair");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    maquina.fillAgua();
                    break;
                case 2:
                    maquina.fillShampoo();
                    break;
                case 3:
                    boolean colocado = maquina.putPet(ragnar);
                    if (colocado) {
                        System.out.println("Pet colocado na máquina com sucesso.");
                    } else {
                        System.out.println("Não foi possível colocar o pet na máquina.");
                    }
                    break;
                case 4:
                    boolean banho = maquina.darBanho();
                    if (banho) {
                        System.out.println("Banho concluído com sucesso.");
                    } else {
                        System.out.println("Não foi possível dar banho.");
                    }
                    break;
                case 5:
                    boolean retirado = maquina.takePet();
                    if (retirado) {
                        System.out.println("Pet retirado da máquina.");
                    } else {
                        System.out.println("Não há pet para retirar.");
                    }
                    break;
                case 6:
                    boolean limpo = maquina.limparMaquina();
                    if (limpo) {
                        System.out.println("Limpeza concluída com sucesso.");
                    } else {
                        System.out.println("Não foi possível limpar a máquina.");
                    }
                    break;
                case 7:
                    System.out.println("Encerrando o PetClean!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecionar uma das opções disponíveis!");
            }

        }
    }
}