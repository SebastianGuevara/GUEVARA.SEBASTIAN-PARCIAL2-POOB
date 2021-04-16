**IMPLEMENTACIÓN**
<img src="https://i.imgur.com/J7wGrl9.png">

**DISEÑO**
<img src="https://i.imgur.com/nR9zoRB.png">

<img src="https://i.imgur.com/Ol7uYSk.png">

**EXTENDIENDO**
1. Realice los cambios necesarios en el diagrama de clases en dónde se indique que una actividad podra tener dependencias a otras actividades o iteraciones.

<img src="https://i.imgur.com/U628W3R.png">

2. De los diseños resultantes del punto I y II, ¿Qué debe cambiar? ¿Qué no debe cambiar?. Justifique su respuesta.
- Debo cambiar la cantidad de clases, debido a que hay que agregar dos nuevas clases una de prerrquisitos y otra de las dependencias como tal. Esto lo hay que hacer ya que nos dicen que las dependencias es un requerimiento, por lo tanto si las actividades tienen varios requerimientos, por logica tambien podria tener varios dependencias. Ademas en el método de dependencias hay que agregar el método de printEstimatedEndDate para notificar la fecha dinal de la dependencia.

3. Teniendo en cuenta los cambios necesarios ¿Que fue bueno y que fue malo de su diseño?
- Yo creo que lo bueno de mi diseño es que hay herencia por lo tanto el mantenimiento del código sería mas eficiente ya que prevengo de repetir atributos y métodos entre varios métodos. Pero como todo lo bueno tiene su lado malo, y yo creo que se puede solucionar este problema de una manera mas eficiente.

**CONCEPTOS**
1.	¿Cuáles son las acciones los tres momentos importantes de las excepciones? ¿Cuál es el objetivo de cada una? ¿Cómo se implementa en Java cada acción?.
-	Lo tres momentos mas importantes de las excepciones es cuando se lanza la excepción, cuando se captura la excepción y cuando se atrapa la excepción.
-	El objetivo de tirar la excepción es comunicar a el usuario que hay una excepción en su código, se propaga debido a que se quiere controlar la excepción que fue lanzada.  Finalmente se atrapa debido a que se tiene que controlar la excepción, y en este momento se controla la excepción lanzada.
-	En java las excepciones se lanzan usando las palabras reservadas throw y new, y después el tipo de excepción que se debería lanzar con su respectivo mensaje. Las excepciones se propagan usando la palabra reservada throws y el tipo de excepción que el método pueda lanzar, esto se hace al lado de la firma del método que pueda lanzar la excepción. Finalmente, el método se atrapa usando dos palabra reservadas try y catch, primero se usa el try para probar el método que puede lanzar una excepción, y el catch se usa para que en dado caso el método tire una excepción, dicha excepción se pueda atrapara y hacer lo que se necesite con ella.

2. ¿Qué es sobre-escritura de métodos? ¿Por qué aplicarla? ¿Cómo impedir que se sobre-escriba un método?.
-	La sobre escritura de métodos es cuando se vuelve a escribir un método en otra clase. Esto se aplica porque se quiere cambiar el funcionamiento de un método ya implementado, pero en caso de que el método que se quiera sobrescribir sea abstracto, la sobre escritura lo que hace es implementar el funcionamiento del método. Finalmente la sobreescritura de métodos se puede impedir con la palabra reservada final al principio de la firma del método.
