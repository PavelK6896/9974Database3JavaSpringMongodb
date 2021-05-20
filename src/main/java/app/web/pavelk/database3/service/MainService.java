package app.web.pavelk.database3.service;


import app.web.pavelk.database3.model.Book;
import app.web.pavelk.database3.repo.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class MainService implements CommandLineRunner {

    private Scanner scanner = new Scanner(System.in);
    private final BookRepo bookRepo;

    @Override
    public void run(String... args) throws Exception {
        while (true) {
            TimeUnit.MILLISECONDS.sleep(500);
            String next = scanner.next();

            if (next.equals("1")) {
                System.out.println(bookRepo.findAll());
            } else if (next.equals("2")) {
                System.out.println(bookRepo.save(Book.builder().id(1).name("22222222222").build()));
            } else if (next.equals("3")) {

            } else if (next.equals("4")) {


            } else if (next.equals("0")) {
                break;
            }
        }
    }
}
