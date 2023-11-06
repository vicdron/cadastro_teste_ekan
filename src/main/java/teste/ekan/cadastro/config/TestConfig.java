package teste.ekan.cadastro.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import teste.ekan.cadastro.entities.Beneficiario;
import teste.ekan.cadastro.entities.Documento;
import teste.ekan.cadastro.repository.BeneficiarioRepository;
import teste.ekan.cadastro.repository.DocumentoRepository;


import java.sql.Date;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
    @Autowired
    private DocumentoRepository documentoRepository;
    @Autowired
    private BeneficiarioRepository beneficiarioRepository;

    @Override
    public void run(String... args) throws Exception {

      //  Beneficiario b1 = new Beneficiario(null, "Junior);
      //  Beneficiario b2 = new Beneficiario(null, "Joao");
        Beneficiario b1 = new Beneficiario();
        b1.setNome("João");
        b1.setTelefone("Maria");
        b1.setDataNascimento(Date.valueOf("1990-01-01"));
        b1.setDataInclusao(Date.valueOf("2023-11-06"));
        b1.setDataAtualizacao(Date.valueOf("2023-11-06"));

        Beneficiario b2 = new Beneficiario();
        b2.setNome("Maria");
        b2.setTelefone("987654321");
        b2.setDataNascimento(Date.valueOf("1995-02-15"));
        b2.setDataInclusao(Date.valueOf("2023-11-06"));
        b2.setDataAtualizacao(Date.valueOf("2023-11-06"));

        beneficiarioRepository.saveAll(Arrays.asList(b1,b2));

        Documento d1 = new Documento();
        d1.setTipoDocumento("RG");
        d1.setDescricao("123456");
        d1.setDataInclusao(Date.valueOf("2023-11-06"));
        d1.setDataAtualizacao(Date.valueOf("2023-11-06"));
        d1.setBeneficiario(b1);

        Documento d2 = new Documento();
        d2.setTipoDocumento("RG");
        d2.setDescricao("789012");
        d2.setDataInclusao(Date.valueOf("2023-11-06"));
        d2.setDataAtualizacao(Date.valueOf("2023-11-06"));
        d2.setBeneficiario(b2);

        Documento d3 = new Documento();
        d3.setTipoDocumento("CPF");
        d3.setDescricao("789012");
        d3.setDataInclusao(Date.valueOf("2023-11-06"));
        d3.setDataAtualizacao(Date.valueOf("2023-11-06"));
        d3.setBeneficiario(b2);

        documentoRepository.saveAll(Arrays.asList(d1,d2,d3));
    }
}