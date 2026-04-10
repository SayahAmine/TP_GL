package model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public  class Person {

    private String name;
    private String surname;
    private String email;
    private String login;
    private String password;




    public Boolean authentication1(String login, String password) {

        return this.login.equals(login) && this.password.equals(password);
    }


    public Boolean authentication2(String login, String password){

        int Attemps =0;
        int maxAttempts = 3;

        while (Attemps < maxAttempts) {
            if(this.authentication1(login, password)){
                return true;
            }else {
                Attemps++;
            }
        }
        return false;
    }

    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Email: " + this.email);
        System.out.println("Login: " + this.login);
        System.out.println("Password: " + this.password);
    }
}
