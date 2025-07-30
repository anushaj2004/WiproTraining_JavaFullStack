package assessment;
class Author {
 private String name;
 private String email;
 private char gender;
 public Author(String name, String email, char gender) {
     this.name = name;
     this.email = email;
     this.gender = gender;
 }
 public String getName() {
     return name;
 }

 public String getEmail() {
     return email;
 }

 public char getGender() {
     return gender;
 }

 public void setName(String name) {
     this.name = name;
 }

 public void setEmail(String email) {
     this.email = email;
 }

 public void setGender(char gender) {
     this.gender = gender;
 }


 public String toString() {
     return "Author [Name = " + name + ", Email = " + email + ", Gender = " + gender + "]";
 }
}

class Book {
 private String name;
 private Author author;
 private double price;
 private int qtyInStock;

 public Book(String name, Author author, double price, int qtyInStock) {
     this.name = name;
     this.author = author;
     this.price = price;
     this.qtyInStock = qtyInStock;
 }

 public String getName() {
     return name;
 }

 public Author getAuthor() {
     return author;
 }

 public double getPrice() {
     return price;
 }

 public int getQtyInStock() {
     return qtyInStock;
 }

 public void setName(String name) {
     this.name = name;
 }

 public void setAuthor(Author author) {
     this.author = author;
 }

 public void setPrice(double price) {
     this.price = price;
 }

 public void setQtyInStock(int qtyInStock) {
     this.qtyInStock = qtyInStock;
 }

 public String toString() {
     return "Book [Name = " + name + ", Price = " + price + ", Quantity = " + qtyInStock + ", Author = " + author + "]";
 }
}


public class Encapsulation {
 public static void main(String[] args) {
     Author author = new Author("Anu J", "anuj@email.com", 'F');
     Book book = new Book("Java Programming", author, 600.00, 25);
     System.out.println(book);
 }
}

