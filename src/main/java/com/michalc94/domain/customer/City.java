package com.michalc94.domain.customer;

/**
 * Created by michalc94 on 26.02.17.
 */
class City {
  private String city;

  // jpa requirement
  public City() {
  }

  public City(String city) {
    this.city = city;
  }

  public String getCity() {
    return city;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    City city1 = (City) o;

    return city != null ? city.equals(city1.city) : city1.city == null;
  }

  @Override
  public int hashCode() {
    return city != null ? city.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "City{" +
        "city='" + city + '\'' +
        '}';
  }
}
