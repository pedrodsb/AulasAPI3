#language: pt
#Author: Pedro Augusto
#Version: 1.0
#Encoding: UTF-8

  @Gorest
  Funcionalidade: Criar e editar contas de usuarios
    Eu como Administrador do sistema, quero cadastrar, editar e excluir usuarios do sistema

  Cenario: Cadastrar novo usuario API Gorest
    Dado que possuo gorest token valido
    Quando envio um request de cadastro de usuario com dados validos
    Entao o usuario deve ser criado corretamente
    E o status code do request deve ser 200