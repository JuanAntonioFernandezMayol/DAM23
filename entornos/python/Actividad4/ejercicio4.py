num1 = int (input("Cuanto vale A "))
num2 = int (input("Cuanto vale B "))
num3 = int (input("Cuanto vale C "))

if num1 > num2 and num1 > num3:
    print(num1, " Es mayor que ",num2, "y que ", num3)
elif num2 > num1 and num2 > num3:
    print(num2, " Es mayor que ", num1, "y que ", num3)
elif num3 > num1 and num3 > num2:
    print(num3, " Es mayor que ", num1, "y que ", num2)
else:
    print("Los numeros son iguales")
