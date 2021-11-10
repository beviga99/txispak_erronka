package model.postgre;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the res_partner_category database table.
 * 
 */
@Entity
@Table(name="res_partner_category")
@NamedQuery(name="ResPartnerCategory.findAll", query="SELECT r FROM ResPartnerCategory r")
public class ResPartnerCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Boolean active;

	private Integer color;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_uid")
	private Integer createUid;

	private String name;

	@Column(name="parent_path")
	private String parentPath;

	@Column(name="write_date")
	private Timestamp writeDate;

	@Column(name="write_uid")
	private Integer writeUid;

	//bi-directional many-to-one association to ResPartnerCategory
	@ManyToOne
	@JoinColumn(name="parent_id")
	private ResPartnerCategory resPartnerCategory;

	//bi-directional many-to-one association to ResPartnerCategory
	@OneToMany(mappedBy="resPartnerCategory")
	private List<ResPartnerCategory> resPartnerCategories;

	//bi-directional many-to-many association to ResPartner
	@ManyToMany
	@JoinTable(
		name="res_partner_res_partner_category_rel"
		, joinColumns={
			@JoinColumn(name="category_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="partner_id")
			}
		)
	private List<ResPartner> resPartners;

	public ResPartnerCategory() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getColor() {
		return this.color;
	}

	public void setColor(Integer color) {
		this.color = color;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Integer getCreateUid() {
		return this.createUid;
	}

	public void setCreateUid(Integer createUid) {
		this.createUid = createUid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentPath() {
		return this.parentPath;
	}

	public void setParentPath(String parentPath) {
		this.parentPath = parentPath;
	}

	public Timestamp getWriteDate() {
		return this.writeDate;
	}

	public void setWriteDate(Timestamp writeDate) {
		this.writeDate = writeDate;
	}

	public Integer getWriteUid() {
		return this.writeUid;
	}

	public void setWriteUid(Integer writeUid) {
		this.writeUid = writeUid;
	}

	public ResPartnerCategory getResPartnerCategory() {
		return this.resPartnerCategory;
	}

	public void setResPartnerCategory(ResPartnerCategory resPartnerCategory) {
		this.resPartnerCategory = resPartnerCategory;
	}

	public List<ResPartnerCategory> getResPartnerCategories() {
		return this.resPartnerCategories;
	}

	public void setResPartnerCategories(List<ResPartnerCategory> resPartnerCategories) {
		this.resPartnerCategories = resPartnerCategories;
	}

	public ResPartnerCategory addResPartnerCategory(ResPartnerCategory resPartnerCategory) {
		getResPartnerCategories().add(resPartnerCategory);
		resPartnerCategory.setResPartnerCategory(this);

		return resPartnerCategory;
	}

	public ResPartnerCategory removeResPartnerCategory(ResPartnerCategory resPartnerCategory) {
		getResPartnerCategories().remove(resPartnerCategory);
		resPartnerCategory.setResPartnerCategory(null);

		return resPartnerCategory;
	}

	public List<ResPartner> getResPartners() {
		return this.resPartners;
	}

	public void setResPartners(List<ResPartner> resPartners) {
		this.resPartners = resPartners;
	}

}