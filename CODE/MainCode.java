package LFYSG3D;

import java.awt.*;

public class MainCode{
	public static void run(Graphics2D g2d, int width, int height, dP context){
		context.drawMesh(context.sp.LFYS(0,0,25,0,context.i,context.i),g2d,context.texture1);
	}
}
class KeyHandler implements KeyListener{
	//vars for wut u want
	public KeyHandler(/* Stuff u want to do */){

	}
	@Override
	public void keyPressed(KeyEvent e){
	}
	@Override
	public void keyReleased(KeyEvnet e){
	}
	@Override
	public void keyTyped(KeyEvent e){
	}

}
