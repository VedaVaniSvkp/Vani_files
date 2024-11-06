package org.tnsif.capgemini.c2tc.oops;

public class Abstraction {

	public static void main(String[] args) {
		MaheshDemo obj = new RameshDemo();
		obj.calling();
		obj.AIIntegration();
		obj.SatelliteComm();
		obj.HealthMonitoring();

	}

}
abstract class MaheshDemo //2015
{
	public void calling()
	{
		System.out.println("Calling");
	}
	public abstract void AIIntegration();//abstract methods
	public abstract void SatelliteComm();
	public abstract void HealthMonitoring();
}
abstract class SureshDemo extends MaheshDemo //2016
{
	public void AIIntegration()
	{
		System.out.println("Phone is integrated with AI Integration");
	}
}
class RameshDemo extends SureshDemo //
{
	public void SatelliteComm()
	{
		System.out.println("Phone is integreted with Satellite Communication");
	}
	public void HealthMonitoring()
	{
		System.out.println("Phone is integreted with Health Monitoring");
	}
}