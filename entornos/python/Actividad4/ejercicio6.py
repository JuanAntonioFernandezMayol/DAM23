import math

numero = int (input("Introduce un numero "))

if numero <= 0:
    print("Error: El numero tiene que ser mayor a 0 ")

else:
    quadrado = numero ** 2
    raiz_quadrada = math.sqrt(numero)

print("El quadrado de", numero,"es", quadrado)
print("La raiz quadrada de", numero,"es", raiz_quadrada)
