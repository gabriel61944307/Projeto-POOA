package entidades;
import java.util.List;

public class ObrasLiterarias {

	private int codigo;
	private int isbn;
	private String titulo;
	private CategoriaObrasLiterarias categoria;
	private List <Autor> autor;
	private String palavrasChave;
	private int diaPublicacao;
	private int mesPublicacao;
	private int anoPublicacao;
	private Editora editora;
	private int numeroPaginas;
	private List <CopiaObrasLiterarias> copia;
	
	public ObrasLiterarias() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public CategoriaObrasLiterarias getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaObrasLiterarias categoria) {
		this.categoria = categoria;
	}

	public List<Autor> getAutor() {
		return autor;
	}

	public void setAutor(List<Autor> autor) {
		this.autor = autor;
	}

	public String getPalavrasChave() {
		return palavrasChave;
	}

	public void setPalavrasChave(String palavrasChave) {
		this.palavrasChave = palavrasChave;
	}

	public int getDiaPublicacao() {
		return diaPublicacao;
	}

	public void setDiaPublicacao(int diaPublicacao) {
		this.diaPublicacao = diaPublicacao;
	}

	public int getMesPublicacao() {
		return mesPublicacao;
	}

	public void setMesPublicacao(int mesPublicacao) {
		this.mesPublicacao = mesPublicacao;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public List<CopiaObrasLiterarias> getCopia() {
		return copia;
	}

	public void setCopia(List<CopiaObrasLiterarias> copia) {
		this.copia = copia;
	}
	
	
	
}
