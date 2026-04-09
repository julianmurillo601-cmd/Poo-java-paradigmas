# 🏠 Composición en Programación Orientada a Objetos

---

## 🧠 Definición  
La **composición** es un tipo de relación en la Programación Orientada a Objetos (POO) que representa una relación **todo–parte fuerte**.  

En este caso, un objeto principal es responsable de crear, contener y gestionar completamente los objetos que forman parte de él. Si el objeto principal deja de existir, sus componentes también dejan de existir.  

De forma intuitiva, se entiende como una relación de tipo **“forma parte de”**, donde las partes no pueden existir de manera independiente fuera del objeto principal.

---

## 💻 Aplicación construida  
Se implementó un sistema compuesto por las siguientes clases:

- `Casa`: representa el objeto principal que contiene habitaciones.  
- `Habitacion`: representa las partes que conforman la casa.  

La clase `Casa` se encarga de crear internamente los objetos `Habitacion` mediante el método `agregarHabitacion()`. Además, almacena una lista de habitaciones que forman parte de la casa.  

En la clase `Main`, se crea una casa con una dirección específica y luego se agregan diferentes habitaciones como `"Sala"`, `"Cocina"` y `"Habitación principal"`. Finalmente, se muestran todas las habitaciones asociadas a la casa.

---

## ▶️ Resultados y funcionamiento  
Al ejecutar el programa se observa el siguiente comportamiento:

- Se crea una casa ubicada en una dirección específica  
- La casa crea y gestiona sus propias habitaciones  
- Se agregan varias habitaciones a la casa  
- Se imprime la lista de habitaciones pertenecientes a la casa  

**Salida esperada:**


Casa ubicada en: Calle 10 # 15-20

Sala
Cocina
Habitación principal

Esto demuestra que las habitaciones dependen completamente de la casa, ya que son creadas dentro de ella y no existen de forma independiente en el contexto del sistema.

Por ejemplo:
- Las habitaciones no se crean fuera de la casa  
- No tienen sentido sin una casa que las contenga  
- Su ciclo de vida está ligado al de la casa  

---

## 🎯 Aprendizaje  
La composición permite:

- 🧱 Modelar relaciones fuertes entre objetos  
- 🔒 Garantizar que los componentes dependan completamente del objeto principal  
- 🏗️ Construir estructuras jerárquicas bien definidas  
- ♻️ Controlar el ciclo de vida de los objetos desde una clase principal  

Desde una perspectiva intuitiva, la composición funciona como un objeto que “construye y posee” sus partes. Es la relación más fuerte entre clases, ya que las partes no pueden existir sin el todo, lo que permite diseñar sistemas más controlados y coherentes.