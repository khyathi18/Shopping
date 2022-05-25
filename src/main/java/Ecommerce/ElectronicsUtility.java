package Ecommerce;

import mypkg.Electronics;

public class ElectronicsUtility {

	Electronics e=new Electronics("8748jfkh",10000);
	public String idTest()
	{
		return e.getDeviceId();
	}
	public int costTest()
	{
		if(e.getDeviceCost()>=10000)
			return e.getDeviceCost();
		else
			return 0;
	}
}
