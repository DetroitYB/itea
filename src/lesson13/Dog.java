package lesson13;

public class Dog implements Cloneable{
    private String name;
    private int age;
    private Owner owner;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, Owner owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public Dog() {
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", owner=" + owner +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Owner owner = (Owner) this.owner.clone();
        Dog dog = (Dog) super.clone();
        dog.setOwner(owner);
        return dog;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if(obj.getClass() != getClass()){
            return false;
        }
        Dog dog = (Dog) obj;
        boolean check = true;
        if(this.age != dog.age){
            check = false;
        }
        if(this.name != null) {
            if (!this.name.equals(dog.name)) {
                check = false;
            }
        }
        return check;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
