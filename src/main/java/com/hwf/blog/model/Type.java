package com.hwf.blog.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table type
 */
public class Type {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type.typeName
     *
     * @mbg.generated
     */
    private String typename;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type.id
     *
     * @return the value of type.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type.id
     *
     * @param id the value for type.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type.typeName
     *
     * @return the value of type.typeName
     *
     * @mbg.generated
     */
    public String getTypename() {
        return typename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type.typeName
     *
     * @param typename the value for type.typeName
     *
     * @mbg.generated
     */
    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }
}