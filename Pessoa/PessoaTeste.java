package Pessoa;

public class PessoaTeste {

	public static void main(String[] args) {
		Autor a1 = new Autor();
		Endereco en1 = new Endereco();
		Cidade c1 = new Cidade();
		Estado es1 = new Estado();
		Pais p1 = new Pais();
		
		p1.setNomePais("Brasil");
		es1.setNomeEstado("São Paulo");
		es1.setSiglaEstado("SP");
		es1.setPais(p1); // relacionando as classes estado e pais
		c1.setNomeCidade("São Carlos");
		c1.setEstado(es1); // relacionando as classes estado e cidade
		en1.setCep("11111-222");
		en1.setLogradouro("Rua rua1");
		en1.setNumero("135");
		en1.setBairro("Bairro 1");
		en1.setCidade(c1); // relacionando as classes cidade e endereço
		a1.setEndereco(en1); // relacionando as classes endereco e autor
		
		
		
		
		a1.setNome("Ruan Crysthian");
		a1.setCodigoAutor(1111);
		
		if(a1 != null && a1.getEndereco() != null) {
			System.out.println("Nome: " + a1.getNome());
			System.out.println("Codigo: " + a1.getCodigoAutor());
			System.out.println("Endereço");
			System.out.println("Rua: " + a1.getEndereco().getLogradouro());
			System.out.println("Numero: " + a1.getEndereco().getNumero());
			System.out.println("Cidade: " +  a1.getEndereco().getCidade().getNomeCidade());
			System.out.println("Estado: " + a1.getEndereco().getCidade().getEstado().getNomeEstado());
			System.out.println("Pais: " + a1.getEndereco().getCidade().getEstado().getPais().getNomePais());
		}
		
		
		
	}
}
