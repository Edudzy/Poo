import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    public Alien(){
        GreenfootImage ali = getImage();
        int altura = (int)ali.getHeight() / 3;
        int largura = (int)ali.getWidth() / 3;
        ali.scale(altura, largura); 
    }
    private int velocidade = 2;

    public void act() {
        movimentar();
        verificarColisaoComNave();
    }

    private void movimentar() {
        setLocation(getX() + velocidade, getY());

        // Inverte o sentido e avança uma linha ao tocar na borda lateral
        if (isAtEdge()) {
            velocidade = -velocidade;
            setLocation(getX() + velocidade, getY() + 25);
        }

        // Caso o alienígena alcance a parte inferior da tela (limite da base)
        if (getY() >= 580) {
            Space mundo = (Space) getWorld();
            if (mundo != null) {
                if (!mundo.getObjects(Nave.class).isEmpty()) {
                    Nave nave = mundo.getObjects(Nave.class).get(0);
                    nave.receberDano();
                }
                mundo.removeObject(this);
            }
        }
    }

    private void verificarColisaoComNave() {
        Actor naveColidida = getOneIntersectingObject(Nave.class);
        if (naveColidida != null) {
            Nave nave = (Nave) naveColidida;
            nave.receberDano(); // Aplica dano à nave
            getWorld().removeObject(this); // O alien é destruído com o impacto
        }
    }
}

