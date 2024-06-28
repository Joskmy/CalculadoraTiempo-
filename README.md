# Calculadora de Fechas y Tiempos

## Descripción

Este proyecto consiste en una serie de clases en Java diseñadas para calcular diferencias entre fechas y proporcionar información detallada sobre la fecha ingresada por el usuario. El programa permite calcular la diferencia en años, meses, días, horas, minutos y segundos entre una fecha ingresada y la fecha actual. También ofrece funcionalidades para cambiar la fecha ingresada y obtener el día de la semana correspondient.
La intención principal de este proyecto es demostrar que abordar un problema desde una perspectiva analítica y dividirlo en componentes manejables puede mejorar significativamente la escalabilidad y la calidad del resultado final. La versión inicial (v1) del programa, aunque funcional, presenta dificultades en términos de legibilidad y escalabilidad. Este proyecto ilustra cómo una estructura bien planificada y modular puede no solo simplificar el mantenimiento del código, sino también facilitar futuras mejoras y ampliaciones. La evolución del código de la versión inicial a la versión actual destaca la importancia de diseñar soluciones robustas y bien organizadas desde el principio.

## Estructura del Proyecto

El proyecto está compuesto por varias clases:

- **CalculadoraFecha**: Proporciona métodos estáticos para calcular la diferencia entre dos fechas en años, meses, días y horas.
- **CalculadoraTiempoV1**: Es el punto de entrada del programa. Permite al usuario ingresar una fecha, seleccionar varias opciones de cálculo y obtener el día de la semana correspondiente a la fecha ingresada.
- **Fecha**: Representa una fecha con día, mes y año, y contiene métodos para validar y obtener la fecha.
- **FechaActual**: Representa la fecha actual y proporciona métodos para obtener el día, mes y año actual.
- **Mes**: Representa un mes con su número y la cantidad máxima de días.
- **Prueba**: Clase de prueba para demostrar el funcionamiento de los métodos de la clase CalculadoraFecha.
- **UtilFecha**: Proporciona métodos utilitarios para validar fechas y determinar si un año es bisiesto.

## Tecnologías Usadas

Este proyecto se desarrolló completamente en JAVA
