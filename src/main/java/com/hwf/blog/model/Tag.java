package com.hwf.blog.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table tag
 */
public class Tag {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.tagName
     *
     * @mbg.generated
     */
    private String tagname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.id
     *
     * @return the value of tag.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.id
     *
     * @param id the value for tag.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.tagName
     *
     * @return the value of tag.tagName
     *
     * @mbg.generated
     */
    public String getTagname() {
        return tagname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.tagName
     *
     * @param tagname the value for tag.tagName
     *
     * @mbg.generated
     */
    public void setTagname(String tagname) {
        this.tagname = tagname == null ? null : tagname.trim();
    }
}