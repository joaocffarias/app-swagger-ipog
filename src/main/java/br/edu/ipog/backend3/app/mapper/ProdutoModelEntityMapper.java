package br.edu.ipog.backend3.app.mapper;


import br.edu.ipog.backend3.app.api.produto.ProdutoDto;
import br.edu.ipog.backend3.app.entity.ProdutoEntity;
import br.edu.ipog.backend3.app.service.produto.ProdutoModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProdutoModelEntityMapper {

    ProdutoModelEntityMapper INSTANCE = Mappers.getMapper(ProdutoModelEntityMapper.class);

    ProdutoModel toModel(ProdutoEntity produtoEntity);

    ProdutoEntity toEntity(ProdutoModel produtoModel);
}
