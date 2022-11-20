package springcore_example;

public class HelloBean {
  private String name;

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  public void sayHello() {

    System.out.println("Hello" + this.name);
  }
}
