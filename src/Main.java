import javax.swing.JOptionPane;

public class Main 
{
    public static void main(String[] args)
    {

       // int op = 0;
        int opcao = 7;
        Acervo acervo = new Acervo();
        Livro livro1 = new Livro("Abela", "James rs", "Petroccio", "Bp", "2021", 49.99f, 230, "Terror");
        acervo.addLivro(livro1);
        Livro livro2 = new Livro("Abela", "James rs", "Petroccio", "Bp", "1940", 79.99f, 340, "Terror");
        acervo.addLivro(livro2);
        Livro livro3 = new Livro("Abela", "James rs", "Petroccio", "Bp", "1817", 341.99f, 420, "Terror");
        acervo.addLivro(livro3);
        Livro livro4 = new Livro("Onde há Doutores", "JRick gk.l", "Marcia", "Arq", "2010", 35.99f, 143, "Autoajuda");
        acervo.addLivro(livro4);
        Livro livro5 = new Livro("Jogos do klark", "Herdiond Jules", "Robert", "Wcs", "1988", 200.99f, 700, "Terror | Suspense");
        acervo.addLivro(livro5);

       // JOptionPane.showMessageDialog(null,acervo);

        
     

           String nome = JOptionPane.showInputDialog("Insira seu nome: ");
           int idade =  Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));
           String cpf = JOptionPane.showInputDialog("Insira o seu cpf: ");
           String email = JOptionPane.showInputDialog("Insira seu email: ");
           String telefone = JOptionPane.showInputDialog("Insira seu telefone: ");
           
           Pessoa pessoa = new Pessoa(nome, idade, cpf, email, telefone);
          
        while(opcao != 0)
        {
           
           // op++; 
            menu();
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção"));
        
            switch(opcao)
            {
                case 1: 
                //compra livro
               String titulo = new String (JOptionPane.showInputDialog(null,"Digite o nome do livro que deseja comprar")); 
               JOptionPane.showMessageDialog(null, pessoa.pesquisar(titulo,acervo)); 

               int esc = Integer.parseInt(JOptionPane.showInputDialog("Deseja comprar qual livro? Digite -1 para cancelar a operação"));
               if(esc != -1 )
               {
                String rua = JOptionPane.showInputDialog("Insira o nome da sua rua");
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero da sua moradia"));
                String cep = JOptionPane.showInputDialog("Insira o CEP de sua moradia");
                String bairro = JOptionPane.showInputDialog("Qual o bairro de sua moradia?");
                String cidade = JOptionPane.showInputDialog("Em qual cidade você mora?");
                String estado = JOptionPane.showInputDialog("Diga também o Estado em que você reside: ");
                String pais = JOptionPane.showInputDialog("Por fim, diga-nos o país em que você mora");

                Endereco endereco = new Endereco(rua, numero, cep, bairro, cidade, estado, pais);
                pessoa.setEndereco(endereco);

               int sim = Integer.parseInt(JOptionPane.showInputDialog("Finalizaremos sua compra em um instante,enviaremos o livro: \n" + acervo.getL(esc) + "\n Para o seguinte endereço: " + pessoa.getEndereco() + "\n Está tudo correto?"));
                if(sim == 1 )
                {
                   if(pessoa.comprar(esc, acervo))
                   {
                    JOptionPane.showMessageDialog(null,"Operação cncluída com sucesso");
                   }
                   else
                   {
                    JOptionPane.showMessageDialog(null,"Operação falhou, por favor, digite um código de um livro que esteja contido na lista");
                   }
                }
                JOptionPane.showMessageDialog(null,acervo);
                
               }
               
                break;
/////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 2:
                //vende livro
                String titulo1 = JOptionPane.showInputDialog("Insira o titulo do livro que deseja vender");
                String autor = JOptionPane.showInputDialog("Qual o autor do livro que deseja inserir?");
                String ilustrador = JOptionPane.showInputDialog("Qual o ilustrador do livro que deseja inserir?");
                String editora = JOptionPane.showInputDialog("Qual a editora do livro que deseja inserir?");
                String edicao = JOptionPane.showInputDialog("Qual a edição do livro que deseja inserir?");
                int numpag = Integer.parseInt(JOptionPane.showInputDialog("Quantas paginas tem o livro que deseja inserir?"));
                String categoria = JOptionPane.showInputDialog("Qual a categoria do livro que deseja inserir?");

                Livro livro = new Livro(titulo1, autor, ilustrador, editora, edicao, numpag, categoria);



                int a = Integer.parseInt(JOptionPane.showInputDialog("Há quantos anos você adquiriu esse livro?"));
                int b = Integer.parseInt(JOptionPane.showInputDialog("Quando você adquiriu o livro, ele ja era usado? Digite 1 se sim e 0 se não"));//ja era usado
                int c = Integer.parseInt(JOptionPane.showInputDialog("Se pudesse dar um valor de 0 à 10 para o estado de conservação do seu livro, qual seria?"));//sinceridade
                livro.avaliacao(a, b, c);
                if(livro.getEstado() == 0)
                {
                    JOptionPane.showMessageDialog(null, "Cuidado, nos avaliamos seu livro e supomos que ele não esteja dos criterios mínimos para continuar a venda, mas você o avaliou de maneira alta em seu estado de conservação\nPor isso, te daremos apenas uma advertência e a possibilidade de enviar a foto do livro no seguinte email  para avaliarmos melhor:\n");
                }
                else if(livro.getEstado() == 1)
                {
                    JOptionPane.showMessageDialog(null, "Parabéns, nos avaliamos seu livro e supomos que ele não esteja dos criterios mínimos para continuar a venda, mas você o avaliou de maneira consistente em seu estado de conservação\nPor isso, te daremos a possibilidade de enviar a foto do livro no seguinte email  para avaliarmos melhor:\n");
                }
                else if(livro.getEstado() == 2 || livro.getEstado() == 3)
                {
                    JOptionPane.showMessageDialog(null, "Parabéns, nos avaliamos seu livro e supomos que ele  esteja nos criterios mínimos para continuar a venda, e você o avaliou de maneira consistente em seu estado de conservação\nPor isso, agora faremos a avaliação do valor que estamos dispostos a pagar pelo seu livro\n");
                }

                pessoa.consultaval(livro, acervo);
                int venda = Integer.parseInt(JOptionPane.showInputDialog("Nós avaliamos seu livro em " + livro.getPreco()+"R$\n Gostaria de vendê-lo?" )) ;
                if(venda == 1)
                {
                    pessoa.vender(livro, acervo);
                }
                break;
////////////////////////////////////////////////////////////////////////////////////////////
                case 3:
                String titulo2 = new String (JOptionPane.showInputDialog("Insira o titulo do livro que deseja pesuisar"));
                JOptionPane.showMessageDialog(null, pessoa.pesquisar(titulo2,acervo)); 
                //pesquisa livro
                break;

                case 0:
                JOptionPane.showMessageDialog(null,"Obrigado por utilizar nosso sistema!");
                //finaliza o programa
                break;

                default:
                JOptionPane.showMessageDialog(null,"Digite uma opção válida!");
                break;
            }
            
        }
    }

   static void menu()
    {
        JOptionPane.showMessageDialog(null,"1- Comprar um livro\n2- Vender um livro\n3- Pesquisar um livro\n0- Finaliza o programa");
    }
    
}
