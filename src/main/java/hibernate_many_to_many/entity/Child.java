package hibernate_many_to_many.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "children")
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
@ToString(exclude = "sections")
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @NonNull
    @Column(name = "name")
    private String name;
    @NonNull
    @Column(name = "age")
    private int age;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(name = "child_section", joinColumns = @JoinColumn(name = "child_id")
            , inverseJoinColumns = @JoinColumn(name = "section_id"))
    private List<Section> sections;

    public void addSectionToChild(Section section) {
        if (sections == null) {
            sections = new ArrayList<>();
        }
        sections.add(section);
    }
}
