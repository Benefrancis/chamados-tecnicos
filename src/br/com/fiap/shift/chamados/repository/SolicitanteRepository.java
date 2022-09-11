package br.com.fiap.shift.chamados.repository;

import br.com.fiap.shift.chamados.model.Solicitante;

import java.util.ArrayList;
import java.util.List;

public class SolicitanteRepository implements Repository<Solicitante> {
    private static final List<Solicitante> solicitantes;

    static {
        solicitantes = new ArrayList<>();
        solicitantes.add(new Solicitante(1L, "Benefrancis do Nascimento"));
        solicitantes.add(new Solicitante(2L, "Maria Raquel do Nascimento"));
        solicitantes.add(new Solicitante(3L, "Erick Sudré do Nascimento"));
        solicitantes.add(new Solicitante(4L, "Bruno Sudré do Nascimento"));
        solicitantes.add(new Solicitante(5L, "Davi Lucca Sudré do Nascimento"));
        solicitantes.add(new Solicitante(6L, "Marcos Sudré"));
        solicitantes.add(new Solicitante(7L, "Gilmar Gonçalves Sudré"));
        solicitantes.add(new Solicitante(8L, "Ellen Cristina Sudré Sobrinho"));
        solicitantes.add(new Solicitante(9L, "Sthepany Caren Sudré Vaz"));
        solicitantes.add(new Solicitante(9L, "Victor Guilherme Sudré Sobrinho"));
    }

    @Override
    public Solicitante findById(Long id) {
        return solicitantes.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }
}
