
public class Acervo extends BasicAc {
    
   
        
    public Livro getL(int i)
	{
		return livros.get(i);
	}
    
    public void addLivro(Livro livro) 
	{
		this.livros.add(livro);
	}
	// Método que verifica se o livro existe na lista e o remove através do parâmetro. Se o livro não constar na lista, mostra mensagem de erro.
	public void excluirLivro(int cod) 
	{
		for(int i = 0; i < Livro.quant(); i++)
		{
			if (i == cod) 
			{
				Livro.delLivro();
				this.livros.remove(cod);
			} 
		}	
	}

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
