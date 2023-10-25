public class Person extends Animal {
    String fName, lName;
    int num;
    static int count = 0;
    public Person() {
        fName = "";
        lName = "";
        count++;
    }

    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
        count++;
    }

    public Person(String fName, String lName, byte age, int num) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.num = num;
        count++;
    }

    public String speak() {
        if (!fName.isEmpty() && age > 0) {
            return "My name is " + this.fName + " " + this.lName + " and I am " + this.age + " years old.";
        }
        if (!fName.isEmpty()) {
            return "My name is " + this.fName + " " + this.lName;
        }
        return "I don't have a name.";
    }

    public static int getPersonCount() {
        return count++;
    }

    @Override
    public String toString() {
        if (!fName.isEmpty() && num > 0) {
            return this.fName + " " + this.lName + " " + this.num%10000;
        }
        if (!fName.isEmpty()) {
            return this.fName + " " + this.lName;
        }
        return "N/A";
    }
}
