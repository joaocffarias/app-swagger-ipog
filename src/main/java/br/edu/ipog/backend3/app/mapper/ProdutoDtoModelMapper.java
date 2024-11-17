package br.edu.ipog.backend3.app.mapper;

import br.edu.ipog.backend3.app.api.produto.ProdutoDto;
import br.edu.ipog.backend3.app.service.produto.ProdutoModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = GlobalMapperConfig.class)
public interface ProdutoDtoModelMapper {

    ProdutoDtoModelMapper INSTANCE = Mappers.getMapper(ProdutoDtoModelMapper.class);

    ProdutoDto toDTO(ProdutoModel produtoModel);

    ProdutoModel toModel(ProdutoDto produtoDto);
}
