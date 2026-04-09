# 📘 Abstracción en Programación Orientada a Objetos

---

## 🧠 Definición  
La **abstracción** es un principio de la Programación Orientada a Objetos (POO) que consiste en representar entidades del mundo real mostrando únicamente sus características esenciales, mientras se ocultan los detalles internos de implementación.  

En otras palabras, permite centrarse en **qué hace un objeto**, sin necesidad de conocer **cómo lo hace** internamente. Esto simplifica el diseño y uso de sistemas complejos.

---

## 💻 Aplicación construida  
Se implementó una clase abstracta llamada `Figura`, la cual define un método común `calcularArea()`. Esta clase sirve como base para diferentes tipos de figuras geométricas.

A partir de ella, se crearon clases concretas como:  
- `Circulo`  
- `Rectangulo`  

Cada una implementa su propia lógica para calcular el área según su forma.

En la clase `Main`, se utilizan referencias de tipo `Figura` para instanciar objetos de distintos tipos. Esto permite trabajar de manera genérica, invocando métodos sin depender del tipo específico de cada figura.

---

## ▶️ Resultados y funcionamiento  
Al ejecutar el programa se obtiene una salida similar a:

- Se identifica el tipo de figura mediante el método `mostrarTipo()`  
- Se calcula el área correspondiente según el objeto creado  

Por ejemplo:

- Para un **círculo** con radio 5:  
  - Se muestra el tipo de figura  
  - Se calcula el área usando la fórmula: π × r²  
  - Resultado aproximado: **78.54**

- Para un **rectángulo** con base 4 y altura 6:  
  - Se muestra el tipo de figura  
  - Se calcula el área usando la fórmula: base × altura  
  - Resultado: **24**

Esto demuestra cómo un mismo método (`calcularArea`) puede comportarse de manera diferente dependiendo del objeto que lo implemente.

---

## 🎯 Aprendizaje  
La abstracción permite:  

- 🧩 Trabajar con conceptos generales en lugar de detalles específicos  
- 🔁 Reutilizar código mediante clases base  
- 🧱 Construir sistemas más organizados y escalables  
- 🚀 Extender funcionalidades sin modificar la estructura existente  

Desde una perspectiva intuitiva, la abstracción funciona como una “caja negra”: el usuario sabe qué entrada proporcionar y qué resultado esperar, sin preocuparse por los procesos internos. Esto facilita el desarrollo, mantenimiento y comprensión del software.