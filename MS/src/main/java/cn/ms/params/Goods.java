package cn.ms.params;

/**
 * 货物信息实体类
 * @author yzw09
 *
 */
public class Goods {
	//唯一主键货物Id
	private Integer goodsId;
	//货物状态 0表示可用 1表示不可用
	private Integer status;
	//货物编号
	private String goodsCode;
	//货物名称
	private String goodsName;
	//货物类别
	private String goodsCatagory;
	//材质
	private String material;
	//货物备注 货物信息补充内容
	private String goodsNote;
	//所属货主Id
	private Integer shipperId;
	//货物图片 服务器图片url
	private String goodsImg;
	//保质期
	private Integer expiryDate;
	//价格
	private Double price;
	
	public Goods() {
		//TODO Auto-generated constructor stub
	}
	
	
	public Goods(Integer status, String goodsCode, String goodsName, String goodsCatagory, String material,
			String goodsNote, Integer shipperId, String goodsImg, Integer expiryDate, Double price) {
		super();
		this.status = status;
		this.goodsCode = goodsCode;
		this.goodsName = goodsName;
		this.goodsCatagory = goodsCatagory;
		this.material = material;
		this.goodsNote = goodsNote;
		this.shipperId = shipperId;
		this.goodsImg = goodsImg;
		this.expiryDate = expiryDate;
		this.price = price;
	}
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsCatagory() {
		return goodsCatagory;
	}
	public void setGoodsCatagory(String goodsCatagory) {
		this.goodsCatagory = goodsCatagory;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getGoodsNote() {
		return goodsNote;
	}
	public void setGoodsNote(String goodsNote) {
		this.goodsNote = goodsNote;
	}
	public Integer getShipperId() {
		return shipperId;
	}
	public void setShipperId(Integer shipperId) {
		this.shipperId = shipperId;
	}
	public String getGoodsImg() {
		return goodsImg;
	}
	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}
	public Integer getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Integer expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
