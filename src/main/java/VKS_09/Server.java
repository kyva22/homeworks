package VKS_09;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Server {

    public void controller(){

        final Pattern pattern = Pattern.compile("[эъыё]");
        boolean isSuspiciousPerson = false;

        try (ServerSocket serverSocket = new ServerSocket(8081)) {
            while (true) {

                Socket accept = serverSocket.accept();

                BufferedReader getMessage = new BufferedReader(new InputStreamReader(accept.getInputStream()));
                PrintWriter sendMessage = new PrintWriter(new OutputStreamWriter(accept.getOutputStream()), true);

                sendMessage.println("Hello");
                String clientMessage = getMessage.readLine();
                Matcher matcher = pattern.matcher(clientMessage);

                System.out.println(clientMessage);

                if (matcher.find()) {
                    sendMessage.println("Що таке пляниця?");
                    String loaf = getMessage.readLine();
                    System.out.println(loaf);
                    isSuspiciousPerson = !loaf.equalsIgnoreCase("хліб");
                }

                if (isSuspiciousPerson) {
                    accept.close();
                } else {
                    sendMessage.println("Сьогодні - " + LocalDateTime.now() + ", гарного Вам дня!");
                    accept.close();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

