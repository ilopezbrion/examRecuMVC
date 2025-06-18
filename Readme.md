# Examen recuperación MVC
---
Transforma esta aplicación según la arquitectura MVC vista en clase, sin cambiar la funcionalidad

Valoración:

* Clases por separado
* Funcionalidad de la vista (20 puntos)
* Funcionalidad del Controller (20 puntos)
* Utilización de Clase para guardar datos (como la clase Coche utilizada en clase) (20 puntos)
  * Coherencia con la clase Model (10 puntos)
* Realización de commits por cada paso que se realice (10 puntos)
* Comentarios en el código (5 puntos)
* Readme justificando la toma de desición y describiendo los beneficios aportados por el cambio de código (15 puntos)




Explicación:

Primeramente cree las distintas clases del MVC, separé lo que es el main en una clase a parte, Main, antes App pero la renombré entre un error y otro
Empecé copiando en el Controller el main de la calculadora original
me fijé en que todo gira entorno a las opciones del menú por lo cual lo que hice fue que el menú pues es visual fuese un método del View
Con ese método creado empecé a hacer que sus distintas opciones fuesen métodos del Controller y esto s mismos en función de que acción quisiesen hacer llamarían al Model para por ejemplo sumar
separé los bloques de código de suamr multiplicar etc y los metí en el model paraque este hiciese las operaciones
El Controller se dedicaría a pedir los datos para enviarselos al model y luego de vuelta se le pasan a la view para que los imprima y siga con el bucle

