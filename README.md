# Feedback2RxJava

Borja Rodriguez Jimenez Programación Concurrente.

RxJava

	1. Realiza una aplicación JavaFX que muestre al usuario el listado de paises usando la API REST Countries
      
	2. Amplia la aplicación anterior para ver también información detallada sobre cada país
      
	3. Añade, a la aplicación anterior, opciones de filtrado sin utilizar las que proporciona la propia API
  
  En el paquete Countries se encuentran las clases y la interfaz necesarias para el funcionamiento del programa:
  		CountriesApi- es la Api para poder obtener los datos
		CountriesController- es el controlador
		CountriesService- es el modelo
		Country-clase que almacenara los datos de cada pais.
		Main-desde aqui se ejecutará el programa.
  
	  al ejecutar la clase main primero nos lista todos los nombres de los paises que hay en el mundo
	  Despues, lista todos los paises con datos del pais (capital,poblacion y continente)
	  Finalmente lista todos los paises filtrados por region (Europa en este caso)
  
  
  
	4. Utiliza la API Open Food Facts para realizar una aplicación JavaFX que muestre la información de un producto a partir de su código de barras (Desde la web disponen de un buscador de productos para ver ejemplos de datos que almacenan)
  
    Para consultar open food facts utilizamos Java Wrapper for OpenFoodFacts que podemos encontrar en su pagina de github:
    https://github.com/openfoodfacts/openfoodfacts-java

    Tenemos una clase Ventana en la que creamos la interfaz grafica donde podremos buscar por codigo de barras el producto que sea en la base de datos open food facts:
    Ejemplos de codigos(5449000288974,4001724819905,5050083779589)

    Se buscara por el codigo y se almacenaran en un objeto de la clase Producto los datos referentes (codigo, url de la imagen y nombre)  que posteriormente se mostraran en la ventana JavaFX.
    
    En el paquete FoodFacts se encuentran ambas clases desde donde se puede ejecutar el programa






