# Ejercicios

1. Implementa Args en uno de los proyectos que se han ido trabajando y aplica las buenas prácticas que se han visto en la sesión 19.
2. Identifica las características principales de la arquitectura limpia, indica en que casos se tendría que utilizar la arquitectura limpia y como lo harías.
3. Teniendo en cuenta lo visto en la sesión 21, utiliza un proyecto de los trabajados y límpialo. Si encuentras código duplicado, elimínalo y realiza la minificación de las clases y métodos.

## Resolución del Ejercicio 2

### Características de la Arquitectura Limpia
- Separación de Responsabilidades: la arquitectura limpia separa las responsabilidades en capas, las cuales cada una se enfoca en una tarea en específico
- Independencia de la plataforma: puede desarrollar componentes independientes de la plataforma.
- Dependencias Inversas: en la arquitectura limpia, las capas superiores no dependen de las capas inferiores y cualquier cambio en una capa no afecta a las capas superiores.
- Pruebas Unitarias: la arquitectura limpia promueve la realización de pruebas unitarias, lo que ayuda a asegurar que los componentes del software funcionan correctamente.
- Separación de la lógica Empresarial: la arquitectura limpia separa la lógica empresarial del software en capas específicas.

### Casos de Uso
- Desarrollo de Aplicaciones Empresariales: en este caso, se podría utilizar la arquitectura limpia para separar la lógica empresarial de la interfaz de usuario y de la infraestructura de datos. Se podrían crear diferentes capas para cada una de estas responsabilidades y utilizar el principio de dependencias inversas para minimizar las dependencias entre ellas.
- Desarrollo de Aplicaciones Web: en este caso, se podría utilizar la arquitectura limpia para separar la lógica de negocio de la interfaz de usuario y de la capa de datos. Se podrían utilizar patrones como MVC (Modelo-Vista-Controlador) para separar la responsabilidad de cada capa y mantener una estructura clara y organizada.
- Desarrollo de Aplicaciones Móviles: en este caso, se podría utilizar la arquitectura limpia para separar la lógica de negocio de la interfaz de usuario y de la capa de acceso a datos. Se podrían utilizar patrones como MVVM (Modelo-Vista-Modelo de vista) para separar la responsabilidad de cada capa y mantener una estructura modular y fácilmente mantenible.
- Desarrollo de Aplicaciones de Inteligencia Artificial: en este caso, se podría utilizar la arquitectura limpia para separar la lógica de inteligencia artificial de la interfaz de usuario y de la capa de acceso a datos. Se podrían utilizar patrones como MVP (Modelo-Vista-Presentador) o MVVM para separar la responsabilidad de cada capa y mantener una estructura clara y organizada.