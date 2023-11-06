package teste.ekan.cadastro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

@Entity
@Table(name = "tb_Beneficiario")
public class Beneficiario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;
    private Date dataNascimento;
    private Date dataInclusao;
    private Date dataAtualizacao;


    @JsonIgnore
    @OneToMany(mappedBy = "beneficiario")
    private List<Documento> documentos = new ArrayList<>();

    public Beneficiario(Long id, String nome, String telefone, Date dataNascimento, Date dataInclusao, Date dataAtualizacao) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataInclusao = dataInclusao;
        this.dataAtualizacao = dataAtualizacao;
    }
}