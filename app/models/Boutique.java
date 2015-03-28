package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Created by Dell on 28/03/2015.
 */
@Entity
public class Boutique extends Model {
    @Id
    public Long id;
    public String zone;
    @ManyToOne
    public ResponsableRegionalBoutique rgb;
    @OneToMany(mappedBy="boutique")
    public Conseiller conseiller;
}