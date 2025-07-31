public class MaquinaBanho {
    private boolean banhoConcluido;
    // Níveis
    private int nivelAgua;
    private int nivelShampoo;
    // Capacidades
    final int capacidadeAguaMax = 30;
    final int capacidadeShampooMax = 10;
    // Controle
    Pet petAtual;
    boolean precisaLimpeza;

    // Construtor
    public MaquinaBanho() {
        this.nivelAgua = 0;
        this.nivelShampoo = 0;
        this.petAtual = null;
        this.precisaLimpeza = false;
    }

    // Getters dos atributos que precisam ser lidos

    public int getNivelAgua() {
        return nivelAgua;
    }

    public int getNivelShampoo() {
        return nivelShampoo;
    }

    public Pet getPetAtual() {
        return petAtual;
    }

    public boolean isPrecisaLimpeza() {
        return precisaLimpeza;
    }

    // Adicionar o metodo para abastecer a agua
    public void fillAgua(){
        if (nivelAgua <= capacidadeAguaMax - 2){
            nivelAgua += 2;
            System.out.println("Água adicionada. Nível atual: " + nivelAgua);
        } else {
            System.out.println("Não é possível adicionar mais água. Nível Atual: " + nivelAgua);
        }
    }

    // Adicionar o metodo para abastecer shampoo
    public void fillShampoo(){
        if (nivelShampoo <= capacidadeShampooMax - 2){
            nivelShampoo += 2;
            System.out.println("Shampoo adicionado. Nível atual: " + nivelShampoo);
        } else {
            System.out.println("Não é possível adicionar mais shampoo. Nível Atual: " + nivelShampoo);
        }
    }

    // Adicionar o metodo para colocar o pet na maquina
    boolean putPet(Pet pet){
        boolean podeEntrar = true;
        // Como queremos checar as condições de forma independente, nao utilizamos else-if
        if (petAtual != null){
            System.out.println("A máquina está ocupada!");
            podeEntrar = false;
        }
        if (precisaLimpeza){
            System.out.println("A máquina precisa ser limpa antes de receber um novo Pet!");
            podeEntrar = false;
        }
        if (nivelAgua < 10){
            System.out.println("A máquina não possui Água suficiente para um novo banho.");
            podeEntrar = false;
        }
        if (nivelShampoo < 2){
            System.out.println("A máquina não possui Shampoo suficiente para um novo banho.");
            podeEntrar = false;
        }
        if (podeEntrar){
            petAtual = pet;
            precisaLimpeza = true;
            return true;
        }
        return false;
    }

    // Adicionar o metodo para retirar o pet da maquina
    boolean takePet(){
        boolean podeTirar = true;
        // Checar condições
        if (petAtual == null){
            System.out.println("A máquina está vazia!");

            podeTirar = false;

        } else if (banhoConcluido) {
            System.out.println("Pet retirado com sucesso!");
            System.out.println("Nível de água: " + nivelAgua + "\nNível de Shampoo: " + nivelShampoo);
            if (nivelAgua >= 10 && nivelShampoo >= 2) {
                System.out.println("Máquina pronta para banho.");
            } else {
                System.out.println("Abasteça a máquina.");
            }
            petAtual = null;
        } else {
            System.out.println("Pet retirado antes do banho terminar. Será necessário limpar a máquina");

            petAtual.setLimpo(false);
            precisaLimpeza = true;
            petAtual = null;
        }
        return podeTirar;
    }

    // Adicionar o metodo para dar banho, seguindo as regras de negócio

    boolean darBanho(){
        banhoConcluido = false;
        if (petAtual == null){
            System.out.println("A máquina está vazia! Coloque o Pet para iniciar o banho.");

            return false;
        }
        if (nivelAgua < 10 || nivelShampoo < 2){
            System.out.println("Sem insumos necessários. Por favor, abasteça a máquina!");

            return false;
        }
        nivelAgua -= 10;
        nivelShampoo -= 2;
        banhoConcluido = true;
        petAtual.setLimpo(true);

        System.out.println("Banho realizado com sucesso!");
        System.out.println("Níveis atuais = \nÁgua = " + nivelAgua + "\nShampoo = " + nivelShampoo);

        return true;
    }

    // Adicionar o metodo de limpar a maquina

    boolean limparMaquina(){
        if (!precisaLimpeza){
            System.out.println("A máquina não precisa de limpeza");

            return false;
        }
        if (nivelAgua < 3 || nivelShampoo < 1 ){
            System.out.println("Não há insumos suficientes para limpeza. Abasteça a máquina");

            return false;
        }
        nivelAgua -= 3;
        nivelShampoo -= 1;
        precisaLimpeza = false;

        System.out.println("Limpeza realizada com Sucesso!");

        return true;
    }


}
