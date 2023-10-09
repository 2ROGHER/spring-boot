package org.pe.api.rest.models.teacher;

import jakarta.persistence.*;

@Entity(name="teacher")
@Table(name="ob_teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    private String gender;
    @Column(name = "birth_date")
    private String birtDate;
    private int age;
    private String speciality;

    public Teacher() {

    }

    public Teacher(Long id, String name, String lastName, String email, String gender, String birtDate, int age, String speciality) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.birtDate = birtDate;
        this.age = age;
        this.speciality = speciality;
    }

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(String birtDate) {
        this.birtDate = birtDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", birtDate='" + birtDate + '\'' +
                ", age=" + age +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
