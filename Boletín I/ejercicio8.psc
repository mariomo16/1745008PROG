Algoritmo ejercicio8
	
	Escribir "Introduce un n�mero uno:";
	Leer num1;
	
	Escribir "Introduce un n�mero dos:";
	Leer num2;
	
	Escribir "Introduce un n�mero tres:";
	Leer num3;
	
	Si (num1 > num2) Entonces
		Si (num2 > num3) Entonces
			Escribir "Los n�meros ordenados son: " , num1 , ", " , num2 , ", " , num3 , ".";
		SiNo
			Si (num1 > num3) Entonces
				Escribir "Los n�meros ordenados son: " , num1 , ", " , num3 , ", " , num2 , ".";
			SiNo 
				Escribir "Los n�meros ordenados son: " , num3 , ", " , num1 , ", " , num2 , ".";
			FinSi
		FinSi
	SiNo
		Si (num1 > num3) Entonces
			Escribir "Los n�meros ordenados son: " , num2 , ", " , num1 , ", " , num3 , ".";
		SiNo
			Si (num2 > num3) Entonces
				Escribir "Los n�meros ordenados son: " , num2 , ", " , num3 , ", " , num1 , ".";
			SiNo
				Escribir "Los n�meros ordenados son: " , num3 , ", " , num2 , ", " , num1 , ".";
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo