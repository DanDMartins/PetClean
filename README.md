# 🐾 PetClean - Sistema de Banho para Pets 🛁

Bem-vindo ao **PetClean**, um sistema simples em Java para gerenciar o banho de pets em uma máquina de banho, controlando insumos, pets e limpeza.

---

## 🚀 Funcionalidades

- 💧 Abastecer água (máximo 30 litros, 2 litros por vez)  
- 🧴 Abastecer shampoo (máximo 10 litros, 2 litros por vez)  
- 🐕 Colocar um pet na máquina (apenas 1 por vez)  
- 🛁 Dar banho consumindo insumos (10 litros de água e 2 litros de shampoo)  
- 🚪 Retirar pet da máquina  
- 🧹 Limpar a máquina (consome 3 litros de água e 1 litro de shampoo)  
- ⚠️ Impede banho se a máquina precisar de limpeza ou estiver sem insumos  

---

## 📝 Regras de Negócio

- A máquina permite apenas 1 pet por vez.  
- Se o pet for retirado antes do banho terminar, a máquina precisa ser limpa antes de usar novamente.  
- Limpeza consome insumos, e não pode ser feita sem níveis mínimos de água e shampoo.  
- O usuário é informado sobre níveis de insumos e status da máquina a todo momento.  

---

## 📁 Estrutura do Projeto

- `Pet.java` — Classe que representa o pet, com atributos de tipo, nome e estado de limpeza.  
- `MaquinaBanho.java` — Classe que controla os níveis de insumos, o pet atual, o estado da máquina e as operações de banho e limpeza.  
- `Main.java` — Classe principal que apresenta um menu interativo para o usuário executar as operações.  

---

## 💻 Como usar

1. Clone o repositório:  
   ```bash
   git clone https://github.com/seuusuario/PetClean.git
Compile os arquivos Java:

bash
Copiar
Editar
javac *.java
Execute o programa:

bash
Copiar
Editar
java Main
Siga as instruções do menu para abastecer, colocar o pet, dar banho, retirar e limpar.

📌 Exemplo de Uso
nginx
Copiar
Editar
Bem vindos ao PetClean! Por favor, seleciona uma das opções
1 - Abastecer Água
2 - Abastecer Shampoo
3 - Colocar Pet
4 - Dar Banho
5 - Retirar Pet
6 - Limpar Máquina
7 - Sair
🤝 Contribuição
Contribuições são bem-vindas! Para sugerir melhorias, abra uma issue ou envie um pull request.

📄 Licença
Este projeto está sob a licença MIT - veja o arquivo LICENSE para detalhes.

Obrigado por visitar o PetClean! 🐶🐱✨

# 🐾 PetClean - Pet Bathing System 🛁

Welcome to **PetClean**, a simple Java system to manage pet baths using a bathing machine, controlling supplies, pets, and cleaning.

---

## 🚀 Features

- 💧 Refill water (max 30 liters, 2 liters at a time)  
- 🧴 Refill shampoo (max 10 liters, 2 liters at a time)  
- 🐕 Place one pet in the machine (only one at a time)  
- 🛁 Give bath consuming supplies (10 liters water and 2 liters shampoo)  
- 🚪 Remove pet from the machine  
- 🧹 Clean the machine (consumes 3 liters water and 1 liter shampoo)  
- ⚠️ Prevent bath if the machine needs cleaning or lacks supplies  

---

## 📝 Business Rules

- The machine allows only 1 pet at a time.  
- If the pet is removed before the bath finishes, the machine must be cleaned before next use.  
- Cleaning consumes supplies and cannot be performed without minimum water and shampoo levels.  
- The user is informed about supply levels and machine status at all times.  

---

## 📁 Project Structure

- `Pet.java` — Class representing a pet, with type, name, and clean state attributes.  
- `MaquinaBanho.java` — Class controlling supply levels, current pet, machine state, and bath & cleaning operations.  
- `Main.java` — Main class presenting an interactive menu for the user to perform operations.  

---

## 💻 How to Use

1. Clone the repository:  
   ```bash
   git clone https://github.com/yourusername/PetClean.git
Compile the Java files:

bash
Copiar
Editar
javac *.java
Run the program:

bash
Copiar
Editar
java Main
Follow the menu instructions to refill, place pet, give bath, remove pet, and clean.

📌 Usage Example
vbnet
Copiar
Editar
Welcome to PetClean! Please select an option:
1 - Refill Water
2 - Refill Shampoo
3 - Place Pet
4 - Give Bath
5 - Remove Pet
6 - Clean Machine
7 - Exit
🤝 Contribution
Contributions are welcome! To suggest improvements, please open an issue or submit a pull request.

📄 License
This project is licensed under the MIT License - see the LICENSE file for details.
