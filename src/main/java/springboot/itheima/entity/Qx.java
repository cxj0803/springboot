package springboot.itheima.entity;

public class Qx {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qx.qxid
     *
     * @mbg.generated Tue Mar 03 15:42:28 CST 2020
     */
    private Integer qxid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qx.qx
     *
     * @mbg.generated Tue Mar 03 15:42:28 CST 2020
     */
    private String qx;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qx.qxid
     *
     * @return the value of qx.qxid
     *
     * @mbg.generated Tue Mar 03 15:42:28 CST 2020
     */
    public Integer getQxid() {
        return qxid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qx.qxid
     *
     * @param qxid the value for qx.qxid
     *
     * @mbg.generated Tue Mar 03 15:42:28 CST 2020
     */
    public void setQxid(Integer qxid) {
        this.qxid = qxid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qx.qx
     *
     * @return the value of qx.qx
     *
     * @mbg.generated Tue Mar 03 15:42:28 CST 2020
     */
    public String getQx() {
        return qx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qx.qx
     *
     * @param qx the value for qx.qx
     *
     * @mbg.generated Tue Mar 03 15:42:28 CST 2020
     */
    public void setQx(String qx) {
        this.qx = qx == null ? null : qx.trim();
    }
}