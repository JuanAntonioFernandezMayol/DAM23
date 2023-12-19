import pygame

class Nave(pygame.sprite.Sprite):
    #Aqui ceamos el costructor
    def __init__(self, posicion) -> None:
        super().__init__()
        #Cargamos la imagen
        self.images = [pygame.image.load("../python/nave1.png"),pygame.image.load("../python/nave2.png")]
        self.indice_images = 0
        self.image = self.images[self.indice_images]
        self.contador_image = 0
        #Cremamos un rectangulo a partir de la imagen
        self.rect = self.image.get_rect()
        #Actualizamos la posicion del rectangulo
        self.rect.topleft=posicion
        
    def update (self,*args: any,**kwargs: any):
        #Capturamos las teclas
        teclas = args[0]
        #Capturamos la pantalla
        pantalla = pygame.display.get_surface()
        #Gestionamos las teclas
        if teclas[pygame.K_LEFT]:
            self.rect.x -= 2
            self.rect.x = max(0, self.rect.x)
            
        if teclas[pygame.K_RIGHT]:
            self.rect.x +=2
            pantalla = pygame.display.get_surface()
            self.rect.x = min(pantalla.get_width()-self.image.get_width(), self.rect.x)
        #Gestionamos la animacion
        self.contador_image = (self.contador_image + 1) % 40
        self.indice_images = self.contador_image // 20
        self.image = self.images[self.indice_images]
    
class Enemigo(pygame.sprite.Sprite):
    #Aqui ceamos el costructor
    def __init__(self, posicion) -> None:
        super().__init__()
        #Cargamos la imagen
        imagen = pygame.image.load("../python/nave1.png")
        self.image = pygame.transform.rotate(imagen, 180)
        #Cremamos un rectangulo a partir de la imagen
        self.rect = self.image.get_rect()
        #Actualizamos la posicion del rectangulo
        self.rect.topleft=posicion
        
    def update (self,*args: any,**kwargs: any) -> None:
        self.rect.y += 1
    