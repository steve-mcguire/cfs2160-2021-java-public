package EXAMPLES.ScannerDemo;

public class HelloName {
    public HelloName(){}

    public String sayHello(String name) throws Exception{
        if(name.equals("")){
            throw new Exception("Please enter your name!");
        }else{
            return "Hello " + name;
        }
    }
}
