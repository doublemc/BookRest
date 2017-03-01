//package com.michalc94.domain.customer;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.Mockito.mock;
//
//import com.michalc94.domain.Address;
//import com.michalc94.domain.Customer;
//import org.junit.Test;
//
///**
// * Created by michalc94 on 26.02.17.
// */
//public class AddressTest {
//
//  private static final String ANY_STATE = "pomorskie";
//  private static final String ANY_ZIP_CODE = "80-870";
//  private static final String ANY_CITY = "Gdansk";
//  private static final String ANY_STREET = "Grunwaldzka 45";
//
//  @Test
//  public void shouldCreateAddress_whenUsingConstructor() {
//    // given
//    State anyState = new State(ANY_STATE);
//    ZipCode anyZipCode = new ZipCode(ANY_ZIP_CODE);
//    City anyCity = new City(ANY_CITY);
//    Street anyStreet = new Street(ANY_STREET);
//    Customer dummyCustomer = mock(Customer.class);
//
//    // when
//    Address address = new Address(new State(ANY_STATE), new ZipCode(ANY_ZIP_CODE),
//        new City(ANY_CITY), new Street(ANY_STREET), dummyCustomer);
//
//    // then
//    assertThat(address.getState()).isEqualTo(anyState);
//    assertThat(address.getZipCode()).isEqualTo(anyZipCode);
//    assertThat(address.getCity()).isEqualTo(anyCity);
//    assertThat(address.getStreet()).isEqualTo(anyStreet);
//    assertThat(address.getCustomers()).hasSize(1);
//  }
//
//}