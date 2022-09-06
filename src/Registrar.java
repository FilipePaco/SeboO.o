import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Registrar 
{


    public ArrayList<Registro> registros = new ArrayList<Registro>();

    public void inicializa()
    {//a
        try
       {
            FileInputStream f = new FileInputStream("registro.txt");
            ObjectInputStream s = new ObjectInputStream(f);
            
            Registro alx;

            while (f.available() > 0) 
            {	
                alx = (Registro)s.readObject();
                addRegistro(alx);
            }	
            s.close();
            f.close();
        }
        catch (IOException e) { System.out.println("Fim-reg"); }
        
        catch (Exception e) { e.printStackTrace();}
    }

    public void atualiza()
    {
        try
        {
        FileOutputStream fx = new FileOutputStream("registro.txt");
        ObjectOutputStream sx = new ObjectOutputStream(fx);

        int i = 0;
        while (i < registros.size()) 
        {
            sx.writeObject(registros.get(i));
            i++;		
        }
        
        sx.close();
        fx.close();
    }
    catch (IOException e) { System.out.println("Fim--reg"); }		
    catch (Exception e) { e.printStackTrace(); }
    }


    
    /** 
     * @param registro
     */
    public void addRegistro(Registro registro) 
    {
        
       // inicializa();
        this.registros.add(registro);
        //atualiza();
    }

    
    /** 
     * @return String
     */
    public String toString() 
    {
        //inicializa();
        String ac = "Aqui está a lista completa dos registros: \n";
        for(int i = 0; i < registros.size(); i++)
        {
            ac = ac + this.registros.get(i) + "\n";
        }	
        return ac;
    }
}
