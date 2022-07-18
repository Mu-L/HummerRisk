package com.hummerrisk.base.domain;

import java.io.Serializable;

public class HistoryPackageTaskWithBLOBs extends HistoryPackageTask implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_package_task.resources
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    private String resources;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_package_task.return_json
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    private String returnJson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table history_package_task
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_package_task.resources
     *
     * @return the value of history_package_task.resources
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    public String getResources() {
        return resources;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_package_task.resources
     *
     * @param resources the value for history_package_task.resources
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    public void setResources(String resources) {
        this.resources = resources == null ? null : resources.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_package_task.return_json
     *
     * @return the value of history_package_task.return_json
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    public String getReturnJson() {
        return returnJson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_package_task.return_json
     *
     * @param returnJson the value for history_package_task.return_json
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    public void setReturnJson(String returnJson) {
        this.returnJson = returnJson == null ? null : returnJson.trim();
    }
}