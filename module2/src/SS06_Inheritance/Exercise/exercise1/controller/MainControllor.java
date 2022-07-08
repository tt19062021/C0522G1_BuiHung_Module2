package SS06_Inheritance.Exercise.exercise1.controller;

import SS05_Access_Modifier_StaticPethod_StaticProperty.Exercise1.Circle;
import SS06_Inheritance.Exercise.exercise1.model.Cylinder;

public class MainControllor {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder(4.2,5.5,"Red");
        System.out.println(cy);

        System.out.printf("Dien tich hinh tru = %1.2f cm, chu vi hinh tru =%1.2f cm\n",  cy.getSurroundingArea() , cy.getPerimeterCylinder());
        System.out.printf("Dien tich toan phan = %1.2f cm\n ", cy.getTotalArea());

       // Circle ci = new Circle(3.2,"Black");
//        System.out.println(ci.toString());

//        System.out.printf("Dien tich hinh tron = %1.2f cm \n ", ci.getArea());


    }

}
