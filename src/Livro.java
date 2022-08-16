
public class Livro 
{
    private static int quant;

    private int estado;
    private String titulo;
    private String autor;
    private String ilustrador;
    private String editora;
    private String edicao;
    private float preco;
    private int numpag;
    private String categoria;
    private int cod = quant;

    

    public Livro(String titulo, String autor, String ilustrador, String editora, String edicao, int numpag,
            String categoria) {
        quant++; 
        this.titulo = titulo;
        this.autor = autor;
        this.ilustrador = ilustrador;
        this.editora = editora;
        this.edicao = edicao;
        this.numpag = numpag;
        this.categoria = categoria;
    }

    public Livro(String titulo, String autor, String ilustrador, String editora, String edicao, float preco, int numpag,String categoria) 
    {
        quant++;
        this.titulo = titulo;
        this.autor = autor;
        this.ilustrador = ilustrador;
        this.editora = editora;
        this.edicao = edicao;
        this.preco = preco;
        this.numpag = numpag;
        this.categoria = categoria;
    }

    public Livro(int estado, String titulo, String autor, String ilustrador, String editora, String edicao, float preco, int numpag, String categoria) 
    {
        quant++;
        this.estado = estado;
        this.titulo = titulo;
        this.autor = autor;
        this.ilustrador = ilustrador;
        this.editora = editora;
        this.edicao = edicao;
        this.preco = preco;
        this.numpag = numpag;
        this.categoria = categoria;
    }

    public String getAutor() 
    {
        return autor;
    }

    public String getCategoria() 
    {
        return categoria;
    }

    public String getEdicao() 
    {
        return edicao;
    }

    public String getEditora() 
    {
        return editora;
    }

    public int getEstado() 
    {
        return estado;
    }

    public String getIlustrador()
    {
        return ilustrador;
    }

    public int getNumpag() 
    {
        return numpag;
    }

    public float getPreco()
    {
        return preco;
    }

    public String getTitulo() 
    {
        return titulo;
    }

    public void setAutor(String autor) 
    {
        this.autor = autor;
    }

    public void setCategoria(String categoria)
    {
        this.categoria = categoria;
    }

    public void setEdicao(String edicao) 
    {
        this.edicao = edicao;
    }

    public void setEditora(String editora)
    {
        this.editora = editora;
    }

    public void setEstado(int estado)
    {
        this.estado = estado;
    }

    public void setIlustrador(String ilustrador)
    {
        this.ilustrador = ilustrador;
    }

    public void setNumpag(int numpag) 
    {
        this.numpag = numpag;
    }

    public void setPreco(float preco) 
    {
        this.preco = preco;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }
    
    void avaliacao(int a, int b, int c)
    {

       // System.out.println("As perguntas a seguir serão avaliadas por um complexo programa de computador "
      //  + "por favor, responda com sinceridade para não correr risco de ter seu cadastro suspenso ou excluído permanentemente!");
       
    // int a = Integer.parseInt(JOptionPane.showInputDialog("Há quantos anos voce utiliza este livro que deseja vender?"));//anos de uso
    // int b = Integer.parseInt(JOptionPane.showInputDialog("Quando você adquiriu o livro, ele ja era usado? Digite 1 se sim e 0 se não"));//ja era usado
   //  int c = Integer.parseInt(JOptionPane.showInputDialog("Se pudesse dar um valor de 0 à 10 para o estado de conservação do seu livro, qual seria?"));//sinceridade

     if(b == 1)//se ja era usado entao vale menos provavelmente
     {
        if(a > 5)//então temos um máximo de quatro anos de uso continuo(leitura ao menos semanal do livro) para poder estar conservado
        {
           
            if(c > 6)
            { 
                this.estado = 0;
                //JOptionPane.showMessageDialog(null, "Cuidado, nos avaliamos seu livro e supomos que ele não esteja dos criterios mínimos para continuar a venda, mas você o avaliou de maneira alta em seu estado de conservação\nPor isso, te daremos apenas uma advertência e a possibilidade de enviar a foto do livro no seguinte email  para avaliarmos melhor:\n");
                //É incoerente uma alta avaliação com livros utilizados a muito tempo, a não ser que sejam clássicos ou bem cuidados, algo que sera avaliado por foto
            }
            else
            {
                this.estado = 1;
               // JOptionPane.showMessageDialog(null, "Parabéns, nos avaliamos seu livro e supomos que ele não esteja dos criterios mínimos para continuar a venda, mas você o avaliou de maneira consistente em seu estado de conservação\nPor isso, te daremos a possibilidade de enviar a foto do livro no seguinte email  para avaliarmos melhor:\n");
                //Avaliação coerente, chance de enviar a foto pela sinceridade
            }
        }
        else
        {
           if( c > 2 && c <= 6)
           {
            this.estado = 1;
            //influencia do proprio usuário no estado do livro
           }
           else if (c > 6)
           {
            this.estado = 2;
            //limitado a dois pois é um livro de segunda mão que está sendo avaliado
           }
           // JOptionPane.showMessageDialog(null, "Parabéns, nos avaliamos seu livro e supomos que ele  esteja nos criterios mínimos para continuar a venda, e você o avaliou de maneira consistente em seu estado de conservação\nPor isso, agora faremos a avaliação do valor que estamos dispostos a pagar pelo seu livro\n");
        }
     }

     
     if(b == 0)
     {
        if(a > 10)
        {  
            if(c > 6)
            {
                this.estado = 0;
               // JOptionPane.showMessageDialog(null, "Cuidado, nos avaliamos seu livro e supomos que ele não esteja dos criterios mínimos para continuar a venda, mas você o avaliou de maneira alta em seu estado de conservação\nPor isso, te daremos apenas uma advertência e a possibilidade de enviar a foto do livro no seguinte email  para avaliarmos melhor:\n");
            }
            else
            {
                this.estado = 1;
               // JOptionPane.showMessageDialog(null, "Parabéns, nos avaliamos seu livro e supomos que ele não esteja dos criterios mínimos para continuar a venda, mas você o avaliou de maneira consistente em seu estado de conservação\nPor isso, te daremos a possibilidade de enviar a foto do livro no seguinte email  para avaliarmos melhor:\n");
            }
        }
        else
        {
           if(c <= 6)
           {
            this.estado = 1;
           }
           else if (c > 6)
           {
            this.estado = 3;
           }
           // JOptionPane.showMessageDialog(null, "Parabéns, nos avaliamos seu livro e supomos que ele  esteja nos criterios mínimos para continuar a venda, e você o avaliou de maneira consistente em seu estado de conservação\nPor isso, agora faremos a avaliação do valor que estamos dispostos a pagar pelo seu livro\n");
        }
     }
    }

    public static int quant()
    {
        return quant;
    }
    public static void delLivro()
    {
        quant = quant - 1;
    }

    public String toString()
    {
        return "Codigo do livro: " + cod +" - Titulo do livro: " + titulo + "  - Autor do livro: " + autor + "   - Ilustrador: " + ilustrador + "   - Editora: " + editora + "   - Edição: " + edicao 
        + "  Preço do livro: " + preco + "R$" + "   Numero de paginas: " + numpag + "   Categoria: " + categoria;
    }
}
