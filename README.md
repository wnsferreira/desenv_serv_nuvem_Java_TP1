# Infnet - Desenvolvimento de Serviços em Nuvem com Java - TP1

#Projeto proposto

Desenvolva um projeto simples com Spring Boot que implemente um microsserviço elementar de consulta que demonstre o entendimento da criação de um projeto simples nessa plataforma.

#Projeto Desenvolvido

Framework: Spring Boot
Pacotes: app, domain e infra

O sistema possui um conjunto de dados salvos no repository que sao modelados de acordo com o que foi definido no domínio e o controller realiza a chamada dos dados ou em sua totalidade ou de 1 item.

A classe Carros contém os seguintes atributos: 

    private int id;
    private String marca;
    private String modelo;
    private String cor;
    private int anoFabricacao;

A classe CarroRepository armazena os dados dos carros salvos em um HashMap.

A classe CarroController realiza a chamada dos dados nas rotas http://localhost:8080/carros e http://localhost:8080/carros/{id}
