import java.applet.*;
import java.awt.*;
/*
<applet code =Prog10_Rectangle width=400 height=450>
</applet>*/

public class Prog10_Rectangle extends Applet
{
    public void paint(Graphics g)
    {
        g.drawRect(100,100,180,100);
        g.drawLine(100,120,280,120);
        g.drawLine(100,140,280,140);
        g.drawLine(100,160,280,160);
        g.drawLine(100,180,280,180);

        showStatus("Applet with rectangle");
    }
}