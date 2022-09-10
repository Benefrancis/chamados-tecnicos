package br.com.fiap.shift.chamados.repository;

import br.com.fiap.shift.chamados.model.Tecnico;

import java.util.ArrayList;
import java.util.List;

public class TecnicoRepository {
    private static final List<Tecnico> tecnicos;

    static {
        tecnicos = new ArrayList<>();
        tecnicos.add(new Tecnico(1L, "Benefrancis do Nascimento"));
        tecnicos.add(new Tecnico(3L, "Erick Sudré do Nascimento"));
        tecnicos.add(new Tecnico(4L, "Bruno Sudré do Nascimento"));
        tecnicos.add(new Tecnico(8L, "ellen Cristina Sudré Sobrinho"));
        tecnicos.add(new Tecnico(9L, "Victor Guilherme Sudré Sobrinho"));
    }

    public static Tecnico findById(int id) {
        return tecnicos.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }
}
