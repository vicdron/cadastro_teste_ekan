package teste.ekan.cadastro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teste.ekan.cadastro.entities.Documento;
import teste.ekan.cadastro.repository.DocumentoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentoService {

    @Autowired
    private DocumentoRepository repository;

    public Documento create (Documento obj){
        return repository.save(obj);
    }

    public void delete (Long id){
        repository.deleteById(id);
    }

    public Documento getId(long id){
        Optional<Documento> obj = repository.findById(id);
        return obj.get();
    }

    public List<Documento> getAll(){
        return repository.findAll();
    }

    public Documento update(Documento obj){
        Optional<Documento> newObj = repository.findById(obj.getId());
        updateDocumento(newObj, obj);
        return repository.save(newObj.get());
    }
    private void updateDocumento (Optional<Documento> newObj, Documento obj){
        newObj.get().setTipoDocumento(obj.getTipoDocumento());
    }


}


