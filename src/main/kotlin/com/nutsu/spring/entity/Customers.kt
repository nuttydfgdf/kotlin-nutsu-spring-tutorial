package com.nutsu.spring.entity

import javax.persistence.*

@Entity
@Table(name = "customers")
class Customers {
    /* GenerationType.IDENTITY is for databases like Postgres
        that use sequence tables instead of auto-increment
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column("customer_number")
    var customerNumber: Long? = null

    @Column("customer_name")
    var customerName: String? = null
    @Column("contact_last_name")
    var contactLastName: String? = null
    @Column("contact_first_name")
    var contactFirstName: String? = null
    var phone: String? = null
    @Column("address_line1")
    var addressLine1: String? = null
    @Column("address_line2")
    var addressLine2: String? = null
    var city: String? = null
    var state: String? = null
    @Column("postal_code")
    var postalCode: String? = null
    var country	: String? = null
    @Column("sales_rep_employee_number")
    var salesRepEmployeeNumber: Long? = null
    @Column("credit_limit")
    var creditLimit: String? = null

}