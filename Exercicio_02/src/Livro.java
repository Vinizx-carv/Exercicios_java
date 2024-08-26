public class Livro{
    String titulo;
    String autor;
    int numeroDePaginas;

    public void detalhesDoLivro(){
        System.out.println("Informação do livro");
        System.out.println("titulo: "+titulo);
        System.out.println("autor: "+autor);
        System.out.println("numeroDepaginas: "+ numeroDePaginas);
    }

    public Livro( String titulo,String autor, int numeroDePaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public void compararPaginas(Livro l2){
        //lógica
        if(numeroDePaginas > l2.numeroDePaginas){
            System.out.printf("True");
        }else{
            System.out.printf("False");
        }

    }
}
