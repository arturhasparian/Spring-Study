package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//            Section section1 = new Section("Dance");
//            Child child1 = new Child("Olya", 12);
//            Child child2 = new Child("Grisha", 8);
//            Child child3 = new Child("Pavlik", 9);
//            section1.addChildrenToSection(child1);
//            section1.addChildrenToSection(child2);
//            section1.addChildrenToSection(child3);
//            session.beginTransaction();
//            session.persist(section1);
//            session.getTransaction().commit();
//            System.out.println("DONE");
//**************************************************************
//            session = factory.getCurrentSession();
//            Section section = new Section("Volleyball");
//            Section section1 = new Section("Chess");
//            Section section2 = new Section("Math");
//            Child child = new Child("Igor", 10);
//            child.addSectionToChild(section);
//            child.addSectionToChild(section1);
//            child.addSectionToChild(section2);
//
//            session.beginTransaction();
//            session.save(child);
//            session.getTransaction().commit();
//            System.out.println("DONE");
//            //**************************************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section = session.get(Section.class,1);
//            System.out.println(section);
//            System.out.println(section.getChildrens());
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");
//            //***********************************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Child child = session.get(Child.class,4);
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();
//            System.out.println("DONE!!!");
////******************************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section = session.get(Section.class,1);
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("DONE!!!");
//            //*************************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 7);
//
//            session.delete(section);
//            session.getTransaction().commit();
//            System.out.println("DONE!!!");
            session = factory.getCurrentSession();
            session.beginTransaction();
            Child child = session.get(Child.class,5);
            session.delete(child);
            session.getTransaction().commit();
            System.out.println("DONE!!!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
