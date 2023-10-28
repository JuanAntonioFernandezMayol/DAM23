contraseña_correcta = "eureka"

intentos = 0

while intentos < 3:
    contraseña = input("Ingresa la contraseña ")

    if contraseña == contraseña_correcta:
        print ("La contraseña es correcta")
        break
    else:
        print ("la contraseña es incorrecta. Te quedan {} intentos.".format(2 - intentos))
        intentos += 1

    if intentos == 3:
        print ("Has agotado todos los intentos ")
