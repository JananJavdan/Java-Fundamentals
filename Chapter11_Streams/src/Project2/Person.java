package Project2;

abstract class Person {
    public void Person() {
    }


  //  public Person(String String) {
    //}

    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}




