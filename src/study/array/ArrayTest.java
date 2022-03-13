package study.array;

public class ArrayTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("title0", "author0");
        library[1] = new Book("title1", "author1");
        library[2] = new Book("title2", "author2");
        library[3] = new Book("title3", "author3");
        library[4] = new Book("title4", "author4");

        /* arraycopy()한 객첵의 주소값이 동일하다.
        - 그러므로 title을 한개만 바꾸면 둘다 값이 바뀐다.
        - 주소를 복사해주는 개념이기 때문
        - 얕은 복사라 칭한다.
        */
        System.arraycopy(library, 0, copyLibrary, 0, 5);
        for (Book book : library) {
            System.out.println(book);
            System.out.println(book.getTitle());
        }
        for (Book book : copyLibrary) {
            System.out.println(book);
            System.out.println(book.getTitle());
        }
    }
}

class Book {
    private String title;
    private String author;
    public Book(){

    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}