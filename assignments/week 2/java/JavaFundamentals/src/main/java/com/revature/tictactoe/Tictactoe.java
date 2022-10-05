package com.revature.tictactoe;

import java.util.Scanner;

public class Tictactoe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        char[][] exampleBoard = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = ' ';
            }
        }
        exampleBoard[0][0] = '1';
        exampleBoard[0][1] = '2';
        exampleBoard[0][2] = '3';
        exampleBoard[1][0] = '4';
        exampleBoard[1][1] = '5';
        exampleBoard[1][2] = '6';
        exampleBoard[2][0] = '7';
        exampleBoard[2][1] = '8';
        exampleBoard[2][2] = '9';
        Scanner input = new Scanner(System.in);
        boolean playing = true;
        printBoard(exampleBoard);
        while (playing) {
            // if?
            // take input
            // decide who goes first, maybe a coin flip
            // print board after every move, maybe in game rules

            //printBoard(board);
        }


    }

    public static void printBoard(char[][] board) {
        System.out.println(" " + board[0][0] + " " + "|" + " " + board[0][1] + " " + "|" + " " + board[0][2] + " ");
        System.out.println("-----------");
        System.out.println(" " + board[1][0] + " " + "|" + " " + board[1][1] + " " + "|" + " " + board[1][2] + " ");
        System.out.println("-----------");
        System.out.println(" " + board[2][0] + " " + "|" + " " + board[2][1] + " " + "|" + " " + board[2][2] + " ");
    }
}
