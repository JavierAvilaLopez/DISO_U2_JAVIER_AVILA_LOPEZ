# 🏥 Servicio Médico en la Guardería - Strategy & Template Method

Este repositorio implementa los patrones de diseño **Strategy** y **Template Method** para gestionar el servicio médico en una guardería.

---

## 📌 Patrones de Diseño Utilizados

### 🔹 Template Method
El **patrón Template Method** define una estructura base para el servicio médico, asegurando que ciertas operaciones se realicen en un orden específico sin permitir modificaciones en métodos clave.

#### 🏗️ Estructura
- **`KinderGardenServiceTemplate`** (clase abstracta)
  - `applyServiceStrategy()`: Orquesta el proceso en un orden fijo.
  - `inspectChildren()` (método abstracto, sobrescrito por subclases).
  - `sendResultsInspection()` y `sendInvoice()` (protegidos para evitar modificaciones).

#### 🏥 Implementaciones
- **`FongDoctorService`**: Implementación específica de `inspectChildren()`.
- **`WangDoctorService`**: Otra implementación distinta de `inspectChildren()`.

### 🔹 Strategy
El **patrón Strategy** permite definir diferentes estrategias de inspección médica y cambiar dinámicamente la forma en que se aplican.

#### 🏗️ Estructura
- **`DoctorStrategy`** (interfaz)
  - Define el método `inspectChildren()`.

#### 🏥 Implementaciones
- **`FongDoctorStrategy`**: Define una inspección específica.
- **`WangDoctorStrategy`**: Implementa otra variación del proceso.

#### 🔄 Contexto
- **`KinderGardenServiceContext`**
  - Contiene una referencia a `DoctorStrategy`, permitiendo el cambio de estrategia en tiempo de ejecución.
  - También está vinculado con `KinderGardenServiceTemplate` para aplicar el servicio.

---

## 🖥️ **Diagrama UML**
![UML](https://diagrams.helpful.dev/d-r2/d-r2:vrZ9ryqX)

---

## 🚀 **Cómo Usar**

### 📌 Clonar el Repositorio
```bash
git clone https://github.com/JavierAvilaLopez/DISO_U2_JAVIER_AVILA_LOPEZ.git
```

