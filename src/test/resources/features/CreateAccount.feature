#language: es

Característica: como usuario realice una creación de cuenta


  @RegistroExitoso
  Esquema del escenario: Escenario: Realizar una creación de cuenta exitosa
    Dado el usuario ingresa a pagina
    Cuando   ingrese un <correo> presione registrarse
    Y Se registre correctamente la  persona <genero>  <nombre>  <apellido>, con nacida el <dia> de <mes> del <ano>, con una contrasena <contrasena>
    Entonces  el sistema muestra mensaje del home
    Ejemplos:
      | correo             | genero | nombre | apellido | dia | mes | ano | contrasena |
      | prueba19@gmail.com | hombre | carlos | prueba   |   19  |Agosto     | 1995    |     PRueba1234       |
