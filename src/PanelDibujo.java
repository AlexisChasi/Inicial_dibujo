import javax.swing.*;
import java.awt.*;
public class PanelDibujo extends JPanel{

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int anchura=getWidth();
        int altura=getHeight();

        g.drawLine(30,20,30,120);//parte izquierda
        g.drawLine(40,60,40,40);// altura recuadro interno lado izquierdo
        g.drawLine(30,20,120,20);//parte superior
        g.drawLine(40,60,110,60);//largo recuadro interno lado inferior
        g.drawLine(40,40,110,40);//largo recuadro interno lado superior
        g.drawLine(110,60,110,40);// altura recuadro interno lado derecho
        g.drawLine(120,20,120,120);//parte derecha
        g.drawLine(30,120,40,120);//base para formar la A parte izquierda
        g.drawLine(120,120,110,120);//base para formar la A parte derecha
        g.drawLine(40,70,110,70);//linea debajo del recuadro interno inferior
        g.drawLine(40,70,40,120);// altura mayor debajo del recuadro interno lado izquiero
        g.drawLine(110,70,110,120);// altura mayor debajo del recuadro interno lado derecho

    }
}
