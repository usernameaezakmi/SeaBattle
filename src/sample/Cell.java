package sample;

import javafx.scene.image.ImageView;

public class Cell extends ImageView{
    private int conditiopn = 0;
    private ImageView im= new ImageView();
    private ImageView imship= new ImageView();
    private double x=0.0;
    private double y=0.0;
    //private Ship ship=null;
    /*
    0=пустая клетка
    1=однопалубник
    2=двухпалубник
    3=трехпалубник
    4=...?





    0=пустая клетка
    1=клетка со своим кораблем
    2=клетка со своим кораблем(нос)
    3=клетка со своим кораблем(тело)
    4=клетка со своим кораблём(корма)
    5=клетка со своим короблём(раненный)
    6=клетка со своим короблём(раненный)(нос)
    7=клетка со своим короблём(раненный)(тело)
    8=клетка со своим короблём(раненный)(корма)
    9=клетка со своим кораблём(убитый)
    10=клетка со своим кораблём(убитый)(нос)
    11=клетка со своим кораблём(убитый)(тело)
    12=клетка со своим кораблём(убитый)(корма)
    13=клетка пустого попадания
    14=клетка пустого попадания(последний выстрел)
    15=клетка со вражеским короблём(раненный)
    16=клетка со вражеским короблём(раненный)(нос)
    17=клетка со вражеским короблём(раненный)(тело)
    18=клетка со вражеским короблём(раненный)(корма)
    19=клетка со вражеским кораблём(убитый)
    20=клетка со вражеским кораблём(убитый)(нос)
    21=клетка со вражеским кораблём(убитый)(тело)
    22=клетка со вражеским кораблём(убитый)(корма)
    23=интуитивно пустая клетка
        private int x;
    private int y;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
    */
    public ImageView getIm(){return imship;}
    public ImageView getIm2(){return im;}
    public void setIm(ImageView im){this.imship=im;}
    public void setIm2(ImageView im){this.im=im;}

    Cell(int conditiopn/*, int x, int y*/) {
        this.conditiopn = conditiopn;
        //this.x = x;
        //this.y = y;
    }

    //Cell(Ship ship/*, int x, int y*/) {
    /*    conditiopn = ship.getType();
        this.ship=ship;
        //this.x = x;
        //this.y = y;
    }
    public void addShip(Ship ship){this.ship=ship;conditiopn=ship.getType();}
    */
    public void setConditiopn(int conditiopn) {
        this.conditiopn = conditiopn;
    }
    public void setCoordinate(double x,double y){this.x = x;this.y=y;}
    public double getCoordinateX(){return x;}
    public double getCoordinateY(){return y;}
    public int getConditiopn() {
        return conditiopn;
    }
}
