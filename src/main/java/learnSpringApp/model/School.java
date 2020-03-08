package learnSpringApp.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class School {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String address;

    @Column
    String name;

    public School() {
    }

    public School(int id, String address, String name) {
        this.id = id;
        this.address = address;
        this.name = name;
    }

    private School(Builder builder) {
        this.id = builder.id;
        this.address = builder.address;
        this.name = builder.name;
    }

    public static Builder newSchool() {
        return new Builder();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static final class Builder {
        private int id;
        private String address;
        private String name;

        private Builder() {
        }

        public School build() {
            return new School(this);
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return id == school.id &&
                address.equals(school.address) &&
                name.equals(school.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, name);
    }

    @Override
    public String toString() {
        return "[id=" + id + " address=" + address + " name=" + name + "]";
    }
}
