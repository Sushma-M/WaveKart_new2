/*Copyright (c) 2015-2016 wavemaker-com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker-com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker-com*/

package com.eshop.eshopping;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;




/**
 * Product generated by hbm2java
 */
@Entity
@Table(name="`PRODUCT`"
    ,schema="PUBLIC"
)
public class Product  implements java.io.Serializable
 {


private Integer id;
private String imgUrl;
private String category;
private double price;
private String description;
private String name;
private boolean availability;
private Set<Itemorder> itemorders = new HashSet<Itemorder>(0);
private Set<Orderdetail> orderdetails = new HashSet<Orderdetail>(0);

    public Product() {
    }



     @Id @GeneratedValue(strategy=IDENTITY)

    

    @Column(name="`ID`", nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    

    @Column(name="`IMG_URL`")
    public String getImgUrl() {
        return this.imgUrl;
    }
    
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    

    @Column(name="`CATEGORY`", nullable=false)
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    

    @Column(name="`PRICE`", nullable=false, precision=64)
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    

    @Column(name="`DESCRIPTION`", nullable=false)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    

    @Column(name="`NAME`", nullable=false)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    

    @Column(name="`AVAILABILITY`", nullable=false)
    public boolean isAvailability() {
        return this.availability;
    }
    
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

@OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="product")
    public Set<Itemorder> getItemorders() {
        return this.itemorders;
    }
    
    public void setItemorders(Set<Itemorder> itemorders) {
        this.itemorders = itemorders;
    }

@OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="product")
    public Set<Orderdetail> getOrderdetails() {
        return this.orderdetails;
    }
    
    public void setOrderdetails(Set<Orderdetail> orderdetails) {
        this.orderdetails = orderdetails;
    }



public boolean equals(Object o) {
         if (this == o)
         return true;
		 if ( (o == null ) )
		 return false;
		 if ( !(o instanceof Product) )
		 return false;

		 Product that = ( Product ) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );

   }

   public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
     }


}

