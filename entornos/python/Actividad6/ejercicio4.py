suma = 0
contador = 0

numero = int(input("Introduce un numero (o -1 para terminar): "))

while numero != -1:
    suma += numero
    contador += 1
    numero = int(input("Introduce otro numero (o -1 para terminar): "))

if contador > 0:
    media = suma / contador
    print(f"La media aritmetica de los numeros = {media}")
else:
    print("No se han introducidos numeros validos.")
