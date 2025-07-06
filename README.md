# Proyecto POO: Sistema de Contenidos Audiovisuales

#UNIVERSIDAD POLITECNICA SELESIANA

## 🎯 Objetivos y Propósito del Proyecto

Este proyecto tiene como objetivo aplicar los principios de la **Programación Orientada a Objetos (POO)** para modelar un sistema de gestión de contenidos audiovisuales. El propósito principal es representar películas, series de televisión, documentales, novelas y videos de cine, utilizando clases, herencia, composición y asociación.

## 🚀 Clases y Funcionalidades Nuevas

- `Novela`: Subclase de `ContenidoAudiovisual` que representa novelas de televisión. Incluye datos como canal de emisión, número de capítulos, país de origen, actores y fecha de estreno.
- `VideoDeCine`: Subclase de `ContenidoAudiovisual` que representa videos cinematográficos como tráileres, avances, cortos, etc. Incluye tipo de video, formato, productor y fecha de estreno.
- `Actor`: Representa a los actores participantes en películas, novelas y videos de cine.
- `Investigador`: Asociado a documentales, con atributos académicos y científicos.
- `Temporada`: Clase que representa las temporadas de una serie de televisión, incluyendo episodios, fechas y duración promedio.

## 📦 Instrucciones para Clonar y Ejecutar el Proyecto

### 1. Clonar el repositorio

```bash
git clone https://github.com/tu-usuario/proyecto-poo-audiovisual.git
cd proyecto-poo-audiovisual
```

### 2. Compilar el proyecto

Asegúrate de tener instalado Java JDK (versión 8 o superior).

```bash
javac -d bin src/uni1a/*.java src/poo/*.java
```

### 3. Ejecutar el proyecto

```bash
cd bin
java poo.PruebaAudioVisual
```

### 4. Estructura del Proyecto

```
proyecto-poo-audiovisual/
├── src/
│   ├── uni1a/              # Paquete de clases base y subclases
│   └── poo/                # Clase principal de prueba
├── bin/                    # Archivos compilados .class
└── README.md               # Descripción del proyecto
```

## ✅ Mejoras Adicionales

- Uso de listas dinámicas (ArrayList) para gestionar actores, temporadas y episodios.
- Implementación de relaciones entre clases (asociación, composición).
- Separación clara entre paquetes (`uni1a`, `poo`).
- Código comentado y estructurado para facilitar la comprensión y reutilización.

---

Este proyecto sirve como una base sólida para el aprendizaje de los fundamentos de la programación orientada a objetos mediante un ejemplo práctico, escalable y extensible.
