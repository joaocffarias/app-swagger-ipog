package br.edu.ipog.backend3.app;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Interface genérica para operações CRUD com suporte a operações em lote.
 * <p>
 * T - Type (Modelo do domínio, como Pessoa ou Aluno)
 * N - Number (Tipo de identificador do registro, como Integer ou Long)
 *
 * <p>
 * Operações:
 * <ul>
 *     <li><b>Create</b> - POST: Cria um novo registro ou registros em lote</li>
 *     <li><b>Read</b> - GET: Lê um registro por ID ou retorna uma lista paginada de registros</li>
 *     <li><b>Update</b> - PUT: Atualiza um registro, com suporte a operações em lote</li>
 *     <li><b>Delete</b> - DELETE: Remove um registro por ID</li>
 * </ul>
 * @see https://docs.oracle.com/javase/tutorial/java/generics/types.html?ref=sangkon.com
 */
public interface GenericOperationResource<T,N> {

    /**
     * Cria um novo registro no sistema.
     *
     * @param dto Objeto a ser criado
     * @return Registro criado com status 201 Created
     */
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    @Operation(summary = "Cria um novo registro", description = "Insere um novo objeto no banco de dados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Registro criado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Erro de validação nos dados enviados"),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor")
    })
    ResponseEntity<T> create(@Validated @RequestBody T dto);


    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    @Operation(summary = "Lista todo os registros", description = "Listagem de todos os registros contido na base de dados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Registro criado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Erro de validação nos dados enviados"),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor")
    })
    ResponseEntity<List<T>> read();

    @GetMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @Operation(summary = "Busca um registro com base no ID", description = "Retorna um único ID na consulta do banco de dados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Registro criado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Erro de validação nos dados enviados"),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor")
    })
    ResponseEntity<T> read(
            @Parameter(description = "Identificador do registro", required = true) //OpenAPI
            @PathVariable N id); // spring

    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @Operation(summary = "Busca um registro com base no ID", description = "Retorna um único ID na consulta do banco de dados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Registro criado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Erro de validação nos dados enviados"),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor")
    })
    ResponseEntity<T> update(
            @Parameter(description = "Identificador do registro", required = true) //OpenAPI
            @PathVariable N id,
            @Validated @RequestBody T dto);

    /**
     * Remove um registro do sistema.
     *
     * @param id Identificador do registro a ser removido
     * @return Status 204 No Content
     */
    @DeleteMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Operation(summary = "Remove um registro", description = "Remove um registro do banco de dados pelo seu identificador")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Registro removido com sucesso"),
            @ApiResponse(responseCode = "404", description = "Registro não encontrado"),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor")
    })
    ResponseEntity<Void> delete(
            @Parameter(description = "Identificador do registro", required = true) //OpenAPI
            @PathVariable N id
    );
}
