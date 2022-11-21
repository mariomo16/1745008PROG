Algoritmo ejercicio2
	
	Escribir "¿Qué nota has obtenido?";
	Leer nota;
	
	Si (nota < 3) Entonces
		Escribir "Vaya, eso es un insuficiente.";
	SiNo
		Si (nota >= 3) & (nota < 5) Entonces
			Escribir "Vaya, eso es un insuficiente.";
		SiNo
			Si (nota >= 5) & (nota < 6) Entonces
				Escribir "Tienes un bien.";
			SiNo
				Si (nota >= 6) & (nota < 9) Entonces
					Escribir "Tienes un notable.";
				SiNo 
					Si (nota >= 9) Entonces
						Escribir "Tienes un sobresaliente";
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo