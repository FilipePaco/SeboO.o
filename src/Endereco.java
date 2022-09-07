public class Endereco implements java.io.Serializable{
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

	
	/** 
	 * @return String
	 */
	public String getRua() 
	{
		return rua;
	}

	
	/** 
	 * @param rua
	 */
	public void setRua(String rua)
    {
		this.rua = rua;
	}


	
	/** 
	 * @return int
	 */
	public int getNumero() 
	{
		return numero;
	}

	
	/** 
	 * @param numero
	 */
	public void setNumero(int numero) 
	{
		this.numero = numero;
	}


	
	/** 
	 * @return String
	 */
	public String getCep() 
	{
		return cep;
	}

	
	/** 
	 * @param cep
	 */
	public void setCep(String cep) 
	{
		this.cep = cep;
	}


	
	/** 
	 * @return String
	 */
	public String getBairro() 
	{
		return bairro;
	}

	
	/** 
	 * @param bairro
	 */
	public void setBairro(String bairro) 
	{
		this.bairro = bairro;
	}


	
	/** 
	 * @return String
	 */
	public String getCidade() 
	{
		return cidade;
	}

	
	/** 
	 * @param cidade
	 */
	public void setCidade(String cidade) 
	{
		this.cidade = cidade;
	}


	
	/** 
	 * @return String
	 */
	public String getEstado() 
	{
		return estado;
	}

	
	/** 
	 * @param estado
	 */
	public void setEstado(String estado) 
	{
		this.estado = estado;
	}


	
	/** 
	 * @return String
	 */
	public String getPais() 
	{
		return pais;
	}

	
	/** 
	 * @param pais
	 */
	public void setPais(String pais) 
	{
		this.pais = pais;
	}

	
	/** 
	 * @return String
	 */
	public String toString() {
		return "Endereco [bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", estado=" + estado + ", numero="
				+ numero + ", pais=" + pais + ", rua=" + rua + "]";
	}

}
	
	
	