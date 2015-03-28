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
public class Produit extends Model {
    @Id
    public Long id;
    public String type;
    @ManyToMany(mappedBy="produit")
    public List<Vendeur> vendeur;
    @ManyToMany(mappedBy="produit")
    public List<Commissionnnement> commissionnnement;
    @ManyToMany
    public List<Client> client;
}
