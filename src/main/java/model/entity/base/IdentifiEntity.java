package model.entity.base;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Wojtek on 2014-09-21.
 */
public abstract class IdentifiEntity implements Identifier {



    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "seq" )
    private Long id;

    @Override
    public Long getId() { return this.id;}

    @Override
    public void setId(Long id) {this.id=id;}

}
