poolobject
==========

Java code example of  design creational pattern pool object

Example to apply good practise in software developmemnt: test and mesurement.

Autor:

Ruben Martinez

## Enlaces:

#### Travis CI

[![Build Status](https://travis-ci.org/RubenMartinezAragon/poolobject.svg?branch=master)](https://travis-ci.org/RubenMartinezAragon/poolobject)

#### CodeCov IO

[![codecov](https://codecov.io/gh/RubenMartinezAragon/poolobject/branch/master/graph/badge.svg)](https://codecov.io/gh/RubenMartinezAragon/poolobject)

## Proceso:

* En primer lugar se escriben las pruebas utilizando eclipse, en mi caso empece por la prueba 
* Posteriormente se realiza un commit a nuestro repositorio en github con la nueva prueba integrada y su funcionalidad
* Cuando realizamos este commit es detectado por Travis CI el cual realiza los test, en nuestro caso esta configurado para que este para cuando se ejecuta un test invalido es por esto que asta que no tenemos todos los test no se crear el fichero de cobertura de código .
* Una vez se crea esto en codecov podemos ver la cobertura de código de nuestras pruebas y de ese modo determinar la calidad del código creado
* En caso de no tener cobertura total como fue en mi caso se pueden realizar cambios en las pruebas indicando estos y haciendo un commit para aumentar la cobertura de las pruebas

## Preguntas:


**1. ¿ se ha realizado el trabajo en equipo ?**

Puesto que solo soy uno en el grupo no puedo contestar a esta pregunta

**2. ¿Tiene calidad el conjunto de pruebas disponible?**

Si puesto que se alcanza un 100% de cobertura de código a probar sin tener en cuenta la clase cliente que es la que hace uso de esos métodos testados

**3. ¿Cual es el esfuerzo invertido en la actividad?**

El esfuerzo seria el siguiente:
* Unos 20 min por cada test bien la funcionalidad del método y creando un test para la cobertura total
* Una 1h para hacer el informe puesto que nunca uso Openoffice y no sabia como hacer muchas cosas

En total podemos decir que habrá sido 2h aproximadamente

**4. ¿Cual es el numero de fallos encontrados en el código?** 
No, ninguno ya que todos los test obtienen los resultados esperados desde un primer momento

## Conclusión:

La patriarca me a parecido muy interesante ya que trabajamos con nuevas plataformas con las que nunca antes había trabajado y que desconocía y nos hace ver como es muy fácil trabajar en un entorno de desarrollo continuo el cual esta muy bien integrado con Github y nos permite crear un repositorio de mayor calidad con un código mejor probado ya que nos permite ver cuanto de ese codigo es ejecutado por las pruebas.
