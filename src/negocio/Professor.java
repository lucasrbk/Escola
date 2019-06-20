package negocio;
import java.util.Date;

public class Professor {
	

	private int id;
	private String nome;
	private String cargo;
	private Date nascimento;
	private String usuario;
	private String senha;
	
	public Professor(int id, String nome, String cargo, Date nascimento, String usuario, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
		this.nascimento = nascimento;
		this.usuario = usuario;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return "Professor [id=" + id + ", nome=" + nome + ", cargo=" + cargo + ", nascimento=" + nascimento
				+ ", usuario=" + usuario + ", senha=" + senha + "]";
	}
	
	
}
