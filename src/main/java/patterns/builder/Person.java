package patterns.builder;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private int age;
    private boolean hasChildren;
    private char sex;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public char getSex() {
        return sex;
    }

    public static Builder newBuilder(){
        Person.Builder builder = new Person().new Builder();
        return builder;
    }

    public class Builder{
        private Builder(){

        }
        public Builder setFirstName(String firstName){
            Person.this.firstName = firstName;

            return this;
        }

        public Builder setLastName(String lastName){
            Person.this.lastName = lastName;

            return this;
        }

        public Builder setAddress(String address){
            Person.this.address = address;

            return this;
        }

        public Builder setAge(int age){
            Person.this.age = age;

            return this;
        }

        public Builder setHasChildren(Boolean hasChildren){
            Person.this.hasChildren = hasChildren;

            return this;
        }

        public Builder setSex(char sex){
            Person.this.sex = sex;

            return this;
        }

        public Person build(){
            return Person.this;
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", hasChildren=" + hasChildren +
                ", sex=" + sex +
                '}';
    }
}
