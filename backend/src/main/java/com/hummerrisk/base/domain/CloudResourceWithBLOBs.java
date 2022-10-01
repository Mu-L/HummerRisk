package com.hummerrisk.base.domain;

import java.io.Serializable;

public class CloudResourceWithBLOBs extends CloudResource implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource.custodian_run_log
     *
     * @mbg.generated Sat Oct 01 17:57:01 CST 2022
     */
    private String custodianRunLog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource.metadata
     *
     * @mbg.generated Sat Oct 01 17:57:01 CST 2022
     */
    private String metadata;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource.resources
     *
     * @mbg.generated Sat Oct 01 17:57:01 CST 2022
     */
    private String resources;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_resource
     *
     * @mbg.generated Sat Oct 01 17:57:01 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource.custodian_run_log
     *
     * @return the value of cloud_resource.custodian_run_log
     *
     * @mbg.generated Sat Oct 01 17:57:01 CST 2022
     */
    public String getCustodianRunLog() {
        return custodianRunLog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource.custodian_run_log
     *
     * @param custodianRunLog the value for cloud_resource.custodian_run_log
     *
     * @mbg.generated Sat Oct 01 17:57:01 CST 2022
     */
    public void setCustodianRunLog(String custodianRunLog) {
        this.custodianRunLog = custodianRunLog == null ? null : custodianRunLog.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource.metadata
     *
     * @return the value of cloud_resource.metadata
     *
     * @mbg.generated Sat Oct 01 17:57:01 CST 2022
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource.metadata
     *
     * @param metadata the value for cloud_resource.metadata
     *
     * @mbg.generated Sat Oct 01 17:57:01 CST 2022
     */
    public void setMetadata(String metadata) {
        this.metadata = metadata == null ? null : metadata.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource.resources
     *
     * @return the value of cloud_resource.resources
     *
     * @mbg.generated Sat Oct 01 17:57:01 CST 2022
     */
    public String getResources() {
        return resources;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource.resources
     *
     * @param resources the value for cloud_resource.resources
     *
     * @mbg.generated Sat Oct 01 17:57:01 CST 2022
     */
    public void setResources(String resources) {
        this.resources = resources == null ? null : resources.trim();
    }
}