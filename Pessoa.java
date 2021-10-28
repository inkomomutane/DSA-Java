import java.util.function.Function;

public class Pessoa {
    private String uuid;
    private String name;
    private int idade;

    public String getUuid(){

        return this.uuid;
    }

    public void setUuid(String uuid){

        this.uuid =uuid;
    }

    public String getName(){

        return this.name;
    }

    public void setName(String name){
                this.name=name;
    }

    public int getIdade(){

        return this.idade;
    }

    public void setIdade(int idade){
        this.idade=idade;
    }


    public String toString(){
        
        return null;
    }
}
