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

package com.vportal.portlet.vcms.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import com.vportal.portlet.vcms.service.persistence.VcmsCARelationPK;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the VcmsCARelation service. Represents a row in the &quot;VcmsCARelation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.vportal.portlet.vcms.model.impl.VcmsCARelationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.vportal.portlet.vcms.model.impl.VcmsCARelationImpl}.
 * </p>
 *
 * @author hai
 * @see VcmsCARelation
 * @see com.vportal.portlet.vcms.model.impl.VcmsCARelationImpl
 * @see com.vportal.portlet.vcms.model.impl.VcmsCARelationModelImpl
 * @generated
 */
public interface VcmsCARelationModel extends BaseModel<VcmsCARelation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vcms c a relation model instance should use the {@link VcmsCARelation} interface instead.
	 */

	/**
	 * Returns the primary key of this vcms c a relation.
	 *
	 * @return the primary key of this vcms c a relation
	 */
	public VcmsCARelationPK getPrimaryKey();

	/**
	 * Sets the primary key of this vcms c a relation.
	 *
	 * @param primaryKey the primary key of this vcms c a relation
	 */
	public void setPrimaryKey(VcmsCARelationPK primaryKey);

	/**
	 * Returns the category ID of this vcms c a relation.
	 *
	 * @return the category ID of this vcms c a relation
	 */
	@AutoEscape
	public String getCategoryId();

	/**
	 * Sets the category ID of this vcms c a relation.
	 *
	 * @param categoryId the category ID of this vcms c a relation
	 */
	public void setCategoryId(String categoryId);

	/**
	 * Returns the article ID of this vcms c a relation.
	 *
	 * @return the article ID of this vcms c a relation
	 */
	@AutoEscape
	public String getArticleId();

	/**
	 * Sets the article ID of this vcms c a relation.
	 *
	 * @param articleId the article ID of this vcms c a relation
	 */
	public void setArticleId(String articleId);

	/**
	 * Returns the created date of this vcms c a relation.
	 *
	 * @return the created date of this vcms c a relation
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this vcms c a relation.
	 *
	 * @param createdDate the created date of this vcms c a relation
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Returns the created by user of this vcms c a relation.
	 *
	 * @return the created by user of this vcms c a relation
	 */
	@AutoEscape
	public String getCreatedByUser();

	/**
	 * Sets the created by user of this vcms c a relation.
	 *
	 * @param createdByUser the created by user of this vcms c a relation
	 */
	public void setCreatedByUser(String createdByUser);

	/**
	 * Returns the status of this vcms c a relation.
	 *
	 * @return the status of this vcms c a relation
	 */
	public long getStatus();

	/**
	 * Sets the status of this vcms c a relation.
	 *
	 * @param status the status of this vcms c a relation
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

	public int compareTo(VcmsCARelation vcmsCARelation);

	public int hashCode();

	public CacheModel<VcmsCARelation> toCacheModel();

	public VcmsCARelation toEscapedModel();

	public String toString();

	public String toXmlString();
}