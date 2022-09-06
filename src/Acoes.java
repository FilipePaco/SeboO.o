public interface Acoes 
{
    void vender(Livro livro, Acervo acervo);
    void comprar(Livro livro, Acervo acervo);
    String pesquisar(String titulo, Acervo acervo);
}
