Algoritmo ejercicio1
	
	Escribir "Introduce un número";
	Leer a;
	
	Escribir "Introduce otro número";
	Leer b;
	
	Si a>b Entonces
		Escribir "El número mayor es " , a , ".";
	SiNo
		Si a<b Entonces
			Escribir "El número mayor es " , b ".";
		SiNo
			Escribir "Los dos números son iguales.";
		FinSi
	Fin Si
	
FinAlgoritmo