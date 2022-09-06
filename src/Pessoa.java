import java.util.ArrayList;

public class Pessoa implements Acoes, java.io.Serializable
{
    private String nome;
    private int idade;
    private String cpf;
    private String senha;
    private Endereco endereco;
    private String email;
    private String telefone;//acervo.consulta
    private ArrayList<Livro> meuAcervo = new ArrayList<Livro>();

    

  

  public Pessoa(String nome, int idade, String cpf, String email, String telefone, String senha) 
    {
      this.nome = nome;
      this.idade = idade;
      this.cpf = cpf;
      this.email = email;
      this.telefone = telefone;
      this.senha = senha;
    }

  public Pessoa(String nome, int idade, String cpf, Endereco endereco, String email, String telefone, String senha) 
   {
      this.nome = nome;
      this.idade = idade;
      this.cpf = cpf;
      this.endereco = endereco;
      this.email = email;
      this.telefone = telefone;
      this.senha = senha;
    }

  
  /** 
   * @param livro
   * @param acervo
   */
  public void consultaval(Livro livro, Acervo acervo)
    {
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

    
    /** 
     * @param livro
     * @param acervo
     */
    public void vender(Livro livro, Acervo acervo)
    {
       acervo.addLivro(livro);
    }

   /* public void vender(Acervo acervo, int i)
    {
       Livro livro = this.meuAcervo.get(i);
       acervo.addLivro(livro);
       this.meuAcervo.remove(i);
    }*/

    public void comprar(Livro livro, Acervo acervo)
    {
        this.meuAcervo.add(livro);
        acervo.excluirLivro(livro);
    }
    
    /** 
     * @param livro
     */
    //testar adção em meu acervo
    public void comprar(Livro livro)
    {
        this.meuAcervo.add(livro);
    }

    
    /** 
     * @param titulo
     * @param acervo
     * @return String
     */
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

    
    /** 
     * @param titulo
     * @param edicao
     * @param acervo
     * @return Livro
     */
    public Livro pesquisarLivro (String titulo,String edicao, Acervo acervo)
    {
      for(int i = 0; i < Livro.quant(); i++)
      {
        if(acervo.getL(i).getTitulo().equals(titulo) && acervo.getL(i).getEdicao().equals(edicao) )
        {
           return acervo.getL(i);
        }    
      }

      return null;
    }

    
    /** 
     * @return String
     */
    public String acervoPessoal()
    {
      String retorno = "Listando os livros do acervo pessoal: \n";

      int i = 0;
      while(i < this.meuAcervo.size())
      {
        retorno = retorno + this.meuAcervo.get(i) + "\n";
        i++;
      }

      return retorno;
    }


    
    /** 
     * @return String
     */
    public String getNome() 
    {
      return nome;
    }

    
    /** 
     * @param nome
     */
    public void setNome(String nome) 
    {
      this.nome = nome;
    }

    
    /** 
     * @return int
     */
    public int getIdade() 
    {
      return idade;
    }

    
    /** 
     * @param idade
     */
    public void setIdade(int idade) 
    {
      this.idade = idade;
    }

    
    /** 
     * @return String
     */
    public String getCpf() 
    {
      return cpf;
    }

    
    /** 
     * @param cpf
     */
    public void setCpf(String cpf) 
    {
      this.cpf = cpf;
    }

    
    /** 
     * @return Endereco
     */
    public Endereco getEndereco() 
    {
      return this.endereco;
    }

    
    /** 
     * @param endereco
     */
    public void setEndereco(Endereco endereco) 
    {
      this.endereco = endereco;
    }

    
    /** 
     * @return String
     */
    public String getEmail() 
    {
      return this.email;
    }

    
    /** 
     * @param email
     */
    public void setEmail(String email) 
    {
      this.email = email;
    }

    
    /** 
     * @return String
     */
    public String getTelefone() 
    {
      return telefone;
    }

    
    /** 
     * @param telefone
     */
    public void setTelefone(String telefone) 
    {
      this.telefone = telefone;
    }

    
    /** 
     * @return String
     */
    public String getSenha() 
    {
      return senha;
    }

    
    /** 
     * @param senha
     */
    public void setSenha(String senha) 
    {
      this.senha = senha;
    }

    
    /** 
     * @return ArrayList<Livro>
     */
    public ArrayList<Livro> getMeuAcervo() {
      return meuAcervo;
    }

    
    /** 
     * @param meuAcervo
     */
    public void setMeuAcervo(ArrayList<Livro> meuAcervo) {
      this.meuAcervo = meuAcervo;
    }


    
    /** 
     * @return String
     */
    public String toString() 
    {
      return "Pessoa [cpf=" + cpf + ", email=" + email + ", endereco=" + endereco + ", idade=" + idade + ", nome="
          + nome + ", telefone=" + telefone + "]";
    }
    
}
