# To Do List API - Java Spring API Rest

API Rest usando Java Spring. API faz parte de um projeto usando React, desta forma a documentação curta, explicando apenas as funcionalidades da API. Para visualizar o projeto React clique [aqui](https://github.com/peregozo/to-do-list).

## Sobre a API

API Rest usando Java Spring para o projeto [To Do List](https://github.com/peregozo/to-do-list). Permite inserir, deletar, visualizar e editar tarefas no aplicativo por meio de seus endpoints.
A classe 'Todo' da API representa uma tarefa, e tem como atributos:

- id: long - Representa o id da tarefa
- name: string - Representa o nome da tarefa
- description: string - Representa a descrição da tarefa
- done: boolean - Representa se a tarefa foi feita ou não, true representa que foi feita e false que não foi feita
- priority: int - Representa a prioridade da tarefa, 1 para alta, 2 para média e 3 para baixa

## Endpoints

**/todos:**

- Criar uma tarefa:

  - Método: POST
  - Corpo da solicitação: Objeto JSON representando a tarefa
  - Descrição: Cria uma nova tarefa e atualiza a lista
 
Corpo da requisição:

```
{
  "name": string,
  "description": string,
  "done": boolean,
  "priority": number
}
```

- Listar as tarefas:
  - Método: GET
  - Descrição: Retorna todas as tarefas cadastradas

  **/todos/{id}:**

  -Deletar uma tarefa pelo id
  
  - Método: DELETE
  - Parâmetros: 'id' - Id da tarefa a ser deletada
  - Descrição: Deleta uma tarefa

**/todos/edit/{id}:**

- Atualizar uma tarefa por id:

  - Método: PUT
  - Parâmetros: 'id' - Id da tarefa a ser editada
  - Corpo da solicitação: Objeto JSON com os novos dados da tarefa
  - Descrição: Atualiza uma tarefa por seu id correspondente

Corpo da requisição:

  ```
  {
    "name": string,
    "description": string,
    "done": boolean,
    "priority": number
  }
  ```

**/set-status/{id}:**

- Atualizar o status de uma tarefa pelo id:

  - Método: PATCH
  - Parâmetros: 'id' - Id da tarefa a ser atualizada
  - Corpo da solicitação: Objeto JSON com o status da tarefa.
  - Descrição: Atualiza o status da tarefa
 
Corpo da requisição:

  ```
  {
    done: boolean
  }
  ```

## Instalação

Sabendo que não é possível acessar a API sem instalar o código Java Spring na máquina, siga as instruções para efetuar a instalação do projeto.

**1 - Instalar o Maven:** Instale o gerenciador de projetos Maven, ele será responsável por controlar as dependências do código. Instale o Maven clicando [aqui](https://maven.apache.org/)

**2 - Clonar o repositório:** Clone o repositório em seu computador, executando o código no terminal do GitHub:

```git clone https://github.com/peregozo/to-do-list-api```

**3 - Verificar as dependências:** Abra o projeto em uma IDE e verifique as dependências.

**4 - Configurar application.properties:** Configure o arquivo application.properties, selecionando um gerenciador de banco de dados, ou usando o mySQL que já está estabelecido no código. Instale o mySQL clicando [aqui](https://www.mysql.com/)

**5 - Estabelecer o banco de dados:** No terminal do banco de dados escolhido, crie um novo database com nome 'todolist' e um novo table com nome 'todos', por meio de:

```CREATE DATABASE TODOLIST;```

```CREATE TABLE TODOS;```

Desta forma o banco de dados estará pronto para estabelecer conexão com a API.

**6 - Iniciar a API:** Execute o projeto Java Spring em sua IDE para inicializar a API.
