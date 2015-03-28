package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by Dell on 28/03/2015.
 */

@Entity
public class Commissionnnement extends Model {
    @Id
    public Long id;
    public Long objectif;
    public Long realisation;
    public Long commission;
    @ManyToMany
    public List<Produit> produit;
    @ManyToMany
    public List<Vendeur> vendeur;
}
