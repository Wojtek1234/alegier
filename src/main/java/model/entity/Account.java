package model.entity;

/**
 * Created by Wojtek on 2014-09-21.
 */

import model.entity.base.BaseEntity;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table( name = "account" )
@SequenceGenerator( name = "seq", sequenceName = "seq_account" )
@AttributeOverrides( { @AttributeOverride( name = "id", column = @Column( name = "account_id" ) )})

public class Account extends BaseEntity{


    private static final long serialVersionUID = 1L;

    @Column( name = "account_name" )
    private String name;

    @OneToMany( mappedBy = "account", cascade = CascadeType.MERGE)
    private Set<Item> itemSet = new HashSet<>();

    public Account()
    {
        super();
    }

    public Account( String name )
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
        if( !(object instanceof Account) )
            return false;
        final Account account = (Account)object;
        return account.getName().equals( this.name ) && account.getId().equals( this.getId() )
                && account.getCreated().equals( this.getCreated() )
                && account.getModified().equals( this.getModified() );
    }

    @Override
    public final int hashCode()
    {
        int result;
        result = 18;
        result = 32 * result + this.getId().intValue();
        return result;
    }

    @Override
    public final String toString()
    {
        return String.format( "%1$s %2$s %2$s %3$s", this.getId(), this.getName(), this.getCreated(),
                this.getModified() );
    }
}
