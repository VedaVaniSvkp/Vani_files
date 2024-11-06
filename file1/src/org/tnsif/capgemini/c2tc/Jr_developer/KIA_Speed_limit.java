package org.tnsif.capgemini.c2tc.Jr_developer;
import org.tnsif.capgemini.c2tc.Manager_Rules.*;

public class KIA_Speed_limit {
	
	public void disp_speed_limit()
	{
		System.out.println("All KIA have speedlimit");
	}

	public static void main(String[] args) {
		KIA_Speed_limit obj = new KIA_Speed_limit();
		obj.disp_speed_limit();
		KIA_Rules obj1 = new KIA_Rules();
		obj1.disp_rules();

	}

}
