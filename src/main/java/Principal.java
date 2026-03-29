import exercicios.Cidade;
import exercicios.CidadeRecord;
import exercicios.PessoaRecord;
import exercicios.PessoaRecordShallow;

/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */
public class Principal {
    public static void main(final String[] args) {

        System.out.println("Teste 1: Imutabilidade Superficial");
        Cidade cidadeMutavel = new Cidade("São Paulo");
        PessoaRecordShallow pessoaShallow = new PessoaRecordShallow("Carlos", cidadeMutavel);
        System.out.println("Cidade original: " + pessoaShallow.cidade().getNome());

        cidadeMutavel.setNome("Rio de Janeiro");
        System.out.println("Cidade após alteração externa: " + pessoaShallow.cidade().getNome());

        System.out.println("\nTeste 2: Imutabilidade");
        CidadeRecord cidadeImutavel = new CidadeRecord("Belo Horizonte");
        PessoaRecord pessoaDeep = new PessoaRecord("Ana", cidadeImutavel);
        System.out.println("Cidade original: " + pessoaDeep.cidade().nome());
    }
}