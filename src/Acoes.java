public interface Acoes 
{
    void vender(Livro livro, Acervo acervo);
    boolean comprar(int cod, Acervo acervo);
    String pesquisar(String titulo, Acervo acervo);
}
