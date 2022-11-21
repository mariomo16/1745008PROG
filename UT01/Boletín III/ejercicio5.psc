Algoritmo ejercicio5
	
	Escribir "*** TEST DE GEOGRAFÍA ***";
	
	Escribir "¿Que motor es el mas usual en el Nissan Skyline GTR R34?";
	Escribir "A) RB36DETT";
	Escribir "B) Rotativo";
	Escribir "C) 2JZ";
	Leer respuesta;
	
	nota = 0;
	
	Si (respuesta = "A") Entonces
		Escribir "¡ACERTASTE!"
		nota = (nota + 1)
	SiNo
		Escribir "OHHH"
	FinSi
	
	Escribir "¿De que marca es el Lancer Evolution?";
	Escribir "A) Toyota";
	Escribir "B) Mitsubishi";
	Escribir "C) Mazda";
	Leer respuesta;
	
	Si (respuesta = "B") Entonces
		Escribir "¡ACERTASTE!"
		nota = (nota + 1)
	SiNo
		Escribir "OHHH"
	FinSi
	
	Escribir "¿Cual es el body kit mas conocido del Mazda RX-7 de 1997?";
	Escribir "A) S-Tune";
	Escribir "B) StreetHunter";
	Escribir "C) VeilSide";
	Leer respuesta;
	
	Si (respuesta = "C") Entonces
		Escribir "¡ACERTASTE!"
		nota = (nota + 1)
	SiNo
		Escribir "OHHH"
	FinSi
	
	Escribir "Has tenido " , nota , " aciertos";
	
FinAlgoritmo