num1 = int (input("Introduce el primer numero "))
num2 = int (input("Introduce el segundo numero "))
num3 = int (input("Introduce el tercer numero "))

if num1 < 0:
    resultado = num1 * num2 * num3
    print("El primer numero es negativo, el producto de los tres es: ", resultado)

else:
    resultado = num1 + num2 + num3
    print("El primer numero no es negativo, y la suma de los tres es: ", resultado)
