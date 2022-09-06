
import javax.swing.JDialog;
import javax.swing.JOptionPane;

//Temos testes em Pessoa, Acervo e Livro.

public class Main 
{
    public static void main(String[] args) throws ClassNotFoundException
    {
       // int op = 0;
        String opcao = "null";
        Acervo acervo = new Acervo();
        acervo.cervo();  
        JDialog.setDefaultLookAndFeelDecorated(true);   
        Pessoa pessoa = null;
        Registrar registrar = new Registrar();
        registrar.inicializa();
        Regpess pessoas = new Regpess();
        pessoas.inicializa();
       
        
			
        //JOptionPane.showMessageDialog(null,Livro.quant());
        while(true)
        {
        
        if(opcao.equals("5"))
        {break;}

        while(pessoa == null )
        {
           pessoa = pessoa(pessoas);
           if(pessoa == null)
           {
            JOptionPane.showMessageDialog(null,"Usuário ou senha incorretos");
           }
        }
             
           if (pessoa.getNome().equals("0") && pessoa.getCpf().equals("0"))
           {
            break;
           }

           if(pessoa.getNome().equals("Alype"))
           {
            opcao = menuAdmin();
           }
           else
           {
            opcao = menu();
           }
             
        
            switch(opcao)
            {
                case "0": 
                //compra livro
                comprar(pessoa,acervo,registrar,pessoas);
               // JOptionPane.showMessageDialog(null,acervo);
                break;
/////////////////////////////////////////////////////////////////////////////////////////////////////////
                case "1":
                //vende livro
                vender(pessoa,acervo,registrar);
                break;
////////////////////////////////////////////////////////////////////////////////////////////
                case "2":
                String titulo2 = new String (JOptionPane.showInputDialog("Insira o titulo do livro que deseja pesuisar"));
                JOptionPane.showMessageDialog(null, pessoa.pesquisar(titulo2,acervo)); 
                //pesquisa livro
                break;
/////////////////////////////////////////////////////////////////////////////////////////
                case "3":
                //JOptionPane.showMessageDialog(null,acervo);
                System.out.println(acervo); 
                //pesquisa livro
                break;
///////////////////////////////////////////////////////////////////////////////////////////
//ver acervo pessoal  e alterar dados pessoais
                case "4":
                pessoal(pessoa,pessoas); 
                registrar.atualiza();
               
                break;
///////////////////////////////////////////////////////////////////////////////////////////
                case "5":
                JOptionPane.showMessageDialog(null,"Obrigado por utilizar nosso sistema!");
                acervo.atualiza();  
               
                //finaliza o programa
                break;
///////////////////////////////////////////////////////////////////////////////////////////
               case "6":
               JOptionPane.showMessageDialog(null,registrar);
                           
                //mostra o registro
                break;
///////////////////////////////////////////////////////////////////////////////////////////
               case "7":
               JOptionPane.showMessageDialog(null,pessoas);
                           
                //mostra o registro
                break;
///////////////////////////////////////////////////////////////////////////////////////////
                default:
                JOptionPane.showMessageDialog(null,"Digite uma opção válida!");
                break;
            }
            
        }
    }



    static String menuPessoa()
    {
                 Object[] options1 = {"Sim",
                 "Não",
                 "Cancelar",
                 "Admin"};

                Object selecionar = JOptionPane.showOptionDialog(null,
                 "Já é um usuário cadastrado?",
                 "SeboO.o",
                 JOptionPane.YES_NO_CANCEL_OPTION,
                 JOptionPane.PLAIN_MESSAGE,
                 null,
                 options1,
                 null);

                 return String.valueOf(selecionar);

    }

   static String menu()
    {
        // "\n1- Comprar um livro\n2- Vender um livro\n3- Pesquisar um livro\n4-Consultar acervo\n0- Finaliza o programa";
        Object[] options1 = {"Comprar",
        "Vender",
        "Pesquisar",
        "Acervo",
        "Pessoal",
         "Sair"};

        Object selecionar = JOptionPane.showOptionDialog(null,
        "Escolha uma opção!",
        "SeboO.o",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE,
        null,
        options1,
        null);

        return String.valueOf(selecionar);
    }

