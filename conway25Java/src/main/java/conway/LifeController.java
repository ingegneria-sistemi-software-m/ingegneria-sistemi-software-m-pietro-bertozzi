package conway;
import java.util.concurrent.TimeUnit;

import conway.devices.ConwayOutput;

public class LifeController {
	public static final int GENERATION_TIME = 1000;
	
    private Life life;
    private IOutDev outdev;
    
    public LifeController(Life game, ConwayOutput co) {  
        this.life = game;
        this.outdev = co;
    }
    
    protected void play(int epoch) {
		for (int i = 1; i <= epoch; i++) {
			try {
				TimeUnit.MILLISECONDS.sleep(GENERATION_TIME);
				System.out.println("---Epoch---" + i);
				life.computeNextGen();
				this.life.getGrid().showGrid(outdev);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}    	
    }

    public void start(){
		System.out.println("---Initial---");
		this.life.getGrid().showGrid(this.outdev);
		play(5);		   	
    }
}
