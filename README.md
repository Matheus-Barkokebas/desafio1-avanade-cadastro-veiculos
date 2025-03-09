```mermaid
classDiagram
    class Veiculo {
        +String placa
        +String marca
        +String modelo
        +int ano
        +String cor
    }

    class Proprietario {
        +String nome
        +String cpf
        +String telefone
    }

    Proprietario "1" --> "0..*" Veiculo : "possui"

```
