package teste.ekan.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teste.ekan.cadastro.entities.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {
}
