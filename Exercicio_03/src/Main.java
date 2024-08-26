//Criar uma classe chamada Produto com três atributos: nome, preco, e
//quantidade. Criar um método exibirProduto() que mostre as informações
//do produto e criar um método vender(), que reduz a quantidade do
//produto em estoque, mas apenas se houver quantidade suficiente
//disponível.

public class  Main{
    public static void main(String[] args){

        Produto leite = new Produto("Leite",7.5F,2);
        Produto CarroDeCorrida = new Produto("CarroDeCorrida",40,2);

        leite.exibirProduto();
        leite.Vender();
        leite.exibirProduto();
        leite.Vender();
        leite.Vender();
        leite.exibirProduto();
    }
}
