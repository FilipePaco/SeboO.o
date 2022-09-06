import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Acervo extends BasicAc {
    //pode-se iniciar o acervo biblioteca a cada chamada da main, mas antes irei testar criar um acervo básico a cada criação dessa classe
   
        public void cervo()
		{//a
			try
           {
				FileInputStream f = new FileInputStream("livraObj.txt");
				ObjectInputStream s = new ObjectInputStream(f);
				
				Livro alx;
				int i = 0;		
				while (f.available() > 0) 
                {	
					alx = (Livro)s.readObject();
					//JOptionPane.showMessageDialog(null, alx.toString());
                    addLivro(alx);
                   //System.out.println(acervo.getL(i)); 
                    i++;
				}	
                Livro.setQuant(i);		
				s.close();
				f.close();
			}
			catch (IOException e) { System.out.println("Fim"); }
			
			catch (Exception e) { e.printStackTrace(); }
		}

	public void atualiza()
	{
		try
		{
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
	
    public Livro getL(int i)
	{
		return livros.get(i);
	}
    
	public void addLivro(Livro livro) 
	{
		this.livros.add(livro);
	}
	//testar o adcionamento de livros
	// Método que verifica se o livro existe na lista e o remove através do parâmetro. Se o livro não constar na lista, mostra mensagem de erro.
	public void excluirLivro(Livro livro) 
	{
		for(int i = 0; i < Livro.quant(); i++)
		{
			if (livros.get(i).getTitulo().equals(livro.getTitulo()) && livros.get(i).getEdicao().equals(livro.getEdicao())) 
			{
				this.livros.remove(livros.get(i));
				Livro.delLivro();
			} 
		}	
	}
	//testar o excluimento de livros

	public String toString() 
	{
		String ac = "Aqui está a lista completa dos livros contidos em nosso acervo: \n";
		for(int i = 0; i < Livro.quant(); i++)
		{
			ac = ac + this.getL(i) + "\n";
		}	
		return ac;
	}

}
