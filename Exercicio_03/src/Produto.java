public class Produto {
    String nome;
    float preco;
    int quantidade;


    public void exibirProduto(){
        System.out.println("Nome: "+nome);
        System.out.println("Preço :"+preco);
        System.out.println("Quantidade: "+quantidade);
    }
    public Produto(String nome,float preco,int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public void Vender(){
        if(quantidade > 0){
            quantidade--;
        }else {
            System.out.println("Não tem estoque deste produto😒");
        }
    }
}
