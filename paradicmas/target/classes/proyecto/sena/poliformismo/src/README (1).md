# 🔀 Polimorfismo en Programación Orientada a Objetos

---

## 🧠 Definición  
El **polimorfismo** es un principio de la Programación Orientada a Objetos (POO) que permite que un mismo método o comportamiento tenga diferentes implementaciones dependiendo del objeto que lo ejecute.  

En otras palabras, una misma acción puede comportarse de distintas formas según el tipo de objeto en tiempo de ejecución.  

De forma intuitiva, el polimorfismo funciona como una “misma interfaz con múltiples formas”, donde un método común puede adaptarse a diferentes comportamientos específicos.

---

## 💻 Aplicación construida  
Se implementó una jerarquía de clases compuesta por:

- `Animal`: clase base que define el método `hacerSonido()` con un comportamiento general.  
- `Perro`: clase que hereda de `Animal` y sobrescribe el método `hacerSonido()` para indicar que el perro ladra.  
- `Gato`: clase que hereda de `Animal` y sobrescribe el método `hacerSonido()` para indicar que el gato maúlla.  

En la clase `Main`, se utilizan referencias de tipo `Animal` para instanciar objetos de tipo `Perro` y `Gato`. Aunque las variables son del tipo general `Animal`, en tiempo de ejecución se invocan los métodos específicos de cada clase.

---

## ▶️ Resultados y funcionamiento  
Al ejecutar el programa se observa el siguiente comportamiento:

- Se crean objetos de tipo `Perro` y `Gato` utilizando referencias de tipo `Animal`  
- Se invoca el método `hacerSonido()` en ambos objetos  
- Cada objeto ejecuta su propia implementación del método  

**Salida esperada:**


El perro ladra.
El gato maúlla.


Esto demuestra que, aunque se usa el mismo método (`hacerSonido()`), el comportamiento varía según el tipo real del objeto.

Por ejemplo:
- `animal1` ejecuta el comportamiento de `Perro`  
- `animal2` ejecuta el comportamiento de `Gato`  
- El método se comporta de manera diferente sin cambiar su nombre  

---

## 🎯 Aprendizaje  
El polimorfismo permite:

- 🔄 Utilizar un mismo método con diferentes comportamientos  
- 🧩 Trabajar con objetos de distintas clases de forma uniforme  
- 🚀 Facilitar la extensibilidad del sistema sin modificar código existente  
- 🏗️ Diseñar sistemas más flexibles y dinámicos  

Desde una perspectiva intuitiva, el polimorfismo permite que una misma acción se adapte según el contexto del objeto que la ejecuta. Es como una misma “orden” que produce diferentes resultados dependiendo de quién la reciba, lo que hace que el sistema sea más versátil y escalable.