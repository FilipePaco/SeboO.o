

public class Pessoa implements Acoes 
{
    private String nome;
    private int idade;
    private String cpf;
    private Endereco endereco;
    private String email;
    private String telefone;//acervo.consulta

    

  public Pessoa(String nome, int idade, String cpf, String email, String telefone) 
    {
      this.nome = nome;
      this.idade = idade;
      this.cpf = cpf;
      this.email = email;
      this.telefone = telefone;
    }

  public Pessoa(String nome, int idade, String cpf, Endereco endereco, String email, String telefone) 
   {
      this.nome = nome;
      this.idade = idade;
      this.cpf = cpf;
      this.endereco = endereco;
      this.email = email;
      this.telefone = telefone;
    }

  public void consultaval(Livro livro, Acervo acervo)
    {
     // JOptionPane.showMessageDialog(null,"Para vender um livro você precisaá informar suas caracteristicas para avaliarmos sua conservação e o preço que estamos dispostos a pagar"); 
     // JOptionPane.showInputDialog("Qual o título do livro que deseja vender?"); 
        if(livro.getNumpag() < 100)
        {
            livro.setPreco(15); 
        }
        else if (livro.getNumpag() >= 100 || livro.getNumpag() <= 300 )
        {
            livro.setPreco(20); 
        }
        else if (livro.getNumpag() > 300)
        {
            livro.setPreco(30); 
        }
    }

    public void vender(Livro livro, Acervo acervo)
    {
     // JOptionPane.showMessageDialog(null,"Para vender um livro você precisaá informar suas caracteristicas para avaliarmos sua conservação e o preço que estamos dispostos a pagar"); 
     // JOptionPane.showInputDialog("Qual o título do livro que deseja vender?"); 
       
       acervo.addLivro(livro);
    }

    public boolean comprar(int cod, Acervo acervo)
    {
      if(cod <= Livro.quant())
      {
        acervo.excluirLivro(cod);
        return true;
      }
      return false;
    }

   /* private Livro pesquisarLivro(Livro livro,Acervo acervo)
    {

      for(int i = 0; i < Livro.quant(); i++)
      {
        if(livro == acervo.getL(i))
        {
          return true;
        }
      }
      return false;
    }*/

    public String pesquisar (String titulo, Acervo acervo)
    {
      String lista= "Listando livros que possuem esse título:\n";

      for(int i = 0; i < Livro.quant(); i++)
      {
        if(acervo.getL(i).getTitulo().equals(titulo))
        {
           lista = lista + acervo.getL(i) + "\n";
        }    
      }
      return lista;
    }

    public String getNome() 
    {
      return nome;
    }

    public void setNome(String nome) 
    {
      this.nome = nome;
    }

    public int getIdade() 
    {
      return idade;
    }

    public void setIdade(int idade) 
    {
      this.idade = idade;
    }

    public String getCpf() 
    {
      return cpf;
    }

    public void setCpf(String cpf) 
    {
      this.cpf = cpf;
    }

    public Endereco getEndereco() 
    {
      return endereco;
    }

    public void setEndereco(Endereco endereco) 
    {
      this.endereco = endereco;
    }

    public String getEmail() 
    {
      return email;
    }

    public void setEmail(String email) 
    {
      this.email = email;
    }

    public String getTelefone() 
    {
      return telefone;
    }

    public void setTelefone(String telefone) 
    {
      this.telefone = telefone;
    }

    public String toString() 
    {
      return "Pessoa [cpf=" + cpf + ", email=" + email + ", endereco=" + endereco + ", idade=" + idade + ", nome="
          + nome + ", telefone=" + telefone + "]";
    }
    
}
