package model.sqlserver;

import java.math.BigDecimal;

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
	
	@Column(name="product_qty")
	private BigDecimal qty;
	
	@Column(name="total_price")
	private BigDecimal total;

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal bigDecimal) {
		this.qty = bigDecimal;
	}

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
