package ru.innopolis.university.task3_11.Client1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    private final int port = 5787;
    private BufferedReader in;
    private PrintWriter out;
    private Socket socket;

    public Client() {
        Scanner scan = new Scanner(System.in);
        try {
            socket = new Socket("localhost", port);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            System.out.println("Введите ваш никнейм");
            out.println(scan.nextLine());

            Resender resend = new Resender();
            resend.start();

            String str = "";
            while (!str.equals("quit")) {
                str = scan.nextLine();
                out.println(str);
            }
            resend.setStop();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }


    private void close() {
        try {
            in.close();
            out.close();
            socket.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void main(String[] args) {
        new Client();
    }

    private class Resender extends Thread {

        private boolean stoped;

        public void setStop() {
            stoped = true;
        }


        @Override
        public void run() {
            try {
                while (!stoped) {
                    String str = in.readLine();
                    System.out.println(str);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
