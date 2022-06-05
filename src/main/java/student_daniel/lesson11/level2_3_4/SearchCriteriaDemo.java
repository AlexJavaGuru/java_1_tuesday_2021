package student_daniel.lesson11.level2_3_4;

public class SearchCriteriaDemo {
    public static void main(String[] args) {
        //Task 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27

        //Color Theme
        String resetColor = "\u001B[0m";
        String redColor = "\u001B[31m";
        String blueColor = "\u001B[36m";
        String greenColor = "\u001B[32m";

        Book newBook = new Book("Zveroboi", "Kuper", "");
        newBook.setId(1L);
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        System.out.println(blueColor + "Title AND Author" + resetColor + " : " + blueColor + searchCriteria1.match(newBook));

        System.out.println();

        Book newBook2 = new Book("", "Kuper", "1890");
        newBook2.setId(2L);
        SearchCriteria authorSearchCriteria2 = new AuthorSearchCriteria("Kuper");
        SearchCriteria yearSearchCriteria = new YearOfIssueSearchCriteria("1890");
        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria2, yearSearchCriteria);
        System.out.println(blueColor + "Author AND Year" + resetColor + " : " + blueColor + searchCriteria2.match(newBook2));

        System.out.println();

        Book newBook3 = new Book("Zveroboi", "Kuper", "1890");
        newBook3.setId(3L);
        SearchCriteria authorSearchCriteria3 = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria3 = new TitleSearchCriteria("");
        SearchCriteria yearSearchCriteria3 = new YearOfIssueSearchCriteria("");

        SearchCriteria searchAuthorTitle = new OrSearchCriteria(authorSearchCriteria3, titleSearchCriteria3);
        SearchCriteria searchAuthorYear = new OrSearchCriteria(authorSearchCriteria3, yearSearchCriteria3);
        SearchCriteria searchAuthorYearTitle = new OrSearchCriteria(titleSearchCriteria3, searchAuthorYear);
        System.out.println(blueColor + "Title OR Author" + resetColor + " : " + blueColor + searchAuthorTitle.match(newBook3));
        System.out.println(blueColor + "Author OR Year" + resetColor + " : " + blueColor + searchAuthorYear.match(newBook3));
        System.out.println(blueColor + "Title OR Author OR Year" + resetColor + " : " + blueColor + searchAuthorYearTitle.match(newBook3));
    }
}
