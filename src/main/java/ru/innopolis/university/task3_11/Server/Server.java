package ru.innopolis.university.task3_11.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Server {

    private final int port = 5787;
    private List<Connection> connections =
            Collections.synchronizedList(new ArrayList<Connection>());
    private ServerSocket server;


    public Server() {
        try {
            server = new ServerSocket(port);

            while (true) {
                Socket socket = server.accept();
                Connection con = new Connection(socket);
                connections.add(con);
                con.start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new Server();
    }

    private class Connection extends Thread {
        private BufferedReader in;
        private PrintWriter out;
        private Socket socket;

        private String name = "";

        public Connection(Socket socket) {
            this.socket = socket;

            try {
                in = new BufferedReader(new InputStreamReader(
                        socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

            } catch (IOException e) {
                e.getMessage();
                close();
            }
        }

        @Override
        public void run() {
            try {
                name = in.readLine();
                synchronized (connections) {
                    Iterator<Connection> iter = connections.iterator();
                    while (iter.hasNext()) {
                        ((Connection) iter.next()).out.println("Приветстуем " + name);
                    }
                }

                String str = "";
                while (true) {
                    str = in.readLine();
                    if (str.equals("quit")) {
                        break;
                    }
                    synchronized (connections) {
                        Iterator<Connection> iter = connections.iterator();
                        while (iter.hasNext()) {
                            ((Connection) iter.next()).out.println(name + ": " + str);
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                close();
            }
        }

        public void close() {
            try {
                in.close();
                out.close();
                socket.close();
                connections.remove(this);
                if (connections.size() == 0) {
                    System.exit(0);
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }
}
