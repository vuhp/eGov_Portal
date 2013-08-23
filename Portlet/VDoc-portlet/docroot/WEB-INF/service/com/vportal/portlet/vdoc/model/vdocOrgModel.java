/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.vportal.portlet.vdoc.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the vdocOrg service. Represents a row in the &quot;vdocOrg&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.vportal.portlet.vdoc.model.impl.vdocOrgModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.vportal.portlet.vdoc.model.impl.vdocOrgImpl}.
 * </p>
 *
 * @author MrEn
 * @see vdocOrg
 * @see com.vportal.portlet.vdoc.model.impl.vdocOrgImpl
 * @see com.vportal.portlet.vdoc.model.impl.vdocOrgModelImpl
 * @generated
 */
public interface vdocOrgModel extends BaseModel<vdocOrg> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vdoc org model instance should use the {@link vdocOrg} interface instead.
	 */

	/**
	 * Returns the primary key of this vdoc org.
	 *
	 * @return the primary key of this vdoc org
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this vdoc org.
	 *
	 * @param primaryKey the primary key of this vdoc org
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the org ID of this vdoc org.
	 *
	 * @return the org ID of this vdoc org
	 */
	@AutoEscape
	public String getOrgId();

	/**
	 * Sets the org ID of this vdoc org.
	 *
	 * @param orgId the org ID of this vdoc org
	 */
	public void setOrgId(String orgId);

	/**
	 * Returns the group ID of this vdoc org.
	 *
	 * @return the group ID of this vdoc org
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this vdoc org.
	 *
	 * @param groupId the group ID of this vdoc org
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this vdoc org.
	 *
	 * @return the company ID of this vdoc org
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this vdoc org.
	 *
	 * @param companyId the company ID of this vdoc org
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this vdoc org.
	 *
	 * @return the user ID of this vdoc org
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this vdoc org.
	 *
	 * @param userId the user ID of this vdoc org
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this vdoc org.
	 *
	 * @return the user uuid of this vdoc org
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this vdoc org.
	 *
	 * @param userUuid the user uuid of this vdoc org
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the created date of this vdoc org.
	 *
	 * @return the created date of this vdoc org
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this vdoc org.
	 *
	 * @param createdDate the created date of this vdoc org
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Returns the modified date of this vdoc org.
	 *
	 * @return the modified date of this vdoc org
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this vdoc org.
	 *
	 * @param modifiedDate the modified date of this vdoc org
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the created by user of this vdoc org.
	 *
	 * @return the created by user of this vdoc org
	 */
	public long getCreatedByUser();

	/**
	 * Sets the created by user of this vdoc org.
	 *
	 * @param createdByUser the created by user of this vdoc org
	 */
	public void setCreatedByUser(long createdByUser);

	/**
	 * Returns the modified by user of this vdoc org.
	 *
	 * @return the modified by user of this vdoc org
	 */
	public long getModifiedByUser();

	/**
	 * Sets the modified by user of this vdoc org.
	 *
	 * @param modifiedByUser the modified by user of this vdoc org
	 */
	public void setModifiedByUser(long modifiedByUser);

	/**
	 * Returns the parent ID of this vdoc org.
	 *
	 * @return the parent ID of this vdoc org
	 */
	@AutoEscape
	public String getParentId();

	/**
	 * Sets the parent ID of this vdoc org.
	 *
	 * @param parentId the parent ID of this vdoc org
	 */
	public void setParentId(String parentId);

	/**
	 * Returns the name of this vdoc org.
	 *
	 * @return the name of this vdoc org
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this vdoc org.
	 *
	 * @param name the name of this vdoc org
	 */
	public void setName(String name);

	/**
	 * Returns the description of this vdoc org.
	 *
	 * @return the description of this vdoc org
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this vdoc org.
	 *
	 * @param description the description of this vdoc org
	 */
	public void setDescription(String description);

	/**
	 * Returns the address of this vdoc org.
	 *
	 * @return the address of this vdoc org
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this vdoc org.
	 *
	 * @param address the address of this vdoc org
	 */
	public void setAddress(String address);

	/**
	 * Returns the phone of this vdoc org.
	 *
	 * @return the phone of this vdoc org
	 */
	@AutoEscape
	public String getPhone();

	/**
	 * Sets the phone of this vdoc org.
	 *
	 * @param phone the phone of this vdoc org
	 */
	public void setPhone(String phone);

	/**
	 * Returns the fax of this vdoc org.
	 *
	 * @return the fax of this vdoc org
	 */
	@AutoEscape
	public String getFax();

	/**
	 * Sets the fax of this vdoc org.
	 *
	 * @param fax the fax of this vdoc org
	 */
	public void setFax(String fax);

	/**
	 * Returns the language of this vdoc org.
	 *
	 * @return the language of this vdoc org
	 */
	@AutoEscape
	public String getLanguage();

	/**
	 * Sets the language of this vdoc org.
	 *
	 * @param language the language of this vdoc org
	 */
	public void setLanguage(String language);

	/**
	 * Returns the status org of this vdoc org.
	 *
	 * @return the status org of this vdoc org
	 */
	public boolean getStatusOrg();

	/**
	 * Returns <code>true</code> if this vdoc org is status org.
	 *
	 * @return <code>true</code> if this vdoc org is status org; <code>false</code> otherwise
	 */
	public boolean isStatusOrg();

	/**
	 * Sets whether this vdoc org is status org.
	 *
	 * @param statusOrg the status org of this vdoc org
	 */
	public void setStatusOrg(boolean statusOrg);

	/**
	 * Returns the position of this vdoc org.
	 *
	 * @return the position of this vdoc org
	 */
	public int getPosition();

	/**
	 * Sets the position of this vdoc org.
	 *
	 * @param position the position of this vdoc org
	 */
	public void setPosition(int position);

	/**
	 * Returns the listparent of this vdoc org.
	 *
	 * @return the listparent of this vdoc org
	 */
	@AutoEscape
	public String getListparent();

	/**
	 * Sets the listparent of this vdoc org.
	 *
	 * @param listparent the listparent of this vdoc org
	 */
	public void setListparent(String listparent);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(vdocOrg vdocOrg);

	public int hashCode();

	public CacheModel<vdocOrg> toCacheModel();

	public vdocOrg toEscapedModel();

	public String toString();

	public String toXmlString();
}