import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave extends Actor
{
    private int cooldownTiro = 0;
    private int vida = 3;

    public Nave() {
        GreenfootImage ale = getImage();
        int altura = (int)ale.getHeight() / 6;
        int largura = (int)ale.getWidth() / 5;
        ale.scale(altura, largura);
         // Posiciona a nave apontada para cima
    }

    @Override
    public void addedToWorld(World world) {
        // Exibe a quantidade inicial de vidas assim que entra no mundo
        ((Space) world).atualizarVida(vida);
    }

    public void act() {
        movimentar();
        atirar();
        verificarVitoria();
    }

    private void movimentar() {
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 5, getY());
        }
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 5, getY());
        }
    
    }

    private void atirar() {
        if (cooldownTiro > 0) {
            cooldownTiro--;
        }

        if (Greenfoot.isKeyDown("space") && cooldownTiro == 0) {
            getWorld().addObject(new Tiro(), getX(), getY() - 30);
            cooldownTiro = 15; // Intervalo de 15 quadros entre disparos
        }
    }

    // Método chamado quando um alienígena colide com a nave ou atinge a base
    public void receberDano() {
        vida--;
        Space mundo = (Space) getWorld();
        
        if (mundo != null) {
            mundo.atualizarVida(vida);

            if (vida <= 0) {
                mundo.gameOver();
                mundo.removeObject(this);
            }
        }
    }

    private void verificarVitoria() {
        Space mundo = (Space) getWorld();
        if (mundo != null) {
            mundo.verificarVitoria();
        }
    }
}
