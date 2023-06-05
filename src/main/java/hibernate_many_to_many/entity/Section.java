package hibernate_many_to_many.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "section")
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
@ToString(exclude = "childrens")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    @NonNull
    private String name;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(name = "child_section", joinColumns = @JoinColumn(name = "section_id")
            , inverseJoinColumns = @JoinColumn(name = "child_id"))
    private List<Child> childrens;

    public void addChildrenToSection(Child child) {
        if (childrens == null) {
            childrens = new ArrayList<>();
        }
        childrens.add(child);
    }
}
