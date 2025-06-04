ETAPA 3 – Herança e Polimorfismo

Foram criadas 5 subclasses que estendem Loja, cada uma com um atributo extra:

- Cosmetico → double taxaComercializacao

- Vestuario → boolean produtosImportados

- Bijuteria → double metaVendas

- Alimentacao → Data dataAlvara

- Informatica → double seguroEletronicos

Todas elas:

- Chamam o construtor da superclasse com super(...)

- Possuem seus próprios getters, setters e toString() sobrescrito
