/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nodira
 */
public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();
    public Developer getDeveloperBySpecialty(String specialty){
        Developer developer = developers.get(specialty);
        if(developer == null){
            switch (specialty){
                case "java":
                    System.out.println("Hiring Java developer...");
                    developer = new JavaDeveloper();
                    break;
                case "c++":
                    System.out.println("Hiring C++ developer...");
                    developer = new CppDeveloper();
                    break;   
                    
            }
            
            developers.put(specialty, developer);
        }
        
        return developer;
    }
}
