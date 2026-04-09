# 🔗 Asociación en Programación Orientada a Objetos

---

## 🧠 Definición  
La **asociación** es una relación en la Programación Orientada a Objetos (POO) que describe una conexión entre dos o más clases, donde los objetos colaboran entre sí para cumplir un objetivo.  

A diferencia de otros tipos de relaciones más fuertes, la asociación no implica dependencia de ciclo de vida, sino simplemente una **relación de uso o interacción** entre objetos.

De forma intuitiva, se puede entender como una relación donde un objeto **“usa” o “se relaciona con”** otro objeto para realizar una funcionalidad.

---

## 💻 Aplicación construida  
Se implementó un sistema compuesto por las siguientes clases:

- `Profesor`: representa a una persona con un nombre.  
- `Curso`: representa un curso que está asociado a un profesor.  

En este caso, la clase `Curso` mantiene una referencia a un objeto `Profesor`, estableciendo una relación entre ambos.  

En la clase `Main`, se crea un objeto `Profesor` llamado `"Andrés Gómez"` y luego se crea un objeto `Curso` llamado `"POO en Java"`, al cual se le asigna el profesor como parte de su construcción. Posteriormente, se muestran los datos del curso junto con el nombre del profesor asociado.

---

## ▶️ Resultados y funcionamiento  
Al ejecutar el programa se observa el siguiente comportamiento:

- Se crea un profesor llamado **Andrés Gómez**  
- Se crea un curso llamado **POO en Java**  
- El curso se asocia con el profesor  
- Se muestran los datos del curso junto con el profesor asignado  

**Salida esperada:**


Curso: POO en Java
Profesor: Andrés Gómez


Esto demuestra que existe una relación entre ambos objetos, donde el curso depende del profesor para mostrar información, pero no controla su existencia.

Por ejemplo:
- El profesor puede existir independientemente del curso  
- El curso puede estar relacionado con un profesor específico  
- Existe una interacción directa entre ambos objetos  

---

## 🎯 Aprendizaje  
La asociación permite:

- 🔗 Relacionar objetos que interactúan entre sí  
- 🤝 Modelar dependencias lógicas sin dependencia de ciclo de vida  
- 🧩 Diseñar sistemas donde las clases colaboran entre sí  
- 🏗️ Mantener relaciones simples y directas entre objetos  

Desde una perspectiva intuitiva, la asociación funciona como una conexión entre objetos que trabajan juntos. No implica propiedad ni control, sino una relación basada en la colaboración para cumplir una funcionalidad dentro del sistema.