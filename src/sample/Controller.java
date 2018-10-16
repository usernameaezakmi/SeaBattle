package sample;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Duration;


import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Controller {
    @FXML
    public ImageView c1 = new ImageView();
    @FXML
    ImageView c2 = new ImageView();
    @FXML
    ImageView c3 = new ImageView();
    @FXML
    ImageView c4 = new ImageView();
    @FXML
    ImageView c5 = new ImageView();
    @FXML
    ImageView c6 = new ImageView();
    @FXML
    ImageView c7 = new ImageView();
    @FXML
    ImageView c8 = new ImageView();
    @FXML
    ImageView c9 = new ImageView();
    @FXML
    ImageView c10 = new ImageView();
    @FXML
    ImageView c11 = new ImageView();
    @FXML
    ImageView c12 = new ImageView();
    @FXML
    ImageView c13 = new ImageView();
    @FXML
    ImageView c14 = new ImageView();
    @FXML
    ImageView c15 = new ImageView();
    @FXML
    ImageView c16 = new ImageView();
    @FXML
    ImageView c17 = new ImageView();
    @FXML
    ImageView c18 = new ImageView();
    @FXML
    ImageView c19 = new ImageView();
    @FXML
    ImageView c20 = new ImageView();
    @FXML
    ImageView c21 = new ImageView();
    @FXML
    ImageView c22 = new ImageView();
    @FXML
    ImageView c23 = new ImageView();
    @FXML
    ImageView c24 = new ImageView();
    @FXML
    ImageView c25 = new ImageView();
    @FXML
    ImageView c26 = new ImageView();
    @FXML
    ImageView c27 = new ImageView();
    @FXML
    ImageView c28 = new ImageView();
    @FXML
    ImageView c29 = new ImageView();
    @FXML
    ImageView c30 = new ImageView();
    @FXML
    ImageView c31 = new ImageView();
    @FXML
    ImageView c32 = new ImageView();
    @FXML
    ImageView c33 = new ImageView();
    @FXML
    ImageView c34 = new ImageView();
    @FXML
    ImageView c35 = new ImageView();
    @FXML
    ImageView c36 = new ImageView();
    @FXML
    ImageView c37 = new ImageView();
    @FXML
    ImageView c38 = new ImageView();
    @FXML
    ImageView c39 = new ImageView();
    @FXML
    ImageView c40 = new ImageView();
    @FXML
    ImageView c41 = new ImageView();
    @FXML
    ImageView c42 = new ImageView();
    @FXML
    ImageView c43 = new ImageView();
    @FXML
    ImageView c44 = new ImageView();
    @FXML
    ImageView c45 = new ImageView();
    @FXML
    ImageView c46 = new ImageView();
    @FXML
    ImageView c47 = new ImageView();
    @FXML
    ImageView c48 = new ImageView();
    @FXML
    ImageView c49 = new ImageView();
    @FXML
    ImageView c50 = new ImageView();
    @FXML
    ImageView c51 = new ImageView();
    @FXML
    ImageView c52 = new ImageView();
    @FXML
    ImageView c53 = new ImageView();
    @FXML
    ImageView c54 = new ImageView();
    @FXML
    ImageView c55 = new ImageView();
    @FXML
    ImageView c56 = new ImageView();
    @FXML
    ImageView c57 = new ImageView();
    @FXML
    ImageView c58 = new ImageView();
    @FXML
    ImageView c59 = new ImageView();
    @FXML
    ImageView c60 = new ImageView();
    @FXML
    ImageView c61 = new ImageView();
    @FXML
    ImageView c62 = new ImageView();
    @FXML
    ImageView c63 = new ImageView();
    @FXML
    ImageView c64 = new ImageView();
    @FXML
    ImageView c65 = new ImageView();
    @FXML
    ImageView c66 = new ImageView();
    @FXML
    ImageView c67 = new ImageView();
    @FXML
    ImageView c68 = new ImageView();
    @FXML
    ImageView c69 = new ImageView();
    @FXML
    ImageView c70 = new ImageView();
    @FXML
    ImageView c71 = new ImageView();
    @FXML
    ImageView c72 = new ImageView();
    @FXML
    ImageView c73 = new ImageView();
    @FXML
    ImageView c74 = new ImageView();
    @FXML
    ImageView c75 = new ImageView();
    @FXML
    ImageView c76 = new ImageView();
    @FXML
    ImageView c77 = new ImageView();
    @FXML
    ImageView c78 = new ImageView();
    @FXML
    ImageView c79 = new ImageView();
    @FXML
    ImageView c80 = new ImageView();
    @FXML
    ImageView c81 = new ImageView();
    @FXML
    ImageView c82 = new ImageView();
    @FXML
    ImageView c83 = new ImageView();
    @FXML
    ImageView c84 = new ImageView();
    @FXML
    ImageView c85 = new ImageView();
    @FXML
    ImageView c86 = new ImageView();
    @FXML
    ImageView c87 = new ImageView();
    @FXML
    ImageView c88 = new ImageView();
    @FXML
    ImageView c89 = new ImageView();
    @FXML
    ImageView c90 = new ImageView();
    @FXML
    ImageView c91 = new ImageView();
    @FXML
    ImageView c92 = new ImageView();
    @FXML
    ImageView c93 = new ImageView();
    @FXML
    ImageView c94 = new ImageView();
    @FXML
    ImageView c95 = new ImageView();
    @FXML
    ImageView c96 = new ImageView();
    @FXML
    ImageView c97 = new ImageView();
    @FXML
    ImageView c98 = new ImageView();
    @FXML
    ImageView c99 = new ImageView();
    @FXML
    ImageView c100 = new ImageView();
    @FXML
    ImageView c101 = new ImageView();
    @FXML
    ImageView c102 = new ImageView();
    @FXML
    ImageView c103 = new ImageView();
    @FXML
    ImageView c104 = new ImageView();
    @FXML
    ImageView c105 = new ImageView();
    @FXML
    ImageView c106 = new ImageView();
    @FXML
    ImageView c107 = new ImageView();
    @FXML
    ImageView c108 = new ImageView();
    @FXML
    ImageView c109 = new ImageView();
    @FXML
    ImageView c110 = new ImageView();
    @FXML
    ImageView c111 = new ImageView();
    @FXML
    ImageView c112 = new ImageView();
    @FXML
    ImageView c113 = new ImageView();
    @FXML
    ImageView c114 = new ImageView();
    @FXML
    ImageView c115 = new ImageView();
    @FXML
    ImageView c116 = new ImageView();
    @FXML
    ImageView c117 = new ImageView();
    @FXML
    ImageView c118 = new ImageView();
    @FXML
    ImageView c119 = new ImageView();
    @FXML
    ImageView c120 = new ImageView();
    @FXML
    ImageView c121 = new ImageView();
    @FXML
    ImageView c122 = new ImageView();
    @FXML
    ImageView c123 = new ImageView();
    @FXML
    ImageView c124 = new ImageView();
    @FXML
    ImageView c125 = new ImageView();
    @FXML
    ImageView c126 = new ImageView();
    @FXML
    ImageView c127 = new ImageView();
    @FXML
    ImageView c128 = new ImageView();
    @FXML
    ImageView c129 = new ImageView();
    @FXML
    ImageView c130 = new ImageView();
    @FXML
    ImageView c131 = new ImageView();
    @FXML
    ImageView c132 = new ImageView();
    @FXML
    ImageView c133 = new ImageView();
    @FXML
    ImageView c134 = new ImageView();
    @FXML
    ImageView c135 = new ImageView();
    @FXML
    ImageView c136 = new ImageView();
    @FXML
    ImageView c137 = new ImageView();
    @FXML
    ImageView c138 = new ImageView();
    @FXML
    ImageView c139 = new ImageView();
    @FXML
    ImageView c140 = new ImageView();
    @FXML
    ImageView c141 = new ImageView();
    @FXML
    ImageView c142 = new ImageView();
    @FXML
    ImageView c143 = new ImageView();
    @FXML
    ImageView c144 = new ImageView();
    @FXML
    ImageView c145 = new ImageView();
    @FXML
    ImageView c146 = new ImageView();
    @FXML
    ImageView c147 = new ImageView();
    @FXML
    ImageView c148 = new ImageView();
    @FXML
    ImageView c149 = new ImageView();
    @FXML
    ImageView c150 = new ImageView();
    @FXML
    ImageView c151 = new ImageView();
    @FXML
    ImageView c152 = new ImageView();
    @FXML
    ImageView c153 = new ImageView();
    @FXML
    ImageView c154 = new ImageView();
    @FXML
    ImageView c155 = new ImageView();
    @FXML
    ImageView c156 = new ImageView();
    @FXML
    ImageView c157 = new ImageView();
    @FXML
    ImageView c158 = new ImageView();
    @FXML
    ImageView c159 = new ImageView();
    @FXML
    ImageView c160 = new ImageView();
    @FXML
    ImageView c161 = new ImageView();
    @FXML
    ImageView c162 = new ImageView();
    @FXML
    ImageView c163 = new ImageView();
    @FXML
    ImageView c164 = new ImageView();
    @FXML
    ImageView c165 = new ImageView();
    @FXML
    ImageView c166 = new ImageView();
    @FXML
    ImageView c167 = new ImageView();
    @FXML
    ImageView c168 = new ImageView();
    @FXML
    ImageView c169 = new ImageView();
    @FXML
    ImageView c170 = new ImageView();
    @FXML
    ImageView c171 = new ImageView();
    @FXML
    ImageView c172 = new ImageView();
    @FXML
    ImageView c173 = new ImageView();
    @FXML
    ImageView c174 = new ImageView();
    @FXML
    ImageView c175 = new ImageView();
    @FXML
    ImageView c176 = new ImageView();
    @FXML
    ImageView c177 = new ImageView();
    @FXML
    ImageView c178 = new ImageView();
    @FXML
    ImageView c179 = new ImageView();
    @FXML
    ImageView c180 = new ImageView();
    @FXML
    ImageView c181 = new ImageView();
    @FXML
    ImageView c182 = new ImageView();
    @FXML
    ImageView c183 = new ImageView();
    @FXML
    ImageView c184 = new ImageView();
    @FXML
    ImageView c185 = new ImageView();
    @FXML
    ImageView c186 = new ImageView();
    @FXML
    ImageView c187 = new ImageView();
    @FXML
    ImageView c188 = new ImageView();
    @FXML
    ImageView c189 = new ImageView();
    @FXML
    ImageView c190 = new ImageView();
    @FXML
    ImageView c191 = new ImageView();
    @FXML
    ImageView c192 = new ImageView();
    @FXML
    ImageView c193 = new ImageView();
    @FXML
    ImageView c194 = new ImageView();
    @FXML
    ImageView c195 = new ImageView();
    @FXML
    ImageView c196 = new ImageView();
    @FXML
    ImageView c197 = new ImageView();
    @FXML
    ImageView c198 = new ImageView();
    @FXML
    ImageView c199 = new ImageView();
    @FXML
    ImageView c200 = new ImageView();
    @FXML
    Label l1 = new Label();
    @FXML
    Label l2 = new Label();
    @FXML
    Label l3 = new Label();
    @FXML
    Label l4 = new Label();
    static Field f1 = new Field();
    static Field f2 = new Field();
    private double oldX = -990.0;
    private double oldY = -990.0;

    @FXML
    public void reset() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                f1.getCell(i, j).getIm().setTranslateY(0);
                f1.getCell(i, j).getIm().setTranslateX(0);
                f1.clearCell(i, j);

            }
        }

    }

    @FXML
    public void reset2() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                f2.getCell(i, j).getIm().setTranslateY(0);
                f2.getCell(i, j).getIm().setTranslateX(0);
                f2.clearCell(i, j);

            }
        }

    }
    @FXML
    public void autoInstall() {

        autoInstalX(f1);
        System.out.println("==============================F1");
        f1.printField();
        System.out.println("==============================F2");
        f2.printField();
        overBuild();
        System.out.println("==============================F1");
        f1.printField();
        System.out.println("==============================F2");
        f2.printField();

//сссука, блядь, почему ??? куда пропадает f2 !?
    }

    @FXML
    public void autoInstall2() {

        autoInstalX(f1);
        overBuild2();
    }

    public void autoInstalX(Field a) {
        int palubnost = 4;
        int numberShip = 10;
        for (; numberShip != 0; ) {
            int direction = (new Random().nextInt(2));
            int randx = (new Random().nextInt(10));
            int randy = (new Random().nextInt(10));
            if (numberShip == 9) {
                palubnost = 3;
            }
            if (numberShip == 7) {
                palubnost = 2;
            }
            if (numberShip == 4) {
                palubnost = 1;
            }
            //System.out.print("numberShip="+numberShip);
            //System.out.println("randx="+randx);
            //System.out.println("randy="+randy);

            if ((randx != 0) && (randx != 9) && (randy != 0) && (randy != 9)) {
                if (direction == 0) {
                    for (int pal = palubnost - 1, obsh = 0; pal >= 0; pal--) {
                        if (randx - palubnost > 0) {

                            if (check45(a, randx - pal, randy)
                                    && check135(a, randx - pal, randy)
                                    && check315(a, randx - pal, randy)
                                    && check225(a, randx - pal, randy)) {
                                obsh++;
                                if (obsh == palubnost) {
                                    for (int pal2 = palubnost - 1; pal2 >= 0; pal2--) {
                                        a.getCell(randx - pal2, randy).setConditiopn(1);
                                    }

                                    numberShip--;
                                    printField();
                                    System.out.println();
                                    System.out.println("----------------------------------------------------------" + numberShip);

                                }
                            }
                        }
                    }
                } else {
                    for (int pal = palubnost - 1, obsh = 0; pal >= 0; pal--) {
                        if (randy + palubnost < 9) {
                            if (check45(a, randx, randy + pal)
                                    && check135(a, randx, randy + pal)
                                    && check315(a, randx, randy + pal)
                                    && check225(a, randx, randy + pal)) {
                                obsh++;
                                if (obsh == palubnost) {
                                    for (int pal2 = palubnost - 1; pal2 >= 0; pal2--) {
                                        a.getCell(randx, randy + pal2).setConditiopn(1);
                                    }
                                    numberShip--;
                                    printField();
                                    System.out.println();
                                    System.out.println("----------------------------------------------------------" + numberShip);
                                }
                            }
                        }
                    }
                }
            } else {

                int direction2 = 0;
                if (direction == 0) {
                    if ((randx == 0) && (randy != 9) && (randy != 0)) {
                        direction2 = 2;
                    }
                    if ((randx != 9 - palubnost + 1) && (randx != 0) && (randy == 0)) {
                        direction2 = 8;
                    }
                    if ((randx != 9 - palubnost + 1) && (randx != 0) && (randy == 9)) {
                        direction2 = 4;
                    }
                    if ((randx == 9 - palubnost + 1) && (randy != 9) && (randy != 0)) {
                        direction2 = 6;
                    }
                    if ((randx == 0) && (randy == 0)) {
                        direction2 = 1;
                    }
                    if ((randx == 0) && (randy == 9)) {
                        direction2 = 3;
                    }
                    if ((randx == 9 - palubnost + 1) && (randy == 0)) {
                        direction2 = 7;
                    }
                    if ((randx == 9 - palubnost + 1) && (randy == 9)) {
                        direction2 = 5;
                    }
                } else {
                    if ((randx == 0) && (randy != 9) && (randy != 0 - 1 + palubnost)) {
                        direction2 = 2;
                    }
                    if ((randx != 9) && (randx != 0) && (randy == 0 - 1 + palubnost)) {
                        direction2 = 8;
                    }
                    if ((randx != 9) && (randx != 0) && (randy == 9)) {
                        direction2 = 4;
                    }
                    if ((randx == 9) && (randy != 9) && (randy != 0)) {
                        direction2 = 6;
                    }
                    if ((randx == 0) && (randy == 0 - 1 + palubnost)) {
                        direction2 = 1;
                    }
                    if ((randx == 0) && (randy == 9)) {
                        direction2 = 3;
                    }
                    if ((randx == 9) && (randy == 0 - 1 + palubnost)) {
                        direction2 = 7;
                    }
                    if ((randx == 9) && (randy == 9)) {
                        direction2 = 5;
                    }
                }

                int rotation = 0;
                if (direction == 1) {
                    rotation = 90;
                }

                switch (direction2) {
                    case 1: {

                        int ifq = 0;
                        if (direction == 0) {

                            for (int kl = 0; kl < palubnost; kl++) {
                                if ((kl + randx > 0) && (kl + randx < 10) && (randy < 10)) {
                                    if (check225(a, randx + kl, randy)) {
                                        ifq++;
                                    }
                                }
                            }
                        } else {

                            for (int kl = 0; kl < palubnost; kl++) {
                                if ((randy - kl > 0) && (randy - kl < 10) && (randx < 10)) {
                                    if (check225(a, randx, randy - kl)) {
                                        ifq++;
                                    }
                                }
                            }
                        }
                        if (ifq == palubnost) {
                            clingShipToCellInCorner(ifq, palubnost, rotation, randx, randy, a);
                            numberShip--;
                            printField();
                            System.out.println();
                            System.out.println("----------------------------------------------------------" + numberShip);
                        }
                        break;


                    }
                    case 2: {

                        int ifq = 0;
                        if (direction == 0) {

                            for (int kl = 0; kl < palubnost; kl++) {
                                if ((randx + kl > 0) && (randx + kl < 10) && (randy < 10)) {
                                    if ((check225(a, randx + kl, randy)) && (check315(a, randx + kl, randy))) {
                                        ifq++;
                                    }
                                }
                            }
                        } else {
                            for (int kl = 0; kl < palubnost; kl++) {
                                if ((randy - kl > 0) && (randy - kl < 10) && (randx < 10) && (randx > 0) && (randx < 10) && (randx > 0)) {
                                    if ((check225(a, randx, randy - kl)) && (check315(a, randx, randy - kl))) {
                                        ifq++;
                                    }
                                }
                            }
                        }
                        if (ifq == palubnost) {
                            clingShipToCellInCorner(ifq, palubnost, rotation, randx, randy, a);
                            numberShip--;
                            printField();
                            System.out.println();
                            System.out.println("----------------------------------------------------------" + numberShip);
                        }
                        break;
                    }
                    case 3: {

                        int ifq = 0;
                        if (direction == 0) {

                            for (int kl = 0; kl < palubnost; kl++) {
                                if ((randx + kl > 0) && (randx + kl < 10) && (randy < 10)) {
                                    if (check315(a, randx + kl, randy)) {
                                        ifq++;
                                    }
                                }
                            }
                        } else {
                            for (int kl = 0; kl < palubnost; kl++) {
                                if ((randy - kl > 0) && (randy - kl < 10) && (randx > 0)) {
                                    if (check315(a, randx, randy - kl)) {
                                        ifq++;
                                    }
                                }
                            }
                        }
                        if (ifq == palubnost) {
                            clingShipToCellInCorner(ifq, palubnost, rotation, randx, randy, a);
                            numberShip--;
                            printField();
                            System.out.println();
                            System.out.println("----------------------------------------------------------" + numberShip);
                        }
                        break;
                    }
                    case 4: {

                        int ifq = 0;
                        if (direction == 0) {

                            for (int kl = 0; kl < palubnost; kl++) {
                                if ((randx + kl > 0) && (randx + kl + 1 < 10) && (randy < 10) && (randy < 10) && (randy > 0)) {

                                    if ((check45(a, randx + kl, randy)) && (check315(a, randx + kl, randy))) {
                                        ifq++;
                                    }
                                }
                            }
                        } else {
                            for (int kl = 0; kl < palubnost; kl++) {
                                if ((randy - kl > 0) && (randy - kl < 10) && (randx > 0)) {
                                    if ((check45(a, randx, randy - kl)) && (check315(a, randx, randy - kl))) {
                                        ifq++;
                                    }
                                }
                            }
                        }
                        if (ifq == palubnost) {
                            clingShipToCellInCorner(ifq, palubnost, rotation, randx, randy, a);
                            numberShip--;
                            printField();
                            System.out.println();
                            System.out.println("----------------------------------------------------------" + numberShip);
                        }
                        break;
                    }
                    case 5: {

                        int ifq = 0;
                        if (direction == 0) {

                            for (int kl = 0; kl < palubnost; kl++) {
                                if ((randx + kl > 0) && (randx + kl < 10) && (randy > 0)) {
                                    if (check45(a, randx + kl, randy)) {
                                        ifq++;
                                    }
                                }
                            }
                        } else {
                            for (int kl = 0; kl < palubnost; kl++) {
                                if ((randy - kl > 0) && (randy - kl < 10) && (randx > 0)) {
                                    if (check45(a, randx, randy - kl)) {
                                        ifq++;
                                    }
                                }
                            }
                        }
                        if (ifq == palubnost) {
                            clingShipToCellInCorner(ifq, palubnost, rotation, randx, randy, a);
                            numberShip--;
                            printField();
                            System.out.println();
                            System.out.println("----------------------------------------------------------" + numberShip);
                        }
                        break;
                    }
                    case 6: {

                        int ifq = 0;

                        if (direction == 0) {

                            for (int kl = 0; kl < palubnost; kl++) {
                                if ((randx + kl > 0) && (randx + kl < 10) && (randy > 0)) {
                                    if ((check135(a, randx + kl, randy)) && (check45(a, randx + kl, randy))) {
                                        ifq++;
                                    }
                                }
                            }
                        } else {
                            for (int kl = 0; kl < palubnost; kl++) {
                                if ((randy - kl > 0) && (randy - kl < 10) && (randx < 10) && (randx > 0)) {
                                    if ((check135(a, randx, randy - kl)) && (check45(a, randx, randy - kl))) {
                                        ifq++;
                                    }
                                }
                            }
                        }
                        if (ifq == palubnost) {
                            clingShipToCellInCorner(ifq, palubnost, rotation, randx, randy, a);
                            numberShip--;
                            printField();
                            System.out.println();
                            System.out.println("----------------------------------------------------------" + numberShip);
                        }
                        break;
                    }
                    case 7: {

                        int ifq = 0;
                        if (direction == 0) {

                            for (int kl = 0; kl < palubnost; kl++) {
                                if ((randx + kl > 0) && (randx + kl < 10) && (randy > 0)) {
                                    if (check135(a, randx + kl, randy)) {
                                        ifq++;
                                    }
                                }
                            }
                        } else {

                            for (int kl = 0; kl < palubnost; kl++) {
                                if ((randy - kl > 0) && (randy - kl < 10) && (randx < 10)) {
                                    if (check135(a, randx, randy - kl)) {
                                        ifq++;
                                    }
                                }
                            }
                        }
                        if (ifq == palubnost) {
                            clingShipToCellInCorner(ifq, palubnost, rotation, randx, randy, a);
                            numberShip--;
                            printField();
                            System.out.println();
                            System.out.println("----------------------------------------------------------" + numberShip);
                        }
                        break;
                    }
                    case 8: {
                        int ifq = 0;
                        if (direction == 0) {
                            for (int kl = 0; kl < palubnost; kl++) {
                                if ((randx + kl > 0) && (randx + kl < 10) && (randy < 10) && (randy > 0)) {
                                    if ((check135(a, randx + kl, randy)) && (check225(a, randx + kl, randy))) {
                                        ifq++;
                                    }
                                }
                            }
                        } else {
                            for (int kl = 0; kl < palubnost; kl++) {
                                if ((randy - kl > 0) && (randy - kl < 10) && (randx < 10)) {
                                    if ((check135(a, randx, randy - kl)) && (check225(a, randx, randy - kl))) {
                                        ifq++;
                                    }
                                }
                            }
                        }
                        if (ifq == palubnost) {
                            clingShipToCellInCorner(ifq, palubnost, rotation, randx, randy, a);
                            numberShip--;
                            printField();
                            System.out.println();
                            System.out.println("----------------------------------------------------------" + numberShip);
                        }
                        break;
                    }

                }
            }
        }
    }

    @FXML
    public void overBuild() {
        int k = 0;
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                k = k + f1.getCell(a, b).getConditiopn();
            }
        }
        if (k == 20) {
            Stage st = (Stage) Stage.getWindows().get(0);
            AnchorPane root = null;
            try {
                root = (AnchorPane) FXMLLoader.load(getClass().getResource("sample2.3.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            st.setScene(new Scene(root));
            Field f3 = new Field();
            f3 = f2;
            f2 = f1;
            f1 = f3;
        } else {
            reset();
        }
    }

    @FXML
    public void overBuild2() {
        int k = 0;
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                k = k + f1.getCell(a, b).getConditiopn();
            }
        }
        if (k == 20) {
            Stage st = (Stage) Stage.getWindows().get(0);

            AnchorPane root = null;
            try {
                root = (AnchorPane) FXMLLoader.load(getClass().getResource("sample3.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            st.setScene(new Scene(root));
        } else {
            reset();
            System.out.println("E!=" + k);
        }
    }

    public void autoRecovery(Field f1) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (f1.getCell(i, j).getConditiopn() == 1) {
                    f1.getCell(i, j).getIm();
                }
            }
        }
    }

    @FXML
    public void playerVsPlayer() {
        Stage st = (Stage) Stage.getWindows().get(0);
        AnchorPane root = null;
        try {
            root = (AnchorPane) FXMLLoader.load(getClass().getResource("sample2.2.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        st.setScene(new Scene(root));
    }

    @FXML
    public void onMouseDragExited(Event event) {
        ImageView im = (ImageView) event.getSource();
        double x = im.getLayoutX() + im.getTranslateX();
        double y = im.getLayoutY() + im.getTranslateY();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                switch ((int) im.getFitHeight()) {
                    case 40: {

                        clingShipToCell(x, y, f1, im, 0, i, j);
                        break;
                    }
                    case 84: {
                        if (im.getRotate() == 0) {
                            clingShipToCell(x, y, f1, im, 0, i, j);
                        } else if (im.getRotate() == 90) {
                            clingShipToCell(x, y, f1, im, 22.0, i, j);
                        }
                        break;
                    }
                    case 128: {
                        if (im.getRotate() == 0) {
                            clingShipToCell(x, y, f1, im, 0, i, j);
                        } else if (im.getRotate() == 90) {
                            clingShipToCell(x, y, f1, im, 44.0, i, j);
                        }
                        break;
                    }
                    case 172: {
                        if (im.getRotate() == 0) {
                            clingShipToCell(x, y, f1, im, 0, i, j);
                        } else if (im.getRotate() == 90) {
                            clingShipToCell(x, y, f1, im, 66.0, i, j);
                        }
                        break;
                    }
                }
            }
        }
    }

    @FXML
    public void onClickShip(Event event) {
        String string = event.toString();

        char[] ch = string.toCharArray();


        for (int i = 0; i < string.length(); i++) {


            if ((ch[i] == 'b') && (ch[i + 1] == 'u') && (ch[i + 2] == 't') && (ch[i + 3] == 't') && (ch[i + 4] == 'o') && (ch[i + 5] == 'n') && (ch[i + 9] == 'S') && (ch[i + 10] == 'E')) {
                ImageView im = (ImageView) event.getSource();
                if ((((ImageView) event.getSource()).getTranslateY() != 0) || (((ImageView) event.getSource()).getTranslateY() != 0)) {
                    f1.clearCell((ImageView) event.getSource());

                }

                RotateTransition rot = new RotateTransition(Duration.seconds(0.5), im);
                TranslateTransition trans = new TranslateTransition(Duration.seconds(0.5), im);

                switch ((int) im.getFitHeight()) {
                    case 40: {
                        rotateMoveShip(im, 0.0, rot, trans);
                        break;
                    }
                    case 84: {

                        rotateMoveShip(im, 22.0, rot, trans);
                        break;
                    }
                    case 128: {
                        rotateMoveShip(im, 44.0, rot, trans);
                        break;
                    }
                    case 172: {
                        rotateMoveShip(im, 66.0, rot, trans);
                        break;
                    }
                }


                f1.printField();
                ((ImageView) event.getSource()).setTranslateY(0);
                ((ImageView) event.getSource()).setTranslateX(0);
                break;

            }

        }

    }


    @FXML
    public void onEnteredShip(Event event) {
        ImageView im = (ImageView) event.getSource();


        if ((oldX == -990.0) && (oldY == -990.0)) {
            oldX = im.getTranslateX() - MouseInfo.getPointerInfo().getLocation().getX();
            oldY = im.getTranslateY() - MouseInfo.getPointerInfo().getLocation().getY();
        }
        if ((oldX != im.getTranslateX() - MouseInfo.getPointerInfo().getLocation().getX()) && (oldY != im.getTranslateY() - MouseInfo.getPointerInfo().getLocation().getY())) {
            oldX = im.getTranslateX() - MouseInfo.getPointerInfo().getLocation().getX();
            oldY = im.getTranslateY() - MouseInfo.getPointerInfo().getLocation().getY();
        }

    }

    @FXML
    public void onDraggedShip(Event event) {
        //где использовать это??
        if ((((ImageView) event.getSource()).getTranslateY() != 0) || (((ImageView) event.getSource()).getTranslateY() != 0)) {
            f1.clearCell((ImageView) event.getSource());
        }

        ImageView im = (ImageView) event.getSource();
        if ((oldX == -990.0) && (oldY == -990.0)) {
            oldX = im.getTranslateX() - MouseInfo.getPointerInfo().getLocation().getX();
            oldY = im.getTranslateY() - MouseInfo.getPointerInfo().getLocation().getY();
        }
        im.setTranslateX(oldX + MouseInfo.getPointerInfo().getLocation().getX());
        im.setTranslateY(oldY + MouseInfo.getPointerInfo().getLocation().getY());
    }

    @FXML
    public void printField() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {

                System.out.print(" " + f1.getCell(i, j).getConditiopn());
            }
        }
    }

    private boolean check45(Field f1, int i, int j) {
        if ((

                f1.getCell(i, j).getConditiopn() == 0) &&
                (f1.getCell(i - 1, j - 1).getConditiopn() == 0) &&
                (f1.getCell(i - 1, j).getConditiopn() == 0) &&
                (f1.getCell(i, j - 1).getConditiopn() == 0)


                ) {
            return true;
        } else {
            return false;
        }
    }

    private boolean check135(Field f1, int i, int j) {
        if ((

                f1.getCell(i, j).getConditiopn() == 0) &&
                (f1.getCell(i - 1, j + 1).getConditiopn() == 0) &&
                (f1.getCell(i, j + 1).getConditiopn() == 0) &&
                (f1.getCell(i - 1, j).getConditiopn() == 0)
                ) {
            return true;
        } else {
            return false;
        }
    }

    private boolean check225(Field f1, int i, int j) {
        if ((
                f1.getCell(i, j).getConditiopn() == 0) &&
                (f1.getCell(i + 1, j + 1).getConditiopn() == 0) &&
                (f1.getCell(i + 1, j).getConditiopn() == 0) &&
                (f1.getCell(i, j + 1).getConditiopn() == 0)
                ) {
            return true;
        } else {
            return false;
        }
    }

    private boolean check315(Field f1, int i, int j) {
        if ((
                f1.getCell(i, j).getConditiopn() == 0) &&
                (f1.getCell(i + 1, j - 1).getConditiopn() == 0) &&
                (f1.getCell(i + 1, j).getConditiopn() == 0) &&
                (f1.getCell(i, j - 1).getConditiopn() == 0)
                ) {
            return true;
        } else {
            return false;
        }
    }

    private void clingShipToCellInCorner(int ifq, int palubnost, ImageView im, int rotation, int i, int j, double range, Field f1) {
        if (ifq == palubnost) {
            for (int klar = 0; klar < palubnost; klar++) {
                if (rotation == 0) {
                    if (klar == 0) {
                        im.setTranslateX(f1.getCell(i, j).getIm2().getLayoutX() - im.getLayoutX() - range);
                        im.setTranslateY(f1.getCell(i, j).getIm2().getLayoutY() - im.getLayoutY() - range);
                    }
                    f1.getCell(i + klar, j).setIm(im);
                    f1.getCell(i + klar, j).setConditiopn(1);
                } else {
                    if (klar == 0) {
                        im.setTranslateX(f1.getCell(i, j).getIm2().getLayoutX() - im.getLayoutX() - range);
                        im.setTranslateY(f1.getCell(i, j).getIm2().getLayoutY() - im.getLayoutY() - range);
                    }
                    f1.getCell(i, j - klar).setIm(im);
                    f1.getCell(i, j - klar).setConditiopn(1);
                }

            }
        } else {
            im.setTranslateX(0);
            im.setTranslateY(0);
            im.setRotate(0);

        }
    }

    private void clingShipToCellInCorner(int ifq, int palubnost, int rotation, int i, int j, Field f1) {
        if (ifq == palubnost) {
            for (int klar = 0; klar < palubnost; klar++) {
                if (rotation == 0) {
                    if (klar == 0) {
                    }
                    f1.getCell(i + klar, j).setConditiopn(1);
                } else {
                    if (klar == 0) {

                    }

                    f1.getCell(i, j - klar).setConditiopn(1);
                }

            }
        } else {

        }
    }


    private void checkAndInstallation(Field f1, int i, int j, ImageView im, double range) {

        int direction = 0;
        int palubnost = 0;
        int rotation = 0;
        if (im.getRotate() == 90) {
            rotation = 90;
        }
        switch ((int) im.getFitHeight()) {
            case 40: {
                palubnost = 1;
                break;
            }
            case 84: {
                palubnost = 2;
                break;
            }
            case 128: {
                palubnost = 3;
                break;
            }
            case 172: {
                palubnost = 4;
                break;
            }
        }
        if (rotation == 0) {
            if ((i == 0) && (j != 9) && (j != 0)) {
                direction = 2;
            }
            if ((i != 9 - palubnost + 1) && (i != 0) && (j == 0)) {
                direction = 8;
            }
            if ((i != 9 - palubnost + 1) && (i != 0) && (j == 9)) {
                direction = 4;
            }
            if ((i == 9 - palubnost + 1) && (j != 9) && (j != 0)) {
                direction = 6;
            }
            if ((i == 0) && (j == 0)) {
                direction = 1;
            }
            if ((i == 0) && (j == 9)) {
                direction = 3;
            }
            if ((i == 9 - palubnost + 1) && (j == 0)) {
                direction = 7;
            }
            if ((i == 9 - palubnost + 1) && (j == 9)) {
                direction = 5;
            }
        } else {
            if ((i == 0) && (j != 9) && (j != 0 - 1 + palubnost)) {
                direction = 2;
            }
            if ((i != 9) && (i != 0) && (j == 0 - 1 + palubnost)) {
                direction = 8;
            }
            if ((i != 9) && (i != 0) && (j == 9)) {
                direction = 4;
            }
            if ((i == 9) && (j != 9) && (j != 0)) {
                direction = 6;
            }
            if ((i == 0) && (j == 0 - 1 + palubnost)) {
                direction = 1;
            }
            if ((i == 0) && (j == 9)) {
                direction = 3;
            }
            if ((i == 9) && (j == 0 - 1 + palubnost)) {
                direction = 7;
            }
            if ((i == 9) && (j == 9)) {
                direction = 5;
            }
        }


        switch (direction) {
            case 1: {

                int ifq = 0;
                if (rotation == 0) {

                    for (int kl = 0; kl < palubnost; kl++) {

                        if (check225(f1, i + kl, j)) {
                            ifq++;
                        }
                    }
                } else {
                    for (int kl = 0; kl < palubnost; kl++) {
                        if (check225(f1, i, j - kl)) {
                            ifq++;
                        }
                    }
                }
                clingShipToCellInCorner(ifq, palubnost, im, rotation, i, j, range, f1);
                break;


            }
            case 2: {

                int ifq = 0;
                if (rotation == 0) {

                    for (int kl = 0; kl < palubnost; kl++) {

                        if ((check225(f1, i + kl, j)) && (check315(f1, i + kl, j))) {
                            ifq++;
                        }
                    }
                } else {
                    for (int kl = 0; kl < palubnost; kl++) {
                        if ((check225(f1, i, j - kl)) && (check315(f1, i, j - kl))) {
                            ifq++;
                        }
                    }
                }
                clingShipToCellInCorner(ifq, palubnost, im, rotation, i, j, range, f1);
                break;
            }
            case 3: {

                int ifq = 0;
                if (rotation == 0) {

                    for (int kl = 0; kl < palubnost; kl++) {

                        if (check315(f1, i + kl, j)) {
                            ifq++;
                        }
                    }
                } else {
                    for (int kl = 0; kl < palubnost; kl++) {
                        if (check315(f1, i, j - kl)) {
                            ifq++;
                        }
                    }
                }
                clingShipToCellInCorner(ifq, palubnost, im, rotation, i, j, range, f1);
                break;
            }
            case 4: {

                int ifq = 0;
                if (rotation == 0) {

                    for (int kl = 0; kl < palubnost; kl++) {

                        if ((check45(f1, i + kl, j)) && (check315(f1, i + kl, j))) {
                            ifq++;
                        }
                    }
                } else {
                    for (int kl = 0; kl < palubnost; kl++) {
                        if ((check45(f1, i, j - kl)) && (check315(f1, i, j - kl))) {
                            ifq++;
                        }
                    }
                }
                clingShipToCellInCorner(ifq, palubnost, im, rotation, i, j, range, f1);
                break;
            }
            case 5: {

                int ifq = 0;
                if (rotation == 0) {

                    for (int kl = 0; kl < palubnost; kl++) {

                        if (check45(f1, i + kl, j)) {
                            ifq++;
                        }
                    }
                } else {
                    for (int kl = 0; kl < palubnost; kl++) {
                        if (check45(f1, i, j - kl)) {
                            ifq++;
                        }
                    }
                }
                clingShipToCellInCorner(ifq, palubnost, im, rotation, i, j, range, f1);
                break;
            }
            case 6: {

                int ifq = 0;
                if (rotation == 0) {

                    for (int kl = 0; kl < palubnost; kl++) {

                        if ((check135(f1, i + kl, j)) && (check45(f1, i + kl, j))) {
                            ifq++;
                        }
                    }
                } else {
                    for (int kl = 0; kl < palubnost; kl++) {
                        if ((check135(f1, i, j - kl)) && (check45(f1, i, j - kl))) {
                            ifq++;
                        }
                    }
                }
                clingShipToCellInCorner(ifq, palubnost, im, rotation, i, j, range, f1);
                break;
            }
            case 7: {

                int ifq = 0;
                if (rotation == 0) {

                    for (int kl = 0; kl < palubnost; kl++) {

                        if (check135(f1, i + kl, j)) {
                            ifq++;
                        }
                    }
                } else {
                    for (int kl = 0; kl < palubnost; kl++) {
                        if (check135(f1, i, j - kl)) {
                            ifq++;
                        }
                    }
                }
                clingShipToCellInCorner(ifq, palubnost, im, rotation, i, j, range, f1);
                break;
            }
            case 8: {

                int ifq = 0;
                if (rotation == 0) {

                    for (int kl = 0; kl < palubnost; kl++) {

                        if ((check135(f1, i + kl, j)) && (check225(f1, i + kl, j))) {
                            ifq++;
                        }
                    }
                } else {
                    for (int kl = 0; kl < palubnost; kl++) {
                        if ((check135(f1, i, j - kl)) && (check225(f1, i, j - kl))) {
                            ifq++;
                        }
                    }
                }
                clingShipToCellInCorner(ifq, palubnost, im, rotation, i, j, range, f1);
                break;
            }
            /*case 9:{

                break;
            } direction 9= full; чё фулл-то?!*/
        }
    }

    private void clingShipToCell(double x, double y, Field f1, ImageView im, double range, int i, int j) {

        if ((f1.getCell(i, j).getCoordinateX() - 22 - range <= x) &&
                (f1.getCell(i, j).getCoordinateX() + 22 - range > x) &&
                (f1.getCell(i, j).getCoordinateY() + 22 - range >= y) &&
                (f1.getCell(i, j).getCoordinateY() - 22 - range < y)) {


            if ((i != 9) && (j != 9) && (i != 0) && (j != 0) && !((im.getFitHeight() == 84) && (i == 8) && (im.getRotate() == 0)) && !((im.getFitHeight() == 128) && (i == 7) && (im.getRotate() == 0)) && !((im.getFitHeight() == 172) && (i == 6) && (im.getRotate() == 0)) &&
                    !((im.getFitHeight() == 84) && (j == 1) && (im.getRotate() == 90)) && !((im.getFitHeight() == 128) && (j == 2) && (im.getRotate() == 90)) && !((im.getFitHeight() == 172) && (j == 3) && (im.getRotate() == 90))) {//другое условие соответствия
                if (im.getRotate() == 90) {
                    switch ((int) im.getFitHeight()) {
                        case 40: {
                            if ((
                                    f1.getCell(i, j).getConditiopn() == 0) &&
                                    (f1.getCell(i - 1, j - 1).getConditiopn() == 0) &&
                                    (f1.getCell(i - 1, j).getConditiopn() == 0) &&
                                    (f1.getCell(i - 1, j + 1).getConditiopn() == 0) &&
                                    (f1.getCell(i, j - 1).getConditiopn() == 0) &&
                                    (f1.getCell(i, j + 1).getConditiopn() == 0) &&
                                    (f1.getCell(i + 1, j - 1).getConditiopn() == 0) &&
                                    (f1.getCell(i + 1, j).getConditiopn() == 0) &&
                                    (f1.getCell(i + 1, j + 1).getConditiopn() == 0)) {
                                System.out.println("x=" + im.getTranslateX() + " y=" + im.getTranslateY());
                                im.setTranslateX(f1.getCell(i, j).getIm2().getLayoutX() - im.getLayoutX() - range);
                                im.setTranslateY(f1.getCell(i, j).getIm2().getLayoutY() - im.getLayoutY() - range);
                                f1.getCell(i, j).setIm(im);
                                f1.getCell(i, j).setConditiopn(1);
                                break;
                            } else {
                                f1.clearCell(im);
                                im.setTranslateX(0);
                                im.setTranslateY(0);
                                im.setRotate(0);

                                break;
                            }
                        }
                        case 84: {
                            if (
                                    ((f1.getCell(i - 1, j - 2).getConditiopn() == 0)) &&
                                            (f1.getCell(i - 1, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i, j - 2).getConditiopn() == 0) &&
                                            (f1.getCell(i, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i, j).getConditiopn() == 0) &&
                                            (f1.getCell(i, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j - 2).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j + 1).getConditiopn() == 0)) {
                                im.setTranslateX(f1.getCell(i, j).getIm2().getLayoutX() - im.getLayoutX() - range);
                                im.setTranslateY(f1.getCell(i, j).getIm2().getLayoutY() - im.getLayoutY() - range);
                                f1.getCell(i, j).setIm(im);
                                f1.getCell(i, j).setConditiopn(1);
                                f1.getCell(i, j - 1).setConditiopn(1);
                                break;
                            } else {
                                f1.clearCell(im);
                                im.setTranslateX(0);
                                im.setTranslateY(0);
                                im.setRotate(0);

                                break;
                            }
                        }
                        case 128: {
                            if (
                                    (f1.getCell(i - 1, j - 2).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i, j - 2).getConditiopn() == 0) &&
                                            (f1.getCell(i, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i, j).getConditiopn() == 0) &&
                                            (f1.getCell(i, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j - 2).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j - 3).getConditiopn() == 0) &&
                                            (f1.getCell(i, j - 3).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j - 3).getConditiopn() == 0)) {


                                im.setTranslateX(f1.getCell(i, j).getIm2().getLayoutX() - im.getLayoutX() - range);
                                im.setTranslateY(f1.getCell(i, j).getIm2().getLayoutY() - im.getLayoutY() - range);
                                f1.getCell(i, j).setIm(im);
                                f1.getCell(i, j).setConditiopn(1);
                                f1.getCell(i, j - 1).setConditiopn(1);
                                f1.getCell(i, j - 2).setConditiopn(1);
                                break;
                            } else {
                                f1.clearCell(im);
                                im.setTranslateX(0);
                                im.setTranslateY(0);
                                im.setRotate(0);

                                break;
                            }
                        }
                        case 172: {
                            if (
                                    (f1.getCell(i - 1, j - 2).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i, j - 2).getConditiopn() == 0) &&
                                            (f1.getCell(i, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i, j).getConditiopn() == 0) &&
                                            (f1.getCell(i, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j - 2).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j - 3).getConditiopn() == 0) &&
                                            (f1.getCell(i, j - 3).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j - 3).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j - 4).getConditiopn() == 0) &&
                                            (f1.getCell(i, j - 4).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j - 4).getConditiopn() == 0)) {
                                im.setTranslateX(f1.getCell(i, j).getIm2().getLayoutX() - im.getLayoutX() - range);
                                im.setTranslateY(f1.getCell(i, j).getIm2().getLayoutY() - im.getLayoutY() - range);
                                f1.getCell(i, j).setIm(im);
                                f1.getCell(i, j).setConditiopn(1);
                                f1.getCell(i, j - 1).setConditiopn(1);
                                f1.getCell(i, j - 2).setConditiopn(1);
                                f1.getCell(i, j - 3).setConditiopn(1);
                                break;
                            } else {
                                f1.clearCell(im);
                                im.setTranslateX(0);
                                im.setTranslateY(0);
                                im.setRotate(0);

                                break;
                            }
                        }
                    }

                } else if (im.getRotate() == 0) {
                    switch ((int) im.getFitHeight()) {
                        case 40: {
                            if (
                                    (f1.getCell(i, j).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j + 1).getConditiopn() == 0)) {
                                System.out.println("x=" + im.getTranslateX() + " y=" + im.getTranslateY());
                                im.setTranslateX(f1.getCell(i, j).getIm2().getLayoutX() - im.getLayoutX() - range);
                                im.setTranslateY(f1.getCell(i, j).getIm2().getLayoutY() - im.getLayoutY() - range);
                                f1.getCell(i, j).setIm(im);
                                f1.getCell(i, j).setConditiopn(1);
                                break;
                            } else {
                                f1.clearCell(im);
                                im.setTranslateX(0);
                                im.setTranslateY(0);
                                im.setRotate(0);

                                break;
                            }
                        }
                        case 84: {
                            if (
                                    (f1.getCell(i, j).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 2, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 2, j).getConditiopn() == 0) &&
                                            (f1.getCell(i + 2, j + 1).getConditiopn() == 0)

                                    ) {


                                System.out.println();
                                System.out.println("i=" + i);
                                System.out.println("j=" + j);

                                System.out.println("x=" + (f1.getCell(i, j).getIm2().getLayoutX() - im.getLayoutX() - range));
                                System.out.println("y=" + (f1.getCell(i, j).getIm2().getLayoutY() - im.getLayoutY() - range));

                                im.setTranslateX(f1.getCell(i, j).getIm2().getLayoutX() - im.getLayoutX() - range);
                                im.setTranslateY(f1.getCell(i, j).getIm2().getLayoutY() - im.getLayoutY() - range);
                                /*System.out.println();
                                System.out.println("translate x=" + im.getTranslateX());
                                System.out.println("translate y=" + im.getTranslateY());
                                System.out.println("x=" + im.getX());
                                System.out.println("y=" + im.getY());
                                System.out.println("layout x=" + im.getLayoutX());
                                System.out.println("layout y=" + im.getLayoutY());
                                System.out.println("scale x=" + im.getScaleX());
                                System.out.println("scale y=" + im.getScaleY());*/
                                f1.getCell(i, j).setIm(im);
                                f1.getCell(i, j).setConditiopn(1);
                                f1.getCell(i + 1, j).setConditiopn(1);

                                break;
                            } else {
                                f1.clearCell(im);
                                im.setTranslateX(0);
                                im.setTranslateY(0);
                                im.setRotate(0);

                                break;
                            }
                        }
                        case 128: {
                            if (
                                    (f1.getCell(i, j).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 2, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 2, j).getConditiopn() == 0) &&
                                            (f1.getCell(i + 2, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 3, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 3, j).getConditiopn() == 0) &&
                                            (f1.getCell(i + 3, j + 1).getConditiopn() == 0)
                                    ) {
                                im.setTranslateX(f1.getCell(i, j).getIm2().getLayoutX() - im.getLayoutX() - range);
                                im.setTranslateY(f1.getCell(i, j).getIm2().getLayoutY() - im.getLayoutY() - range);

                                f1.getCell(i, j).setIm(im);
                                f1.getCell(i, j).setConditiopn(1);
                                f1.getCell(i + 1, j).setConditiopn(1);
                                f1.getCell(i + 2, j).setConditiopn(1);
                                break;
                            } else {
                                f1.clearCell(im);
                                im.setTranslateX(0);
                                im.setTranslateY(0);
                                im.setRotate(0);

                                break;
                            }
                        }
                        case 172: {
                            if (
                                    (f1.getCell(i, j).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j).getConditiopn() == 0) &&
                                            (f1.getCell(i - 1, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j).getConditiopn() == 0) &&
                                            (f1.getCell(i + 1, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 2, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 2, j).getConditiopn() == 0) &&
                                            (f1.getCell(i + 2, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 3, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 3, j).getConditiopn() == 0) &&
                                            (f1.getCell(i + 3, j + 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 4, j - 1).getConditiopn() == 0) &&
                                            (f1.getCell(i + 4, j).getConditiopn() == 0) &&
                                            (f1.getCell(i + 4, j + 1).getConditiopn() == 0)

                                    ) {
                                im.setTranslateX(f1.getCell(i, j).getIm2().getLayoutX() - im.getLayoutX() - range);
                                im.setTranslateY(f1.getCell(i, j).getIm2().getLayoutY() - im.getLayoutY() - range);
                                f1.getCell(i, j).setIm(im);
                                f1.getCell(i, j).setConditiopn(1);
                                f1.getCell(i + 1, j).setConditiopn(1);
                                f1.getCell(i + 2, j).setConditiopn(1);
                                f1.getCell(i + 3, j).setConditiopn(1);
                                break;
                            } else {
                                f1.clearCell(im);
                                im.setTranslateX(0);
                                im.setTranslateY(0);
                                im.setRotate(0);

                                break;
                            }
                        }
                    }
                }
            } else {
                //
                checkAndInstallation(f1, i, j, im, range);


            }
            //if(im.getRotate())


            //System.out.println("X= " + (im.getLayoutX() + im.getTranslateX()) + " Y= " + (im.getLayoutY() + im.getTranslateY()));
            System.out.println("Cell x =" + f1.getCell(i, j).getCoordinateX() + " Cell y =" + f1.getCell(i, j).getCoordinateY());

            //}
        }


    }

    private void rotateMoveShip(ImageView im, double move, RotateTransition rot, TranslateTransition trans) {
        if ((im.getRotate() == 90)) {
            trans.setByX(move);
            trans.setByY(move);
            rot.setToAngle(0);
            rot.play();
            trans.play();
        }
        if ((im.getRotate() == 0)) {
            trans.setByX(-move);
            trans.setByY(-move);
            rot.setToAngle(90);
            rot.play();
            trans.play();
        }
    }

    public void initialize() {
        f1.getCell(0, 0).setIm2(c1);
        f1.getCell(0, 1).setIm2(c2);
        f1.getCell(0, 2).setIm2(c3);
        f1.getCell(0, 3).setIm2(c4);
        f1.getCell(0, 4).setIm2(c5);
        f1.getCell(0, 5).setIm2(c6);
        f1.getCell(0, 6).setIm2(c7);
        f1.getCell(0, 7).setIm2(c8);
        f1.getCell(0, 8).setIm2(c9);
        f1.getCell(0, 9).setIm2(c10);
        f1.getCell(1, 0).setIm2(c11);
        f1.getCell(1, 1).setIm2(c12);
        f1.getCell(1, 2).setIm2(c13);
        f1.getCell(1, 3).setIm2(c14);
        f1.getCell(1, 4).setIm2(c15);
        f1.getCell(1, 5).setIm2(c16);
        f1.getCell(1, 6).setIm2(c17);
        f1.getCell(1, 7).setIm2(c18);
        f1.getCell(1, 8).setIm2(c19);
        f1.getCell(1, 9).setIm2(c20);
        f1.getCell(2, 0).setIm2(c21);
        f1.getCell(2, 1).setIm2(c22);
        f1.getCell(2, 2).setIm2(c23);
        f1.getCell(2, 3).setIm2(c24);
        f1.getCell(2, 4).setIm2(c25);
        f1.getCell(2, 5).setIm2(c26);
        f1.getCell(2, 6).setIm2(c27);
        f1.getCell(2, 7).setIm2(c28);
        f1.getCell(2, 8).setIm2(c29);
        f1.getCell(2, 9).setIm2(c30);
        f1.getCell(3, 0).setIm2(c31);
        f1.getCell(3, 1).setIm2(c32);
        f1.getCell(3, 2).setIm2(c33);
        f1.getCell(3, 3).setIm2(c34);
        f1.getCell(3, 4).setIm2(c35);
        f1.getCell(3, 5).setIm2(c36);
        f1.getCell(3, 6).setIm2(c37);
        f1.getCell(3, 7).setIm2(c38);
        f1.getCell(3, 8).setIm2(c39);
        f1.getCell(3, 9).setIm2(c40);
        f1.getCell(4, 0).setIm2(c41);
        f1.getCell(4, 1).setIm2(c42);
        f1.getCell(4, 2).setIm2(c43);
        f1.getCell(4, 3).setIm2(c44);
        f1.getCell(4, 4).setIm2(c45);
        f1.getCell(4, 5).setIm2(c46);
        f1.getCell(4, 6).setIm2(c47);
        f1.getCell(4, 7).setIm2(c48);
        f1.getCell(4, 8).setIm2(c49);
        f1.getCell(4, 9).setIm2(c50);
        f1.getCell(5, 0).setIm2(c51);
        f1.getCell(5, 1).setIm2(c52);
        f1.getCell(5, 2).setIm2(c53);
        f1.getCell(5, 3).setIm2(c54);
        f1.getCell(5, 4).setIm2(c55);
        f1.getCell(5, 5).setIm2(c56);
        f1.getCell(5, 6).setIm2(c57);
        f1.getCell(5, 7).setIm2(c58);
        f1.getCell(5, 8).setIm2(c59);
        f1.getCell(5, 9).setIm2(c60);
        f1.getCell(6, 0).setIm2(c61);
        f1.getCell(6, 1).setIm2(c62);
        f1.getCell(6, 2).setIm2(c63);
        f1.getCell(6, 3).setIm2(c64);
        f1.getCell(6, 4).setIm2(c65);
        f1.getCell(6, 5).setIm2(c66);
        f1.getCell(6, 6).setIm2(c67);
        f1.getCell(6, 7).setIm2(c68);
        f1.getCell(6, 8).setIm2(c69);
        f1.getCell(6, 9).setIm2(c70);
        f1.getCell(7, 0).setIm2(c71);
        f1.getCell(7, 1).setIm2(c72);
        f1.getCell(7, 2).setIm2(c73);
        f1.getCell(7, 3).setIm2(c74);
        f1.getCell(7, 4).setIm2(c75);
        f1.getCell(7, 5).setIm2(c76);
        f1.getCell(7, 6).setIm2(c77);
        f1.getCell(7, 7).setIm2(c78);
        f1.getCell(7, 8).setIm2(c79);
        f1.getCell(7, 9).setIm2(c80);
        f1.getCell(8, 0).setIm2(c81);
        f1.getCell(8, 1).setIm2(c82);
        f1.getCell(8, 2).setIm2(c83);
        f1.getCell(8, 3).setIm2(c84);
        f1.getCell(8, 4).setIm2(c85);
        f1.getCell(8, 5).setIm2(c86);
        f1.getCell(8, 6).setIm2(c87);
        f1.getCell(8, 7).setIm2(c88);
        f1.getCell(8, 8).setIm2(c89);
        f1.getCell(8, 9).setIm2(c90);
        f1.getCell(9, 0).setIm2(c91);
        f1.getCell(9, 1).setIm2(c92);
        f1.getCell(9, 2).setIm2(c93);
        f1.getCell(9, 3).setIm2(c94);
        f1.getCell(9, 4).setIm2(c95);
        f1.getCell(9, 5).setIm2(c96);
        f1.getCell(9, 6).setIm2(c97);
        f1.getCell(9, 7).setIm2(c98);
        f1.getCell(9, 8).setIm2(c99);
        f1.getCell(9, 9).setIm2(c100);
        f2.getCell(0, 0).setIm2(c1);
        f2.getCell(0, 1).setIm2(c2);
        f2.getCell(0, 2).setIm2(c3);
        f2.getCell(0, 3).setIm2(c4);
        f2.getCell(0, 4).setIm2(c5);
        f2.getCell(0, 5).setIm2(c6);
        f2.getCell(0, 6).setIm2(c7);
        f2.getCell(0, 7).setIm2(c8);
        f2.getCell(0, 8).setIm2(c9);
        f2.getCell(0, 9).setIm2(c10);
        f2.getCell(1, 0).setIm2(c11);
        f2.getCell(1, 1).setIm2(c12);
        f2.getCell(1, 2).setIm2(c13);
        f2.getCell(1, 3).setIm2(c14);
        f2.getCell(1, 4).setIm2(c15);
        f2.getCell(1, 5).setIm2(c16);
        f2.getCell(1, 6).setIm2(c17);
        f2.getCell(1, 7).setIm2(c18);
        f2.getCell(1, 8).setIm2(c19);
        f2.getCell(1, 9).setIm2(c20);
        f2.getCell(2, 0).setIm2(c21);
        f2.getCell(2, 1).setIm2(c22);
        f2.getCell(2, 2).setIm2(c23);
        f2.getCell(2, 3).setIm2(c24);
        f2.getCell(2, 4).setIm2(c25);
        f2.getCell(2, 5).setIm2(c26);
        f2.getCell(2, 6).setIm2(c27);
        f2.getCell(2, 7).setIm2(c28);
        f2.getCell(2, 8).setIm2(c29);
        f2.getCell(2, 9).setIm2(c30);
        f2.getCell(3, 0).setIm2(c31);
        f2.getCell(3, 1).setIm2(c32);
        f2.getCell(3, 2).setIm2(c33);
        f2.getCell(3, 3).setIm2(c34);
        f2.getCell(3, 4).setIm2(c35);
        f2.getCell(3, 5).setIm2(c36);
        f2.getCell(3, 6).setIm2(c37);
        f2.getCell(3, 7).setIm2(c38);
        f2.getCell(3, 8).setIm2(c39);
        f2.getCell(3, 9).setIm2(c40);
        f2.getCell(4, 0).setIm2(c41);
        f2.getCell(4, 1).setIm2(c42);
        f2.getCell(4, 2).setIm2(c43);
        f2.getCell(4, 3).setIm2(c44);
        f2.getCell(4, 4).setIm2(c45);
        f2.getCell(4, 5).setIm2(c46);
        f2.getCell(4, 6).setIm2(c47);
        f2.getCell(4, 7).setIm2(c48);
        f2.getCell(4, 8).setIm2(c49);
        f2.getCell(4, 9).setIm2(c50);
        f2.getCell(5, 0).setIm2(c51);
        f2.getCell(5, 1).setIm2(c52);
        f2.getCell(5, 2).setIm2(c53);
        f2.getCell(5, 3).setIm2(c54);
        f2.getCell(5, 4).setIm2(c55);
        f2.getCell(5, 5).setIm2(c56);
        f2.getCell(5, 6).setIm2(c57);
        f2.getCell(5, 7).setIm2(c58);
        f2.getCell(5, 8).setIm2(c59);
        f2.getCell(5, 9).setIm2(c60);
        f2.getCell(6, 0).setIm2(c61);
        f2.getCell(6, 1).setIm2(c62);
        f2.getCell(6, 2).setIm2(c63);
        f2.getCell(6, 3).setIm2(c64);
        f2.getCell(6, 4).setIm2(c65);
        f2.getCell(6, 5).setIm2(c66);
        f2.getCell(6, 6).setIm2(c67);
        f2.getCell(6, 7).setIm2(c68);
        f2.getCell(6, 8).setIm2(c69);
        f2.getCell(6, 9).setIm2(c70);
        f2.getCell(7, 0).setIm2(c71);
        f2.getCell(7, 1).setIm2(c72);
        f2.getCell(7, 2).setIm2(c73);
        f2.getCell(7, 3).setIm2(c74);
        f2.getCell(7, 4).setIm2(c75);
        f2.getCell(7, 5).setIm2(c76);
        f2.getCell(7, 6).setIm2(c77);
        f2.getCell(7, 7).setIm2(c78);
        f2.getCell(7, 8).setIm2(c79);
        f2.getCell(7, 9).setIm2(c80);
        f2.getCell(8, 0).setIm2(c81);
        f2.getCell(8, 1).setIm2(c82);
        f2.getCell(8, 2).setIm2(c83);
        f2.getCell(8, 3).setIm2(c84);
        f2.getCell(8, 4).setIm2(c85);
        f2.getCell(8, 5).setIm2(c86);
        f2.getCell(8, 6).setIm2(c87);
        f2.getCell(8, 7).setIm2(c88);
        f2.getCell(8, 8).setIm2(c89);
        f2.getCell(8, 9).setIm2(c90);
        f2.getCell(9, 0).setIm2(c91);
        f2.getCell(9, 1).setIm2(c92);
        f2.getCell(9, 2).setIm2(c93);
        f2.getCell(9, 3).setIm2(c94);
        f2.getCell(9, 4).setIm2(c95);
        f2.getCell(9, 5).setIm2(c96);
        f2.getCell(9, 6).setIm2(c97);
        f2.getCell(9, 7).setIm2(c98);
        f2.getCell(9, 8).setIm2(c99);
        f2.getCell(9, 9).setIm2(c100);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                f1.getCell(i, j).setCoordinate(f1.getCell(i, j).getIm2().getLayoutX() + f1.getCell(i, j).getIm2().getTranslateX(), f1.getCell(i, j).getIm2().getLayoutY() + f1.getCell(i, j).getIm2().getTranslateY());
                f2.getCell(i, j).setCoordinate(f2.getCell(i, j).getIm2().getLayoutX() + f2.getCell(i, j).getIm2().getTranslateX(), f2.getCell(i, j).getIm2().getLayoutY() + f2.getCell(i, j).getIm2().getTranslateY());
            }
        }
    }

}

