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

package com.vportal.portlet.vcalendar.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the VFile service. Represents a row in the &quot;VFile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.vportal.portlet.vcalendar.model.impl.VFileModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.vportal.portlet.vcalendar.model.impl.VFileImpl}.
 * </p>
 *
 * @author LongLH
 * @see VFile
 * @see com.vportal.portlet.vcalendar.model.impl.VFileImpl
 * @see com.vportal.portlet.vcalendar.model.impl.VFileModelImpl
 * @generated
 */
public interface VFileModel extends BaseModel<VFile> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a v file model instance should use the {@link VFile} interface instead.
	 */

	/**
	 * Returns the primary key of this v file.
	 *
	 * @return the primary key of this v file
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this v file.
	 *
	 * @param primaryKey the primary key of this v file
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the file ID of this v file.
	 *
	 * @return the file ID of this v file
	 */
	public long getFileId();

	/**
	 * Sets the file ID of this v file.
	 *
	 * @param fileId the file ID of this v file
	 */
	public void setFileId(long fileId);

	/**
	 * Returns the fullname of this v file.
	 *
	 * @return the fullname of this v file
	 */
	@AutoEscape
	public String getFullname();

	/**
	 * Sets the fullname of this v file.
	 *
	 * @param fullname the fullname of this v file
	 */
	public void setFullname(String fullname);

	/**
	 * Returns the phone of this v file.
	 *
	 * @return the phone of this v file
	 */
	@AutoEscape
	public String getPhone();

	/**
	 * Sets the phone of this v file.
	 *
	 * @param phone the phone of this v file
	 */
	public void setPhone(String phone);

	/**
	 * Returns the address of this v file.
	 *
	 * @return the address of this v file
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this v file.
	 *
	 * @param address the address of this v file
	 */
	public void setAddress(String address);

	/**
	 * Returns the birthday of this v file.
	 *
	 * @return the birthday of this v file
	 */
	public Date getBirthday();

	/**
	 * Sets the birthday of this v file.
	 *
	 * @param birthday the birthday of this v file
	 */
	public void setBirthday(Date birthday);

	/**
	 * Returns the position of this v file.
	 *
	 * @return the position of this v file
	 */
	@AutoEscape
	public String getPosition();

	/**
	 * Sets the position of this v file.
	 *
	 * @param position the position of this v file
	 */
	public void setPosition(String position);

	/**
	 * Returns the status of this v file.
	 *
	 * @return the status of this v file
	 */
	public long getStatus();

	/**
	 * Sets the status of this v file.
	 *
	 * @param status the status of this v file
	 */
	public void setStatus(long status);

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

	public int compareTo(VFile vFile);

	public int hashCode();

	public CacheModel<VFile> toCacheModel();

	public VFile toEscapedModel();

	public String toString();

	public String toXmlString();
}