package localhost.moviemanager.model;

//import jakarta.persistence.Id;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Movies implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(nullable = false, updatable = false)
  private Long id;
  private String name;
  private String genre;
  private String director;
  private int releaseYear;
  private String imageUrl;
  @Column(nullable = false, updatable = false)
  private String movieCode;

  // Additional fields for booking
  private String customerName;
  private String customerEmail;
  private String bookingDate;

  public Movies() {
  }

  public Movies(String name, String genre, String director, int releaseYear, String imageUrl, String movieCode, String customerName, String customerEmail, String bookingDate) {
    this.name = name;
    this.genre = genre;
    this.director = director;
    this.releaseYear = releaseYear;
    this.imageUrl = imageUrl;
    this.movieCode = movieCode;
    this.customerName = customerName;
    this.customerEmail = customerEmail;
    this.bookingDate = bookingDate;
  }

  // Getters and Setters...

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public String getMovieCode() {
    return movieCode;
  }

  public void setMovieCode(String movieCode) {
    this.movieCode = movieCode;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public String getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(String bookingDate) {
    this.bookingDate = bookingDate;
  }


  // Additional Getters and Setters for booking fields...

  @Override
  public String toString() {
    return "Movies{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", genre='" + genre + '\'' +
      ", director='" + director + '\'' +
      ", releaseYear=" + releaseYear +
      ", imageUrl='" + imageUrl + '\'' +
      ", movieCode='" + movieCode + '\'' +
      ", customerName='" + customerName + '\'' +
      ", customerEmail='" + customerEmail + '\'' +
      ", bookingDate='" + bookingDate + '\'' +
      '}';
  }
}

