package conway.devices;

import conway.IOutDev;

public class ConwayOutput implements IOutDev{
	
	@Override
	public void write(String msg) {
		System.out.print(msg);
	}
}
