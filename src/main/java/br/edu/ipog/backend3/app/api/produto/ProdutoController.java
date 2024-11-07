package br.edu.ipog.backend3.app.api.produto;

import br.edu.ipog.backend3.app.GenericOperationResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class ProdutoController implements ProdutoResource{
    /**
     * Cria um novo registro no sistema.
     *
     * @param dto Objeto a ser criado
     * @return Registro criado com status 201 Created
     */
    @Override
    public ResponseEntity<ProdutoDto> create(ProdutoDto dto) {
        return null;
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
