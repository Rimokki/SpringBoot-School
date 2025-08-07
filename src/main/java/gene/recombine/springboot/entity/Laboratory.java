package gene.recombine.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName laboratory
 */
@TableName(value ="laboratory")
@Data
public class Laboratory {
    /**
     * 实验室表主键自增id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 实验室编号
     */
    private String number;

    /**
     * 实验室名称
     */
    private String name;

    /**
     * 工位数量
     */
    private Integer stationNum;

    /**
     * 面积 平方米
     */
    private Integer area;

    /**
     * 设施总值 单位：万
     */
    private Integer facilitiesPrice;

    /**
     * 地址
     */
    private String address;

    /**
     * 缩略图地址
     */
    private String thumbnail;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Laboratory other = (Laboratory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getStationNum() == null ? other.getStationNum() == null : this.getStationNum().equals(other.getStationNum()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getFacilitiesPrice() == null ? other.getFacilitiesPrice() == null : this.getFacilitiesPrice().equals(other.getFacilitiesPrice()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getThumbnail() == null ? other.getThumbnail() == null : this.getThumbnail().equals(other.getThumbnail()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getStationNum() == null) ? 0 : getStationNum().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getFacilitiesPrice() == null) ? 0 : getFacilitiesPrice().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getThumbnail() == null) ? 0 : getThumbnail().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", number=").append(number);
        sb.append(", name=").append(name);
        sb.append(", stationNum=").append(stationNum);
        sb.append(", area=").append(area);
        sb.append(", facilitiesPrice=").append(facilitiesPrice);
        sb.append(", address=").append(address);
        sb.append(", thumbnail=").append(thumbnail);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}