
//Exercício 2: Criar uma Classe Livro
//Criar uma classe chamada Livro com três atributos: titulo, autor, e
//numeroDePaginas. Em seguida, criar um método detalhesDoLivro() que
//exibe os detalhes do livro e criar um método compararPaginas(Livro
//outroLivro), que retorna true se o livro tiver mais páginas que o livro
//passado como parâmetro, e false caso contrário.

public class Main{
    public static void main(String[] args){

        Livro l1 = new Livro("HomemFormiga","jason starr",215);
        Livro l2 = new Livro("Misterio de eleusis","Márcio Signey",445);

        l1.detalhesDoLivro();
        l1.compararPaginas(l2);
    }
}
