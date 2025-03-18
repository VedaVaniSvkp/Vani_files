package codechallenges;

abstract class Book {
    String title;
    abstract void setTitle(String title);
    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    void setTitle(String title) {
        this.title = title;
    }
}

public class BookAbstract {
    public static void main(String[] args) {
        // Book new_novel=new Book(); This line results in error as Book is abstract
        MyBook new_novel = new MyBook();
        new_novel.setTitle("A tale of two cities");
        System.out.println("The title is: " + new_novel.getTitle());
    }
}