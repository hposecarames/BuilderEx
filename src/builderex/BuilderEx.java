
package builderex;

/**
 *
 * @author Hector Pose Carames
 */
public class BuilderEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee miBuilderEmployee = new BuilderEmployee("Juan",80)
                .setMiddleName("Jose")
                .setLastName("Campos")
                .createEmployee();
        System.out.print(miBuilderEmployee);
                
               
    }
    
}