    static int menuYN(String mensagem)
    {
        // "\n1- Comprar um livro\n2- Vender um livro\n3- Pesquisar um livro\n4-Consultar acervo\n0- Finaliza o programa";
        Object[] options1 = {"Sim",
        "Não",};

Object selecionar = JOptionPane.showOptionDialog(null,
        mensagem,
        "SeboO.o",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE,
        null,
        options1,
        null);

        return Integer.parseInt(String.valueOf(selecionar));
    }

    static String menuAdmin()
    {
        // "\n1- Comprar um livro\n2- Vender um livro\n3- Pesquisar um livro\n4-Consultar acervo\n0- Finaliza o programa";
        Object[] options1 = {"Comprar",
        "Vender",
        "Pesquisar",
        "Acervo",
        "Pessoal",
         "Sair",
         "Registro de Operações",
         "Registro de usuários"};

       Object selecionar = JOptionPane.showOptionDialog(null,
        "Escolha uma opção!",
        "SeboO.o- Administradores",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE,
        null,
        options1,
        null);

        return String.valueOf(selecionar);
    }
    
    static Pessoa pessoa(Regpess pessoas)
    {
        
        String escolhe = menuPessoa();
        if(escolhe.equals("1"))
        {
            String nome = JOptionPane.showInputDialog("Insira seu nome: ");
            int idade =  Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));
            String cpf = JOptionPane.showInputDialog("Insira o seu cpf: ");
            String email = JOptionPane.showInputDialog("Insira seu email: ");
            String telefone = JOptionPane.showInputDialog("Insira seu telefone: ");
            String senha = JOptionPane.showInputDialog("Insira uma senha: ");
            Pessoa pessoa = new Pessoa(nome, idade, cpf, email, telefone, senha);

