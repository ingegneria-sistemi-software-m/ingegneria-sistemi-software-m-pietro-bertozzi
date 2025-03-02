package conway;

import conway.devices.ConwayInputMock;

public class MainConway  {

    public static void main(String[] args) {
    	//configureTheSystem
        Life life           = new Life( 3,3 );
        LifeController cc   = new LifeController(life);   
        ConwayInputMock cim = new ConwayInputMock(cc,life);
        //start the system
        cim.simulateUserControl();
    }

}

//qui direi che l l input mock deve essere controllato da life controller e non essere nel main
//poi il controller avrà un modo per interfacciarsi

//cosa che non centra nulla 130.136.113.239 dopo