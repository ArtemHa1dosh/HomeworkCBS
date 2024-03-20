package exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ключ доступу (pro або exp): ");
        String key = scanner.nextLine();

        DocumentWorker documentWorker;

        if (key.equals("pro")) {
            documentWorker = new ProDocumentWorker();
        } else if (key.equals("exp")) {
            documentWorker = new ExpertDocumentWorker();
        } else {
            documentWorker = new DocumentWorker();
        }

        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();
    }
}

