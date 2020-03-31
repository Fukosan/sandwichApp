# Sandwich App

Proyecto final para clase de 'Taller de Desarrollo de Aplicaciones Para Android'. Consta en una aplicación para celulares android la cual muestra información acerca de Sandwiches para una empresa que vende estos.

## Características de la aplicación

La aplicación consta de lo siguiente:

### Vistas

- activity_main: Vista principal que lleva al resto de la aplicación. Usa Constraint Layout.
- activity_about_view: Vista que presenta un mensaje descriptivo acerca de la empresa. Usa Relative Layout.
- activity_sandwich_view: Vista que presenta, de forma dinámica, una lista de todos los sandwiches ingresados en el sistema. Ver en 'Detalles' para ver cómo agregar un nuevo sandwich. Usa Linear Layout.
- activity_detalle_sandwich: Vista que presenta, a través de los datos pasados desde la vista anterior, los datos asociados a cada sandwich. Usa Constraint Layout.

### Otras características

- Vistas alternativas para Portrait mode y Landscape mode.

## Detalles

### Agregar nuevo sandwich

Para agregar un nuevo sandwich, primero se debe ir a:

```
res/values/strings.xml
```
Se debe cambiar el valor en la linea 15, el cual es llamado 'cantidadSandwiches'. Se debe incrementar según la cantidad de sandwiches que se quieren agregar. Luego de esto, se deben agregar ir a:

```
ubb/sandwichapp/sandwichView.java
```

Para poder agregar en la línea 34 (Luego de la definición de los otros sandwiches), una declaración del nuevo objeto sandwich que se está creando. Si bien se recomienda agregar primero los textos en el archivo strings.xml, se pueden ingresar los datos directamente con la forma anteriormente dicha. El formato es el siguiente:

```
sandwichArray[i] = new Sandwich('nombre', 'idImagen', 'descripcion' 'precio');
```

Donde i corresponde al número consecutivo al sandwich anteriormente introducido.

## Autor
Benjamín Enrique Islas Pacheco


## Carrera
Ingeniería de Ejecución en Computación e Informática
