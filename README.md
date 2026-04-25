#  Laboratorio Sem 03 - simUPato

En este laboratorio aplicaremos el **patrón de diseño Strategy** al proyecto **simUPato**, con el objetivo de mejorar la flexibilidad y reutilización del código.

---

##  Objetivos

- Comprender el patrón de diseño **Strategy**
- Identificar comportamientos que pueden variar en tiempo de ejecución
- Desacoplar algoritmos de las clases principales
- Aplicar buenas prácticas de diseño orientado a objetos

---

##  ¿Qué es el patrón Strategy?

El patrón **Strategy** permite definir una familia de algoritmos, encapsular cada uno de ellos y hacerlos intercambiables. Este patrón permite que el algoritmo varíe independientemente de los clientes que lo utilizan.

---

##  Contexto: simUPato

El proyecto simUPato simula diferentes tipos de patos con comportamientos variables como:
- Volar 
- cuaquear 

En lugar de implementar estos comportamientos directamente en cada tipo de pato, utilizaremos **Strategy** para separarlos en clases independientes.

---

##  Estructura del proyecto
