package model.sqlserver;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import model.postgre.ProductTemplate;

@Entity
@Table(name="Salmentak")
public class Salmentak {
	
	@Id
	private int id;
	
	/*@Column(name="Product_Id")
	private int p_id;*/
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Produktoak p_id;
	
	/*@Column(name="Client_Id")
	private int b_id;*/
	
	@ManyToOne
	@JoinColumn(name="client_id")
	private Bezeroak b_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produktoak getP_id() {
		return p_id;
	}

	public void setP_id(Produktoak p_id) {
		this.p_id = p_id;
	}

	public Bezeroak getB_id() {
		return b_id;
	}

	public void setB_id(Bezeroak b_id) {
		this.b_id = b_id;
	}





}
