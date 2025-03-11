```mermaid
classDiagram
    class Veiculo {
        +Long id
        +String placa
        +String marca
        +String modelo
        +int ano
        +String cor
    }

    class Concessionária {
        +Long id
        +String nome
        +String cnpj
        +String telefone
    }

    Concessionária "1" --> "0..*" Veiculo : "possui"

```
