package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the product_template database table.
 * 
 */
@Entity
@Table(name="product_template")
@NamedQuery(name="ProductTemplate.findAll", query="SELECT p FROM ProductTemplate p")
public class ProductTemplate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Boolean active;

	@Column(name="available_threshold")
	private double availableThreshold;

	@Column(name="can_image_1024_be_zoomed")
	private Boolean canImage1024BeZoomed;

	@Column(name="categ_id")
	private Integer categId;

	private Integer color;

	@Column(name="company_id")
	private Integer companyId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_uid")
	private Integer createUid;

	@Column(name="custom_message")
	private String customMessage;

	@Column(name="default_code")
	private String defaultCode;

	private String description;

	@Column(name="description_picking")
	private String descriptionPicking;

	@Column(name="description_pickingin")
	private String descriptionPickingin;

	@Column(name="description_pickingout")
	private String descriptionPickingout;

	@Column(name="description_purchase")
	private String descriptionPurchase;

	@Column(name="description_sale")
	private String descriptionSale;

	@Column(name="expense_policy")
	private String expensePolicy;

	@Column(name="has_configurable_attributes")
	private Boolean hasConfigurableAttributes;

	@Column(name="inventory_availability")
	private String inventoryAvailability;

	@Column(name="invoice_policy")
	private String invoicePolicy;

	@Column(name="is_published")
	private Boolean isPublished;

	@Column(name="list_price")
	private BigDecimal listPrice;

	@Column(name="message_main_attachment_id")
	private Integer messageMainAttachmentId;

	private String name;

	@Column(name="purchase_line_warn")
	private String purchaseLineWarn;

	@Column(name="purchase_line_warn_msg")
	private String purchaseLineWarnMsg;

	@Column(name="purchase_method")
	private String purchaseMethod;

	@Column(name="purchase_ok")
	private Boolean purchaseOk;

	@Column(name="rating_last_value")
	private double ratingLastValue;

	@Column(name="sale_delay")
	private double saleDelay;

	@Column(name="sale_line_warn")
	private String saleLineWarn;

	@Column(name="sale_line_warn_msg")
	private String saleLineWarnMsg;

	@Column(name="sale_ok")
	private Boolean saleOk;

	@Column(name="seo_name")
	private String seoName;

	private Integer sequence;

	@Column(name="service_to_purchase")
	private Boolean serviceToPurchase;

	@Column(name="service_type")
	private String serviceType;

	private String tracking;

	private String type;

	@Column(name="uom_id")
	private Integer uomId;

	@Column(name="uom_po_id")
	private Integer uomPoId;

	private BigDecimal volume;

	@Column(name="website_description")
	private String websiteDescription;

	@Column(name="website_id")
	private Integer websiteId;

	@Column(name="website_meta_description")
	private String websiteMetaDescription;

	@Column(name="website_meta_keywords")
	private String websiteMetaKeywords;

	@Column(name="website_meta_og_img")
	private String websiteMetaOgImg;

	@Column(name="website_meta_title")
	private String websiteMetaTitle;

	@Column(name="website_ribbon_id")
	private Integer websiteRibbonId;

	@Column(name="website_sequence")
	private Integer websiteSequence;

	@Column(name="website_size_x")
	private Integer websiteSizeX;

	@Column(name="website_size_y")
	private Integer websiteSizeY;

	private BigDecimal weight;

	@Column(name="write_date")
	private Timestamp writeDate;

	@Column(name="write_uid")
	private Integer writeUid;

	public ProductTemplate() {
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

	public double getAvailableThreshold() {
		return this.availableThreshold;
	}

	public void setAvailableThreshold(double availableThreshold) {
		this.availableThreshold = availableThreshold;
	}

	public Boolean getCanImage1024BeZoomed() {
		return this.canImage1024BeZoomed;
	}

	public void setCanImage1024BeZoomed(Boolean canImage1024BeZoomed) {
		this.canImage1024BeZoomed = canImage1024BeZoomed;
	}

	public Integer getCategId() {
		return this.categId;
	}

	public void setCategId(Integer categId) {
		this.categId = categId;
	}

	public Integer getColor() {
		return this.color;
	}

	public void setColor(Integer color) {
		this.color = color;
	}

	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
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

	public String getCustomMessage() {
		return this.customMessage;
	}

	public void setCustomMessage(String customMessage) {
		this.customMessage = customMessage;
	}

	public String getDefaultCode() {
		return this.defaultCode;
	}

	public void setDefaultCode(String defaultCode) {
		this.defaultCode = defaultCode;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescriptionPicking() {
		return this.descriptionPicking;
	}

	public void setDescriptionPicking(String descriptionPicking) {
		this.descriptionPicking = descriptionPicking;
	}

	public String getDescriptionPickingin() {
		return this.descriptionPickingin;
	}

	public void setDescriptionPickingin(String descriptionPickingin) {
		this.descriptionPickingin = descriptionPickingin;
	}

	public String getDescriptionPickingout() {
		return this.descriptionPickingout;
	}

	public void setDescriptionPickingout(String descriptionPickingout) {
		this.descriptionPickingout = descriptionPickingout;
	}

	public String getDescriptionPurchase() {
		return this.descriptionPurchase;
	}

	public void setDescriptionPurchase(String descriptionPurchase) {
		this.descriptionPurchase = descriptionPurchase;
	}

	public String getDescriptionSale() {
		return this.descriptionSale;
	}

	public void setDescriptionSale(String descriptionSale) {
		this.descriptionSale = descriptionSale;
	}

	public String getExpensePolicy() {
		return this.expensePolicy;
	}

	public void setExpensePolicy(String expensePolicy) {
		this.expensePolicy = expensePolicy;
	}

	public Boolean getHasConfigurableAttributes() {
		return this.hasConfigurableAttributes;
	}

	public void setHasConfigurableAttributes(Boolean hasConfigurableAttributes) {
		this.hasConfigurableAttributes = hasConfigurableAttributes;
	}

	public String getInventoryAvailability() {
		return this.inventoryAvailability;
	}

	public void setInventoryAvailability(String inventoryAvailability) {
		this.inventoryAvailability = inventoryAvailability;
	}

	public String getInvoicePolicy() {
		return this.invoicePolicy;
	}

	public void setInvoicePolicy(String invoicePolicy) {
		this.invoicePolicy = invoicePolicy;
	}

	public Boolean getIsPublished() {
		return this.isPublished;
	}

	public void setIsPublished(Boolean isPublished) {
		this.isPublished = isPublished;
	}

	public BigDecimal getListPrice() {
		return this.listPrice;
	}

	public void setListPrice(BigDecimal listPrice) {
		this.listPrice = listPrice;
	}

	public Integer getMessageMainAttachmentId() {
		return this.messageMainAttachmentId;
	}

	public void setMessageMainAttachmentId(Integer messageMainAttachmentId) {
		this.messageMainAttachmentId = messageMainAttachmentId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurchaseLineWarn() {
		return this.purchaseLineWarn;
	}

	public void setPurchaseLineWarn(String purchaseLineWarn) {
		this.purchaseLineWarn = purchaseLineWarn;
	}

	public String getPurchaseLineWarnMsg() {
		return this.purchaseLineWarnMsg;
	}

	public void setPurchaseLineWarnMsg(String purchaseLineWarnMsg) {
		this.purchaseLineWarnMsg = purchaseLineWarnMsg;
	}

	public String getPurchaseMethod() {
		return this.purchaseMethod;
	}

	public void setPurchaseMethod(String purchaseMethod) {
		this.purchaseMethod = purchaseMethod;
	}

	public Boolean getPurchaseOk() {
		return this.purchaseOk;
	}

	public void setPurchaseOk(Boolean purchaseOk) {
		this.purchaseOk = purchaseOk;
	}

	public double getRatingLastValue() {
		return this.ratingLastValue;
	}

	public void setRatingLastValue(double ratingLastValue) {
		this.ratingLastValue = ratingLastValue;
	}

	public double getSaleDelay() {
		return this.saleDelay;
	}

	public void setSaleDelay(double saleDelay) {
		this.saleDelay = saleDelay;
	}

	public String getSaleLineWarn() {
		return this.saleLineWarn;
	}

	public void setSaleLineWarn(String saleLineWarn) {
		this.saleLineWarn = saleLineWarn;
	}

	public String getSaleLineWarnMsg() {
		return this.saleLineWarnMsg;
	}

	public void setSaleLineWarnMsg(String saleLineWarnMsg) {
		this.saleLineWarnMsg = saleLineWarnMsg;
	}

	public Boolean getSaleOk() {
		return this.saleOk;
	}

	public void setSaleOk(Boolean saleOk) {
		this.saleOk = saleOk;
	}

	public String getSeoName() {
		return this.seoName;
	}

	public void setSeoName(String seoName) {
		this.seoName = seoName;
	}

	public Integer getSequence() {
		return this.sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public Boolean getServiceToPurchase() {
		return this.serviceToPurchase;
	}

	public void setServiceToPurchase(Boolean serviceToPurchase) {
		this.serviceToPurchase = serviceToPurchase;
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getTracking() {
		return this.tracking;
	}

	public void setTracking(String tracking) {
		this.tracking = tracking;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getUomId() {
		return this.uomId;
	}

	public void setUomId(Integer uomId) {
		this.uomId = uomId;
	}

	public Integer getUomPoId() {
		return this.uomPoId;
	}

	public void setUomPoId(Integer uomPoId) {
		this.uomPoId = uomPoId;
	}

	public BigDecimal getVolume() {
		return this.volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	public String getWebsiteDescription() {
		return this.websiteDescription;
	}

	public void setWebsiteDescription(String websiteDescription) {
		this.websiteDescription = websiteDescription;
	}

	public Integer getWebsiteId() {
		return this.websiteId;
	}

	public void setWebsiteId(Integer websiteId) {
		this.websiteId = websiteId;
	}

	public String getWebsiteMetaDescription() {
		return this.websiteMetaDescription;
	}

	public void setWebsiteMetaDescription(String websiteMetaDescription) {
		this.websiteMetaDescription = websiteMetaDescription;
	}

	public String getWebsiteMetaKeywords() {
		return this.websiteMetaKeywords;
	}

	public void setWebsiteMetaKeywords(String websiteMetaKeywords) {
		this.websiteMetaKeywords = websiteMetaKeywords;
	}

	public String getWebsiteMetaOgImg() {
		return this.websiteMetaOgImg;
	}

	public void setWebsiteMetaOgImg(String websiteMetaOgImg) {
		this.websiteMetaOgImg = websiteMetaOgImg;
	}

	public String getWebsiteMetaTitle() {
		return this.websiteMetaTitle;
	}

	public void setWebsiteMetaTitle(String websiteMetaTitle) {
		this.websiteMetaTitle = websiteMetaTitle;
	}

	public Integer getWebsiteRibbonId() {
		return this.websiteRibbonId;
	}

	public void setWebsiteRibbonId(Integer websiteRibbonId) {
		this.websiteRibbonId = websiteRibbonId;
	}

	public Integer getWebsiteSequence() {
		return this.websiteSequence;
	}

	public void setWebsiteSequence(Integer websiteSequence) {
		this.websiteSequence = websiteSequence;
	}

	public Integer getWebsiteSizeX() {
		return this.websiteSizeX;
	}

	public void setWebsiteSizeX(Integer websiteSizeX) {
		this.websiteSizeX = websiteSizeX;
	}

	public Integer getWebsiteSizeY() {
		return this.websiteSizeY;
	}

	public void setWebsiteSizeY(Integer websiteSizeY) {
		this.websiteSizeY = websiteSizeY;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
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

}