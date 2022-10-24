Algoritmo ejercicio2
	
	Escribir "Escribe tu edad:";
	Leer edad;
	
	Escribir "Escribe tu género (V/M):";
	leer genero;
	
	Si genero = "V" Entonces
		Si edad > 50 Entonces
			pseguro = 350
		SiNo
			Si edad < 30 Entonces
				pseguro = 450
			SiNo
				pseguro = 400
			FinSi
		FinSi
	SiNo Si genero = "M" Entonces
			Si edad>25 Entonces
				pseguro = 350
			SiNo pseguro = 400
			FinSi
		FinSi
	FinSi
	
	Escribir "El precio de tu seguro es " , pseguro , " euros";
	
FinAlgoritmo
