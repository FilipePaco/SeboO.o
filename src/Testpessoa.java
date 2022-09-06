import static org.junit.Assert.*;
import org.junit.Test;


public class Testpessoa 
{
    @Test
    public void testaAdd()
    {
        Pessoa pessoa = new Pessoa("nome", 18, "cpf"," email", "88", "senha");
        Livro livro = new Livro("TESTE", "TESTE", "TEST", "TESTE", "2000", 23.4f, 239, "TESTE");
        pessoa.comprar(livro);
        
        assertEquals(pessoa.getMeuAcervo().size(),1,0.5);
    }
}
