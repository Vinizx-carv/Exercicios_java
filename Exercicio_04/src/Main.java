//Criar uma classe chamada Animal com três atributos: nome, especie, e
//idade. Em seguida, criar um método exibirAnimal() que imprime as
//informações do animal, criar um método aniversario(), que aumenta a
//idade do animal em um ano, e um método ehAdulto(), que retorna true
//se o animal for considerado adulto (defina um critério de idade para ser
//adulto ex: 5 anos) e false caso contrário.

public class Main {
    public static void main(String[] args) {

        Animal A1 = new Animal("Neuza", "Bovino", 16);
        Animal A2 = new Animal("Lino", "Canis Lupus", 17);

        A1.exibirAnimal();
        A1.Aniversario();
        System.out.println(A1.ehAdulto());
        A1.exibirAnimal();
        A1.Aniversario();
        System.out.println(A1.ehAdulto());
        A1.exibirAnimal();
        System.out.println(A1.ehAdulto());
    }
}
