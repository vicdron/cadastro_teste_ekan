package teste.ekan.cadastro.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import teste.ekan.cadastro.entities.Beneficiario;
import teste.ekan.cadastro.services.BeneficiarioService;

import java.util.List;


@RestController
@RequestMapping(value = "/beneficiarios")
public class BeneficiarioController {
    @Autowired
    private BeneficiarioService service;

    @PostMapping
    public ResponseEntity<Beneficiario> cadastrarBeneficiario(@RequestBody Beneficiario obj){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(obj));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> removerBeneficiario (@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Beneficiario> getId(@PathVariable Long id){
        return ResponseEntity.ok().body(service.getId(id));
    }

    @GetMapping
    public ResponseEntity<List<Beneficiario>> listarBeneficiarios(){
        return ResponseEntity.ok().body(service.getAll());
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Beneficiario> atualizarBeneficiario(@PathVariable Long id, @RequestBody Beneficiario obj){
        obj.setId(id);
        return ResponseEntity.ok().body(service.update(obj));
    }
    @GetMapping(value = "/{id}/documentos")
    public ResponseEntity<Beneficiario> listarDocumentosDoBeneficiario (@PathVariable Long id, @RequestBody Beneficiario obj) {
        obj.setId(id);
        return ResponseEntity.ok().body(service.update(obj));
    }

}