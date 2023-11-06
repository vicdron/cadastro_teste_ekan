package teste.ekan.cadastro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teste.ekan.cadastro.entities.Beneficiario;
import teste.ekan.cadastro.repository.BeneficiarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BeneficiarioService {

    @Autowired
    private BeneficiarioRepository repository;

    public Beneficiario create (Beneficiario obj){
        return repository.save(obj);
    }

    public void delete (Long id){
        repository.deleteById(id);
    }

    public Beneficiario getId(long id){
        Optional<Beneficiario> obj = repository.findById(id);
        return obj.get();
    }

    public List<Beneficiario> getAll(){
        return repository.findAll();
    }

    public Beneficiario update(Beneficiario obj){
        Optional<Beneficiario> newObj = repository.findById(obj.getId());
        updateBeneficiario(newObj, obj);
        return repository.save(newObj.get());
    }
    private void updateBeneficiario (Optional<Beneficiario> newObj, Beneficiario obj){
        newObj.get().setNome(obj.getNome());
    }


}

