# ListaProdutosAPI 
## Como usar:
Foi desenvolvida uma api para realizar operações CRUD em uma lista de produtos. Em ambiente de desenvolvimento, a api possui o endpoint https://localhost:8080/api/produtos. A seguir são apresentados os serviços.

## Entidade Produto
A entidade Produto é representada da seguinte forma no formato JSON:  
{  
  "ID": "PROD-1234",  
  "nome": "Caneta Azul",  
  "preco": 2.50,  
  "peso": 0.01,  
  "versao": 1  
}  

**findById**  
endpoint: https://localhost:8080/api/produtos/{id}  
Método: GET  
Funcionalidade: Retorna o produto com o id informado na URL. Caso o produto não seja encontrado, é retornada uma exceção.  

**findAll**  
endpoint: https://localhost:8080/api/produtos/  
Método: GET  
Funcionalidade: Retorna uma lista com todos os produtos armazenados no banco.  

**create**
endpoint: https://localhost:8080/api/produtos/
Método: POST
Funcionalidade: Cria uma novo registro de produtos no banco de dados. Enviar no corpo da GET request um JSON semelhante ao informado anteriormente com as informações do produto a ser criado.  

**update**  
endpoint: https://localhost:8080/api/produtos/{id}  
Método: PUT  
Funcionalidade: realiza a operação de atualzizar a entidade que possui o id informado no URL com os novos dados do JSON presente no corpo da requisição. Caso o produto não seja encontrado, é retornada uma exceção.  

**delete**  
endpoint: https://localhost:8080/api/produtos/{id}  
Método: DELETE  
Funcionalidade: Remove do banco de dados o produto com o id informado no URL.  