           pessoas.armazenaPessoa(pessoa);
           pessoas.atualiza();
           return pessoa;
        }
        else if(escolhe.equals("0"))
        {
          String  cpf = JOptionPane.showInputDialog("Insira seu cpf cadastrado");
          String  senha = JOptionPane.showInputDialog("Insira a sua senha de usuário");
          Pessoa  pessoa =  pessoas.achaPessoa(cpf, senha);

          return pessoa;
        }
        else if (escolhe.equals("3"))
        {
            String senha = JOptionPane.showInputDialog("Insira a sua senha de administrador");
            if(senha.equals("Adm@1"))
            {
                Pessoa pessoa = new Pessoa("Alype", 23, "654.123.789-01", "Al@gmail.com", "99999999", "Adm@1");
                return pessoa;
            }
            else
            {
                return null;
            }

        }
        else 
        {
          JOptionPane.showMessageDialog(null,"Obrigado por utilizar nosso sistema!" + escolhe);
          Pessoa pessoa = new Pessoa("0", 00000, "0", "0", "0", "0");

          return pessoa; 
        }
    }

    static void pessoal(Pessoa pessoa, Regpess pessoas)
    {
        Object[] options1 = 
        {
        "Ver acervo pessoal",
        "Alterar informações pessoais",
        "Ver meu perfil"
        };

       Object selecionar = JOptionPane.showOptionDialog(null,
        "Escolha uma opção!",
        "SeboO.o- Pessoal",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE,
        null,
        options1,
        null);   
        
      String op = String.valueOf(selecionar);
      if(op.equals("0"))
      {
        JOptionPane.showMessageDialog(null, pessoa.acervoPessoal());
      }
      else if(op.equals("1"))
      {
        Object[] options2 = 
        {
        "Alterar senha",
        "Alterar endereço"
        };

       Object selec = JOptionPane.showOptionDialog(null,
        "Escolha uma opção!",
        "SeboO.o- Pessoal",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE,
        null,
        options2,
        null);   
        
      String o = String.valueOf(selec);
         
        if(o.equals("0"))
        {
            String senha = JOptionPane.showInputDialog("Insira uma senha: ");
            String senhac = JOptionPane.showInputDialog("Confirme sua senha: "); 
            while(!senha.equals(senhac))
            {
                JOptionPane.showMessageDialog(null,"Senhas diferentes!");
                senha = JOptionPane.showInputDialog("Insira uma senha: ");
                senhac = JOptionPane.showInputDialog("Confirme sua senha: "); 
            }

            if(senha.equals(senhac))
            {
                JOptionPane.showMessageDialog(null, "Senha atualizada com sucesso");
                pessoas.atualizaSenhaPessoa(pessoa, senha);
                pessoas.atualiza();
            }
        }
        else if(o.equals("1"))
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
         pessoas.atualizaPessoa(pessoa);
         pessoas.atualiza();
        }

      }
      else if(op.equals("2"))
      {
        JOptionPane.showMessageDialog(null, pessoa);
      }
    }
    

    static void comprar(Pessoa pessoa, Acervo acervo, Registrar registrar, Regpess pessoas)
    {
        String titulo = new String (JOptionPane.showInputDialog(null,"Digite o nome do livro que deseja comprar")); 
        JOptionPane.showMessageDialog(null, pessoa.pesquisar(titulo,acervo)); 

        String esc = JOptionPane.showInputDialog("Deseja comprar qual edição desse livro? Digite -1 para cancelar a operação");
        if(esc != "-1")
        {
            int sim;
            Livro livro;
        
        try
        {
            if(!pessoa.getEndereco().equals(null))
            {
            livro = pessoa.pesquisarLivro(titulo, esc, acervo);
            sim = menuYN("Finalizaremos sua compra em um instante,enviaremos o livro: \n" + livro  + "\n Para o seguinte endereço: " + pessoa.getEndereco() + "\n Está tudo correto?");
            }
            else
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
         pessoas.atualizaPessoa(pessoa);
         pessoas.atualiza();
         livro = pessoa.pesquisarLivro(titulo, esc, acervo);
         livro.setPreco(livro.getPreco()*2.0f);
         sim = menuYN("Finalizaremos sua compra em um instante,enviaremos o livro: \n" + livro  + "\n Para o seguinte endereço: " + pessoa.getEndereco() + "\n Está tudo correto?");
            }
            
        }
        catch(NullPointerException e)
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
         pessoas.atualizaPessoa(pessoa);
         pessoas.atualiza();
         livro = pessoa.pesquisarLivro(titulo, esc, acervo);
         sim = menuYN("Finalizaremos sua compra em um instante,enviaremos o livro: \n" + livro  + "\n Para o seguinte endereço: " + pessoa.getEndereco() + "\n Está tudo correto?");
        }


         if(sim == 0 )
         {
            pessoa.comprar(livro, acervo);
            pessoas.atualizaPessoa(pessoa);
            pessoas.atualiza();
            JOptionPane.showMessageDialog(null,"Operação concluída com sucesso");
            Registro registro =  new Registro(pessoa, "compra", livro);
            registrar.addRegistro(registro);
            registrar.atualiza();
         }
        else
        {
            JOptionPane.showMessageDialog(null,"Operação cancelada com sucesso"); 
        }
    }
        
  }

    static void vender(Pessoa pessoa, Acervo acervo, Registrar registrar)
    {
        String titulo1 = JOptionPane.showInputDialog("Insira o titulo do livro que deseja vender");
        String autor = JOptionPane.showInputDialog("Qual o autor do livro que deseja inserir?");
        String ilustrador = JOptionPane.showInputDialog("Qual o ilustrador do livro que deseja inserir?");
        String editora = JOptionPane.showInputDialog("Qual a editora do livro que deseja inserir?");
        String edicao = JOptionPane.showInputDialog("Qual a edição do livro que deseja inserir?");
        int numpag = Integer.parseInt(JOptionPane.showInputDialog("Quantas paginas tem o livro que deseja inserir?"));
        String categoria = JOptionPane.showInputDialog("Qual a categoria do livro que deseja inserir?");

        Livro livro = new Livro(titulo1, autor, ilustrador, editora, edicao, numpag, categoria);



        int a = Integer.parseInt(JOptionPane.showInputDialog("Há quantos anos você adquiriu esse livro?"));
        int b = menuYN("Quando você adquiriu o livro, ele ja era usado?");//ja era usado
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
        int venda = menuYN("Nós avaliamos seu livro em " + livro.getPreco()+"R$\n Gostaria de vendê-lo?" );
        if(venda == 0)
        {
            pessoa.vender(livro, acervo);
            Registro registro =  new Registro(pessoa, "venda", livro);
            registrar.addRegistro(registro);
            registrar.atualiza();
            
            JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Operação cancelada com sucesso!");
        }
    }
}
