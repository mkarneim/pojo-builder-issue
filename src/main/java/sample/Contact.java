package sample;

import net.karneim.pojobuilder.GeneratePojoBuilder;
import sample.anothernamespace.HelloWorld;

@GeneratePojoBuilder
public class Contact {
    public String name;
    public int age;

    public void sayHello(String[] args) {
      HelloWorld.main(args);
    }
}
