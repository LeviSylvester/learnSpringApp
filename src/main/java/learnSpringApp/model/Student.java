package learnSpringApp.model;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Objects;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Size(message = "CNP must be 13 digits")
    @Digits(integer = 13, fraction = 0, message = "CNP must be 13 digits")
    private String cnp;

    @Column
    @NotBlank(message = "First name is mandatory")
    private String firstName;

    @Column
    @NotBlank(message = "Last name is mandatory")
    private String lastName;

    @Column
    @Email(message = "Email must be a valid email")
    @NotBlank(message = "Email must not be empty")
    private String email;

    @Column
    @Pattern(regexp = "[mMfF]", message = "Gender must be m or f case insensitive")
    private String gender;

    @Column
    @Min(value = 1, message = "Age has to be at least 1")
    @Max(value = 130, message = "Age has to be at most 130")
    @NotNull(message = "Age has to be between 1 and 130")
    private Integer age;

    public Student() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static Builder newInstance() {
        return new Builder();
    }

    public static class Builder {
        private String cnp;
        private String firstName;
        private String lastName;
        private String email;
        private String gender;
        private Integer age;

        public Builder cnp(String cnp) {
            this.cnp = cnp;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Student build() {
            Student student = new Student();
            student.setCnp(cnp);
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setEmail(email);
            student.setGender(gender);
            student.setAge(age);

            return student;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
