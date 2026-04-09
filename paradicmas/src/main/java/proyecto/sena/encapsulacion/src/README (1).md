# 🔒 Encapsulación en Programación Orientada a Objetos

---

## 🧠 Definición  
La **encapsulación** es un principio de la Programación Orientada a Objetos (POO) que consiste en proteger los datos de un objeto, restringiendo el acceso directo a sus atributos y controlando su modificación mediante métodos específicos.  

Su objetivo es garantizar la integridad de la información, evitando que los datos sean modificados de manera incorrecta o no controlada.  

De forma intuitiva, la encapsulación funciona como una “caja protegida” donde los datos internos solo pueden ser consultados o modificados a través de reglas definidas.

---

## 💻 Aplicación construida  
Se implementó una clase llamada `CuentaBancaria` que contiene atributos privados como:

- `titular`  
- `saldo`  

Estos atributos no pueden ser accedidos directamente desde otras clases, sino únicamente a través de métodos públicos como:

- `getTitular()`  
- `getSaldo()`  
- `depositar()`  
- `retirar()`  

En la clase `Main`, se crea un objeto de tipo `CuentaBancaria` con un titular y un saldo inicial. Luego, se realizan operaciones como depósitos y retiros utilizando los métodos controlados por la clase.

---

## ▶️ Resultados y funcionamiento  
Al ejecutar el programa se observa el siguiente comportamiento:

- Se crea una cuenta bancaria con un titular y un saldo inicial  
- Se consulta la información mediante métodos públicos  
- Se realizan operaciones de depósito y retiro  
- Se valida que las operaciones cumplan ciertas condiciones  

**Salida esperada (aproximada):**


Titular: Laura
Saldo inicial: 500000.0
Depósito realizado correctamente.
Retiro realizado correctamente.
Saldo final: 540000.0


Durante la ejecución se aplican validaciones como:
- No permitir depósitos con valores negativos o cero  
- No permitir retiros mayores al saldo disponible  
- No permitir valores inválidos en las operaciones  

Esto demuestra que el acceso a los datos está controlado y protegido mediante reglas internas.

---

## 🎯 Aprendizaje  
La encapsulación permite:

- 🔐 Proteger los atributos de una clase  
- 🎛️ Controlar el acceso y modificación de los datos  
- ✅ Validar información antes de ser procesada  
- 🧱 Mantener la integridad y consistencia del estado del objeto  

Desde una perspectiva intuitiva, la encapsulación funciona como un sistema seguro donde los datos no están expuestos directamente, sino que se accede a ellos mediante métodos controlados. Esto evita errores, mejora la seguridad y hace que el código sea más confiable y mantenible.