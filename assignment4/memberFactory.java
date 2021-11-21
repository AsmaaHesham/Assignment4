
package assignment4;


public class memberFactory {
    public staff getmember(String memberName){
        String a= memberName.toLowerCase();
        switch(a){
            case "TeacherAssistant":
                return new TeacherAssistant();
                
                case "Doctor":
                return new Doctor();
                    
                     
                default:
                    return null;
        }
        
    }
    
}
