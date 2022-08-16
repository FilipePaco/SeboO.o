import java.util.ArrayList;
public  abstract class BasicAc 
{
    public ArrayList<Livro> livros = new ArrayList<Livro>();

    abstract void addLivro(Livro livro);
    abstract void excluirLivro(int cod);
}
