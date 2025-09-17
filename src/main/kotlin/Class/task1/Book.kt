package Class.task1
/*
    Создать класс Book с:полями title, author, year
    первичным конструктором.методом toString().
    Добавить метод equals() и hashCode() для сравнения книг по названию и автору.
    Создать enum class Genre (FANTASY, DETECTIVE, SCIENCE, HISTORY).
    Сделать абстрактный класс LibraryItem (с полем id) и наследовать от него Book.
    Создать interface Borrowable с методом borrow(user: String) и реализовать его в Book.
    И создать аналог Book через Data class и сравнить логику методов tostring, equals, hashcode
 */
class Book(
    id: Int,
    val title: String,
    val author: String,
    val year: Int,
    val genre: Genre
) :LibraryItem(id), Borrowable{
    override fun borrow(user: String) {
        println("The book '$title' by $author was borrowed by $user.")
    }
    override fun toString(): String {
        return "Book(id=$id, title='$title', author='$author', year=$year, genre=$genre)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Book) return false
        return title == other.title && author == other.author
    }

    override fun hashCode(): Int {
        var result = title.hashCode()
        result = 31 * result + author.hashCode()
        return result
    }
}

fun main() {
    val book1 = Book(1, "1984", "Джордж Оруэлл", 1949, Genre.SCIENCE)
    val book2 = Book(2, "Лунный камень", "Улки Коллинз", 1866, Genre.DETECTIVE)
    val book3 = Book(3, "Дюна", "Фрэнк Герберт", 1965, Genre.FANTASY)

    println(book1)
    println(book2)
    println(book3)

    println("book1 == book2 ? ${book1 == book2}")
    println("book1 == book3 ? ${book1 == book3}")
}