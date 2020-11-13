package com.autowiring.aw;

//1.no property tag is required for injectiong objects of dependencies instead autowire //
//2.mention autowire = byName in this class bean in xml file//
//3.autowire = "byName", autowire = "byType" autowire = "constructor"//
//4. autowiring using @autowired//
//4.1 create a default constructor for refernce object i.e..emplo  //
//4.2 remove autowire type or name in xml file instaed write @autowired before constructor line  or before setter line   //
//4.3 add context in schema location in xml file  and add this to xml code <contxt >//
//5. autowiring using @qulaifier("inject an objects i.e put the object wanted"), when we have multiple objects or multiple implementations to overcome which object to use which implementatio is to use spring gets confused//

public class employee {
   public employeedetails emplo;

public employee(employeedetails emplo) {
	super();
	this.emplo = emplo;
}

public void setEmplo(employeedetails emplo) {
	this.emplo = emplo;
}

public void empinfo() {
	emplo.display();
}
}
