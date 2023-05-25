package br.com.sea_quanta.service;

import java.util.List;

import br.com.sea_quanta.model.Honkai;
import br.com.sea_quanta.repository.HonkaiRepository;

public class HonkaiService {
    private HonkaiRepository repository = new HonkaiRepository();

    public List<Honkai> findAll() {
        return repository.findAll();
    }

    public Honkai save(Honkai honkai) throws IllegalArgumentException {
        if (honkai.getDescription().trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição não pode ficar vazia!!!");
        }
        if (honkai.getArma().trim().isEmpty()){
            throw new IllegalArgumentException("adicione um tipo de arma");
        }
        if (honkai.verification() == null) {
            throw new IllegalArgumentException("Error on verification");
        }
        return repository.save(honkai);
    }

    public Honkai edit(Honkai honkai) throws IllegalArgumentException {
        if (honkai.getDescription().trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição não pode ficar vazia!!!");
        }
        if (honkai.getArma().trim().isEmpty()){
            throw new IllegalArgumentException("adicione um tipo de arma");
        }
        if (honkai.verification() == null) {
            throw new IllegalArgumentException("Error on verification");
        }
        return repository.edit(honkai);
    }

    public Honkai delete(Honkai honkai) {
        if (honkai.getDescription().trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição não pode ficar vazia!!!");
        }
        if (honkai.getArma().trim().isEmpty()){
            throw new IllegalArgumentException("adicione um tipo de arma");
        }
        return repository.delete(honkai);
    }
}