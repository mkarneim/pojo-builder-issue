package sample;

import sample.anothernamespace.HelloWorld;

public class CallScala {
  public static void main(String[] args) {
    HelloWorld.main(args);
    Contact c = new ContactBuilder().build();
    c.sayHello(args);

  }
}
