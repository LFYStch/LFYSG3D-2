package LFYSG3D;

import java.awt.*;
import java.awt.event.*;

public class game{
	public static spawner sp = new spawner();
	public static void run(Graphics2D g2d, int width, int height, dP context){
		context.drawMesh(sp.LFYS(0,0,25,0,context.i,context.i),g2d,context.texture1);
	}
	public static void Update(dP context){
		context.i+=0.1;
	}
}
class KeyHandler implements KeyListener{
	//vars for wut u want
	public KeyHandler(/* Stuff u want to do */){

	}
	@Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

}
class spawner {
    Objloader loader = new Objloader();
	public spawner(){}

    
    public mesh LFYS(double x, double y, double z, int aI, double theta, double psi) {
    
    GameObject LFYS = new GameObject(new mesh[]{
        loader.load("Cube.obj",x,y,z,1,1,1)
    }, new AABB(new vec3(0, 0, 0, 0, 0), new vec3(0, 0, 0, 0, 0)), theta, psi, x, y, z);
    return LFYS.getMesh(aI);
}

}
