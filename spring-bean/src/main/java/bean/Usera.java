package bean;


import lombok.Data;


@Data
public class Usera {


    private String name;


    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public static Usera createUser(){
        Usera user = new Usera();
        user.setName("111");
        user.setId(1111);
        return user;
    }
}
