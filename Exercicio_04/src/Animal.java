public class Animal {
    String nome;
    String especie;
    int idade;

    public void exibirAnimal() {
        System.out.println("Nome: " + nome);
        System.out.println("especie: " + especie);
        System.out.println("Idade: " + idade);
    }
    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }
    public void Aniversario() {
        idade++;
    }
    public boolean ehAdulto() {
        return this.idade >= 18;
    }
}
