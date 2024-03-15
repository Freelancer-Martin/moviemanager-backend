package localhost.moviemanager.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Users implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(nullable = false, updatable = false)
  private Long id;

  private String customerName;
  private String customerEmail;
  private String bookingDate;
  private String seatNumber;

  // Additional fields as needed (e.g., contact number, address)

  public Users() {
  }

  public Users(String customerName, String customerEmail, String bookingDate, String seatNumber) {
    this.customerName = customerName;
    this.customerEmail = customerEmail;
    this.bookingDate = bookingDate;
    this.seatNumber = seatNumber;
  }

  // Getters and Setters

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public String getSeatNumber() {
    return seatNumber;
  }

  public void setSeatNumber(String seatNumber) {
    this.seatNumber = seatNumber;
  }

  // Getters and Setters for additional fields

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", customerName='" + customerName + '\'' +
      ", customerEmail='" + customerEmail + '\'' +
      ", bookingDate=" + bookingDate +
      ", seatNumber='" + seatNumber + '\'' +
      '}';
  }
}
