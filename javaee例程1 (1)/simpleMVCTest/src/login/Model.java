package login;   
  
public class Model {   
       
    private String name=null;   
    private String pas=null;   
       
    public void setName(String name)   
    {   
        this.name=name;   
    }   
       
    public String getName() {   
        return name;   
    }   
       
    public void setPas(String pas)   
    {   
        this.pas=pas;   
    }   
       
    public String getPas() {   
        return pas;   
    }   
       
    public boolean login()   
    {   
        if ((name.trim().equals("admin"))&&(pas.trim().equals("1234"))) {   
            return true;   
        }   
        else {   
            return false;   
        }   
    }   
}  
