package ch.didierviret.hr_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/* @Data de la librairie Lombok fourni automatiquement les getters et setters */
@Data
/* @Entity Indique que cette classe correspond à une table de la BD */
@Entity
/* @Table Permet d'indiquer le nom de la table qui correspond à cette classe */
@Table(name = "employees")
public class Employee {

    /* @Id indique que c'est la clé primaire de la table */
    /* @GeneratedVaue indique que c'est un auto-incrément */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /* @Column indique le nom du champ de la table qui correspond à cet attribut de classe */
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    /* Si le nom du champ de la table est identique au nom de l'attribut, l'annotation @Column n'est pas nécessaire */
    private String mail;

    private String password;
}
