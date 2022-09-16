# Matriz
## _Rotar matriz en sentido anti-horario_

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

## Features

Implementar un backend con un API Rest (Java Funcional) que reciba un 
array de arrays de números que conformen una matriz de NxN representando una imagen, y se 
devuelva la misma matriz que represente la imagen, pero rotada en sentido anti-horario (90 grados).
La API debe ser de tipo POST, el Content-Type de los request y response deben ser application/json
y se debe controlar correctamente los errores. Adicional, el backend debe estar dockerizad


## Docker

Dillinger is very easy to install and deploy in a Docker container.

By default, the Docker will expose port 8080, so change this within the
Dockerfile if necessary. When ready, simply use the Dockerfile to
build the image.

```sh
docker build -t prueba-matrix-operation .
docker image ls.
```


Verify the deployment by navigating to your server address in
your preferred browser.

```sh
docker run --name container-prueba-matrix  -p 9091:9091 prueba-matrix-operation
```

## Request

Endpoint

```sh
http://localhost:9091/matrixOperation/rotation
```
**Ejemplo 1**
Input: [ [1,2], [3,4] ]
Output: [ [2,4], [1,3] ]
 
**Ejemplo2**
Input: [ [1,2,3], [4,5,6], [7,8,9] ]
Output: [ [3,6,9], [2,5,8], [1,4,7] ]
