package sample;

public class Ship {

    private int type = 0;
    /*
    1=1 палубник
    2 = нос
    3 = тело
    4=карма
     */

     Ship(int type){
        setType(type);

    }
    public int getType() {
        return type;
    }
    private void setType(int type){
        this.type=type;
    }



}
