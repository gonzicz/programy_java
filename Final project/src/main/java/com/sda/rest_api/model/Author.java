package com.sda.rest_api.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Klasa, którą adnotujemy za pomocą @Entity, musi mieć publiczne gettery i settery dla każdego pola.
 * Adnotacja, która mówi o tym, że ta klasa jest zarządzana przez JPA i odpowiada tabeli w bazie danych,
 * adnotacja oznacza, że jest encja czyli klasa którą będziemy mapować
 * adnotacja @Data to najbardziej popularna adnotacja, łączy w sobie kilka innych: @Getter, @Setter,
 *
 * @EqualsAndHashCode, @RequiredArgsConstructor oraz @ToString
 */

@Data
@Entity
public class Author {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String surname;

    /**
     * relacja jeden do wielu, jeden autor może napisac wiele ksiązęk
     */
    @OneToMany(mappedBy = "author")
    private List<Book> books = new ArrayList<>();
}
