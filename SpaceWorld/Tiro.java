import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tiro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tiro extends Actor
{
    public Tiro(){
        GreenfootImage genki = getImage();
        int altura = (int)genki.getHeight() / 5;
        int largura = (int)genki.getWidth() / 5;
        genki.scale(altura, largura);
    }
    public void act() {
        setLocation(getX(), getY() - 8);
        verificarColisao();
    }

    private void verificarColisao() {
        // Colisão com o Alienígena
        Actor alien = getOneIntersectingObject(Alien.class);
        if (alien != null) {
            Space mundo = (Space) getWorld();
            if (mundo != null) {
                mundo.aumentarPontuacao(10); // Concede 10 pontos por abate
                mundo.removeObject(alien);
                mundo.removeObject(this);
            }
            return;
        }

        // Remoção ao atingir o limite superior da tela
        if (isAtEdge() && getY() <= 10) {
            getWorld().removeObject(this);
        }
    }
}

