import pygame
from elementos import Nave
from elementos import Fondo

pygame.init()
pantalla = pygame.display.set_mode((800,600))
reloj = pygame.time.Clock()
FPS = 60
# imagen_tanke = pygame.image.load("tanke.png")
#tanke = pygame.transform.scale(imagen_tanke, (190,130))
#tanke rect = tanke.get_rect()

salir = False
nave = Nave()
fondo = Fondo()

while not salir:
    reloj.tick(60)
    #Gestionar eventos
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            salir = True
            
    teclas = pygame.key.get_pressed()
    if teclas[pygame.K_LEFT]:
        nave.moverIzquierda()
    if teclas[pygame.K_RIGHT]:
        nave.moverDerecha()
    #if teclas[pygame.K_UP]:
        
    #if teclas[pygame.K_DOWN]:
        
        
    #Gestionar cambios
    fondo.dibujar()
    nave.dibujar()
    #pygame.draw.rect(pantalla,(255,255,255), pygame.Rect(posIzda,posTop,60,60))
    #pantalla.blit(tanke, (posIzda, posTop))
    #Redibujar el juego
    pygame.display.flip()
    
pygame.quit()