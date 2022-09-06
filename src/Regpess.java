import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Regpess
{
    public ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
   

    
    /** 
     * @param pessoa
     */
    public void armazenaPessoa(Pessoa pessoa)
    {
       pessoas.add(pessoa);
    }

    public void inicializa()
    {
        try
        {
            FileInputStream f = new FileInputStream("gpessoa.txt");
            ObjectInputStream s = new ObjectInputStream(f);
                Pessoa alx;

            while (f.available() > 0) 
            {	
                alx = (Pessoa)s.readObject();
                armazenaPessoa(alx);
            }	
            s.close();
            f.close();  
        }
        
        catch (IOException e)
        { System.out.println("Fim-regpess");
       
         try
        {
         FileOutputStream  fx = new FileOutputStream("gpessoa.txt");
         ObjectOutputStream sx = new ObjectOutputStream(fx);
        
        Pessoa tt = new Pessoa("0", 0, "0", "0", "0", "0");
              sx.writeObject(tt);
          sx.close();
          fx.close();
        }
         catch (IOException ex) { System.out.println("Fim--pessoa"); }		
         catch (Exception ex) { ex.printStackTrace(); }
         
        }
        catch (Exception e) { e.printStackTrace();}
    }

    public void atualiza()
    {
        try
        {
          FileOutputStream fx = new FileOutputStream("gpessoa.txt");
          ObjectOutputStream sx = new ObjectOutputStream(fx);
        
          int i = 0;
          while (i < pessoas.size()) 
          {
              sx.writeObject(pessoas.get(i));
              i++;		
          }
     
          sx.close();
          fx.close();
        }
         //catch (IOException e) { System.out.println("Fim--pessoa"); }		
         catch (Exception e) { e.printStackTrace(); }
    }

    
    /** 
     * @param cpf
     * @param senha
     * @return Pessoa
     */
    public  Pessoa achaPessoa(String cpf, String senha)
    {
        System.out.println(pessoas.size());
        if(pessoas.size() == 0)
        {  System.out.println("aqui");
             return null;}	

             System.out.println(pessoas.size());
        int i = 0;
		while (i < pessoas.size()) 
        {	
				
          if(pessoas.get(i).getCpf().equals(cpf) && pessoas.get(i).getSenha().equals(senha))
          {
            return pessoas.get(i);
          }
          i++;
	    }	
        return null; 
	}

    
    /** 
     * @param pessoa
     * @param senha
     */
    public void atualizaSenhaPessoa(Pessoa pessoa, String senha)
    {
       Pessoa aux =  achaPessoa(pessoa.getCpf(), pessoa.getSenha());
       if(aux != null)
       {
        pessoas.remove(aux);
        pessoa.setSenha(senha);
        armazenaPessoa(pessoa);
        atualiza();
       }
    }

    
    /** 
     * @param pessoa
     */
    public void atualizaPessoa(Pessoa pessoa)
    {
       Pessoa aux =  achaPessoa(pessoa.getCpf(), pessoa.getSenha());
       if(aux != null)
       {
        pessoas.remove(aux);
        //pessoa.setEndereco(endereco);
        armazenaPessoa(pessoa);
       }
    }

    
    /** 
     * @return String
     */
    public String toString()
    {
        String retorno = "Listando os usuários cadastrados: \n";
        int i = 0;
        while(i < pessoas.size())
        {
            retorno = retorno + pessoas.get(i) + "\n";
            i++;
        }
        return retorno;
    }
      
}
    

