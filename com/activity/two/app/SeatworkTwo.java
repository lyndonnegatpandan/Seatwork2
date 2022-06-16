package com.activity.two.app;
import com.activity.two.Telephone;
import com.activity.two.Smartphone;


public class SeatworkTwo{

	public static void main(String args[]){
		Telephone telephone = new Telephone();
		telephone.call("0922222222");

		Smartphone smartphone = new Smartphone("09676767767", "Kitkat");

		System.out.println(smartphone.getPhoneNo());
		System.out.println(smartphone.getOperatingSystem());

		smartphone.addContact("Lyndonne", "3232323232");
		smartphone.addContact("Jobert", "9862736");
		smartphone.addContact("Joven", "27827828");
		smartphone.addContact("Jovit", "900923902");
		smartphone.addContact("Juan", "93874374");

		smartphone.displayContacts();
		smartphone.removeContact("Jovit");
		smartphone.displayContacts();

		smartphone.call("909099090");
		smartphone.call("09676767767");
		smartphone.call("Juan", "93874374");


	}

}