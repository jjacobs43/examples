package streams.domain;

import lombok.*;

@Data
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private String email;
    private double salary;
    private String department;

}
