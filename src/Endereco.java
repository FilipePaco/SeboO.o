public class Endereco {
	/*- setor: String
- numero: int
- rua: String
- cidade: String
- estado:String
- pais:String
- cep: int */
	private String rua;
	private int numero;
	private String cep;
	private String bairro;
	private String cidade; 
	private String estado;
	private String pais;

	public Endereco(String rua, int numero, String cep, String bairro, String cidade, String estado, String pais) 
	{
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}

	public String getRua() 
	{
		return rua;
	}

	public void setRua(String rua)
    {
		this.rua = rua;
	}


	public int getNumero() 
	{
		return numero;
	}

	public void setNumero(int numero) 
	{
		this.numero = numero;
	}


	public String getCep() 
	{
		return cep;
	}

	public void setCep(String cep) 
	{
		this.cep = cep;
	}


	public String getBairro() 
	{
		return bairro;
	}

	public void setBairro(String bairro) 
	{
		this.bairro = bairro;
	}


	public String getCidade() 
	{
		return cidade;
	}

	public void setCidade(String cidade) 
	{
		this.cidade = cidade;
	}


	public String getEstado() 
	{
		return estado;
	}

	public void setEstado(String estado) 
	{
		this.estado = estado;
	}


	public String getPais() 
	{
		return pais;
	}

	public void setPais(String pais) 
	{
		this.pais = pais;
	}

	public String toString() {
		return "Endereco [bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", estado=" + estado + ", numero="
				+ numero + ", pais=" + pais + ", rua=" + rua + "]";
	}

}
	
	
	