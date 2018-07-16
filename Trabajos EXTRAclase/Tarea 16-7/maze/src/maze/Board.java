/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crazyiot
 */
public class Board {

    Scanner scan = new Scanner(System.in);
    String move;
    boolean inGame = false;
    int maze[][] = new int[8][8];
    Random r = new Random();
    ArrayList<String> direction = new ArrayList<String>();

    public Board() {

        int wall = 1;
        int player = 2;
        int end = 3;
        int N;
        int E;
        int S;
        int W;

    }

    public void init() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (i == 0 && j != 1) {
                    maze[i][j] = r.nextInt(2);

                } else if (i == 0 && j == 1) {
                    maze[i][j] = 2;
                    System.out.print("*" + " ");

                } else if (i == maze.length - 1 && j != 6) {
                    maze[i][j] = r.nextInt(2);

                } else if (i == maze.length - 1 && j == 6) {
                    maze[i][j] = 4;

                } else if (4 > i || i > 0) {

                    maze[i][j] = r.nextInt(2);

                }
            }
            System.out.println();
        }
        getmoves();
    }

    public void print() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(" " + maze[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print(direction);
        System.out.println();
    }

    public void getmoves() {
        for (int i = 0; i < 11; i++) {
            int move = r.nextInt(5);
            if (move == 1) {
                direction.add("n");
            } else if (move == 2) {
                direction.add("o");
            } else if (move == 3) {
                direction.add("s");
            } else if (move == 4) {
                direction.add("e");
            }
        }
    }

    public void inGame() {
        inGame = true;
        int current = maze[0][1];
        int future = maze[0][0];
        int past = maze[0][1];
        for (int i = 0; i < maze.length; i++) {
            for (int j = 1; j < 2; i++) {

                while (inGame = true) {
                    move = scan.next();

                    if (direction.contains(move)) {
                        direction.remove(move);
                        if (move.equals("n")) {
                            if (maze[i - 1][j] == 4) {
                                System.out.print("GANO" + " ");

                                inGame = false;
                                break;
                            }
                            if (maze[i - 1][j] == 1) {
                                System.out.print(":(" + " ");

                                inGame = false;
                                System.exit(0);
                            }
                            maze[i][j] = 0;
                            maze[i - 1][j] = 2;
                            current = maze[i--][j];

                            print();
                        }
                        if (move.equals("o")) {
                            if (maze[i][j - 1] == 4) {
                                System.out.print("GANO" + " ");

                                inGame = false;
                                break;
                            }
                            if (maze[i][j - 1] == 1) {
                                System.out.print(":(" + " ");

                                inGame = false;
                                System.exit(0);
                            }
                            maze[i][j] = 0;
                            maze[i][j - 1] = 2;
                            current = maze[i][j--];

                            print();
                        }
                        if (move.equals("s")) {
                            if (maze[i + 1][j] == 4) {
                                System.out.print("GANO" + " ");

                                inGame = false;
                                break;
                            }
                            if (maze[i + 1][j] == 1) {
                                System.out.print(":(" + " ");

                                inGame = false;
                                System.exit(0);
                            }
                            maze[i][j] = 0;
                            maze[i + 1][j] = 2;
                            current = maze[i++][j];

                            print();

                        }

                        if (move.equals("e")) {
                            if (maze[i][j + 1] == 4) {
                                System.out.print("GANO" + " ");

                                inGame = false;
                                break;
                            }
                            if (maze[i][j + 1] == 1) {
                                System.out.print(":(" + " ");

                                inGame = false;
                                System.exit(0);
                            }
                            maze[i][j] = 0;
                            maze[i][j + 1] = 2;
                            current = maze[i][j++];
                            print();
                        }
                    } else if (direction.isEmpty()) {
                        System.out.print("perdio" + " ");

                    } else {
                        System.out.print("not available" + " ");
                    }
                }
            }
        }
    }
}
