Aplicação de Cadastro de Beneficiários de Plano de Saúde

Está aplicação foi desenvolvida utilizando Java e Spring Boot para fornecer uma API REST para cadastro de beneficiarios de um plano de saúde
Diagrama do Projeto


Configurando o Ambiente de Desenvolvimento
Certifique-se de ter o Java JDK 17 e o Maven instalados no seu sistema.
Instalação do maven no ubuntu
sudo apt update
sudo apt install maven
OBS: se estiver usando o VScode, instale a extensão do Spring Boot.

Executando a Aplicação.

Clone este repositório https://github.com/vicdron/cadastro_teste_ekan.git.
Navegue até o diretório no projeto e execute o comando abaixo
mvn spring-boot:run

Tecnologias Utilizadas
-Java
-Spring Boot
-Spring Data JPA
-Banco de Dados H2

Funcionalidades da API

POST /beneficiarios              (Cadastrar um beneficiário)
GET /beneficiarios                 (Listar todos os beneficiários)
GET /documento{id}              (Listar todos os documentos de um beneficiário)
PUT /beneficiario{id}             (Atualizar os dados cadastrais de um beneficiário)
DELETE /beneficiario{id}      (Remover um beneficiário)


