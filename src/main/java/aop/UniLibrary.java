package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We are getting book from UniLibrary ");
        System.out.println("-------------------------------------");
    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("We are backing a book to UniLibrary");
        return "JAVA BOOK";
    }

    public void getMagazine() {
        System.out.println("We are getting magazine from Unilibrary");
        System.out.println("-------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("We are backing a magazine to Unilibrary");
        System.out.println("-------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("We ara adding a book to Unilibrary");
        System.out.println("-------------------------------------");
    }

    public void addMagazine() {
        System.out.println("We are adding a magazine to Unilibrary");
        System.out.println("-------------------------------------");
    }
}
