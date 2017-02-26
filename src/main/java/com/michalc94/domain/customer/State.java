package com.michalc94.domain.customer;

/**
 * Created by michalc94 on 26.02.17.
 */

class State {

  private String state;

  // jpa requirement
  public State() {
  }

  public State(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    State state = (State) o;
    return this.state != null ? this.state.equals(state.state) : state.state == null;
  }

  @Override
  public int hashCode() {
    return state != null ? state.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "State{" +
        "state='" + state + '\'' +
        '}';
  }
}
