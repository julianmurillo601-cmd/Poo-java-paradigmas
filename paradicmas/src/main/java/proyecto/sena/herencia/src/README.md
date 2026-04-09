# 🧬 Herencia en Programación Orientada a Objetos

---

## 🧠 Definición  
La **herencia** es un principio de la Programación Orientada a Objetos (POO) que permite crear nuevas clases a partir de clases existentes, heredando atributos y métodos.  

Este mecanismo facilita la reutilización de código y la creación de jerarquías entre clases, donde una clase base (superclase) comparte sus características con clases derivadas (subclases).  

De forma intuitiva, la herencia funciona como una relación de tipo **“es un”**, donde una clase especializada es una versión más específica de una clase general.

---

## 💻 Aplicación construida  
Se implementó una jerarquía de clases compuesta por:

- `Empleado`: clase base que contiene atributos comunes como `nombre` y `salario`, además del método `mostrarInformacion()`.  
- `Gerente`: clase que hereda de `Empleado` y añade el atributo `area`, junto con el método `mostrarArea()`.  
- `Desarrollador`: clase que también hereda de `Empleado` y añade el atributo `lenguaje`, junto con el método `mostrarLenguaje()`.  

En la clase `Main`, se crean objetos de tipo `Gerente` y `Desarrollador`, los cuales utilizan tanto los métodos heredados de `Empleado` como sus propios métodos específicos.

---

## ▶️ Resultados y funcionamiento  
Al ejecutar el programa se observa el siguiente comportamiento:

- Se crean objetos de tipo `Gerente` y `Desarrollador`  
- Ambos reutilizan atributos y métodos de la clase base `Empleado`  
- Cada clase añade comportamientos específicos según su rol  
- Se muestran los datos generales junto con la información particular de cada clase  

**Salida esperada:**

Nombre: María
Salario: 4500000.0
Área: Tecnología

Nombre: Carlos
Salario: 3800000.0
Lenguaje principal: Java


Esto demuestra cómo las clases hijas heredan características de una clase padre y, al mismo tiempo, pueden extender su funcionalidad.

Por ejemplo:
- `Gerente` y `Desarrollador` comparten atributos comunes como nombre y salario  
- Cada uno agrega información específica según su tipo  
- Se evita duplicar código en cada clase  

---

## 🎯 Aprendizaje  
La herencia permite:

- ♻️ Reutilizar código existente sin necesidad de repetirlo  
- 🧱 Crear jerarquías entre clases bien estructuradas  
- 🧩 Extender funcionalidades a partir de una clase base  
- 📈 Organizar mejor sistemas complejos mediante especialización  

Desde una perspectiva intuitiva, la herencia permite construir clases más específicas a partir de una clase general, como si se tratara de una “familia” donde los hijos heredan características del padre, pero también tienen sus propias particularidades. Esto facilita la escalabilidad y mantenimiento del sistema.