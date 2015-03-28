package models;

import play.db.ebean.Model;

import javax.persistence.Entity;

/**
 * Created by Dell on 28/03/2015.
 */

@Entity
public class Pdv extends Model implements Vendeur{
    public Integer ponderation;
}
