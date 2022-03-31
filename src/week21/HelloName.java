package week21;

public class HelloName {
    public HelloName(){}

    public String sayHello(String name) throws Exception{
        if(name.equals("")){
            throw new Exception("dont be daft!");
        }else{
            return "Hello " + name;
        }
    }
}
