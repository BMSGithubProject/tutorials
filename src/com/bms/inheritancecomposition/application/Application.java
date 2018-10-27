package com.bms.inheritancecomposition.application;

import com.bms.inheritancecomposition.model.Actress;
import com.bms.inheritancecomposition.model.Computer;
import com.bms.inheritancecomposition.model.StandardMemory;
import com.bms.inheritancecomposition.model.Person;
import com.bms.inheritancecomposition.model.StandardProcessor;
import com.bms.inheritancecomposition.model.StandardSoundCard;
import com.bms.inheritancecomposition.model.Waitress;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class Application {
    
    public static void main(String[] args) {
        
        Person person = new Person("John", "john@domain.com", 35);
        Waitress waitress = new Waitress("Mary", "mary@domain.com", 22);
        System.out.println(waitress.serveStarter("mixed salad"));
        System.out.println(waitress.serveMainCourse("steak"));
        System.out.println(waitress.serveDessert("cup of cofee"));
        Actress actress = new Actress("Susan", "susan@domain.com", 30);
        System.out.println(actress.readScript("Psycho"));
        System.out.println(actress.performRole());
        Computer computer = new Computer(new StandardProcessor("Intel I3"), new StandardMemory("Kingston", "1TB"));
        computer.setSoundCard(new StandardSoundCard("Generic Sound Card"));
        System.out.println(computer);
    }
}
