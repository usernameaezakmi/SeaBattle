package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;


import java.util.ArrayList;

public class Field {

    private ObservableList<ObservableList<Cell>> cells = FXCollections.observableArrayList();
    Field() {
        autocomplete();
    }
     void autocomplete() {
        for (int i = 0; i < 10; i++) {
            ObservableList <Cell> obs2 =FXCollections.observableArrayList();
            cells.add(obs2);
            for (int j = 0; j < 10; j++) {

                cells.get(i).add(new Cell(0));

            }
        }

    }

    public void getXY(Cell cell ){

        for (int i=0;i<10;i++)
        {
            if (cells.get(i).indexOf(cell)!=-1){
                System.out.println("x="+(i+1)+" y="+(cells.get(i).indexOf(cell)+1));
            }
        }

    }

    public void clearCell(int a,int b){
        ImageView im=cells.get(a).get(b).getIm();
        if (im.getRotate() == 90) {

            switch ((int) im.getFitHeight()) {
                case 40: {

                    cells.get(a).get(b).setConditiopn(0);
                    cells.get(a).get(b).setIm(new ImageView());
                    break;
                }
                case 84: {

                    cells.get(a).get(b).setConditiopn(0);
                    cells.get(a).get(b-1).setConditiopn(0);
                    cells.get(a).get(b).setIm(new ImageView());
                    cells.get(a).get(b-1).setIm(new ImageView());
                    break;
                }
                case 128: {

                    cells.get(a).get(b).setConditiopn(0);
                    cells.get(a).get(b-1).setConditiopn(0);
                    cells.get(a).get(b-2).setConditiopn(0);
                    cells.get(a).get(b).setIm(new ImageView());
                    cells.get(a).get(b-1).setIm(new ImageView());
                    cells.get(a).get(b-2).setIm(new ImageView());
                    break;
                }
                case 172: {

                    cells.get(a).get(b).setConditiopn(0);
                    cells.get(a).get(b-1).setConditiopn(0);
                    cells.get(a).get(b-2).setConditiopn(0);
                    cells.get(a).get(b-3).setConditiopn(0);
                    cells.get(a).get(b).setIm(new ImageView());
                    cells.get(a).get(b-1).setIm(new ImageView());
                    cells.get(a).get(b-2).setIm(new ImageView());
                    cells.get(a).get(b-3).setIm(new ImageView());
                    break;
                }

            }

        } else  {

            switch ((int) im.getFitHeight()) {
                case 40: {

                    cells.get(a).get(b).setConditiopn(0);
                    cells.get(a).get(b).setIm(new ImageView());
                    break;
                }
                case 84: {

                    cells.get(a).get(b).setConditiopn(0);
                    cells.get(a+1).get(b).setConditiopn(0);
                    cells.get(a).get(b).setIm(new ImageView());
                    cells.get(a+1).get(b).setIm(new ImageView());
                    break;
                }
                case 128: {

                    cells.get(a).get(b).setConditiopn(0);
                    cells.get(a+1).get(b).setConditiopn(0);
                    cells.get(a+2).get(b).setConditiopn(0);
                    cells.get(a).get(b).setIm(new ImageView());
                    cells.get(a+1).get(b).setIm(new ImageView());
                    cells.get(a+2).get(b).setIm(new ImageView());
                    break;
                }
                case 172: {

                    cells.get(a).get(b).setConditiopn(0);
                    cells.get(a+1).get(b).setConditiopn(0);
                    cells.get(a+2).get(b).setConditiopn(0);
                    cells.get(a+3).get(b).setConditiopn(0);
                    cells.get(a).get(b).setIm(new ImageView());
                    cells.get(a+1).get(b).setIm(new ImageView());
                    cells.get(a+2).get(b).setIm(new ImageView());
                    cells.get(a+3).get(b).setIm(new ImageView());
                    break;
                }
            }
        }

    }
    public void clearCell(ImageView im){
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++)
                if (cells.get(a).get(b).getIm()==im) {

                    if (im.getRotate() == 90) {


                        switch ((int) im.getFitHeight()) {
                            case 40: {

                                cells.get(a).get(b).setConditiopn(0);
                                cells.get(a).get(b).setIm(new ImageView());
                                break;
                            }
                            case 84: {

                                cells.get(a).get(b).setConditiopn(0);
                                cells.get(a).get(b-1).setConditiopn(0);
                                cells.get(a).get(b).setIm(new ImageView());
                                cells.get(a).get(b-1).setIm(new ImageView());
                                break;
                            }
                            case 128: {

                                cells.get(a).get(b).setConditiopn(0);
                                cells.get(a).get(b-1).setConditiopn(0);
                                cells.get(a).get(b-2).setConditiopn(0);
                                cells.get(a).get(b).setIm(new ImageView());
                                cells.get(a).get(b-1).setIm(new ImageView());
                                cells.get(a).get(b-2).setIm(new ImageView());
                                break;
                            }
                            case 172: {

                                cells.get(a).get(b).setConditiopn(0);
                                cells.get(a).get(b-1).setConditiopn(0);
                                cells.get(a).get(b-2).setConditiopn(0);
                                cells.get(a).get(b-3).setConditiopn(0);
                                cells.get(a).get(b).setIm(new ImageView());
                                cells.get(a).get(b-1).setIm(new ImageView());
                                cells.get(a).get(b-2).setIm(new ImageView());
                                cells.get(a).get(b-3).setIm(new ImageView());
                                break;
                            }

                        }

                    } else  {

                        switch ((int) im.getFitHeight()) {
                            case 40: {

                                cells.get(a).get(b).setConditiopn(0);
                                cells.get(a).get(b).setIm(new ImageView());
                                break;
                            }
                            case 84: {

                                cells.get(a).get(b).setConditiopn(0);
                                cells.get(a+1).get(b).setConditiopn(0);
                                cells.get(a).get(b).setIm(new ImageView());
                                cells.get(a+1).get(b).setIm(new ImageView());
                                break;
                            }
                            case 128: {

                                cells.get(a).get(b).setConditiopn(0);
                                cells.get(a+1).get(b).setConditiopn(0);
                                cells.get(a+2).get(b).setConditiopn(0);
                                cells.get(a).get(b).setIm(new ImageView());
                                cells.get(a+1).get(b).setIm(new ImageView());
                                cells.get(a+2).get(b).setIm(new ImageView());
                                break;
                            }
                            case 172: {

                                cells.get(a).get(b).setConditiopn(0);
                                cells.get(a+1).get(b).setConditiopn(0);
                                cells.get(a+2).get(b).setConditiopn(0);
                                cells.get(a+3).get(b).setConditiopn(0);
                                cells.get(a).get(b).setIm(new ImageView());
                                cells.get(a+1).get(b).setIm(new ImageView());
                                cells.get(a+2).get(b).setIm(new ImageView());
                                cells.get(a+3).get(b).setIm(new ImageView());
                                break;
                            }
                        }
                    }

                }
        }
    }

    public void setCell(int x, int y, int type) {
        cells.get(x - 1).get(y - 1).setConditiopn(type);
    }
/*
    public void setCellShip(int x, int y, Ship ship) {
        cells.get(x - 1).get(y - 1).setConditiopn(ship.getType());
        cells.get(x - 1).get(y - 1).addShip(ship);
    }
*/
    public Cell getCell(int x, int y) {
        return cells.get(x ).get(y );
    }
    public void printField(){
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print(" "+cells.get(i).get(j).getConditiopn()+" ");

            }
        }
        System.out.println();
        System.out.println("=============================");
    }
}
