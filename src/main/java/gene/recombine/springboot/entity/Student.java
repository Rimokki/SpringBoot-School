package gene.recombine.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName student
 */
@TableName(value ="student")
@Data
public class Student {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long studentId;

    /**
     * 
     */
    private String studentName;

    /**
     * 
     */
    private String studentBirth;

    /**
     * 
     */
    private String studentAddress;

    /**
     * 
     */
    private Long studentNo;

    /**
     * 
     */
    private Long gradeId;

    /**
     * 
     */
    private Integer studentAge;

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
        Student other = (Student) that;
        return (this.getStudentId() == null ? other.getStudentId() == null : this.getStudentId().equals(other.getStudentId()))
            && (this.getStudentName() == null ? other.getStudentName() == null : this.getStudentName().equals(other.getStudentName()))
            && (this.getStudentBirth() == null ? other.getStudentBirth() == null : this.getStudentBirth().equals(other.getStudentBirth()))
            && (this.getStudentAddress() == null ? other.getStudentAddress() == null : this.getStudentAddress().equals(other.getStudentAddress()))
            && (this.getStudentNo() == null ? other.getStudentNo() == null : this.getStudentNo().equals(other.getStudentNo()))
            && (this.getGradeId() == null ? other.getGradeId() == null : this.getGradeId().equals(other.getGradeId()))
            && (this.getStudentAge() == null ? other.getStudentAge() == null : this.getStudentAge().equals(other.getStudentAge()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStudentId() == null) ? 0 : getStudentId().hashCode());
        result = prime * result + ((getStudentName() == null) ? 0 : getStudentName().hashCode());
        result = prime * result + ((getStudentBirth() == null) ? 0 : getStudentBirth().hashCode());
        result = prime * result + ((getStudentAddress() == null) ? 0 : getStudentAddress().hashCode());
        result = prime * result + ((getStudentNo() == null) ? 0 : getStudentNo().hashCode());
        result = prime * result + ((getGradeId() == null) ? 0 : getGradeId().hashCode());
        result = prime * result + ((getStudentAge() == null) ? 0 : getStudentAge().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", studentId=").append(studentId);
        sb.append(", studentName=").append(studentName);
        sb.append(", studentBirth=").append(studentBirth);
        sb.append(", studentAddress=").append(studentAddress);
        sb.append(", studentNo=").append(studentNo);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", studentAge=").append(studentAge);
        sb.append("]");
        return sb.toString();
    }
}