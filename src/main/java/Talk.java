import lombok.Data;

@Data
public class Talk {

    private final String message;

    public Talk(String message){
        this.message = message;
    }

    public String SayHello(){
        return message;
    }

}
