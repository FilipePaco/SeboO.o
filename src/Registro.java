
import java.util.Calendar;
import java.io.Serializable;

public class Registro implements Serializable
{
    private static int cod;
    private Pessoa pessoa;
    private String operacao;
    private String data;
    private Livro livro;
    
    public Registro(Pessoa pessoa, String operacao, Livro livro) 
    {
        cod++;
        Calendar c = Calendar.getInstance();
        this.pessoa = pessoa;
        this.operacao = operacao;
        this.data = String.valueOf(c.getTime());
        this.livro = livro;
    }

    
    /** 
     * @return int
     */
    public static int getCod() {
        return cod;
    }


    
    /** 
     * @param cod
     */
    public static void setCod(int cod) {
        Registro.cod = cod;
    }


    
    /** 
     * @return Pessoa
     */
    public Pessoa getPessoa() {
        return pessoa;
    }


    
    /** 
     * @param pessoa
     */
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }


    
    /** 
     * @return String
     */
    public String getOperacao() {
        return operacao;
    }


    
    /** 
     * @param operacao
     */
    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    
    /** 
     * @return String
     */
    public String getData()
    {
       return data;
    } 

   
   /** 
    * @param data
    */
   public void setData(String data) 
   {
       this.data = data;
   }

   
   /** 
    * @return Livro
    */
   public Livro getLivro() 
   {
    return livro;
   }

   
   /** 
    * @param livro
    */
   public void setLivro(Livro livro) 
   {
    this.livro = livro;
   }


/** 
 * @return String
 */
@Override
    public String toString() 
    {
        return "Registro " + cod + "\n[\n| data=" + data + ", \n| livro=\n" + livro + "\n| operacao=" + operacao + "\n| pessoa=" + pessoa + "]";
    } 
}
