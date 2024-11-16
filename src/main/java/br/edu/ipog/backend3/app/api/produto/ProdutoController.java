package br.edu.ipog.backend3.app.api.produto;

import br.edu.ipog.backend3.app.mapper.ProdutoDtoModelMapper;
import br.edu.ipog.backend3.app.service.produto.ProdutoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class ProdutoController implements ProdutoResource{

    final ProdutoService produtoService;
    private final ProdutoDtoModelMapper produtoDtoModelMapper;

    public ProdutoController(ProdutoService produtoService, ProdutoDtoModelMapper produtoDtoModelMapper) {
        this.produtoService = produtoService;
        this.produtoDtoModelMapper = produtoDtoModelMapper;
    }


    /**
     * Cria um novo registro no sistema.
     *
     * @param dto Objeto a ser criado
     * @return Registro criado com status 201 Created
     */
    @Override
    public ResponseEntity<ProdutoDto> create(ProdutoDto dto) {

        var produtoConvertido = produtoDtoModelMapper.toModel(dto);

        var produto = produtoService.create(produtoConvertido);

        var produtoEnviado = produtoDtoModelMapper.toDTO(produto);

        return ResponseEntity.status(HttpStatus.CREATED).body(produtoEnviado);
    }

    @Override
    public ResponseEntity<List<ProdutoDto>> read() {
        return null;
    }

    @Override
    public ResponseEntity<ProdutoDto> read(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<ProdutoDto> update(Integer id, ProdutoDto dto) {
        return null;
    }

    /**
     * Remove um registro do sistema.
     *
     * @param id Identificador do registro a ser removido
     * @return Status 204 No Content
     */
    @Override
    public ResponseEntity<Void> delete(Integer id) {
        return null;
    }
}
