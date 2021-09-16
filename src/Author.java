public class Author {
    String name;
    String email;
    char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    String getName() {
        return  name;
    }

    void setEmail(String e){
        this.email = e;
    }

    String getEmail() {
        return email;
    }

    char getGender(){
        return gender;
    }

    String toStrIng(){
        return name + " (" + gender + ") at " + email;
    }
}
