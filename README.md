Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Gestión de Mobiliario y Costos de Envio (Herencia, Sobrescritura y Polimorfismo en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🪑 Simulación de Gestión de Mobiliario y Envíos (Herencia y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema de catálogo y logística para una mueblería, implementando una jerarquía de clases mediante herencia para administrar distintos tipos de artículos (sillas ergonómicas, escritorios modulares y archivos rodantes) con reglas especializadas para el cálculo de costos de envío basados en peso y recargos logísticos por volumen o fragilidad. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **generalización de atributos protegidos (`protected`)**, la utilización de constructores mediante `super`, la sobrescritura polimórfica de métodos (`@Override`), la invocación de lógica heredada en cálculos y el procesamiento masivo mediante arreglos polimórficos en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base general, sus respectivas subclases especializadas y un punto de ejecución:

* **`Mueble`**: Clase base que centraliza los atributos y comportamientos comunes de cualquier artículo mobiliario.
* **Atributos protegidos (`protected`)**: `material`, `color` y `pesoKg`, permitiendo que las clases hijas accedan directamente a las características físicas del mueble.
* **Constructor**: Inicializa los datos comunes de fabricación y peso.
* **Métodos operativos**:
* `calcularCostoEnvio()`: Método base que calcula el costo logístico estándar multiplicando el peso en kilogramos por un factor base (`pesoKg * 1000`).
* `mostrarInformacion()`: Imprime por consola el material, el color y el peso del artículo.




* **`SillaErgonomica`**: Extiende de `Mueble` para modelar asientos de oficina con ajustes de confort.
* **Atributos privados (`private`)**: `ajusteAltura` y `soporteLumbar` (de tipo booleano).
* **Constructor**: Invoca a `super(...)` para configurar los datos base de la silla.
* **Sobrescritura (`@Override`)**:
* `calcularCostoEnvio()`: Extiende el cálculo base reutilizando `super.calcularCostoEnvio()` y sumando un recargo logístico fijo de `$5000`.
* `mostrarInformacion()`: Reutiliza `super.mostrarInformacion()` y detalla el estado de los ajustes de altura y soporte lumbar.




* **`EscritorioModular`**: Extiende de `Mueble` para modelar estaciones de trabajo amplias y desarmables.
* **Atributos privados (`private`)**: `superficieM2` y `cantidadCajoneras`.
* **Constructor**: Utiliza `super(...)` para asignar los atributos heredados y configura la superficie y cajoneras.
* **Sobrescritura (`@Override`)**:
* `calcularCostoEnvio()`: Calcula el envío sumando al costo base por peso un recargo estructural de `$10000` debido a su volumen.
* `mostrarInformacion()`: Muestra los datos generales mediante `super` y añade la superficie en metros cuadrados y el número de cajoneras.




* **`ArchivoRodante`**: Extiende de `Mueble` para modelar muebles de archivo metálicos pesados con sistemas de seguridad.
* **Atributos privados (`private`)**: `cantidadGavetas` y `sistemaSeguridad`.
* **Constructor**: Utiliza `super(...)` para configurar las propiedades físicas heredadas.
* **Sobrescritura (`@Override`)**:
* `calcularCostoEnvio()`: Incorpora un recargo de seguridad y manipulación de `$7000` al valor base retornado por `super.calcularCostoEnvio()`.
* `mostrarInformacion()`: Reutiliza la lógica base e incorpora la cantidad de gavetas y la disponibilidad de seguridad.




* **`Main`**: Punto de entrada del programa. Instancia una silla ergonómica, un escritorio modular y un archivo rodante con medidas reales, los agrupa en un arreglo polimórfico de tipo `Mueble[]`, y recorre la colección generando un reporte institucional que invoca de forma dinámica las descripciones y el cálculo de costos de envío correspondientes.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Cálculo Polimórfico de Costos Logísticos:** Cada subclase reutiliza la lógica base de transporte por peso (`super.calcularCostoEnvio()`) y le añade de manera flexible su propio recargo diferencial según la complejidad de manipulación del producto.
2. **Reutilización Estructurada con `super`:** Tanto en los métodos de cálculo como en los de visualización (`mostrarInformacion`), se invoca explícitamente a la superclase para evitar la duplicación de código y mantener la integridad del reporte.
3. **Procesamiento Masivo Uniforme:** El uso de un arreglo de la clase padre (`Mueble[]`) permite tratar de forma completamente transparente y polimórfica a objetos con atributos y comportamientos internos totalmente diversos.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
===== REPORTE DE MOBILIARIO =====

------------------------------
Material: Metal y tela
Color: Negro
Peso: 15.0 kg
Ajuste de altura: true
Soporte lumbar: true
Costo de envio: $20000.0

------------------------------
Material: Madera
Color: Marron
Peso: 40.0 kg
Superficie: 2.5 m2
Cantidad de cajoneras: 3
Costo de envio: $50000.0

------------------------------
Material: Metal
Color: Gris
Peso: 60.0 kg
Cantidad de gavetas: 5
Sistema de seguridad: true
Costo de envio: $67000.0

```

---

## 🚀 Conceptos de Programación Aplicados

* **Herencia y Reutilización de Código:** Estructuración jerárquica donde la superclase `Mueble` provee la base común de atributos y lógica financiera que las hijas extienden.
* **Polimorfismo y Ligadura Dinámica:** Ejecución en tiempo de ejecución de las versiones sobrescritas de `calcularCostoEnvio()` y `mostrarInformacion()` según el tipo real del objeto.
* **Diseño Modular:** Clara separación entre el dominio de negocio logístico y la ejecución de casos de prueba simulados en el cliente (`Main`).
