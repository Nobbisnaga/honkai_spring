package br.com.sea_quanta.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.sea_quanta.model.Honkai;

public class HonkaiRepository {
    private static List<Honkai> tasks = new ArrayList<>();

    public List<Honkai> findAll() {
        return tasks;
    }

    public Honkai save(Honkai honkai) {
        // Adicionar um id
        tasks.add(honkai);
        return honkai;
    }

    public Honkai edit(Honkai honkai) {
        for (int i = 0; i < tasks.size(); i++) {
            Honkai element = tasks.get(i);
            if (element.getDescription().equals(honkai.getDescription())) {
                tasks.set(i, honkai);
                break;
            }
        }
        return honkai;
    }

    public Honkai delete(Honkai honkai) {
        for (int i = 0; i < tasks.size(); i++) {
            Honkai element = tasks.get(i);
            if (element.getDescription().equals(honkai.getDescription())) {
                tasks.remove(i);
            }
        }
        return honkai;
    }
}