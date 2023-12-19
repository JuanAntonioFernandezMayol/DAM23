import pygame
import elementos
import random
#Iniciamos el juego
pygame.init()

#Creamos la pantalla
tamanyo = (800, 600)
pantalla = pygame.display.set_mode(tamanyo)

#Creamo un reloj para limitar el framerate
reloj = pygame.time.Clock()
FPS = 60

#Booleano de control
running = True

#Creamos la nave
posicion = (200,200)
nave = elementos.Nave(posicion)

#Creamos un grupo de sprites
grupo_sprites = pygame.sprite.Group(nave)
grupo_sprites.add(elementos.Nave((100,100)))
grupo_sprites.add(elementos.Nave((200,100)))
grupo_sprites.add(elementos.Nave((300,100)))

enemigo = elementos.Enemigo((50,50))
grupo_sprites.add(enemigo)
#Creamos una variable que almacena la ultima vez que se creo un enemigo
ultimo_enemigo_creado = 0
frecuencia_creacion_enemigos = 200
#Creamos el bucle principal
while running:
    #limitamos el bucle al framerate que hemos definido
    reloj.tick(FPS)
    
    #Gestionamos la salida
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
            
    #Creacion de enemigos
    momento_actual = pygame.time.get_ticks()
    if (momento_actual > ultimo_enemigo_creado + frecuencia_creacion_enemigos):
        cordX = random.randint(0, pantalla.get_width())
        cordY = 0
        grupo_sprites.add(elementos.Enemigo((cordX, cordY)))
        ultimo_enemigo_creado = momento_actual
        
    #Capturamos las teclas
    teclas = pygame.key.get_pressed()
    
    #Pintamos
    pantalla.fill((255, 255, 255))
    grupo_sprites.update(teclas)
    grupo_sprites.draw(pantalla)


    #Redibujar la pantalla
    pygame.display.flip()
    
#Finalizamos el juego
pygame.quit()



