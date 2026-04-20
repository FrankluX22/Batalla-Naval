# Batalla Naval

Un juego clásico de Batalla Naval implementado en Java.

## Descripción

Este proyecto implementa el juego de Batalla Naval (Battleship) en Java. Los jugadores colocan sus barcos en un tablero y se turnan para disparar coordenadas, intentando hundir todos los barcos del oponente.

## Requisitos

- Java Development Kit (JDK) 8 o superior
- Sistema operativo Windows/Linux/Mac

## Instalación

1. Clona o descarga el proyecto en tu máquina local.
2. Asegúrate de tener Java instalado. Puedes verificar con:
   ```
   java -version
   ```


### Usando el JAR precompilado

Si tienes el archivo `main.jar`, puedes ejecutarlo directamente:
```
java -jar main.jar
```

## Estructura del Proyecto

```
Batalla Naval/
├── Main.java          # Clase principal del juego
├── main.jar           # Archivo JAR ejecutable
└── README.md          # Este archivo
```

## Cómo Jugar

1. El juego iniciará mostrando un mensaje de bienvenida.
2. Se crearán los tableros para ambos jugadores.
3. Los barcos se posicionarán automáticamente o manualmente (pendiente de implementación).
4. Los jugadores se turnarán para disparar coordenadas.
5. El primer jugador en hundir todos los barcos del oponente gana.

## Estado del Desarrollo

Este es un proyecto en desarrollo. Actualmente implementado:
- Estructura básica del programa
- Método principal de inicio

Pendiente de implementar:
- Sistema de tableros
- Lógica de colocación de barcos
- Sistema de turnos
- Detección de disparos y hundimientos
- Condiciones de victoria

## Contribución

Si deseas contribuir al proyecto:
1. Haz un fork del repositorio
2. Crea una rama para tu feature (`git checkout -b feature/nueva-funcionalidad`)
3. Commit tus cambios (`git commit -am 'Agrega nueva funcionalidad'`)
4. Push a la rama (`git push origin feature/nueva-funcionalidad`)
5. Abre un Pull Request

## Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo LICENSE para más detalles.

## Troubleshooting

### Error: "java no se reconoce como un comando interno o externo"
- Asegúrate de que Java esté instalado y agregado al PATH del sistema.
- Descarga e instala JDK desde https://www.oracle.com/java/technologies/javase-downloads.html

### Error al compilar: "Main.java: error: class Main is public, should be declared in a file named Main.java"
- El nombre del archivo debe coincidir exactamente con el nombre de la clase pública.

### El juego no inicia correctamente
- Verifica que estés ejecutando desde el directorio correcto.
- Asegúrate de que no haya errores de compilación.