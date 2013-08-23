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
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import com.vportal.portlet.vdoc.service.persistence.vdocDORelPK;

import java.io.Serializable;

/**
 * The base model interface for the vdocDORel service. Represents a row in the &quot;vdocDORel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.vportal.portlet.vdoc.model.impl.vdocDORelModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.vportal.portlet.vdoc.model.impl.vdocDORelImpl}.
 * </p>
 *
 * @author MrEn
 * @see vdocDORel
 * @see com.vportal.portlet.vdoc.model.impl.vdocDORelImpl
 * @see com.vportal.portlet.vdoc.model.impl.vdocDORelModelImpl
 * @generated
 */
public interface vdocDORelModel extends BaseModel<vdocDORel> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vdoc d o rel model instance should use the {@link vdocDORel} interface instead.
	 */

	/**
	 * Returns the primary key of this vdoc d o rel.
	 *
	 * @return the primary key of this vdoc d o rel
	 */
	public vdocDORelPK getPrimaryKey();

	/**
	 * Sets the primary key of this vdoc d o rel.
	 *
	 * @param primaryKey the primary key of this vdoc d o rel
	 */
	public void setPrimaryKey(vdocDORelPK primaryKey);

	/**
	 * Returns the doc ID of this vdoc d o rel.
	 *
	 * @return the doc ID of this vdoc d o rel
	 */
	@AutoEscape
	public String getDocId();

	/**
	 * Sets the doc ID of this vdoc d o rel.
	 *
	 * @param docId the doc ID of this vdoc d o rel
	 */
	public void setDocId(String docId);

	/**
	 * Returns the org ID of this vdoc d o rel.
	 *
	 * @return the org ID of this vdoc d o rel
	 */
	@AutoEscape
	public String getOrgId();

	/**
	 * Sets the org ID of this vdoc d o rel.
	 *
	 * @param orgId the org ID of this vdoc d o rel
	 */
	public void setOrgId(String orgId);

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

	public int compareTo(vdocDORel vdocDORel);

	public int hashCode();

	public CacheModel<vdocDORel> toCacheModel();

	public vdocDORel toEscapedModel();

	public String toString();

	public String toXmlString();
}