package model.entity;

import model.entity.base.BaseEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Wojtek on 2014-09-21.
 */

@Entity
@Table( name = "item" )
@SequenceGenerator( name = "seq", sequenceName = "seq_item" )
@AttributeOverrides( { @AttributeOverride( name = "id", column = @Column( name = "category_id" ) )})

public class Category extends BaseEntity {



    @Column( name = "category_name" )
    private String name;

    @OneToMany( mappedBy = "category" )
    private Set<Item> itemSet = new HashSet<>();


    public Category()
    {
    }

    public Category( String name )
    {
        this.name = name;
    }

    public final Set<Item> getItemSet()
    {
        return this.itemSet;
    }

    public final void setItemSet( Set<Item> bookSet )
    {
        this.itemSet = bookSet;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public final boolean equals( Object object )
    {
        if( !(object instanceof Category) )
            return false;
        final Category category = (Category)object;
        return category.getName().equals( this.name ) && category.getId().equals( this.getId() )
                && category.getCreated().equals( this.getCreated() )
                && category.getModified().equals( this.getModified() );
    }

    @Override
    public final int hashCode()
    {
        int result;
        result = 20;
        result = 35 * result + this.getId().intValue();
        return result;
    }

    @Override
    public final String toString()
    {
        return String.format( "%1$s %2$s %2$s %3$s", this.getId(), this.getName(), this.getCreated(),
                this.getModified() );
    }
}
