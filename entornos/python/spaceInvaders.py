import pygame

pygame.init()
pantalla = pygame.display.set_mode((800,600))

imagen_tanke = pygame.image.load("tanke.png")
tanke = pygame.transform.scale(imagen_tanke, (190,130))
#tanke rect = tanke.get_rect()

salir = False

posIzda = 30
posTop = 30
while not salir:
    #Gestionar eventos
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            salir = True
            
    teclas = pygame.key.get_pressed()
    if teclas[pygame.K_LEFT]:
        posIzda -= 1
    if teclas[pygame.K_RIGHT]:
        posIzda += 1
    if teclas[pygame.K_UP]:
        posTop -= 1
    if teclas[pygame.K_DOWN]:
        posTop += 1
        
    #Gestionar cambios
    pantalla.fill((255,0,255))
    
    #pygame.draw.rect(pantalla,(255,255,255), pygame.Rect(posIzda,posTop,60,60))
    pantalla.blit(tanke, (posIzda, posTop))
    #Redibujar el juego
    pygame.display.flip()
    
pygame.quit()