package br.edu.ipog.backend3.app.service.produto;

import br.edu.ipog.backend3.app.generics.GenericOperationsService;
import br.edu.ipog.backend3.app.mapper.ProdutoModelEntityMapper;
import br.edu.ipog.backend3.app.repository.ProdutoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProdutoService implements GenericOperationsService<ProdutoModel, Integer> {

    final ProdutoRepository produtoRepository;
    final ProdutoModelEntityMapper produtoModelEntityMapper;

    public ProdutoService(ProdutoRepository produtoRepository, ProdutoModelEntityMapper produtoModelEntityMapper) {
        this.produtoRepository = produtoRepository;
        this.produtoModelEntityMapper = produtoModelEntityMapper;
    }

    @Override
    public ProdutoModel create(ProdutoModel model) {
        log.info("Criando novo produto");
        var produtoCadastrado = produtoRepository.save(produtoModelEntityMapper.toEntity(model));
        return produtoModelEntityMapper.toModel(produtoCadastrado);
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
