# Conversor de Divisas
Esta aplicación convierte diferentes divisas a MXN (pesos mexicanos) y viceversa;
se hace uso de la API de https://www.exchangerate-api.com/ para obtener las tasas de cambio actualizadas.



## Funcionalidades

- Convertir de Dolares a Pesos Méxicanos
- Convertir de Euros a Pesos Méxicanos
- Convertir de Euros a Pesos Méxicanos
- Convertir de Libras Esterlinas a Pesos Méxicanos
- Convertir de Yenes a Pesos Méxicanos
- Convertir de Dolar Australiano a Pesos Méxicanos
- Convertir de Dolar Canadiense a Pesos Méxicanos

## Requisitos

- Java Development Kit (JDK) 8 o superior
- Internet para obtener las tasas de cambio actuales

## Instalación

Clona el repositorio:

    ```sh
    git clone https://github.com/tu-usuario/tu-repositorio.git
    cd tu-repositorio
    ```
Tener el archivo `gson-2.11.0.jar` en la carpeta `lib`.
Compila el proyecto:
    ```sh
    javac -cp "lib/gson-2.11.0.jar" -d bin src/*.java
    ```

## Uso
Ejecuta el programa:
    ```sh
    java -cp "bin:lib/gson-2.11.0.jar" Inicio
    ```
    Sigue las instrucciones en pantalla para seleccionar la divisa que deseas convertir y proporciona el monto a convertir.

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

## Contacto

Si tienes alguna pregunta o sugerencia, no dudes en abrir un issue o contactar al autor del repositorio.