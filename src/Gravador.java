import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class Gravador {
	
	/** 
	 * @param args
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException {

		String arquivo;
        ArrayList<Livro> livros = new ArrayList<Livro>();
		
		String info[] = new String[10];
			try {
				arquivo = "biblioteca.txt";
				FileReader r = new FileReader(arquivo);
				BufferedReader bf = new BufferedReader(r);

				String linha;
			//	int j = 0;
				while ((linha = bf.readLine()) != null) 
				{

					if (!linha.equals("")) 
					{
						info = linha.split("@");

						livros.add(new Livro(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4], info[5], Float.parseFloat(info[6]), Integer.parseInt(info[7]), info[8]));
						//System.out.println(livros.get(j).toString());
						//j++;
					
					}
				}
			r.close();

            FileOutputStream fx = new FileOutputStream("livraObj.txt");
		    ObjectOutputStream sx = new ObjectOutputStream(fx);

		
            //Livro al;

            int i = 0;
			//System.out.println(livros.size());
			while (i < livros.size()) 
            {
               // System.out.println(livros.get(i).toString());
				 
				sx.writeObject(livros.get(i));
                i++;
				//System.out.println(i);			
			}
			
			sx.close();
			fx.close();
		}
		catch (IOException e) { System.out.println("Fim"); }		
		catch (Exception e) { e.printStackTrace(); }

		
	}	

  
}

