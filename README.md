# Java Boleto API ID

Aplicativo Java para envio/consulta de boletos via API (exemplo de integração com CobExpress). Este repositório contém código-fonte, binários, dependências.

Principais pontos:
- Projeto em Java com classes de serviço para comunicação com uma API de cobrança.
- Dependências externas (locais) no diretório `lib/` (Jackson e JJWT).


Como a aplicação funciona (visão geral)
- `App.java` contém métodos de exemplo para gerar e consultar boletos usando `CobExpressService`.
- Ajuste as chaves (`chaveGeral`, `chaveConta`) e o modo (`homologacao` ou `producao`) conforme suas credenciais e ambiente.


