import pygame
import math

class Nave:
    def __init__(self) -> None:
        self.x = 320
        self.y = 500
        imagen = [pygame.image.load("nave1.png"), pygame.image.load("nave2.png")]
        #imagen = pygame.image.load("nave.png")
        self.imagen = [pygame.transform.scale(imagen[0], (100,100)), pygame.transform.scale(imagen[1], (100,100))]
        self.contador = 0
        
    def moverDerecha(self):
        self.x += 1
        pantalla = pygame.display.get_surface()
        limite = pantalla.get_width()
        #limite = self.imagen.get_width()
        self.x = min(self.x, limite - 80)
        
    def moverIzquierda(self):
        self.x -= 1
        #pantalla = pygame.display.get_surface()
        limite = 0
        self.x = max(self.x, limite)
        
    def dibujar (self):
        self.contador = (self.contador + 1) % 40
        pantalla = pygame.display.get_surface()
        seleccionada = self.contador // 20
        pantalla.blit(self.imagen[seleccionada], (self.x, self.y))
        
class Fondo:
    def __init__(self) -> None:
        pantalla = pygame.display.get_surface()
        imagen = pygame.image.load("fondo.png")
        self.fondo = pygame.transform.scale(imagen, (pantalla.get_width(), imagen.get_height()))
        self.scroll = 0 
        self.piezas = math.ceil(pantalla.get_height() / self.fondo.get_height()) +1
        
    def dibujar(self):
        self.scroll += 1
        
        pantalla = pygame.display.get_surface()
        if self.scroll > self.fondo.get_height():
            self.scroll = 0
            
        for i in range(0, self.piezas):
            pantalla.blit(self.fondo, (0, - self.fondo.get_height() + i * self.fondo.get_height() + self.scroll))
        
    