package br.com.sea_quanta.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sea_quanta.model.Honkai;
import br.com.sea_quanta.service.HonkaiService;

@RestController
@RequestMapping("/api/honkai")
public class HonkaiController {
    
    private HonkaiService service = new HonkaiService();

    @GetMapping
    public List<Honkai> findAll() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Honkai honkai) {
        try {
            return new ResponseEntity<>(service.save(honkai), HttpStatus.CREATED);
        } catch (IllegalArgumentException valk) {
            return new ResponseEntity<>(valk.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>("Lamento, houve um erro inesperado no sistema!!!",
                    HttpStatus.INTERNAL_SERVER_ERROR);
            // Log para e.getMessage()
        }
    }

    @PutMapping
    public ResponseEntity<Object> edit(@RequestBody Honkai honkai) {
        try {
            return new ResponseEntity<>(service.edit(honkai), HttpStatus.CREATED);
        } catch (IllegalArgumentException valk) {
            return new ResponseEntity<>(valk.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>("Lamento, houve um erro inesperado no sistema!!!",
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping
    public ResponseEntity<Object> delete(@RequestBody Honkai honkai) {
        try {
            return new ResponseEntity<>(service.delete(honkai), HttpStatus.OK);
        } catch (IllegalArgumentException valk) {
            return new ResponseEntity<>(valk.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>("Lamento, houve um erro inesperado no sistema!!!",
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}