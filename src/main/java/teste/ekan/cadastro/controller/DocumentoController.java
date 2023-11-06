package teste.ekan.cadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import teste.ekan.cadastro.entities.Documento;
import teste.ekan.cadastro.services.DocumentoService;

import java.util.List;

@RestController
@RequestMapping(value = "/documentos")
public class DocumentoController {
    @Autowired
    private DocumentoService service;

    @PostMapping
    public ResponseEntity<Documento> cadastrarDocumento(@RequestBody Documento obj){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(obj));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> removerDocumento(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Documento> getId(@PathVariable Long id){
        return ResponseEntity.ok().body(service.getId(id));
    }

    @GetMapping
    public ResponseEntity<List<Documento>> listarDocumentos(){
        return ResponseEntity.ok().body(service.getAll());
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Documento> atualizarDocumento(@PathVariable Long id, @RequestBody Documento obj){
        obj.setId(id);
        return ResponseEntity.ok().body(service.update(obj));
    }

}