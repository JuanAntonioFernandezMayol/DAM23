numero = int(input("Introduce un numero entero: "))
minimo = numero
maximo = numero
suma = numero
contador = 1

while numero != 0:
    numero = int(input("Introduce otro numero entero (o 0 para terminar): "))
    if numero != 0:
        suma += numero
        contador += 1
        if numero < minimo:
            minimo = numero
        if numero > maximo:
            maximo = numero

media = suma / contador

print("El numero mas pequeño es:", minimo)
print("El numero mas grande es:", maximo)
print("La media de los números es:", media)
