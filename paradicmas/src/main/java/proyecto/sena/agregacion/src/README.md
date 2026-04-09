# 🤝 Agregación en Programación Orientada a Objetos

---

## 🧠 Definición  
La **agregación** es un tipo de relación entre objetos en la Programación Orientada a Objetos (POO) que representa una asociación **todo–parte débil**.  

En este caso, un objeto principal contiene otros objetos, pero estos pueden existir de manera independiente. Es decir, los objetos “parte” no dependen del ciclo de vida del objeto “todo”.

En términos intuitivos, se puede entender como una relación de **“tiene un”**, donde el contenedor agrupa elementos sin ser responsable de su creación ni destrucción.

---

## 💻 Aplicación construida  
Se implementó un sistema donde:  

- La clase `Equipo` representa el objeto principal  
- La clase `Jugador` representa los elementos que forman parte del equipo  

El `Equipo` contiene una lista de objetos `Jugador`, permitiendo agregar múltiples jugadores mediante el método `agregarJugador()`.  

En la clase `Main`, se crean jugadores de manera independiente y luego se asignan a un equipo llamado `"Tigres"`. Finalmente, el equipo muestra la lista de jugadores asociados.

---

## ▶️ Resultados y funcionamiento  
Al ejecutar el programa se obtiene una salida similar a:

- Se crea un equipo llamado **Tigres**  
- Se agregan jugadores como **Luis** y **Pedro**  
- Se imprime la lista de jugadores pertenecientes al equipo  

Ejemplo de salida:


Equipo: Tigres

Luis
Pedro

Esto demuestra que el equipo agrupa jugadores, pero los jugadores existen como objetos independientes fuera del equipo.

Por ejemplo:  
- Un jugador puede existir sin pertenecer a un equipo  
- Un jugador puede ser reutilizado en otro equipo (en teoría)  
- El equipo no controla la creación ni destrucción de los jugadores  

---

## 🎯 Aprendizaje  
La agregación permite:  

- 🔗 Representar relaciones flexibles entre objetos  
- 🧩 Reutilizar objetos en diferentes contextos  
- 🏗️ Modelar estructuras donde los componentes no dependen completamente del contenedor  
- 📦 Mantener independencia entre las clases relacionadas  

Desde una perspectiva intuitiva, la agregación funciona como un “contenedor” que agrupa elementos externos sin poseerlos completamente. Esto permite construir sistemas más modulares y desacoplados, facilitando su mantenimiento y expansión.