import static org.junit.Assert.*;
import org.junit.Test;


public class Testaacervo 
{
    @Test
    public void testa()
    {
        Acervo acervo = new Acervo();
        Pessoa pessoa = new Pessoa("nome", 18, "cpf"," email", "88", "senha");
        Livro livro = new Livro("TESTE", "TESTE", "TEST", "TESTE", "2000", 23.4f, 239, "TESTE");
        pessoa.vender(livro, acervo);
        assertEquals(acervo.livros.size(),1,0.5);
        pessoa.comprar(livro,acervo);
        assertEquals(acervo.livros.size(),0,0.5);
        
    }
}
