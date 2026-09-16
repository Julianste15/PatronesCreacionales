# Patrones Creacionales - Builder 🏗️

> Implementación del patrón de diseño **Builder** para construir de forma guiada proyectos de grado (investigación, práctica profesional o plan coterminal).

**🇪🇸 Español:** Demuestra cómo el patrón *Builder* divide la construcción de un objeto complejo (`Project`) en pasos controlados por un *Director*, con builders especializados según la modalidad del proyecto. Incluye diagrama UML de la solución.

**🇺🇸 English:** A practical example of the **Builder** design pattern for building complex degree-project objects step by step, orchestrated by a *Director*, with dedicated builders per project type (research, professional practice, coterminal degree). Includes a UML diagram.

## ✨ Funcionalidades / Features

- `ProjectBuilder` (interfaz) con builders: `ResearchProjectBuilder`, `ProfessionProjectBuilder`, `CoterminalPlanProjectBuilder`
- `ProjectDirector` que orquesta la construcción paso a paso
- `Project` con validaciones y fecha de creación
- Diagrama UML en `image.png`

## 🛠️ Tecnologías / Tech Stack

- Java · Patrón Builder (GoF) · UML

## 🚀 Ejecución / Getting Started

```bash
javac *.java
java ClienteMain
```

## 👤 Autor y contexto / About

Proyecto académico de la asignatura **Patrones de Diseño**. © Julián Camacho.