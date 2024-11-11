package br.edu.ipog.backend3.app.service.produto;

import br.edu.ipog.backend3.app.generics.GenericOperationsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProdutoService implements GenericOperationsService<ProdutoModel, Integer> {

    @Override
    public ProdutoModel create(ProdutoModel model) {
        log.info("Criando novo produto");
        return null;
    }

    @Override
    public List<ProdutoModel> read() {
        log.info("Listando produtos");
        return List.of();
    }

    @Override
    public ProdutoModel readById(Integer id) {
        log.info("Buscando produto pelo ID {}", id);
        return null;
    }

    @Override
    public ProdutoModel update(Integer id, ProdutoModel model) {
        log.info("Atualizando produto pelo ID {}", id);
        return null;
    }

    @Override
    public Void delete(Integer id) {
        log.info("Deletando produto pelo ID {}", id);
        return null;
    }
}