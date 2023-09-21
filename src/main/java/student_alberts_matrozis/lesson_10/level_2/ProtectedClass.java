package student_alberts_matrozis.lesson_10.level_2;

class ProtectedClass {

    private String title;
    private String author;

    // protected модификатор доступа означает,
    // что он виден только внутри заключающего
    // класса и любых подклассов, а также в
    // любом месте пакета заключающего класса.
    // Ни одно тело не знает, какие классы будут
    // подклассами защищенного класса. Так что
    // это тоже не имеет смысла
}